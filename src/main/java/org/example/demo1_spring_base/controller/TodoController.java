package org.example.demo1_spring_base.controller;

import org.example.demo1_spring_base.interfaces.iTodoService;
import org.example.demo1_spring_base.model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final iTodoService todoService;

    public TodoController(iTodoService todoService) {
        this.todoService = todoService;
    }

    // GET /todos -> retourne toute la liste
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    // GET /todos/first -> retourne le premier élément
    @GetMapping("/first")
    public Todo getFirstTodo() {
        return todoService.getFirstTodo();
    }
}
