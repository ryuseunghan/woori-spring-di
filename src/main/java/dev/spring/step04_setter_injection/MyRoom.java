package dev.spring.step04_setter_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1. 스프링의 핵심 기술 중 하나인 의존성 주입을 활용하기 위해
 * spring-context.jar라는 의존성 설치
 *
 * 2. 스프링 컨테이너 구성 (TapeCompany.java와 동일한 개념)
 * 스프링 컨테이너는 애플리케이션의 동작에 필요한 비즈니스 객체들을 관리하는 공간
 * 여기서는 Tape와 TapeReader 클래스들이 비즈니스 객체이자 빈(Bean)
 *
 * setter-config.xml이라는 설정 파일을 생성했음(TapeReader라는 클래스를 빈으로 정의)
 *
 * 3. 스프링 컨테이너를 통해 의존성을 주입해서 해결
 *  3-1. 스프링 컨테이너 객체 생성
 *
 *  3-2. 생성한 스프링 컨테이너 객체가 설정 파일을 읽도록 지정
 *
 *  3-3. 설정 파일을 읽은 스프링 컨테이너를 통해 필요한 빈을 가져오기
 */
public class MyRoom {
    public static void main(String[] args) {
        // Spring 적용 전 의사코드
        //    TapeReader reader = TapeCompany.createTapeReader();
        //    Tape tape = TapeCompany.createTape();
        //    reader.setTape(tape);
        //    reader.test();

        // Spring 적용 후
        // 3-1. 스프링 컨테이너 객체 생성
        // 3-2. 생성한 스프링 컨테이너 객체가 설정 파일을 읽도록 지정
        ApplicationContext context
                = new ClassPathXmlApplicationContext("setter-config.xml");

        //  3-3. 설정 파일을 읽은 스프링 컨테이너를 통해 필요한 빈을 가져오기(getBean)
        TapeReader reader = context.getBean(TapeReader.class);
        System.out.println("reader = " + reader); // soutv

        // TODO: Tape에 대한 의존성도 설정 정보에 작성해서 애플리케이션이 정상 동작하도록
        // -> TapeReader를 생성하는 과정에서 Tape라는 의존성도 같이 해결되도록
        Tape tape = context.getBean(Tape.class);
        System.out.println("tape = " + tape.getName() + tape.isWorked());
        reader.test();
    }
}
