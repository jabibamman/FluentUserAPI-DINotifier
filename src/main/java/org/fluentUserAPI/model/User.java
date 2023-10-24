package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String id, String firstname, String lastname, int age,
                   Address address) {
  public User {
    Objects.requireNonNull(id, "id must not be null");
    Objects.requireNonNull(firstname, "firstname must not be null");
    Objects.requireNonNull(lastname, "lastname must not be null");
    if (age < 0) {
      throw new IllegalArgumentException("Age must be greater than or equal to 0");
    }
    Objects.requireNonNull(address, "address must not be null");
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", age=" + age +
            ", address=" + address +
            '}';
  }
}
