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
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = Objects.requireNonNull(city);
    return addressBuilder;
  }

  @Override
  public AddressBuilder streetNumber(int streetNumber) {
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = Objects.requireNonNull(streetNumber);
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  @Override
  public AddressBuilder streetName(String streetName) {
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = Objects.requireNonNull(streetName);
    addressBuilder.postalCode = postalCode;
    addressBuilder.city = city;
    return addressBuilder;
  }

  @Override
  public AddressBuilder postalCode(String postalCode) {
    AddressBuilder addressBuilder = new AddressBuilder();
    addressBuilder.streetNumber = streetNumber;
    addressBuilder.streetName = streetName;
    addressBuilder.postalCode = Objects.requireNonNull(postalCode);
    addressBuilder.city = city;
    return addressBuilder;
  }

  public Address build() {
    return new Address(streetNumber, streetName, postalCode, city);
  }
}
