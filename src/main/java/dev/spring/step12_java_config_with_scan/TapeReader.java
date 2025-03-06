package dev.spring.step12_java_config_with_scan;

import org.springframework.stereotype.Component;

@Component
public class TapeReader {

    private final Tape tape;

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