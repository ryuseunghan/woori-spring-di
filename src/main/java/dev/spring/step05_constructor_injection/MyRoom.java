package dev.spring.step05_constructor_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("constructor-config.xml");

        TapeReader reader = context.getBean(TapeReader.class);
        System.out.println("reader = " + reader);

        Tape tape = context.getBean(Tape.class);
        System.out.println("tape = " + tape.getName() + tape.isWorked());
        reader.test();
    }
}
