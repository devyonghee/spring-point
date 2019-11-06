package me.devyonghee.messagesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class MessageSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageSourceApplication.class, args);
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:/messages");
        source.setDefaultEncoding("UTF-8");
        source.setCacheSeconds(3);
        return source;
    }
}
