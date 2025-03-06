package dev.spring.step09_component_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // TapeReader 클래스를 스프링의 컴포넌트 스캔 대상이 되도록 지정
// 해당 클래스는 애플리케이션에서 활용할 비즈니스 객체인 빈으로 등록하도록 선언, 정의
// 결과적으로 해당 클래스를 스프링 컨테이너가 관리할 하나의 Bean으로 생성, 관리하도록 적용됨
public class TapeReader {

    private final Tape tape;

    // @Autowired // 생성자가 1개만 존재할 경우, 스프링 4.3버전 이후부터 @Autowired를 사용하지 않아도 적용되도록 업데이트
    // https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/autowired.html#beans-autowired-annotation-constructor-resolution
    public TapeReader(Tape tape) {
        System.out.println("TapeReader(Tape) called");
        this.tape = tape;
    }

    public void test() {
        if (tape.isWorked()) {
            System.out.println(tape.getName() + " 정상 동작합니다.");
        } else {
            System.out.println(tape.getName() + " 사기 당했습니다.");
        }
    }

}
