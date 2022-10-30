package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5Application {

	public static void main(String[] args) {
		SpringApplication.run(Day5Application.class, args);
	}

}

/*
@SpringBootApplication
1. 자동 구성 활성화
2. @ComponentScan : @Component 들을 찾아서 자동으로 Bean 으로 등록
3. @Configuration 이 붙은 클래스를 찾아 자동으로 Bean 으로 등록

Class Day5Application
-Entrypoint Class : 애플리케이션의 시작점
-Spring Boot(initializer)로 자동 생성

SpringApplication.run(Day5Application.class, args);
-Spring app Bootstrap : 애플리케이션 실행 전 설정 작업을 수행하는 단계를 의미.
*/