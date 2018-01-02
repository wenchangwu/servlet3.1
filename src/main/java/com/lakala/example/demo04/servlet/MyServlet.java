package com.lakala.example.demo04.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name="myServlet",urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("this is just a demo from get");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer=resp.getWriter();
        writer.write("this is just a test");
        req.getServletContext().setAttribute("country","zh");
        req.getServletContext().setAttribute("country","cn");
        req.getServletContext().removeAttribute("country");
        req.getServletContext().log("myServlet doGet");
    }
}
