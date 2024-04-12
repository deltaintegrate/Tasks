package com.architecture.task.application.find;

import com.architecture.task.domain.model.TaskQuery;
import com.architecture.task.domain.repository.TaskQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TaskFindUseCase {
    private final TaskQueryRepository taskQueryRepository;
    public List<TaskQuery> findAllPosts(){
        return this.taskQueryRepository.findAllTask();
    }
    public TaskQuery findById(Integer id){
        return this.taskQueryRepository.findById(id).orElseThrow();
    }
    public List<TaskQuery> findAllPostsByUserId(Integer userId){
        return this.taskQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }
  
}
