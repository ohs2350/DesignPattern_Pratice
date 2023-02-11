package com.example.DesignPattern.StructuralPatterns.Decorator;

public class ChocoLatteDecorator extends LatteDecorator{
    public ChocoLatteDecorator(final Coffee coffee) {
        super(coffee);
    }

    @Override
    public void make() {
        super.make();
        System.out.println(" + 초코 시럽");
    }
}
