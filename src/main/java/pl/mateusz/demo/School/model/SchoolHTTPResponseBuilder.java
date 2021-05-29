package pl.mateusz.demo.School.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SchoolHTTPResponseBuilder {
    public int id;
    public String learners;
    public String teachers;

//    public SchoolHTTPResponseBuilder() {
//
//    }
//    public static SchoolHTTPResponseBuilder builder(){
//        return new SchoolHTTPResponseBuilder();
//    }
//    public SchoolHTTPResponseBuilder id(int id){
//        this.id= id;
//        return this;
//    }
//    public SchoolHTTPResponseBuilder learners(String learners){
//        this.learners= learners;
//        return this;
//    }
//    public SchoolHTTPResponseBuilder teachers(String teachers){
//        this.teachers= teachers;
//        return this;
//    }
//    public SchoolHTTPResponse build(){
//        return new SchoolHTTPResponse (id, learners, teachers);
//    }

}
