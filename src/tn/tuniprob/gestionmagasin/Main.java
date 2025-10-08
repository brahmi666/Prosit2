package tn.tuniprob.gestionmagasin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now());
        Produit p2 = new Produit(101, "Lait", "Delice", 1.2f, LocalDate.now());
        Produit p3 = new Produit(102, "Pain", "Baguette", 0.5f, LocalDate.now());
        Magasin m1 = new Magasin(1, "Tunis");
        m1.ajouter(p1);
        m1.ajouter(p3);

        Magasin m2 = new Magasin(2, "Sfax");
        m2.ajouter(p2);
        m2.ajouter(p3);
        System.out.println("--------------------------------------");
        m1.afficher();
        m2.afficher();

        System.out.println("comparer p1 et p2" + p1.comparer(p2));
        System.out.println("Comparer(p1,p2): " + Produit.comparer(p1, p2));
        System.out.println("Comparer(p1,p3): " + Produit.comparer(p1, p3));


        System.out.println("produits total dans tous les magasins: " + Magasin.getTotalmagasins());
        m1.ajouter(p1);

        Magasin maxMagasin = Magasin.comparer(m1, m2);
        if (maxMagasin != null) {
            System.out.println("magasin avec plus de produits est:" + maxMagasin);
        } else {
            System.out.println("les deux magasins ont le meeme produits n");
        }

    }

}

