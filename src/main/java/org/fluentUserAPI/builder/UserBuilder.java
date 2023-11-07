package org.fluentUserAPI.builder;

import java.util.Objects;
import java.util.UUID;
import org.fluentUserAPI.model.Address;
import org.fluentUserAPI.model.User;
import org.fluentUserAPI.model.UserBuilderModel;

public class UserBuilder implements UserBuilderModel {
  private String firstname;
  private String lastname;
  private int age;
  private Address address;

  public static UserBuilderModel create() { return new UserBuilder(); }

  @Override
  public UserBuilderModel firstname(String firstname) {
    Objects.requireNonNull(firstname);
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel lastname(String lastname) {
    Objects.requireNonNull(lastname);
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel age(int age) {
    if (age < 0) {
      throw new IllegalArgumentException(
          "Age must be greater than or equal to 0");
    }
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel address(Address address) {
    Objects.requireNonNull(address);
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public User build() {
    return new User(UUID.randomUUID().toString(), firstname, lastname, age,
                    address);
  }
}
