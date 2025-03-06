package dev.spring.step07_annotation_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

    private Tape tape;

    // Autowiring을 생성자를 기반으로 주입하도록 지정
    @Autowired
    public TapeReader(Tape tape) {
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
