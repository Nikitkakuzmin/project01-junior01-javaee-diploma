package kz.kuzmin.javaee.update;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Flamethrowers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/flameupdate")

public class UpdateFlameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/flameupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        String name = req.getParameter("name");

        String description = req.getParameter("description");

        double price = Double.parseDouble(req.getParameter("price"));

        String photo = req.getParameter("photo");

        Flamethrowers flamethrower = DBManagerShop.getFlamethrowers(id);

        if(flamethrower!=null){

            flamethrower.setName(name);

            flamethrower.setDescription(description);

            flamethrower.setPrice(price);

            flamethrower.setPhoto(photo);

            DBManagerShop.updateFlamethrowers(flamethrower);

        }

        resp.sendRedirect("/updsuc");

    }
}