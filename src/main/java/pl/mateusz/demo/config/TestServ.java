package pl.mateusz.demo.config;

import org.springframework.stereotype.Service;

@Service
public class TestServ {
    public static void create(String typ, int quantity){
        System.out.println("Create");
    }
    public static void delete(String typ, int quantity){
        System.out.println("Delete");
    }
    public static void update(String typ, int quantity){
        System.out.println("Update");
    }
}
