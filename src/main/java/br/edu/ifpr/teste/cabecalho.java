package br.edu.ifpr.teste;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "cabecalho", value = "/cabecalho")
public class cabecalho extends HttpServlet {
    private String message;

    public void init() {
        message = "Cabeçalho - <a href='/testeApp'> Voltar </a>";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        String host = request.getHeader("host");
        String useragent = request.getHeader("user-agent");
        String acceptencoding = request.getHeader("accept-encoding");
        String acceptlanguage = request.getHeader("accept-language");

        out.println("<p>host: " + host + "</p>");
        out.println("<p>user Agent: " + useragent + "</p>");
        out.println("<p>accept-encoding: " + acceptencoding + "</p>");
        out.println("<p>accept-language: " + acceptlanguage + "</p>");

        out.println("</body></html>");


    }

    public void destroy() {
    }
}