package org.itstep.controller;

import org.itstep.model.SpringPogo;
import org.itstep.service.SpringPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/spring-pojo")

public class SpringPojoController {
    @Autowired
    SpringPojoService springPojoService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SpringPogo> save(@RequestParam SpringPogo springPogo){
        SpringPogo savedSpringPojo = springPojoService.save(springPogo);
        if(savedSpringPojo != null){
            return new ResponseEntity<SpringPogo>(savedSpringPojo, HttpStatus.OK);
        }
        return new ResponseEntity<SpringPogo>(HttpStatus.METHOD_NOT_ALLOWED);
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SpringPogo> update(@RequestParam SpringPogo springPogo){
        SpringPogo savedSpringPojo = springPojoService.update(springPogo);
        if(savedSpringPojo != null){
            return new ResponseEntity<SpringPogo>(savedSpringPojo, HttpStatus.OK);
        }
        return new ResponseEntity<SpringPogo>(HttpStatus.METHOD_NOT_ALLOWED);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SpringPogo> get(@RequestParam Integer id){
        SpringPogo foundSpringPojo = springPojoService.get(id);
        if(foundSpringPojo != null){
            return new ResponseEntity<SpringPogo>(foundSpringPojo, HttpStatus.OK);
        }
        return new ResponseEntity<SpringPogo>(HttpStatus.METHOD_NOT_ALLOWED);
    }
    @DeleteMapping
    public ResponseEntity<SpringPogo> delete(@RequestParam Integer id){
        springPojoService.delete(id);

            return new ResponseEntity<SpringPogo>( HttpStatus.OK);}

}
