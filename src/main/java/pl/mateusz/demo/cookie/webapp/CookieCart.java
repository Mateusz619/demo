package pl.mateusz.demo.cookie.webapp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello.cookie")
public class CookieCart extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
//        int id = httpServletRequest.getParameter("id");
//        if (id != null) {
//            Cookie cookie = new Cookie("id", id);
//            httpServletResponse.addCookie(cookie);
//        }
//        else {
//            for (Cookie c : httpServletRequest.getCookies()) {
//                if (c.getId().equals("id")) {
//                    id = c.getValue();
//                }
//            }
//        }
//        Product product = httpServletRequest.getParameter("product");
//        if (product !> null) {
//            Cookie cookie = new Cookie("product", product);
//            httpServletResponse.addCookie(cookie);
//        }
//        else {
//            for (Cookie v : httpServletRequest.getCookies()){
//                if (v.getProduct().equals("product")){
//                    product = v.getValue();
//                }
//            }
//        }
//
//        if (product == null)
//            product = "default";
//        httpServletResponse.getWriter().print("Hello  " + "" + product + "?" );
//
//
//    }
    }}