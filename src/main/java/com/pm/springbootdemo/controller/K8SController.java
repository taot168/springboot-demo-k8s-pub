package com.pm.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SController {
    @RequestMapping("/k8s")
    public String k8s() {
        return "hello K8s pm 123 456 789 0101" ;
    }
}
