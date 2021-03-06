package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.repository.IPersonDao;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    @Transactional
    public List<Person> findPersonByName(String name) {
        return iPersonDao.findPersonByName(name);
    }

    @Override
    @Transactional
    public List<Person> findPersonByNameStartingWith(String start) {
        return iPersonDao.findPersonByNameStartingWith(start);
    }

    @Override
    @Transactional
    public List<Person> findByLastnameContaining(String contain) {
        return iPersonDao.findByLastnameContaining(contain);
    }

    @Override
    @Transactional
    public List<Person> findByIdLessThanEqual(Long id) {
        return iPersonDao.findByIdLessThanEqual(id);
    }

    @Override
    @Transactional
    public List<Person> findByIdBetween(Long startId, Long endId) {
        return iPersonDao.findByIdBetween(startId, endId);
    }

    @Override
    @Transactional
    public List<Person> findByIdIn(Collection<Long> ids) {
        return iPersonDao.findByIdIn(ids);
    }

    @Override
    @Transactional
    public List<Person> findPersonByNameOrderByNameDesc(String name) {
        return iPersonDao.findPersonByNameOrderByNameDesc(name);
    }
}
