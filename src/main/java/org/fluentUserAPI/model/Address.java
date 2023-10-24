package org.fluentUserAPI.model;

import java.util.Objects;

public record Address( int streetNumber, String streetName, int postalCod , String city) {
  public Address{
    Objects.requireNonNull(streetName);
    Objects.requireNonNull(postalCod);
    Objects.requireNonNull(city);
  }

}
