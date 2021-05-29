package pl.mateusz.demo.Buffet;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mateusz.demo.Buffet.Buffet;

@Repository
public interface BuffetRepository extends CrudRepository<Buffet, Long> {
}
