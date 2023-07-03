package com.antonio.ToDoList.task.domain.ports;

import com.antonio.ToDoList.task.domain.TaskModel;
import com.antonio.ToDoList.task.domain.TaskSaveModel;

import java.util.List;

public interface TaskRepository {

    TaskModel save(TaskSaveModel model);
    TaskModel getTask(String id);
    Boolean deleteTask(String id);
    Boolean updateComplete(TaskSaveModel model);
    List<TaskModel> getAllUser();
}
