package com.fc.cicd.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("")
    fun home(): String{
        var i = 1;
        if (i == 1) {
            return "Hello World $i";
        } else {
            return "Hello World 2";
        }
    }
}