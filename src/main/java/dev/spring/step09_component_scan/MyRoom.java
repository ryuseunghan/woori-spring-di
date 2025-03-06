package dev.spring.step09_component_scan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 여전히 xml파일을 사용하긴 하지만, xml 파일 내에서 <bean>에 대한 코드를 제거
 * <bean> 대신 스프링이 알아서 의존성을 스캔(검색)해서 필요한 곳에 주입할 수 있게끔 설정
 */
public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("annotation-component-scan.xml");

        TapeReader reader = context.getBean(TapeReader.class);
        reader.test();
    }
}
