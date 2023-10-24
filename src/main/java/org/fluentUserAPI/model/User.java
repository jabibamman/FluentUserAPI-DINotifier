package org.fluentUserAPI.model;

import java.util.Objects;

public record User(String firstname, String lastname, int age ,
                   int street_number, String street_name,
                   int postal_code , String city) {
    public User {
        Objects.requireNonNull(firstname);
        Objects.requireNonNull(lastname);
        if(age<0) throw new IllegalArgumentException();
        Objects.requireNonNull(street_name);
        Objects.requireNonNull(street_name);
        Objects.requireNonNull(postal_code);
        Objects.requireNonNull(city);

    }

}
