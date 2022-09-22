package io.practiv.starter.model;

public class User {
    private String name;
    private String greeting;

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User greeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
}
