package com.architecture.task.domain.repository;

import com.architecture.task.domain.model.TaskQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TaskQueryRepository {
  Optional<TaskQuery> findById(int id);
  List<TaskQuery> searchBy(Map<String, String> params);
  List<TaskQuery> findAllTask();
}
