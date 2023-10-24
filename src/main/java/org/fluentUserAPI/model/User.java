package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String id, String firstname, String lastname, int age,
                   Address address) {
  public User {
    Objects.requireNonNull(id);
    Objects.requireNonNull(firstname);
    Objects.requireNonNull(lastname);
    if (age < 0)
      throw new IllegalArgumentException();
    Objects.requireNonNull(address);
  }


  public String getId() {
    return id;
  }
}
