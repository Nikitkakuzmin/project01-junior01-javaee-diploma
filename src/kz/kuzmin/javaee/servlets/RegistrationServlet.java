package kz.kuzmin.javaee.servlets;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.users.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/regist")

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/regist.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/regist";
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String name = req.getParameter("name");

        req.setAttribute("email", email);
        req.setAttribute("password", password);
        req.setAttribute("name", name);


        Users user = new Users();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);


        if(DBManagerShop.addUser(user)){
            redirect = "/regsuc";
        }
        resp.sendRedirect(redirect);
    }
}
