package dev.spring.step07_annotation_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Tape {
    private String name;
    private boolean isWorked;
    @Autowired
    public Tape(String name, boolean worked) {
        this.name = name;
        this.isWorked = worked;
    }

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

}