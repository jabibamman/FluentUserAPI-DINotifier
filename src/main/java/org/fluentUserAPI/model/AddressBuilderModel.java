package org.fluentUserAPI.model;

public interface AddressBuilderModel {
  AddressBuilderModel streetNumber(int streetNumber);

  AddressBuilderModel streetName(String streetName);

  AddressBuilderModel postalCode(String postalCode);

  AddressBuilderModel city(String city);

  Address build();
}
