package dev.spring.step05_constructor_injection;

public class Tape {
    private String name;
    private boolean isWorked;

    public Tape(String name, boolean isWorked) {
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