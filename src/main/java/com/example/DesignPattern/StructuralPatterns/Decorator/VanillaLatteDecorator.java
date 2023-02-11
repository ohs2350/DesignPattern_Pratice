package com.example.DesignPattern.StructuralPatterns.Decorator;

public class VanillaLatteDecorator extends LatteDecorator{
    public VanillaLatteDecorator(final Coffee coffee) {
        super(coffee);
    }

    @Override
    public void make() {
        super.make();
        System.out.println(" + 바닐라 시럽");
    }
}
