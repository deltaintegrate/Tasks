package com.architecture.task.infraestructure;

import com.architecture.task.domain.model.TaskQuery;
import com.architecture.task.domain.repository.TaskQueryRepository;
import com.architecture.task.infraestructure.outbound.external.JsonPlaceHolderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TaskQueryRepositoryImpl  implements TaskQueryRepository {
    private final JsonPlaceHolderAPIClient jsonPlaceHolderAPIClient;
    @Override
    public Optional<TaskQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceHolderAPIClient.findTaskById(id));
    }

    @Override
    public List<TaskQuery> searchBy(Map<String, String> params) {
        return jsonPlaceHolderAPIClient.searchByParam(params);
    }

    @Override
    public List<TaskQuery> findAllTask() {
        return jsonPlaceHolderAPIClient.getAllTask();
    }
}
