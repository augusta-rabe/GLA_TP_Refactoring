package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    // Aucun champ à ajouter, car les champs sont déjà définis dans la classe parente Humain

    // Aucune méthode à redéfinir ici, car toString() et les getters/setters sont déjà dans Humain
}
