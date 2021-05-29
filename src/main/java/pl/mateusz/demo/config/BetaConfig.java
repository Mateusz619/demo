package pl.mateusz.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.mateusz.demo.School.SchoolRepository;
import pl.mateusz.demo.School.SchoolService;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class BetaConfig {
    @Bean
    @Primary
    @Qualifier("bean1")
    public Integer bean(){
        return 999;
    }
    @Bean
    @Qualifier("bean2")
    public Integer bean1(){
        return 888;
    }
    @Bean
    @Qualifier("bean-list")
    List<Integer> listNumbers (){
        return asList(1,2,3,4,5,8);
    }

    @Bean
    public SchoolService schoolService (@Autowired SchoolRepository schoolRepository){
        return new SchoolService(schoolRepository);
    }
}
