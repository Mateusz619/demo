package pl.mateusz.demo.School.model;

public class SchoolMapper {
    public static SchoolHTTPResponse map(School school){
        return SchoolHTTPResponse.builder()
                .learners(school.getLearners())
                .teachers(school.getTeachers())
                .build();
    }
    public static School map(SchoolHTTPRequest school){
        return School.builder()
                .learners(school.getLearners())
                .teachers(school.getTeachers())
                .build();
    }
}
