package kz.kuzmin.javaee.delete;


import kz.kuzmin.javaee.db.DBManagerShop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/sniperdelete")
public class DeleteSniperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/deletesniper?error";
        Long id = Long.valueOf(req.getParameter("id"));
        if(DBManagerShop.deleteSniperrifles(id)){
            redirect = "/delsuc";
        }
        resp.sendRedirect(redirect);
    }
}
