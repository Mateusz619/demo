package pl.mateusz.demo.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static java.util.Arrays.asList;

@WebServlet("/")
public class ServletController extends HttpServlet {
    private Objects PersonalCart;

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException, ServletException {
        httpServletRequest
                .getRequestDispatcher("/aa.jsp")
                .forward(httpServletRequest, httpServletResponse);

    }
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException, ServletException {
        String cookie1 = httpServletRequest.getParameter("cookie1");
        httpServletRequest
                .setAttribute("Message1", cookie1);

                asList(PersonalCart
                );
        httpServletRequest
                .getRequestDispatcher("/CookieView.jsp")
                .forward(httpServletRequest, httpServletResponse);
    }
}