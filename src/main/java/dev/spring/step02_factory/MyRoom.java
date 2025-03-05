package dev.spring.step02_factory;

import static dev.spring.step02_factory.TapeCompany.createTape;
import static dev.spring.step02_factory.TapeCompany.createTapeReader;

/**
 * MyRoom도 클래스임
 * 따라서 MyRoom도 TapeReader에게 의존하고 있다고 볼 수 있음
 * (main()이 동작하려면 TapeReader가 있어야 하기 때문)
 *
 * 같은 맥락으로 TapeReader.java를 보면 Tape에게 의존하고 있는 것과 마찬가지
 *
 * Task.
 * 1. MyRoom이 TapeReader에 대한 의존도를 낮추려면??
 * -> new TapeReader()라는 코드를 MyRoom에서 없애야함
 *
 * 현재 상황은 MyRoom에서 TapeReader를 개발자가 직접 생성해서 사용하고 있음
 * 어떤 방법을 사용하든 MyRoom에서 new TapeReader()라는 코드를 없애도 동작할 수 있게
 * 힌트. 패키지 이름(factory)
 */
public class MyRoom {
    public static void main(String[] args) {
        TapeReader reader = createTapeReader();

        Tape tape = createTape("아일랜드", true);

        reader.setTape(tape);

        reader.test();
    }
}
