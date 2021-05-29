package pl.mateusz.demo.School.model;

public class SchoolNumberHTTPRequest {
    public int number;

    public SchoolNumberHTTPRequest(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static SchoolNumberHTTPRequestBuilder builder() {
        return new SchoolNumberHTTPRequestBuilder();
    }

    public static final class SchoolNumberHTTPRequestBuilder {
        public int number;

        private SchoolNumberHTTPRequestBuilder() {
        }


        public SchoolNumberHTTPRequestBuilder number(int number) {
            this.number = number;
            return this;
        }

        public SchoolNumberHTTPRequest build() {
            return new SchoolNumberHTTPRequest(number);
        }
    }
}
