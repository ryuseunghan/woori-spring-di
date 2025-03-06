package dev.spring.step08_annotation_setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Tape {
    private String name;
    private boolean isWorked;
    public Tape() {}

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

    @Autowired
    public void setName(@Value("아일랜드") String name) {
        System.out.println("setName() called");
        this.name = name;
    }

    @Autowired
    public void setWorked(@Value("true") boolean isWorked) {
        System.out.println("setWorked() called");
        this.isWorked = isWorked;
    }
}