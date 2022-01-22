package nazari.sample.crud.repository;

import nazari.sample.crud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonDao extends CrudRepository<Person, Long> {

    List<Person> findPersonByName(String name);
}
