package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;

public interface IPersonService {

    Person saveOrUpdate(Person person);

    Person getById(Long id);

    Iterable<Person> getAllPerson();

    void deleteById(Long id);
}
