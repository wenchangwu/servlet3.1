package com.lakala.example.demo04.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 * User: xiao_dingo
 * Date: 2017-12-31
 * Time: 下午4:35
 */
public class MyReadListener implements ReadListener {

    private ServletInputStream in;
    private AsyncContext ac;

    public MyReadListener(ServletInputStream in, AsyncContext ac) {
        this.in = in;
        this.ac = ac;
    }

    @Override
    public void onDataAvailable() throws IOException {
        System.out.println("reading data complete");
    }

    @Override
    public void onAllDataRead() throws IOException {

        try {
            Thread.sleep(5000);
            ac.getRequest().setAttribute("userName", "dingo");
            ac.getResponse().getWriter().println("hello Asynchronized io");
            ac.getResponse().getWriter().flush();
            ac.complete();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("read error");
        throwable.printStackTrace();
    }
}
