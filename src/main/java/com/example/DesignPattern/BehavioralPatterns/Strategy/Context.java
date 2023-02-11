package com.example.DesignPattern.BehavioralPatterns.Strategy;

public class Context {
    /**
     * Context와 전략을 분리하는 패턴
     * 통상 변하지 않는 것은 context, 변하는 부분은 Strategy
     * 인터페이스인 Strategy가 변하지 않는 이상, 구현체들을 변경할 필요가 없다.
     * */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void hello() {
        System.out.println(strategy);
    }

    // 구현체를 직접 파라미터로 전달해서 사용 - 실행할 때마다 전략을 계속 지정해주어야 하지만, 유연하게 변경할 수 있다는 장점 존재
    public void callback(Strategy strategy) {
        System.out.println(strategy);
    }
}
