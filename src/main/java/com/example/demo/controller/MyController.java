package com.example.demo.controller;

import com.example.demo.dto.Student;
import com.example.demo.dto.StudentInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ozads
 * @version v1.0
 * @project demo1
 * @since 2024-06-27
 **/
@RestController
@RequestMapping("/my")
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> printHello(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") Integer id){
        return ResponseEntity.ok("Hello"+id);
    }

    @GetMapping("/myget")
    public ResponseEntity<String> myget(@RequestParam Integer id){
        return ResponseEntity.ok("Hello"+id);
    }

    @PostMapping("/mypost")
    public ResponseEntity<String> post(@RequestBody Student student){
        return ResponseEntity.ok("Hello"+student.getName());
    }

    @PostMapping("/mypostwithfile")
    public ResponseEntity<String> postWithFile(
        @ModelAttribute StudentInfo student){
        return ResponseEntity.ok(String.valueOf(
            student.getFile().getSize()));
    }
}
