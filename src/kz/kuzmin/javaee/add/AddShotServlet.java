package kz.kuzmin.javaee.add;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Shotguns;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/addshot")

public class AddShotServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addshot.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/AddShot?error";
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        String photo = req.getParameter("photo");
        req.setAttribute("name", name);
        req.setAttribute("description", description);
        req.setAttribute("price", price);
        req.setAttribute("photo", photo);
        Shotguns shotgun = new Shotguns();
        shotgun.setName(name);
        shotgun.setDescription(description);
        shotgun.setPrice(price);
        shotgun.setPhoto(photo);

        if(DBManagerShop.addShotguns(shotgun)){
            redirect = "/addsuc";
        }
        resp.sendRedirect(redirect);
    }
}