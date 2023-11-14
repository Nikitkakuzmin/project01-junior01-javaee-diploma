package kz.kuzmin.javaee.servlets;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.users.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/login")

public class LoginShopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/errorlogin";
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Users user = DBManagerShop.getUser(email);
        if(user!=null){
            redirect = "/errorpass";
            if(user.getPassword().equals(password)){
                redirect = "/hello";
                req.getSession().setAttribute("CURRENT_USER", user);
            }
        }
        resp.sendRedirect(redirect);
    }
}
