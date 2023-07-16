package com.example.shapesspringboot.model;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import java.util.Scanner;


@Component
@ConditionalOnProperty
        (value = "chose.shape",
        havingValue = "rectangle",
        matchIfMissing = true)
public class Rectangle implements Shape{

    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a: ");
        int a = scanner.nextInt();
        System.out.print("Please type b: ");
        int b = scanner.nextInt();
        scanner.close();
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
