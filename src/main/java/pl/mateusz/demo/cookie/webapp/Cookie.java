package pl.mateusz.demo.cookie.webapp;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Cookie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToMany
    private long CookieId;

//    public Cookie(long cookieId) {
//        CookieId = cookieId;
//    }
//
//    public long getCookieId() {
//        return CookieId;
//    }
//
//    public void setCookieId(long cookieId) {
//        CookieId = cookieId;
//    }

//    private Cookie createCookie(long cookieCaId){
//        Cookie cookie1 = new Cookie(cookieCaId);
//        cookie1.setPath("/");
//        cookie1.setMaxAge(60*60);
//        cookie1.setHttpOnly(true);
//        cookie1.setSecure(true);
//        return cookie1;
//    }
}
