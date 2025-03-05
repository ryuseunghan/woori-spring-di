package dev.spring.step01_dependency;

import org.example.step01_dependecy.Tape;

/**
 * 내 방
 *
 * 비디오 테이프를 빌렸는데, 내 방에서 Tape(.java)가 잘 돌아가는지 테스트
 * 테스트는 비디오 테스트 기기인 TapeReader(.java)를 통해 수행할 수 있음
 */
public class MyRoom {
    public static void main(String[] args) {
        TapeReader reader = new TapeReader();

        Tape tape = new Tape("아일랜드", true);

        // TapeReader는 Tape에 의존하고 있음(dependent)

        // setter()를 통해 Tape 타입에 대한 의존성(dependency)를 TapeReader에게 주입(Injection)
        reader.setTape(tape);
        // -> TapeReader라는 클래스는 Tape라는 타입의 클래스가 없으면 동작할 수 없다는 것

        // 테스트 수행
        reader.test();
    }
}
