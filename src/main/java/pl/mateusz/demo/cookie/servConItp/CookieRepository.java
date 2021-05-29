package pl.mateusz.demo.cookie.servConItp;

import org.springframework.data.repository.CrudRepository;

import javax.servlet.http.Cookie;

public interface CookieRepository extends CrudRepository <Cookie, Long> {
}
