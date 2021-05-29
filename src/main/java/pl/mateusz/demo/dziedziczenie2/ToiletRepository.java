package pl.mateusz.demo.dziedziczenie2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToiletRepository extends CrudRepository<Toilet, Long> {
}
