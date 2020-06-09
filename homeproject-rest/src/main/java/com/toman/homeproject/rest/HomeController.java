package com.toman.homeproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class HomeController
{

    @GetMapping(path="/", produces = "application/json")
    public String getEmployees()
    {
        return "aaa";
    }

}
