package com.architecture.task.infraestructure;

import com.architecture.task.domain.model.TaskCommand;
import com.architecture.task.domain.model.TaskQuery;
import com.architecture.task.domain.repository.TaskCommandRepository;
import com.architecture.task.infraestructure.outbound.external.JsonPlaceHolderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TaskCommandRepositoryImpl implements TaskCommandRepository {

    private final JsonPlaceHolderAPIClient jsonPlaceHolderAPIClient;

    @Override
    public Optional<TaskQuery> createTask(TaskCommand taskCommand) {
        return Optional.ofNullable(jsonPlaceHolderAPIClient.create(taskCommand));
    }

    @Override
    public Optional<TaskQuery> updateTask(TaskCommand taskCommand) {
        return Optional.empty();
    }

    @Override
    public void deleteTask(int id) {

    }
}
