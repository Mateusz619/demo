package pl.mateusz.demo.cookie.servConItp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CookieController {
    private final CookieService cookieService;

    @Autowired
    public CookieController(CookieService cookieService) {
        this.cookieService = cookieService;
    }

    @GetMapping(value = "/cookie/{id}")
    public CookieHTTPResponse getCookieById(@PathVariable long id) {
        return CookieService.getCookieById(id);
    }
    @PostMapping(value = "/save/cookie")
    public long saveCookie(@RequestBody CookieHTTPResponse cookieHTTPResponse) {
        return cookieService.saveCookie(cookieHTTPResponse);
    }



}
