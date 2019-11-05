package com.devyonghee.resourceloader;

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
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.exists());

        File file = resource.getFile();
        System.out.println(new String(Files.readAllBytes(file.toPath())));
    }
}
