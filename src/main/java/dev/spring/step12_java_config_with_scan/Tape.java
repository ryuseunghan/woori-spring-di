package dev.spring.step12_java_config_with_scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tape {

    private String name;
    private boolean isWorked;

    public Tape(@Value("아일랜드") String name, @Value("true") boolean isWorked) {
        super();
        this.name = name;
        this.isWorked = isWorked;
    }

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

}