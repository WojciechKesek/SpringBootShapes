package com.example.shapesspringboot.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty
        (value = "chose.shape",
        havingValue = "square",
        matchIfMissing = false)
public class Square implements Shape{

    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a: ");
        int a = scanner.nextInt();
        scanner.close();
        return a*a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
