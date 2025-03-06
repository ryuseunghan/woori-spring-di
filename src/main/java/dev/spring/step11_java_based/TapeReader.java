package dev.spring.step11_java_based;

import org.springframework.stereotype.Component;

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
