package biblio;

import java.util.*;

/**
* Classe Client
*/

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private boolean eligible;

    /**
    * Constructeur de la Classe Client par Défaut.
    */
    public Client() { 
        nom = null;
        prenom = null;
        adresse = null;
        eligible = false;
    }

    /**
    * Constructeur de la classe Client.
    *
    * @param nom - Nom du Client.
    * @param prenom - Prénom du Client.
    * @param adresse - Adresse du Client.
    * @param eligible - Indique si le Client peut Emprunter ou non.
    */
    public Client( String nom, String prenom, String adresse, boolean eligible) {
        this.nom = nom;
        this.prenom= prenom;
        this.adresse = adresse;
        this.eligible = eligible;
    }
    
    /** Méthode qui vérifie si les Clients sont identiques
    *
    * @param client - Le Client avec lequel comparer
    *
    * @return boolean - Si les clients sont identiques
    */
    public boolean equals(Client client) {

        if (this.nom.equals(client.nom) && this.prenom.equals(client.prenom) && this.adresse.equals(client.adresse)) {
            return true;
        }
        return false;
    }

    /** Methode pour afficher le nom, prenom et adresse du Client.
    *
    * @return String - Descriptif du Client
    */
    public String toString() {
        return "Nom: "+ nom +"\n"+
            "Prénom: "+ prenom +"\n"+
            "Adresse: "+ adresse +"\n";
    }

    /** Methode retournant l'éligibilité du Client.
    *
    * @return boolean si le Client peut emprunter un document 
    */
    public boolean peutEmprunter(){
        return eligible;
    }
}