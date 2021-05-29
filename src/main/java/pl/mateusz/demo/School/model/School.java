package pl.mateusz.demo.School.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
//    @ManyToMany(fetch = FetchType.EAGER)
    public String learners;
    public String teachers;


//    public School(long id, String learners, String teachers) {
//        this.id = id;
//        this.learners = learners;
//        this.teachers = teachers;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
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
//
//    public static SchoolBuilder builder() {
//        return new SchoolBuilder();
//    }
//
//    public static final class SchoolBuilder {
//        public int id;
//        public String learners;
//        public String teachers;
//
//        private SchoolBuilder() {
//        }
//
//        public SchoolBuilder id(int id) {
//            this.id = id;
//            return this;
//        }
//
//        public SchoolBuilder learners(String learners) {
//            this.learners = learners;
//            return this;
//        }
//
//        public SchoolBuilder teachers(String teachers) {
//            this.teachers = teachers;
//            return this;
//        }
//
//        public School build() {
//            return new School(id, learners, teachers);
//        }
//    }
}
