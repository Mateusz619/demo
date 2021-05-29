package pl.mateusz.demo.School.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SchoolHTTPRequest {
    private SchoolHTTPRequest schoolNumber;
    public String learners;
    public String teachers;

    public SchoolHTTPRequest(SchoolHTTPRequest schoolNumber, String learners, String teachers) {
        this.schoolNumber = schoolNumber;
        this.learners = learners;
        this.teachers = teachers;
    }

//    public SchoolHTTPRequest getSchoolNumber() {
//        return schoolNumber;
//    }
//
//    public void setSchoolNumber(SchoolHTTPRequest schoolNumber) {
//        this.schoolNumber = schoolNumber;
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
//
//    public static SchoolHTTPRequestBuilder builder() {
//        return new SchoolHTTPRequestBuilder();
//    }
//
//    public static final class SchoolHTTPRequestBuilder {
//        public String learners;
//        public String teachers;
//        private SchoolHTTPRequest schoolNumber;
//
//        private SchoolHTTPRequestBuilder() {
//        }
//
//        public SchoolHTTPRequestBuilder schoolNumber(SchoolHTTPRequest schoolNumber) {
//            this.schoolNumber = schoolNumber;
//            return this;
//        }
//
//        public SchoolHTTPRequestBuilder learners(String learners) {
//            this.learners = learners;
//            return this;
//        }
//
//        public SchoolHTTPRequestBuilder teachers(String teachers) {
//            this.teachers = teachers;
//            return this;
//        }
//
//        public SchoolHTTPRequest build() {
//            return new SchoolHTTPRequest(schoolNumber, learners, teachers);
//        }
//    }
}
