package org.example.demo1_spring_base.service;

import org.example.demo1_spring_base.interfaces.iTodoService;
import org.example.demo1_spring_base.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TodoService implements iTodoService {
    private final List<Todo> todos = new ArrayList<>();


    public TodoService() {
        initTodos();
    }

    private void initTodos(){
        todos.add(Todo.builder().id(UUID.randomUUID()).name("Spring").description("Apprendre Spring").isDone(false).build());
        todos.add(Todo.builder().id(UUID.randomUUID()).name("Faire les courses").description("Acheter du lait et du pain").isDone(false).build());
        todos.add(Todo.builder().id(UUID.randomUUID()).name("Réviser Java").description("Lire le chapitre sur les collections").isDone(true).build());
        todos.add(Todo.builder().id(UUID.randomUUID()).name("Sport").description("Faire 30 min de course à pied").isDone(false).build());
    }
    @Override
    public List<Todo> getAllTodos() {
        return todos;
    }

    @Override
    public Todo getFirstTodo() {
        return todos.isEmpty() ? null : todos.get(0);
    }
}
