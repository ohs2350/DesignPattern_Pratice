package com.example.DesignPattern.CreationalPatterns.Singleton;

public class Singleton {
    /**
     * 싱글톤 구현 2 - static inner class사용
     * 멀티스레드 환경에서 안전하다.
     * getInstance()가 호출될때 생성
     * */
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }


//    /**
//     * 싱글톤 구현 1
//     * 생성자를 private로 구현하고 if문을 주어 인스턴스 1개만 생성하게 함
//     * 하지만, 멀티스레드 환경에서 안전하지 않은 문제점을 가짐
//     * */
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
}
