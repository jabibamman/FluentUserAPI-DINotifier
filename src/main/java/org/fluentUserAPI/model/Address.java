package org.fluentUserAPI.model;

public final class Address {
  private String numeroRue;
  private String nomRue;
  private String codePostal;
  private String ville;

  private Address(String numeroRue, String nomRue, String codePostal,
                  String ville) {
    this.numeroRue = numeroRue;
    this.nomRue = nomRue;
    this.codePostal = codePostal;
    this.ville = ville;
  }
}
