package br.com.sharkdays;

import br.com.codandosimples.infra.ConnectionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(urlPatterns = {"/xpto", "/teste", "*.cnn"})
public class PrimeiraServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Primeira página gerada através da Servlet!</h1>");
        writer.println("</body>");
        writer.println("</html>");

        Connection connection = ConnectionFactory.getConnection();


    }
}
