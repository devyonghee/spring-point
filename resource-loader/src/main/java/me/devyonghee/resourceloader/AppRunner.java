package me.devyonghee.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        new FileSystemXmlApplicationContext("test.xml");
//        new ClassPathXmlApplicationContext("test.xml");

        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("classpath:test.txt");
//        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println(resource.getClass());
        System.out.println(resource.exists());

        File file = resource.getFile();
        System.out.println(new String(Files.readAllBytes(file.toPath())));
//        JAVA 11
//        System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}
