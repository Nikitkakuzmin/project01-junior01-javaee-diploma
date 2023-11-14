package kz.kuzmin.javaee.update;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Rifles;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/rifleupdate")

public class UpdateRifleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/rifleupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        String name = req.getParameter("name");

        String description = req.getParameter("description");

        double price = Double.parseDouble(req.getParameter("price"));

        String photo = req.getParameter("photo");

        Rifles rifle = DBManagerShop.getRifles(id);

        if(rifle!=null){

            rifle.setName(name);

            rifle.setDescription(description);

            rifle.setPrice(price);

            rifle.setPhoto(photo);

            DBManagerShop.updateRifles(rifle);

        }

        resp.sendRedirect("/updsuc");

    }
}