package com.example.DesignPattern.StructuralPatterns.Decorator;

public class LatteDecorator implements Coffee{
    private Coffee coffee;

    public LatteDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void make() {
        coffee.make();
        System.out.println("+ 우유");
    }
}
