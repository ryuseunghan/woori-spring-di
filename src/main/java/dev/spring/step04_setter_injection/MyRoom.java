package dev.spring.step04_setter_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
