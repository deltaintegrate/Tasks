package com.architecture.task.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaskCommand {
    private Long taskId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String title;
    private String family;
    private String image;
    private String imageUrl;
}
