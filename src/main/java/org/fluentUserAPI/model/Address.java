package org.fluentUserAPI.model;

public final class Address {
  private int numeroRue;
  private String nomRue;
  private String codePostal;
  private String ville;

  private Address(int numeroRue, String nomRue, String codePostal,
                  String ville) {
    this.numeroRue = numeroRue;
    this.nomRue = nomRue;
    this.codePostal = codePostal;
    this.ville = ville;
  }
}
