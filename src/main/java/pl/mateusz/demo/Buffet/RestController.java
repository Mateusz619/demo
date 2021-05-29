package pl.mateusz.demo.Buffet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    CinemaRepository cinemaRepository;

//    @GetMapping("/first/endpoint")
//    public String get(){
//        return "hi";
//    }
//    @PostMapping("/binary")
//    public int post(){
//        return 10010010;
//    }
//    @GetMapping("/second/{id}")
//    public long second(@PathVariable long id){
//        return id;
//    }
//    @DeleteMapping("/third/{id}")
//    public String third(@PathVariable long id, @RequestParam String brand, @RequestParam String model){
//        return id + " " + brand + " " + model;
//    }

    @PutMapping("/fourth/{id}")
    public String fourth(@PathVariable long id, @RequestParam String brand, @RequestHeader String cost) {
        return id + " " + brand + " " + "I am expensive, my cost = " + cost;
    }

//    @PostMapping("/cinema")
//    public String cinema(@RequestBody CinemaReq cinema){
//        return cinema.toString();
//    }
    @GetMapping("/qwer")
    public Iterable<Cinema> cinema1(){
        return cinemaRepository.findAll();
    }
    @GetMapping("/qwer/{id}")
    public Cinema cinema2(@PathVariable long id){
        return cinemaRepository.findById(id).get();
    }

//    @PostMapping("/rewq")
//    public long asd(@RequestBody CinemaReq cinemaReq){
//        Cinema cinema = new Cinema(1,"room 32",5, LocalDateTime.now(), Movies.KIDS, new Buffet( new AccessoriesStore(2,"toys"),"pop corn", "Cola"));
//        Cinema save = cinemaRepository.save(cinema);
//        return save.getId();
//    }


    }

