package org.fluentUserAPI.model;

public final class Adresse {
    private String numeroRue;
    private String nomRue;
    private String codePostal;
    private String ville;

    private Adresse(String numeroRue, String nomRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }


}
