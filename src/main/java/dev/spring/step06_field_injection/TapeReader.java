package dev.spring.step06_field_injection;

import org.springframework.beans.factory.annotation.Autowired;

// Tape 클래스를 테스트할 수 있는 비디오 기기
public class TapeReader {
    @Autowired // 설정 파일인 .xml 파일에서 Tape 타입에 해당하는 Bean들을
    private Tape tape;

    public TapeReader(Tape tape) {
        this.tape = tape;
    }
    // 비디오가 잘 동작하는지 테스트해주는 메서드
    public void test() {
        if (tape.isWorked()) {
            System.out.println(tape.getName() + " 정상 동작합니다.");
        } else {
            System.out.println(tape.getName() + " 사기 당했습니다.");
        }
    }

}