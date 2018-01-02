package com.lakala.example.demo04.servlet.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    private long startTime;

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSessionEvent source: " + se.getSource());
        System.out.println("session Id: " + se.getSession().getId());
        System.out.println("session created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSessionEvent source: " + se.getSource());
        System.out.println("session Id: " + se.getSession().getId());
        System.out.println("active time: " + (System.nanoTime() - startTime));
        System.out.println("session destroy");
    }
}
