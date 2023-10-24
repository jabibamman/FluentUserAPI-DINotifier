package org.fluentUserAPI.model;

public interface UserBuilderModel {
    UserBuilderModel firstname(String firstname);

    UserBuilderModel lastname(String lastname);

    UserBuilderModel age(int age);

    UserBuilderModel address(Address address);

    User build();
}
