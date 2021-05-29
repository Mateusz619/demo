package pl.mateusz.demo.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.mateusz.demo.School.model.School;
import pl.mateusz.demo.School.model.SchoolHTTPRequest;
import pl.mateusz.demo.School.model.SchoolHTTPResponse;
import pl.mateusz.demo.School.model.SchoolMapper;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @GetMapping("/school/{id}")
    public SchoolHTTPResponse getSchool(@PathVariable long id){
        return schoolService.getSchool(id);
    }

    @GetMapping("/school")
    public List<SchoolHTTPResponse> getAllSchool(){
        return schoolService.getAllSchool();
    }

    @PostMapping("/school")
    public String create(SchoolHTTPRequest request){
        return schoolService.create(request);
    }

    @PutMapping("/school/{id}")
    public String update(@PathVariable long id,SchoolHTTPRequest request){
        return schoolService.update(id ,request);
    }

    @DeleteMapping("/school/{id}")
    public boolean delete(@PathVariable long id){
        return schoolService.delete(id);
    }




}
