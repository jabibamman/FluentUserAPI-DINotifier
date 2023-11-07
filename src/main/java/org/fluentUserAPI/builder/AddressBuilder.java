package org.fluentUserAPI.builder;

import java.util.Objects;
import org.fluentUserAPI.model.Address;
import org.fluentUserAPI.model.AddressBuilderModel;

public class AddressBuilder implements AddressBuilderModel {
  private int streetNumber;
  private String streetName;
  private String postalCode;
  private String city;

  public static AddressBuilder create() { return new AddressBuilder(); }

  @Override
  public AddressBuilder city(String city) {
    Objects.requireNonNull(city);
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  @Override
  public AddressBuilder streetNumber(int streetNumber) {
    if (streetNumber < 0) {
      throw new IllegalArgumentException(
          "Street number must be greater than or equal to 0");
    }

    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  @Override
  public AddressBuilder streetName(String streetName) {
    Objects.requireNonNull(streetName);
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  @Override
  public AddressBuilder postalCode(String postalCode) {
    Objects.requireNonNull(postalCode);
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  public Address build() {
    return Address.of(streetNumber, streetName, postalCode, city);
  }
}
