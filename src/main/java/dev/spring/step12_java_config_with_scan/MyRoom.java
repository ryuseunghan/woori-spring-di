package dev.spring.step12_java_config_with_scan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean을 구성하는 설정 정보(설정 파일)를 .java를 활용하여 구성
 *
 * 별도의 @Bean을 작성하지 않아도,
 * 컴포넌트 스캔 대상의 basePackage에 속하는 클래스들을 스캔해서
 */
public class MyRoom {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        TapeReader reader = context.getBean(TapeReader.class);
        reader.test();
    }
}
