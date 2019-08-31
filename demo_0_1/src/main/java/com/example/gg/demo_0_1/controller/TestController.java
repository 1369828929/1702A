package com.example.gg.demo_0_1.controller;

import com.example.gg.demo_0_1.utils.ToolsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${file.path}")
    private String filePath;

    @Autowired
    ToolsBean toolsBean;

    @RequestMapping("hello")
    public Object hello(){
        String zhangsan = toolsBean.hello("zhangsan");
        return "hello";
    }
}
