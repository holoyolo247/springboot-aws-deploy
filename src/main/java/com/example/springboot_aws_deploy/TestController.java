package com.example.springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public  String GetData(){
        return "First message from AWS Ecs";
    }

    @GetMapping(".data")
    public String getMessage(){
        return "Second message from AWS Ecs";
    }
}
