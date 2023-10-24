package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String firstName, String lastname, int age ,Address adress ) {
    public User {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastname);
        if(age<0) {
            throw new  IllegalArgumentException();
        }
        Objects.requireNonNull(adress);

    }

}
