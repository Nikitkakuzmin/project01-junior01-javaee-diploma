package kz.kuzmin.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookies[] = req.getCookies();
        String cookieValue = "EMPTY";
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("tovar")){
                    cookieValue = cookie.getValue();
                    break;
                }
            }
        }

        req.setAttribute("tovar",cookieValue);

        req.getRequestDispatcher("/Cart.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
