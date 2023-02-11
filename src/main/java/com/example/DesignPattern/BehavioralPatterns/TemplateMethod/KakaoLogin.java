package com.example.DesignPattern.BehavioralPatterns.TemplateMethod;

public class KakaoLogin extends Login{

    @Override
    protected void loggin() {
        System.out.println("카카오 로그인");
    }
}
