package dev.spring.step06_field_injection;

import org.springframework.beans.factory.annotation.Value;

public class Tape {
    @Value("아일랜드") private String name;
    @Value("true") private boolean isWorked;

    public Tape() {}

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

}