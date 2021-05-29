package pl.mateusz.demo.cookie.servConItp;

public class CookieHTTPResponse {
    private long id;

    public CookieHTTPResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static CookieHTTPResponseBuilder builder() {
        return new CookieHTTPResponseBuilder();
    }

    public static final class CookieHTTPResponseBuilder {
        private long id;

        private CookieHTTPResponseBuilder() {
        }

        public CookieHTTPResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public CookieHTTPResponse build() {
            return new CookieHTTPResponse(id);
        }
    }
}
