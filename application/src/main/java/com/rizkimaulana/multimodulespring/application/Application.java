package com.rizkimaulana.multimodulespring.application;

import com.rizkimaulana.multimodulespring.library.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.rizkimaulana.multimodulespring")

public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
class Controller {
    @Autowired
    LibraryService libraryService;

    @GetMapping("/hello")
    public String hello() {
        return libraryService.hello();
    }
}