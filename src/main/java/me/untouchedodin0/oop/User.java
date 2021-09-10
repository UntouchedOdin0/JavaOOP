package me.untouchedodin0.oop;

public class User {

    private String name;
    String membership;

    // If the args parameters has the same name as the variable, prefix it with "this"

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
