package com.antonio.ToDoList.task.domain;

import com.antonio.ToDoList.user.domain.UserModel;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

public class TaskSaveModel {

    @NotEmpty
    @Length(min = 3,max = 200)
    String title;
    @Length(min = 3,max = 255)
    @NotEmpty
    String description;
    @NotEmpty
    LocalDateTime dueDate;
    @NotEmpty
    @Length(min = 3,max = 60)
    String category;
    Boolean completed;
    @NotEmpty
    UserModel userModel;
}
