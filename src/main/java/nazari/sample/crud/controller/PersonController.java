package nazari.sample.crud.controller;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @PostMapping("save-or-update")
    public Person saveOrUpdate(@RequestBody Person person) {
        return iPersonService.saveOrUpdate(person);
    }

    @GetMapping("get-by-id/{id}")
    public Person getById(@PathVariable Long id) {
        return iPersonService.getById(id);
    }

    @GetMapping("get-all")
    public Iterable<Person> getAll() {
        return iPersonService.getAllPerson();
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Long id) {
        iPersonService.deleteById(id);
    }
}
