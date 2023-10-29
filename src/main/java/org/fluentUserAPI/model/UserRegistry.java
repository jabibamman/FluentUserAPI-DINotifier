package org.fluentUserAPI.model;

public interface UserRegistry {
  User getById(String id);

  void save(User user);
}
