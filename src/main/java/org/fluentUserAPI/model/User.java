package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String firstname, String lastname, int age , int street_number, String street_name, int postal_cod , String city) {
    public User {
        Objects.requireNonNull(firstname);
        Objects.requireNonNull(lastname);
        if(age<0) {
            throw new  IllegalArgumentException();
        }
        Objects.requireNonNull(street_name);
        Objects.requireNonNull(street_name);
        Objects.requireNonNull(postal_cod);
        Objects.requireNonNull(city);

    }

}
