package dev.spring.step04_setter_injection;

public class Tape {
    private String name;
    private boolean isWorked;

    public Tape() {
    }

    public String getName() {
        return name;
    }

    public boolean isWorked() {
        return isWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorked(boolean isWorked) {
        this.isWorked = isWorked;
    }
}