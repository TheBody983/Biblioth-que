package biblio;

import java.util.*;

/**
* Initialisation de la classe Document.
*/

public class Document{

    public boolean estDisponible;
    public String reference;
    public String titre;
    public String auteur;
    public int annee;
    public ArrayList listeDocuments;

    /**
    * Constructeur de la classe Document par defaut.
    */

    public Document() {
        reference = null;
        titre = null;
        auteur = null;
        annee = -1;
        estDisponible = false;
        }

    /**
    * Constructeur de la classe Document.
    * @param reference est la reference du Document.
    * @param titre est le titre du Document.
    * @param auteur est l'auteur du Document.
    * @param estDisponible indique si le Document est empruntable ou non.
    */

    public Document(String reference, String titre, String auteur, int annee, boolean estDisponible) {

        this.reference = reference;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.estDisponible = estDisponible;
    }

    /** Méthode pour comparer des attributs de Documents.
    * @param doc est un autre Document à comparer
    * @return un boolean.
    */

    public boolean equals(Document doc) {

        if (this.reference == null && doc.reference == null) return true;
        if (this.titre.equals(doc.titre) && this.auteur.equals(doc.auteur) && this.annee == doc.annee) {
            return true;
        }
        return false;
    }

    /** Methode pour afficher la reference, le titre, l'auteur, l'année et la disonibilité du Document.
    * @return une reference, un titre, un auteur, une année et une disponiblité d'un Document.
    */

    public String toString() {

        return "Référence: "+ reference +"\n"+
                "Titre: "+ titre +"\n"+
                "Auteur: "+ auteur +"\n"+
                "Année: "+ annee +"\n"+
                "Disponible ?: "+ estDisponible +"\n";
    }

    /** Methode pour verifier si un Document est empruntable.
    * @return un boolean.
    */

    public boolean estEmpruntable() {

        return estDisponible;
    }

    public boolean setFicheEmprunt(FicheEmprunt fiche){
        return false;
    }
}
