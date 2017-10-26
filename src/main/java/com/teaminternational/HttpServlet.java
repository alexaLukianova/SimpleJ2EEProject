package com.teaminternational;

import com.teaminternational.web.BaseHttpServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServlet extends BaseHttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        super.doGet(req,resp);
        HelloWorldGenerator helloWorldGenerator = getBean(HelloWorldGenerator.COMPONENT_NAME);
        helloWorldGenerator.sayHello();

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola</title>");
        out.println("</head");
        out.println("<body bgcolor = \"white\">");
        out.println(helloWorldGenerator.sayHello());
        out.println("</body>");
        out.println("</html>");
    }
}
