package kz.kuzmin.javaee.add;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Sniperrifles;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/addsniper")

public class AddSniperServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addsniper.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/AddSniper?error";
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        String photo = req.getParameter("photo");
        req.setAttribute("name", name);
        req.setAttribute("description", description);
        req.setAttribute("price", price);
        req.setAttribute("photo", photo);
        Sniperrifles sniperrifle = new Sniperrifles();
        sniperrifle.setName(name);
        sniperrifle.setDescription(description);
        sniperrifle.setPrice(price);
        sniperrifle.setPhoto(photo);

        if(DBManagerShop.addSniperrifles(sniperrifle)){
            redirect = "/addsuc";
        }
        resp.sendRedirect(redirect);
    }
}