package kz.kuzmin.javaee.update;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Machineguns;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/machineupdate")

public class UpdateMachineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/machineupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));

        String name = req.getParameter("name");

        String description = req.getParameter("description");

        double price = Double.parseDouble(req.getParameter("price"));

        String photo = req.getParameter("photo");

        Machineguns machinegun = DBManagerShop.getMachinguns(id);

        if(machinegun!=null){

            machinegun.setName(name);

            machinegun.setDescription(description);

            machinegun.setPrice(price);

            machinegun.setPhoto(photo);

            DBManagerShop.updateMachineguns(machinegun);

        }

        resp.sendRedirect("/updsuc");

    }
}