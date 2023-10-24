package org.fluentUserAPI.builder;

import java.util.Objects;
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
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = Objects.requireNonNull(firstname);
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel lastname(String lastname) {
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = Objects.requireNonNull(lastname);
    userBuilder1.age = age;
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel age(int age) {
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = Objects.requireNonNull(age);
    userBuilder1.address = address;
    return userBuilder1;
  }

  @Override
  public UserBuilderModel address(Address address) {
    UserBuilder userBuilder1 = new UserBuilder();
    userBuilder1.firstname = firstname;
    userBuilder1.lastname = lastname;
    userBuilder1.age = age;
    userBuilder1.address = Objects.requireNonNull(address);
    return userBuilder1;
  }

  @Override
  public User build() {
    return new User(firstname, lastname, age, address);
  }
}
