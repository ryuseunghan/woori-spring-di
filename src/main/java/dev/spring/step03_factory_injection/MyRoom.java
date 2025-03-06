package dev.spring.step03_factory_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyRoom {
    public static void main(String[] args) throws IOException {
//       Spring 적용 후
//        3-1. 스프링 컨테이너 객체 생성
//        3-2. 생성한 스프링 컨테이너 객체가 설정 파일을 읽도록 지정
        ApplicationContext context = new ClassPathXmlApplicationContext("setter-config.xml");
//        3-3. 설정 파일을 읽은 스프링 컨테이너를 통해 필요한 빈을 가져오기(getBean)
        TapeReader reader = context.getBean(TapeReader.class);
        System.out.println("reader = "+ reader);
        Tape tape = context.getBean(Tape.class);
        System.out.println("tape = "+ tape);
    }
}

