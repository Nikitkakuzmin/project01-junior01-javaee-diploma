package kz.kuzmin.javaee.add;

import kz.kuzmin.javaee.db.DBManagerShop;
import kz.kuzmin.javaee.guns.Machineguns;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/addmachine")

public class AddMachineServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addmachine.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/AddMachine?error";
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        String photo = req.getParameter("photo");
        req.setAttribute("name", name);
        req.setAttribute("description", description);
        req.setAttribute("price", price);
        req.setAttribute("photo", photo);
        Machineguns machinegun = new Machineguns();
        machinegun.setName(name);
        machinegun.setDescription(description);
        machinegun.setPrice(price);
        machinegun.setPhoto(photo);

        if(DBManagerShop.addMachineguns(machinegun)){
            redirect = "/addsuc";
        }
        resp.sendRedirect(redirect);
    }
}