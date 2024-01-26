package com.ms.todolist.controllers;

import com.ms.todolist.entities.Todo;
import com.ms.todolist.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    List<Todo> listAll() {
        return todoService.listAll();
    }

    @PostMapping
    List<Todo> createTodo(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping
    List<Todo> updateTodo(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> deleteTodo(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
