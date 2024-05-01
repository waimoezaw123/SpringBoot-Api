package com.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/data/v1")
public class BookController {

    @RequestMapping(value="/book",method=RequestMethod.GET)
    public String Book(){
        return "Hell World";
    }
}
