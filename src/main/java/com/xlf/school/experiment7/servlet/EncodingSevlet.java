package com.xlf.school.experiment7.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EncodingSevlet")
public class EncodingSevlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EncodingSevlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String param = request.getParameter("param");
        if (param != null) {
            System.out.println(param);
            request.getSession().setAttribute("param", param);

            response.sendRedirect("showparam.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
