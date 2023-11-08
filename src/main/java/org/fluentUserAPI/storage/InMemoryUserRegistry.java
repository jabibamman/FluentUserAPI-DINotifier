package org.fluentUserAPI.storage;

import java.util.HashMap;
import java.util.Map;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.model.UserRegistry;

public final class InMemoryUserRegistry implements UserRegistry {

  private final Map<String, User> users = new HashMap();

  @Override
  public User getById(String id) {
    return users.get(id);
  }

  @Override
  public void save(User user) {
    users.put(user.getId(), user);
  }

  @Override
  public boolean exists(User user) {
    return users.containsKey(user.getId());
  }
}
