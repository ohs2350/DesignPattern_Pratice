package com.example.DesignPattern.StructuralPatterns.Decorator;

public class Americano implements Coffee{
    @Override
    public void make() {
        System.out.println("에스프레소 + 물");
    }
}
