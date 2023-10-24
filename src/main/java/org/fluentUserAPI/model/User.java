package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String firstname, String lastname, int age ,Address adress ) {
    public User {
        Objects.requireNonNull(firstname);
        Objects.requireNonNull(lastname);
        if(age<0) {
            throw new  IllegalArgumentException();
        }
        Objects.requireNonNull(adress);

    }

}
