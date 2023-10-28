package tn.tuniprob.gestionmagasin;

import java.util.Date;
public class Produit {
    int identifiant;
    String libelle,marque;
    float prix;

    Date dateexp;
    public Produit(int id,String libelle,String m)
    {

        this.identifiant=id;
        this.marque=m;
        this.libelle=libelle;
    }

    public Produit(int identifiant,String lib)
    {

        this.identifiant=identifiant;
        libelle=lib;
    }
    public Produit(int identifiant,String lib,Date da)
    {

        this.identifiant=identifiant;
        libelle=lib;
        dateexp=da;
    }
    public Produit(String mar,int id)
    {
        marque=mar;
        identifiant=id;
    }
    public Produit(){}

    public void afficher()
    {
        System.out.println("identifiant :"+this.identifiant);
        System.out.println("marque :"+marque);
        System.out.println("libelle :"+libelle);
        System.out.println("prix :"+prix);
    }
    public String toString()
    {

        return "identifiant :"+identifiant+" marque :"
                +marque+" libelle :"+libelle+" prix :"
                +prix+"Date expiration :"+dateexp;
    }
    public int getIdentifiant(){
        return this.identifiant;
    }
    public String getlibelle(){
        return this.libelle;
    }
    public float getPrix(){
        return this.prix;
    }
    public void setIdentifiant(int ind){
        this.identifiant=ind;
    }
    public void setLibelle(String s){
        this.libelle=s;
    }
    public void setPrix(int pr){
        if(pr>0){
            this.prix=pr;
        }

    }
    public boolean compare(Produit produit){
        return this.identifiant == produit.identifiant && this.libelle.equals(produit.libelle) && this.prix == produit.prix;

    }
    public boolean compare(Produit produit,Produit produit_tow){
        return produit_tow.identifiant == produit.identifiant && produit_tow.libelle.equals(produit.libelle) && produit_tow.prix == produit.prix;
    }

}