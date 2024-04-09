package com.architecture.task.domain.repository;

import com.architecture.task.domain.model.TaskCommand;
import com.architecture.task.domain.model.TaskQuery;

import java.util.Optional;

public interface TaskCommandRepository {
    Optional<TaskQuery> createTask(TaskCommand taskCommand);
    Optional<TaskQuery> updateTask(TaskCommand taskCommand);
    void deleteTask(int id);
}
