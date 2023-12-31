package com.antonio.ToDoList.user.domain.ports;

import com.antonio.ToDoList.user.domain.UserModel;
import com.antonio.ToDoList.user.domain.UserSaveModel;

import java.util.List;

public interface UserServicePort {
    UserModel save(UserSaveModel model);

    List<UserModel> getAllContexts();
}
