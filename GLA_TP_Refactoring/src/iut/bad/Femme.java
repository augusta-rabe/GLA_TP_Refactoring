package iut.bad;

public class Femme extends Humain {

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Homme h = new Homme("Doe", "John", 30);
        Femme f = new Femme("Smith", "Jane", 28);
        
        // Déclarer que l'homme est ami de la femme
        h.ami(f, 30);
        
        // Afficher la liste d'amis de l'homme et de la femme
        System.out.println("Amis de " + h.getPrenom() + ":");
        h.afficherAmis();
        
        System.out.println("\nAmis de " + f.getPrenom() + ":");
        f.afficherAmis();
    }
}
