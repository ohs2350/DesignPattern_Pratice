package com.example.DesignPattern.CreationalPatterns.Singleton;

public enum EnumSingleton {
    /**
     * 3. enum타입 싱글톤 구현
     * enum 타입은 기본적으로 직렬화 가능하므로 Serializable 인터페이스를 구현할 필요가 없고, 리플렉션 문제도 발생하지 않는다.
     * 인스턴스가 JVM 내에 하나만 존재한다는 것이 100% 보장 되므로, Java에서 싱글톤을 만드는 가장 좋은 방법으로 권장된다.
     * 클래스로 싱글톤을 만들 시 생성자가 무조건 private인데 Reflection으로 접근한다면 문제가 발생한다.
     *
     * 즉, Enum Singleton은 Thread-safety, Serialization 보장, Reflection 공격도 안전
     * */

    INSTANCE;
}
