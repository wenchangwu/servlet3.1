package com.lakala.example.demo04.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Description:
 * User: xiao_dingo
 * Date: 2017-12-31
 * Time: 下午4:08
 */
@WebServlet(name="AsyncServlet",urlPatterns = {"/testAysn.do"},asyncSupported = true)
public class AsyncServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");

        AsyncContext actx=req.startAsync();
        actx.setTimeout(30*3000);

        ServletInputStream inputStream=req.getInputStream();
        inputStream.setReadListener(new MyReadListener(inputStream,actx));
    }
}
