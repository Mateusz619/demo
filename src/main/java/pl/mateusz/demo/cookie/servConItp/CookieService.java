package pl.mateusz.demo.cookie.servConItp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.util.ArrayList;

@Service
public class CookieService {

    private final CookieRepository cookieRepository;

    @Autowired

    public CookieService(CookieRepository cookieRepository) {
        this.cookieRepository = cookieRepository;
    }
    public static CookieHTTPResponse getCookieById(long id) {
        return CookieRepository.findById(id)
                .map(CookieMapper::map)
                .orElseThrow();
    }
    public long saveCookie(CookieHTTPResponse cookieHTTPResponse) {
        Cookie cookie = CookieMapper.map(cookieHTTPResponse);
        return CookieRepository.save(Cookie).getId();
    }
}
