package org.fluentUserAPI.model;

import java.util.Objects;

public record Address( int street_number, String street_name, int postal_cod , String city) {
  public Address{
    Objects.requireNonNull(street_name);
    Objects.requireNonNull(postal_cod);
    Objects.requireNonNull(city);
  }

}
