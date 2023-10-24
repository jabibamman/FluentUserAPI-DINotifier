package org.fluentUserAPI.service;

import org.fluentUserAPI.logger.LoggerInterface;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.model.UserRegistry;


public class UserService {
    UserRegistry userRegistry;
    private final LoggerInterface logger;

    public UserService(UserRegistry userRegistry, LoggerInterface logger) {
        this.userRegistry = userRegistry;
        this.logger = logger;
    }

    public void register(User user) {
        logger.log("Registering user " + user);
        userRegistry.save(user);
    }

    public User get(User user) {
        return userRegistry.getById(user.getId());
    }
}
