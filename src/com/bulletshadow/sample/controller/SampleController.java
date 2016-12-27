package com.bulletshadow.sample.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"api/v1.0/sample"})
public class SampleController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String addAppContentInfo(@PathVariable Long id) {

        return id.toString();
    }
}  