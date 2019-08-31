package com.example.gg.demo_0_1;

import com.example.gg.demo_0_1.utils.ToolsBean;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:xml-test.xml")
public class SpringbootDemo1702aApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo1702aApplication.class, args);
    }
    @Bean
    public ToolsBean toolsBean() {
        return new ToolsBean();
    }
}
