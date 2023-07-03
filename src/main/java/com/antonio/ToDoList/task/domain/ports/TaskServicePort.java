package com.antonio.ToDoList.task.domain.ports;

import com.antonio.ToDoList.task.domain.TaskModel;
import com.antonio.ToDoList.task.domain.TaskSaveModel;

import java.util.List;

public interface TaskServicePort {
    TaskModel save(TaskSaveModel model);

    List<TaskModel> getAllContexts();
}
