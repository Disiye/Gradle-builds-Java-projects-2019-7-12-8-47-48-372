package com.thoughtworks.gradle.todo;

public class TodoItem {
    private String name;
    private boolean hasDone;

    public TodoItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    public String toString(){
        return name + (hasDone ? "hasDone !":"need to do !");
    }
}
