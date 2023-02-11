package com.example.DesignPattern.BehavioralPatterns.TemplateMethod;

public abstract class Login {
    /**
     * 템플릿 메소드 패턴
     * 변하지 않는 부분을 추상 클래스 내 메서드로 정의
     * 변하는 부분을 추상 클래스 내 abstract 메서드로 정의
     * 자식 클래스는 부모 클래스의 기능을 전혀 사용하지 않지만 부모 클래스의 코드를 가지고 있다. - 단점
     * */

    protected void security() {
        System.out.println("정보 확인");
    }
    protected abstract void loggin();

    // 템플릿 메소드
    public void doLogin() {
        security();
        loggin();
    }
}
