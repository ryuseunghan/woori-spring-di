package dev.spring.step08_annotation_setter_injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter 기반 주입으로 동작하되, @Autowired가 setter()를 통해 동작하도록
 * annotation-config-setter.xml로 구분
 */
public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("annotation-config-setter.xml");

        TapeReader reader = context.getBean(TapeReader.class);
        reader.test();
    }
}
