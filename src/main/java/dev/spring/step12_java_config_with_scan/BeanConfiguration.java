package dev.spring.step12_java_config_with_scan;

import org.springframework.context.annotation.ComponentScan;

// Bean에 대한 설정 정보를 class 내에 정의
@ComponentScan(basePackages = "dev.spring.step12_java_config_with_scan")
public class BeanConfiguration {

}
