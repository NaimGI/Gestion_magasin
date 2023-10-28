import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Produit p = new Produit(2,"test","2-12-2023");
        Produit p2 = new Produit(3,"okdoki","2-12-2023");
        Produit p3 = new Produit(3,"hello","2-12-2023");
        Magasin m = new Magasin(3,"test");
        m.ajouter(p);
        m.ajouter(p2);
        m.ajouter(p2);
        m.ajouter(p3);
        m.afficher();
    }
}