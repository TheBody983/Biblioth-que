import java.util.*;


public class DocumentTest{
    public static void main(String[] args) {
        DocumentTest dt = new DocumentTest();

        // Creation des objets necessaires a la réalistion des differents tests
        Document docVide1 = new Document();
        Document docVide2 = new Document();
        Document doc3 = new Document("JAV42", "Java mon ami", "Pikachu", 2021, true);
        Document doc4 = new Document("JAV12", "Java mon ami", "Pikachu", 2021, true);
        Document doc5 = new Document("JAV01", "Java, comment je l'aime très beaucoup", "Anonyme", 2020, false);

        // Tests de la fonction equals(Document doc)
        System.out.print("Comparaison de deux documents vides --> ");
        System.out.println(dt.testEquals(docVide1, docVide2, true));

        System.out.print("Comparaison d'un document vide et d'un document non vide --> ");
        System.out.println(dt.testEquals(docVide1, doc3, false));

        System.out.print("Comparaison de deux documents non vides identiques --> ");
        System.out.println(dt.testEquals(doc3, doc4, true));

        System.out.print("Comparaison de deux documents non vides différents --> ");
        System.out.println(dt.testEquals(doc3, doc5, false));

        String reponse = "Référence: JAV42\nTitre: JAVA mon ami\nAuteur: Pikachu\nAnnée: 2021\nDisponible ?: true\n";
        System.out.println(dt.testToString(doc3, reponse));
    }

    private boolean testEquals(Document doc1, Document doc2, boolean resultatATrouver) {
        return resultatATrouver == doc1.equals(doc2);
    }

    private boolean testToString(Document doc, String resultat) {
        return resultat.equals(doc.toString());
    }

}