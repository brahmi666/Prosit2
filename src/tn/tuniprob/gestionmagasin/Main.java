package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Tunis", 100);
        m1.ajouter(new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now()));
        m1.ajouter(new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now()));
        m1.ajouter(new Produit(102, "Pain", "Baguette", 0.5f, LocalDate.now()));
        m1.afficher();

        Magasin m2 = new Magasin(2, "Sfax", 80);
        m2.ajouter(new Produit(103, "Fromage", "Président", 3.5f, LocalDate.now()));
        m2.afficher();

        System.out.println("produits total dans tous les magasins: " + (m1.getTotalProducts()+m2.getTotalProducts()));
    }
}
