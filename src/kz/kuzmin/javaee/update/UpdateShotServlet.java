package kz.kuzmin.javaee.update;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Shotguns;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/shotupdate")

public class UpdateShotServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/shotupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        String name = req.getParameter("name");

        String description = req.getParameter("description");

        double price = Double.parseDouble(req.getParameter("price"));

        String photo = req.getParameter("photo");

        Shotguns shotgun = DBManagerShop.getShotguns(id);

        if(shotgun!=null){

            shotgun.setName(name);

            shotgun.setDescription(description);

            shotgun.setPrice(price);

            shotgun.setPhoto(photo);

            DBManagerShop.updateShotguns(shotgun);

        }

        resp.sendRedirect("/updsuc");

    }
}