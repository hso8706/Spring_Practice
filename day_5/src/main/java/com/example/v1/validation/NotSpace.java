package com.example.v1.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NotSpaceValidator.class})
public @interface NotSpace {
    String message() default "공백이 아니어야 합니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

/*
NotSpace @interface
-CustomAnnotation : NotSpace 라는 이름의 custom annotation 을 만들기위한 특별한 인터페이스
-3가지 필수 조건 : message(), groups(), payload() 는 custom annotation 을 만들기위해 필수적으로 작성해줘야하는 조건이다.
-필수 클래스 : @interface 로 만든 애너테이션은 애너테이션의 외면만 만드는 것이다. 애너테이션의 내부, 즉 기능을 구현하는 것을 위한 클래스를 만드는 것도 필수적인 조건이다.

@Target
-애너테이션의 위치 : 애너테이션을 어디에 붙일 수 있는지에 대한 조건을 표현한다.

@Retention
-애너테이션이 작동되는 타이밍 : 애너테이션이 언제 작용하는지에 대한 조건을 표현한다.

@Constraint
-validateBy : @Constraint 의 validateBy 속성값으로 해당 custom annotation 을 처리하는 클래스를 표현한다.
 */
