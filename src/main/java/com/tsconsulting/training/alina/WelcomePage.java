package com.tsconsulting.training.alina;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@WebServlet(urlPatterns = "/welcome", name = "welcome")
public class WelcomePage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!EduServlet.getMembers().isEmpty()) {
            for (Map.Entry<String, String> stringEntry : EduServlet.getMembers().entrySet()) {
                req.setAttribute("man", String.format("Привет, %s!", stringEntry.getValue()));
                req.setAttribute("email", String.format("Твоя почта - %s.", stringEntry.getKey()));
            }
        }
        req.getRequestDispatcher("welcomepage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/servlet_with_jsp/2");
    }

}
