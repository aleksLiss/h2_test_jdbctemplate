package com.aleks.h2.example.repository;

import com.aleks.h2.example.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> save(User user);

    boolean delete(int id);

    Optional<User> getById(int id);

    Optional<User> getByLogin(String login);
}
