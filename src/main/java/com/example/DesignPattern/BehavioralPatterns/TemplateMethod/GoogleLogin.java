package com.example.DesignPattern.BehavioralPatterns.TemplateMethod;

public class GoogleLogin extends Login{


    @Override
    protected void loggin() {
        System.out.println("구글 로그인");
    }
}
