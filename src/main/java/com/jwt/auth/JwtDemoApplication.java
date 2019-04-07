package com.jwt.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.sql.Time;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        JwtDemoApplication.class,
        Jsr310JpaConverters.class})
public class JwtDemoApplication {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
    public static void main(String[] args) {
        SpringApplication.run(JwtDemoApplication.class, args);
    }

}
