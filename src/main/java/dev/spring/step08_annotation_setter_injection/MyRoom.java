package dev.spring.step07_annotation_constructor_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
* setter 기반 주입으로 동작하되 , Autowired가 setter()를 통해 동작하도록
* */
public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("annotation-config-constructor.xml");

        TapeReader reader = context.getBean(TapeReader.class);
        System.out.println("reader = " + reader);

        Tape tape = context.getBean(Tape.class);
        System.out.println("tape = " + tape.getName() + tape.isWorked());
        reader.test();
    }
}
