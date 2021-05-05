package biblio;

import java.util.*;

/**
* Classe Bibliotheque
*/

public class Bibliotheque{
    public static int docsMax;

    private String nom;
    private String adresse;
    private String mail;
    private int telephone;
    private int joursMax;

    /**
    * Constructeur de la classe Bibliotheque par défaut.
    */ 
    public Bibliotheque() {
        nom = null;
        adresse = null;
        mail = null;
        telephone = -1;
        joursMax = -1;
    }

    /**
    * Constructeur de la classe Bibliotheque.
    *
    * @param nom - Nom de la Bibliotheque.
    * @param adresse - Adresse de la Bibliotheque.
    * @param mail - Mail de la Bibliotheque.
    * @param telephone - Numero de Telephone de la bibliotheque.
    * @param joursMax - Nombre de jours maximum d'emprunt par Client
    */
    public Bibliotheque( String nom, String adresse, String mail, int telephone, int docsMax, int joursMax) {
        this.nom = nom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.joursMax = joursMax;
    }

    public void ajouterDocument(Document doc){
        
    }
    
    public void supprDocument(Document doc){
        
    }

}