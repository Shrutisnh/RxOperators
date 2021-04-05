package com.example.rxoperators;

public class Task {
    private String description;
    private int priority;
    private boolean isComplete;

    public Task(String description, int priority, boolean isComplete) {
        this.description = description;
        this.priority = priority;
        this.isComplete = isComplete;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
