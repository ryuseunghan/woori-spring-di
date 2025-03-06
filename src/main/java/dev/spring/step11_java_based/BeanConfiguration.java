package dev.spring.step11_java_based;

import org.springframework.context.annotation.Bean;

// Bean에 대한 설정 정보를 class 내에 정의
public class BeanConfiguration {
    @Bean // < xml에서 <bean>과 동일
    public TapeReader tapeReader(Tape tape) {
        return new TapeReader(tape);
    }

    @Bean
    public Tape tape() {
        return new Tape("아일랜드", true);
    }
}
