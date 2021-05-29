package pl.mateusz.demo.School;

import org.springframework.data.repository.CrudRepository;
import pl.mateusz.demo.School.model.School;

import java.util.List;

public interface SchoolRepository extends CrudRepository<School, Long> {
//    Iterable<School> findAllByLibrarian(String librarian);
//    boolean existsByLearners(String Learners);
//    void deleteAllByLibrarian(String librarian);
//    void deleteByIdAndLearner(long id, String learner);
//    List<School> findAllByTeachers(String teachers);
//    long countByLearners(String learners);
//    boolean existByLearners(String learners);

}
