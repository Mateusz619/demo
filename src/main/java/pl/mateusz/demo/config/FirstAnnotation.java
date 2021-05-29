package pl.mateusz.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Autowired
@Qualifier("bean")
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {
}
