package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.Model.UserModel;

import java.util.List;

public interface IUserService  {
    public List<UserModel> getAllUsers();

    public UserModel getUserById(Long id);

    public void createUser(UserModel user);

    public void deleteUser(Long id);

    public void updateUser(Long id, UserModel user);

//    public String login(String username, String password) throws Exception;
}
