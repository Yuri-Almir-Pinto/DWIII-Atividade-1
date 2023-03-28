package br.edu.ifpr.teste;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "requisicao", value = "/requisicao")
public class requisicao extends HttpServlet {
    private String message;

    public void init() {
        message = "Requisicao - <a href='/testeApp'> Voltar </a>";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        String method = request.getMethod();
        out.println("<p>Method: " + method + "</p>");
        String requestURI = request.getRequestURI();
        out.println("<p>URI: " + requestURI + "</p>");
        String protocol = request.getProtocol();
        out.println("<p>Protocol: " + protocol + "</p>");
        String remoteAddr = request.getRemoteAddr();
        out.println("<p>Remote Address: " + remoteAddr + "</p>");
        out.println("</body></html>");



    }

    public void destroy() {
    }
}