package com.ms.todolist;

import com.ms.todolist.entities.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoListApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTodoSuccess() {
        var todo = new Todo("Test todo", "Desc", false, 3);

        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(todo)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$").isArray()
                .jsonPath("$.length()").isEqualTo(1)
                .jsonPath("$[0].name").isEqualTo(todo.getName())
                .jsonPath("$[0].description").isEqualTo(todo.getDescription())
                .jsonPath("$[0].done").isEqualTo(todo.isDone())
                .jsonPath("$[0].priority").isEqualTo(todo.getPriority());


    }

}
