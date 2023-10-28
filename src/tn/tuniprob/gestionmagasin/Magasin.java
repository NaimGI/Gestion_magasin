package tn.tuniprob.gestionmagasin;

public class Magasin {

    int identifiant;
    String adresse;

    final int CAPACITE_PRD=50;

    Produit[] tabprod=new Produit[CAPACITE_PRD];

    int compprod;

    public Magasin()
    {}

    public Magasin(int id, String ad)
    {
        identifiant=id;
        adresse=ad;
    }

    public void ajouter(Produit p) {
        if (!recherche(p)) {
            if (compprod < CAPACITE_PRD) {
                tabprod[compprod] = p;
                compprod++;
                System.out.println("produit ajouté ");
            } else {

                System.out.println("Magasin plein");
            }
        }else{
          System.out.println("The product is already exist");
        }
    }
    public void supprimer(Produit produit){
        for (Produit p:tabprod) {
            if(!p.compare(produit)){
                p=null;

            }
        }
    }

    public void afficher()
    {

        System.out.println("identifiant :"+this.identifiant+"adresse :"+adresse);
        for (int i=0;i<compprod;i++)
        {

            System.out.println("Marque :"+tabprod[i].marque);
            System.out.println("libelle :"+tabprod[i].libelle);
            System.out.println("date :"+tabprod[i].dateexp);
            System.out.println("prix :"+tabprod[i].prix);
            System.out.println("Identifiant :"+tabprod[i].identifiant);
        }
    }
    public boolean recherche(Produit produit){

        for (Produit p:tabprod) {
            if(p.compare(produit)){
                return true;
            }
        }
        return false;
    }
    public void supprimerProduit(Produit produit){
        if (recherche(produit)){
            for (int i = 0; i < tabprod.length; i++) {
                if (produit.equals(tabprod[i])) {
                    tabprod[i]=null;
                    compprod--;
                }
            }
        }
        else {
            System.out.println("this product doesn't exist");
        }
    }

    public Magasin compare_magasin(Magasin magasin){
        if (this.compprod>magasin.compprod){
            return this;
        }
        else {
            return magasin;
        }
    }
}
