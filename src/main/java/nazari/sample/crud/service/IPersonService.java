package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;

import java.util.List;

public interface IPersonService {

    List<Person> findPersonByName(String name);

}
