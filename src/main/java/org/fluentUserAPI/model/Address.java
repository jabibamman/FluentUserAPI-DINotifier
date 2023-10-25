package org.fluentUserAPI.model;

import java.util.Objects;

public record Address(int streetNumber, String streetName, String postalCode, String city) {
  public Address{
    Objects.requireNonNull(streetName);
    Objects.requireNonNull(postalCode);
    Objects.requireNonNull(city);
  }

    public static Address of(int streetNumber, String streetName, String postalCode, String city) {
        return new Address(streetNumber, streetName, postalCode, city);
    }
}
