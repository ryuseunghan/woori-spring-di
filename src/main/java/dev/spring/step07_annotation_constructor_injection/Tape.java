package dev.spring.step07_annotation_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Tape {

    private String name;
    private boolean isWorked;

    @Autowired
    public Tape(@Value("아일랜드") String name, @Value("true") boolean isWorked) {
        super();
        System.out.println("Tape(name, isWorked) called");
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
