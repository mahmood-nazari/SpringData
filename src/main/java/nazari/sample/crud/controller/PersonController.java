package nazari.sample.crud.controller;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    /*
     * you must send request to server with this template for use bellow method:
     * http://localhost:8080/person/find-by-name?theName=sampleName
     * */
    @GetMapping("find-by-name")
    public List<Person> findPersonByName(@RequestParam String theName) {
        return iPersonService.findPersonByName(theName);
    }

    @GetMapping("find-by-name-start-with")
    public List<Person> findPersonByNameStartingWith(@RequestParam String start) {
        return iPersonService.findPersonByNameStartingWith(start);
    }

    @GetMapping("find-by-name-contain")
    public List<Person> findByLastnameContaining(@RequestParam String contain) {
        return iPersonService.findByLastnameContaining(contain);
    }

    @GetMapping("find-by-id-less-than/{id}")
    public List<Person> findByIdLessThanEqual(@PathVariable Long id) {
        return iPersonService.findByIdLessThanEqual(id);
    }
}