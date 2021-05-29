package pl.mateusz.demo.cookie.servConItp;

import javax.servlet.http.Cookie;

public class CookieMapper {
    public static CookieHTTPResponse map(Cookie cookie){
        return CookieHTTPResponse.builder()
                .id(cookie.getId())
                .build();
    }
}
