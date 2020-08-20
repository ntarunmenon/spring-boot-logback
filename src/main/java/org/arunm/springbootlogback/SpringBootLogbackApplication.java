package org.arunm.springbootlogback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLogbackApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(SpringBootLogbackApplication.class);

    @GetMapping
    public String helloWorld() {
        LOG.info("going to return hello world now");
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLogbackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.debug("Only available in profile LOCAL");
        LOG.info("Available in LOCAL and DEV");
    }
}
