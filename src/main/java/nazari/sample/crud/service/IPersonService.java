package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;

import java.util.Collection;
import java.util.List;

public interface IPersonService {

    List<Person> findPersonByName(String name);

    List<Person> findPersonByNameStartingWith(String start);

    List<Person> findByLastnameContaining(String contain);

    List<Person> findByIdLessThanEqual(Long id);

    List<Person> findByIdBetween(Long startId, Long endId);

    List<Person> findByIdIn(Collection<Long> ids);

    List<Person> findPersonByNameOrderByNameDesc(String name);

}
