package com.architecture.task.infraestructure.outbound.external;

import com.architecture.task.domain.model.TaskCommand;
import com.architecture.task.domain.model.TaskQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${gaymostron.client.name}", url = "${gaymostron.url}")
public interface JsonPlaceHolderAPIClient {
    @PostMapping
    TaskQuery create(@RequestBody TaskCommand request);

    @GetMapping("/{id}")
    TaskQuery findTaskById(@PathVariable Integer id);

    @GetMapping
    List<TaskQuery> getAllTask();

    @GetMapping
    List<TaskQuery> searchByParam(@RequestParam Map<String, String> params);

}

