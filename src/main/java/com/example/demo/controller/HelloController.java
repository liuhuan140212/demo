package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id",defaultValue = "0",required = false) Integer myid){
        return "id =" + myid;
    }


}
