package com.example.shapesspringboot.command;


import com.example.shapesspringboot.model.Shape;
import com.example.shapesspringboot.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CommandLineBoot implements CommandLineRunner {

    @Autowired
    ShapeService service;
    @Override
    public void run(String... args) throws Exception {
        service.getShapeArea();
    }
}
