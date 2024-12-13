package com.xlf.school.experiment7.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener
public class TestListener implements HttpSessionListener, HttpSessionAttributeListener {

    private int count = 0;
    private int userCount = 0;

    public TestListener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        HttpSession session = se.getSession();
        ServletContext context = session.getServletContext();
        context.setAttribute("count", count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String attribute = se.getName();
        if (attribute.equals("username")) userCount++;
        HttpSession session = se.getSession();
        ServletContext context = session.getServletContext();
        context.setAttribute("usercount", userCount);

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        String attribute = se.getName();
        if (attribute.equals("username")) userCount--;
        HttpSession session = se.getSession();
        ServletContext context = session.getServletContext();
        context.setAttribute("usercount", userCount);

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
    }

}
