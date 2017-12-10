package ru.tpu.helloworld.model;

public class Greeting {
    private Integer greetingId;
    private String greetingMessage;

    public Greeting(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public Greeting(Integer greetingId, String greetingMessage) {
        this.greetingId = greetingId;
        this.greetingMessage = greetingMessage;
    }

    public Integer getGreetingId() {
        return greetingId;
    }

    public void setGreetingId(Integer greetingId) {
        this.greetingId = greetingId;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
