package tn.tuniprob.gestionmagasin;

public class Magasin {
    private int identifiant;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] tabp = new Produit[CAPACITE];
    private int nbproduit;

    private static int totalProduits = 0;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.nbproduit = 0;
    }

    public void ajouter(Produit p) {
        if (nbproduit < CAPACITE) {
            if (!rechercher(p)){
            tabp[nbproduit] = p;
            nbproduit++;
            totalProduits++;
        } else
        System.out.println("produit deja existe");}
        else {
            System.out.println("Magasin plein");
        }
    }

    public void afficher() {
        System.out.println(" id: " + identifiant + " adresse: " + adresse + " produits: " + nbproduit);
        for (int i = 0; i < nbproduit; i++) {
            System.out.println(tabp[i]);
        }
    }
    @Override
    public String toString() {
        return " id: " + identifiant + " adresse: " + adresse + " produits: " + nbproduit;
    }


    public int getTotalProducts() {
        return nbproduit;
    }
    public static int getTotalmagasins() {
        return totalProduits;
    }
    public boolean rechercher(Produit p) {
        for (int i = 0; i < nbproduit; i++) {
            if (tabp[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }
    public static Magasin comparer(Magasin m1, Magasin m2) {
        if (m1.nbproduit > m2.nbproduit) {
            return m1;
        } else if (m2.nbproduit > m1.nbproduit) {
            return m2;
        } else {

        return null;
        }
    }
}
