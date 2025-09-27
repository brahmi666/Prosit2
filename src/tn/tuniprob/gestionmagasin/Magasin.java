package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class Magasin {
    private  int identifiant;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produit;
    private  int nbproduit;

    public Magasin(int identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produit = new ArrayList<>();
        this.nbproduit = 0;
    }


    public void ajouter(Produit produit) {
       if (nbproduit<50 && this.produit.size()<this.capacite) {
           this.produit.add(produit);
           nbproduit++;
       } else {
           System.out.println("magasin plein");
       }
   }

   public void afficher() {
         System.out.println("id: " + this.identifiant +" adresse " + this.adresse +" capacite " + this.capacite);
         for (Produit p : produit) {
              System.out.println(p);
         }
   }
   public int getTotalProducts() {
       return nbproduit;
    }
}
