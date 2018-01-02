package com.lakala.example.demo04.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener,ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("servletContextEvent source:"+scae.getSource());
        System.out.println("attribute add:"+scae.getName()+":"+scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("servletContextEvent source:"+scae.getSource());
        System.out.println("attribute remove:"+scae.getName()+":"+scae.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("servletContextEvent source:"+scae.getSource());
        System.out.println("attribute replace:"+scae.getName()+":"+scae.getValue());
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
            System.out.println("servletContextEvent source:"+sce.getSource());
            System.out.println("servletContextEvent created");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
            System.out.println("servletContextEvent source:"+sce.getSource());
            System.out.println("servletContextEvent destroyed");
    }
}
