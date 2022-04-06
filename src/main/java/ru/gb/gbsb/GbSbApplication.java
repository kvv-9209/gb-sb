package ru.gb.gbsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.gb.gbsb.controller.ShopController;
import ru.gb.gbsb.repository.ProductRepository;
import ru.gb.gbsb.service.ProductService;

@SpringBootApplication
@EnableWebMvc
public class GbSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(GbSbApplication.class, args);
    }

}
