package com.example.shapesspringboot.command;


import com.example.shapesspringboot.service.ShapeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class CommandLineBoot implements CommandLineRunner {


    private final ShapeService service;
    @Override
    public void run(String... args) throws Exception {
        service.getShapeArea();
    }
}
