package dev.spring.step11_java_based;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean을 구성하는 설정 정보(설정 파일)를 .java를 활용하여 구성
 *
 * @Bean를 통해 개별 빈을 .java 설정 파일에 작성
 */
public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        TapeReader reader = context.getBean(TapeReader.class);
        reader.test();
    }
}
