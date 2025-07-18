package org.example.demo1_spring_base.interfaces;

import org.example.demo1_spring_base.model.Todo;

import java.util.List;

public interface iTodoService {
    List<Todo> getAllTodos();
    Todo getFirstTodo();
}
