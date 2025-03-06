package dev.spring.step10_annotation_config;

import dev.spring.step03_factory_injection.TapeReader;
import dev.spring.step11_java_based.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrinkTest {
    public static void main(String[] args) {
        // 별도의 .xml파일 없이 스프링 컨테이너 구성
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        System.out.println(context.getBean(Drink.class));

        // TapeReader에 대한 의존성?
        context.getBean(TapeReader.class);
        // basePackage에 속하지 않았기 때문에 컨테이너에 빈으로 등록되지 않아서 에러 발생

    }
}
