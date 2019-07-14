package com.thoughtworks.gradle.todo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class TodoItemTest {
    @Test
    public void testTodoItem(){
        String testString = "This is a Gradle Project";
        TodoItem todoItem = new TodoItem(testString);
        String name = todoItem.getName();
        Assert.assertEquals(testString,name);
    }

    @Test
    public void test1()  {
        TodoItem test = Mockito.mock(TodoItem.class);

        when(test.getName()).thenReturn("This is a Gradle Project");

        Assert.assertEquals(test.getName(),"This is a Gradle Project");
    }
}
