package com.antonio.ToDoList.user.domain.ports;

import com.antonio.ToDoList.user.domain.UserModel;
import com.antonio.ToDoList.user.domain.UserSaveModel;

import java.util.List;

public interface UserRepository {

    UserModel save(UserSaveModel model);
    UserModel getUser(String username);
    Boolean deleteUser(String id);
    List<UserModel> getAllUser();
    Boolean emailAlreadyExists(String email);
}
