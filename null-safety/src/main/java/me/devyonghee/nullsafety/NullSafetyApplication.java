package me.devyonghee.nullsafety;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NullSafetyApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(NullSafetyApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
//        SpringApplication.run(NullSafetyApplication.class, args);
    }

}
