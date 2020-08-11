package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.FileUploadDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/file")
public class FileUploadController {

    @GetMapping("/upload")
    public void upload(@RequestBody FileUploadDTO fileUploadDTO) {

    }
}
