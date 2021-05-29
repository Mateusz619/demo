package pl.mateusz.demo.cookie;

import pl.mateusz.demo.cookie.webapp.CookieCart;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FinalCookie {

//    Cookie cookieCart = new Cookie("cookie", "cart");
//    response.addCookie(CookieCart);
//
//    CookieCart.setMaxAge(60*60);
//    CookieCart.setDomain("localhost/8080");
//    CookieCart.setPath("/welcomeUser");

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String name = httpServletRequest.getParameter("cookieCart");
        if (name != null) {
            javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("cookieCart", name);
            httpServletResponse.addCookie(cookie);
        }
        else {
            for (Cookie c : httpServletRequest.getCookies()) {
                if (c.getName().equals("cookieCart")) {
                    name = c.getValue();
                }
            }


        }}}