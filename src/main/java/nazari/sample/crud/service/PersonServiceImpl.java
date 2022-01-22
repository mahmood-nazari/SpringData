package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.repository.IPersonDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    public List<Person> findPersonByName(String name) {
        return iPersonDao.findPersonByName(name);
    }

    @Override
    public List<Person> findPersonByNameStartingWith(String start) {
        return iPersonDao.findPersonByNameStartingWith(start);
    }

    @Override
    public List<Person> findByLastnameContaining(String contain) {
        return iPersonDao.findByLastnameContaining(contain);
    }
}
