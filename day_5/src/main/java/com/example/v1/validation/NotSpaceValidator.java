package com.example.v1.validation;


import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotSpaceValidator implements ConstraintValidator<NotSpace, String> {

    @Override
    public void initialize(NotSpace constraintAnnotation){
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context){
        return value == null || StringUtils.hasText(value);
    }
}

/*
NotSpaceValidator Class
-CustomAnnotation 처리 클래스 : NotSpace 의 기능을 구현하는 클래스이다.
-ConstraintValidator : custom annotation 을 처리하는 클래스를 만들때 꼭 구현해야하는 interface 이다.

ConstraintValidator<A,B>
-필수 인터페이스 : custom annotation 을 처리하는 클래스를 만들때 꼭 구현해야하는 interface 이다.
-A : custom annotation 의 이름을 넣어준다.
-B : custom annotation 으로 검증할 대상 멤버 변수의 타입을 넣어준다.
-initialize(), isValid() : 필수로 구현해주어야 할 ConstraintValidator 의 메서드이다.
-initialize() : custom annotation 가 사용되는 곳의 객체를 받는 느낌이다. 애너테이션이 사용된 것을 확인하고 isValid 를 작동한다.
-isValid() : custom annotation 으로 검증할 대상에 대한 검증 방식을 작성한 메서드이다.
 */
