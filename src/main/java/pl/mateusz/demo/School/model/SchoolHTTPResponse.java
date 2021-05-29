package pl.mateusz.demo.School.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SchoolHTTPResponse {
    public int id;
    public String learners;
    public String teachers;


    public SchoolHTTPResponse(int id, String learners, String teachers) {
        this.id = id;
        this.learners = learners;
        this.teachers = teachers;
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLearners() {
//        return learners;
//    }
//
//    public void setLearners(String learners) {
//        this.learners = learners;
//    }
//
//    public String getTeachers() {
//        return teachers;
//    }
//
//    public void setTeachers(String teachers) {
//        this.teachers = teachers;
//    }

}
