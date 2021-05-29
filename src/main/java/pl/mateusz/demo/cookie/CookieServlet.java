package pl.mateusz.demo.cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import pl.mateusz.demo.cookie.webapp.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@WebServlet(name ="CookieServlet", urlPatterns = "/")
public class CookieServlet {

    public Cookie cookie;


    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String cartID = request.getParameter("id");
//        if (cartID = null) {
//            int id = Integer.parseInt(cartID);
//            cartService.getCart(id)
//                    .ifPresent(s -> request.setAttribute("cartRecord", s));
//        }
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("");
//        dispatcher.forward(request, response);
    }
    @RequestMapping
    protected Cart doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
//        HttpServletRequest httpServletRequest;
//        HttpServletResponse httpServletResponse;
//        String name = httpServletRequest.getParameter("cookieCart");
//        if (name != null) {
//            javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("cookieCart", name);
//            httpServletResponse.addCookie(cookie);
//        }
//        else {
//            for (Cookie c : httpServletRequest.getCookies()) {
//                if (c.getName().equals("cookieCart")) {
//                    name = c.getValue();
//                }
//            }
//        }
        CookieReader cookieReader = new CookieReader(request);
        Optional<String> userId = cookieReader.readCookie("userId");
        Optional<String> userName = cookieReader.readCookie("userName");

        if (!userName.isPresent()) {
            response.sendRedirect("/");
        } else {
            request.setAttribute("userId", userId.get());
            request.setAttribute("sessionAttribute", request.getSession()
                    .getAttribute("sampleKey"));
        }

        if (Cookie == null){
            return new Cart(1);
        } else{
            Cookie
         }

    }







    @RequestMapping
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        //private Cookie createCookie(int cookieId, int userId){
        Cookie cookieCa = new Cookie("cookieId", "userId");
        cookieCa.setMaxAge(60 * 60);
        cookieCa.setPath("/Cart");
        cookieCa.getValue(Cart);
        cookieCa.isHttpOnly();
        response.addCookie(cookieCa);

    }


    }
