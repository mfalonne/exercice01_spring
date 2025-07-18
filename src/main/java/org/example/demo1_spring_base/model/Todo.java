package org.example.demo1_spring_base.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private UUID id;
    private String name;
    private String description;
    private Boolean isDone;
}
