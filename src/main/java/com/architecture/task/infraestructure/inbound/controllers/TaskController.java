package com.architecture.task.infraestructure.inbound.controllers;


import com.architecture.task.application.create.TaskCreateUseCase;
import com.architecture.task.application.find.TaskFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class TaskController {
    private final TaskFindUseCase taskFindUseCase;
    @GetMapping
    public ResponseEntity findAllTasks(){
        return ResponseEntity.ok(this.taskFindUseCase.findAllPosts());
    }
}
