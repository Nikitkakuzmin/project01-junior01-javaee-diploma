package kz.kuzmin.javaee.servlets;

import kz.kuzmin.javaee.users.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/home")

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users currentUser = (Users) req.getSession().getAttribute("CURRENT_USER");

        if(currentUser!=null) {

            req.getRequestDispatcher("/Home.jsp").forward(req, resp);

        }else{

            resp.sendRedirect("/login");

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Home.jsp").forward(req, resp);
    }
}
