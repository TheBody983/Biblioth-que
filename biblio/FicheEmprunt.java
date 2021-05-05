package biblio;

import java.util.*;

public class FicheEmprunt{
    public ArrayList<Document> listeEmprunts;
    public Client client;

    public FicheEmprunt() {
        this.listeEmprunts = null;
        this.client = null;
    }

    public FicheEmprunt(Client client) {
        this.listeEmprunts = null;
        this.client = client;
    }

    public boolean equals(FicheEmprunt fiche){
        return this.listeEmprunts.equals(fiche.listeEmprunts) && this.client.equals(fiche.client);
    }

    public void ajouterEmprunt(Document doc){
        if (doc.estEmpruntable()){
        this.listeEmprunts.add(doc);
        }
    }

    public String toString(){
        return "Documents empruntés: "+ listeEmprunts +"\n"+
            "Client: "+ client;
    }
    
    public void ajouterDocument(Document doc)
    {
        this.listeDocument.add(doc);
    }


    public void supprDocument(Document doc)
    {
        this.listeDocument.remove(doc);
    }
}