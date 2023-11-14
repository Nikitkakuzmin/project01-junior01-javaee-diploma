package kz.kuzmin.javaee.update;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Sniperrifles;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/sniperupdate")

public class UpdateSniperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/sniperupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        String name = req.getParameter("name");

        String description = req.getParameter("description");

        double price = Double.parseDouble(req.getParameter("price"));

        String photo = req.getParameter("photo");

        Sniperrifles sniperrifle = DBManagerShop.getSniperrifles(id);

        if(sniperrifle!=null){

            sniperrifle.setName(name);

            sniperrifle.setDescription(description);

            sniperrifle.setPrice(price);

            sniperrifle.setPhoto(photo);

            DBManagerShop.updateSniperrifles(sniperrifle);

        }

        resp.sendRedirect("/updsuc");

    }
}