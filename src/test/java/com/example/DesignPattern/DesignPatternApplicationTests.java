package com.example.DesignPattern;

import com.example.DesignPattern.BehavioralPatterns.TemplateCallback.Template;
import com.example.DesignPattern.BehavioralPatterns.TemplateMethod.GoogleLogin;
import com.example.DesignPattern.BehavioralPatterns.TemplateMethod.KakaoLogin;
import com.example.DesignPattern.BehavioralPatterns.TemplateMethod.Login;
import com.example.DesignPattern.StructuralPatterns.Decorator.Americano;
import com.example.DesignPattern.StructuralPatterns.Decorator.ChocoLatteDecorator;
import com.example.DesignPattern.StructuralPatterns.Decorator.Coffee;
import com.example.DesignPattern.StructuralPatterns.Decorator.VanillaLatteDecorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("데코레이터 패턴 테스트")
	void decorator() {
		Coffee americano = new Americano();
		americano.make();
		System.out.println();

		Coffee vanilla = new VanillaLatteDecorator(new Americano());
		vanilla.make();
		System.out.println();

		Coffee choco = new ChocoLatteDecorator(new Americano());
		choco.make();
		System.out.println();

		Coffee chocoVanilla = new ChocoLatteDecorator(new VanillaLatteDecorator(new Americano()));
		chocoVanilla.make();
	}

	@Test
	@DisplayName("템플릿 메소드 패턴 테스트")
	void TemplateMethod() {
		Login kakao = new KakaoLogin();
		kakao.doLogin();

		Login google = new GoogleLogin();
		google.doLogin();
	}

	@Test
	@DisplayName("템플릿 콜백 패턴 테스트")
	void TemplateCallback() {
		Template template = new Template();
		template.runContext();
	}
}
