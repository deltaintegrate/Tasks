package com.architecture.task.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaskCommand {
    private Long taskId;
    private String body;
    private String title;
}
