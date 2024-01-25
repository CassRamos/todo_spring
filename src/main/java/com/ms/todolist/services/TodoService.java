package com.ms.todolist.services;

import com.ms.todolist.entities.Todo;
import com.ms.todolist.repositories.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listAll() {
        Sort sort = Sort
                .by("priority")
                .descending()
                .and
                        (Sort
                                .by("name")
                                .ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return listAll();
    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return listAll();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return listAll();
    }
}
