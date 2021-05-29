package pl.mateusz.demo.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.mateusz.demo.School.model.School;
import pl.mateusz.demo.School.model.SchoolHTTPRequest;
import pl.mateusz.demo.School.model.SchoolHTTPResponse;
import pl.mateusz.demo.School.model.SchoolMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;



public class SchoolService {

    public final SchoolRepository schoolRepository;


    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    public SchoolHTTPResponse getSchool( long id){
        School school = schoolRepository.findById(id).get();
        SchoolHTTPResponse response = SchoolMapper.map(school);
        return response;
    }
    public List<SchoolHTTPResponse> getAllSchool(){
        return stream(schoolRepository.findAll().spliterator(),false)
                .map(school -> SchoolMapper.map(school))
                .collect(Collectors.toList());


//        Iterable<School> schools = schoolRepository.findAll();
//        List<SchoolHTTPResponse> responseSchool = new ArrayList<>();
//        for(School school : schools){
//            responseSchool.add(SchoolMapper.map(school));
//        }
//        return responseSchool;
    }

    public List<SchoolHTTPResponse> existByLibrarian(){
        Iterable<School> schools = schoolRepository.findAll();
        List<SchoolHTTPResponse> responseSchool = new ArrayList<>();
        for(School school : schools){
            responseSchool.add(SchoolMapper.map(school));
        }
        return responseSchool;
    }
//    public static boolean existsByLearners(String learners ){
//        if(SchoolRepository.existsByLearners(learners)){
//            return true;
//        }
//        return false;
//    }

    public boolean delete(long id){
        if(schoolRepository.existsById(id)){
            schoolRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public String create(SchoolHTTPRequest school){
        School schoolEntity = SchoolMapper.map(school);
        School save = schoolRepository.save(schoolEntity);
        return String.valueOf(save.getId());
    }
    public String update(long id, SchoolHTTPRequest school){
        School schoolEntity = SchoolMapper.map(school);
        schoolEntity.setId(id);
        School save = schoolRepository.save(schoolEntity);
        return String.valueOf(save.getId());
    }


}
