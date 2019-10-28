package com.tutorial.processserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("api/v1")
public class ProcessController {

    @GetMapping("process")
    public ResponseEntity<?> getAllProcess(){
        HashMap<String,Object> resp = new HashMap<>();
        resp.put("result", "this is result");
        resp.put("error", false);
        resp.put("msg", "Success");
        return new ResponseEntity<>(resp, HttpStatus.OK);

    }

}
