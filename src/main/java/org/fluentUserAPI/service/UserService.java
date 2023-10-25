package org.fluentUserAPI.service;

import org.fluentUserAPI.logger.LoggerInterface;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.model.UserRegistry;
import org.fluentUserAPI.notification.NotifierInterface;

public class UserService {
  UserRegistry userRegistry;
  private final NotifierInterface notifier;
  private final LoggerInterface logger;

  public UserService(UserRegistry userRegistry, NotifierInterface notifier,
                     LoggerInterface logger) {
    this.userRegistry = userRegistry;
    this.notifier = notifier;
    this.logger = logger;
  }

  public String register(User user) {
    logger.log("Registering user " + user);
    notifier.notify("Registering user");
    userRegistry.save(user);
    return user.id();
  }

  public User get(User user) { return userRegistry.getById(user.getId()); }
}
