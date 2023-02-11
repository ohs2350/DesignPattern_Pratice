package com.example.DesignPattern.BehavioralPatterns.TemplateCallback;

public class Template {
    /**
     * 템플릿 콜백 패턴
     * 전략 패턴의 변형, 전략 패턴에 익명 내부 클래스를 가미해서 사용하는 방법
     * Context 를 실행할 때마다 Strategy 를 변경할 수 있다. 즉, 일반적인 전략패턴보다 유연하게 전략 변경이 가능
     * OCP, DIP가 적용된 설계 패턴
     * */

    public void runContext() {
        long startTime = System.currentTimeMillis();
        execute().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private Strategy execute() {
        return new Strategy() {
            @Override
            public void run() {
                System.out.println("callback 실행");
            }
        };
    }
}
