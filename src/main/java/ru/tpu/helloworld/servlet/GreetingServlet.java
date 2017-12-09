package ru.tpu.helloworld.servlet;

import ru.tpu.helloworld.util.GreetingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GreetingServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GreetingUtil greetingUtil = new GreetingUtil();
        String greetingMessage = greetingUtil.getGreetingById(1).getGreetingMessage();

        response.setContentType("text/html");
        response.getWriter().write(greetingMessage);
    }
}
