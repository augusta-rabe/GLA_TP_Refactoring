package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Humain> amis; // Liste d'amis
    protected int dureeAmitie; // Durée de l'amitié en jours

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>();
        this.dureeAmitie = 100; // Valeur par défaut
    }
    
    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getDureeAmitie() {
        return dureeAmitie;
    }

    public void setDureeAmitie(int dureeAmitie) {
        this.dureeAmitie = dureeAmitie;
    }
    

   /* // Méthode details() pour afficher les détails
    public void details() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age);
    }
    */
    
    // Méthode manger() de l'interface Consommation
    @Override
    public void manger() {
        System.out.println("Je suis en train de manger.");
    }

    // Méthode boire() de l'interface Consommation
    @Override
    public void boire() {
        System.out.println("Je suis en train de boire.");
    }


    // Méthode pour ajouter un ami avec durée de l'amitié
    public void ami(Humain ami, int dureeAmitie) {
        this.amis.add(ami);
        ami.amis.add(this); // Pour ajouter l'humain courant à la liste d'amis de l'ami
        this.dureeAmitie = dureeAmitie;
        ami.dureeAmitie = dureeAmitie;
        System.out.println(this.prenom + " est maintenant ami avec " + ami.getPrenom() + " pour " + dureeAmitie + " jours.");
    }

    // Méthode pour afficher les amis
    public void afficherAmis() {
        System.out.println("Liste d'amis de " + this.prenom + ":");
        for (Humain ami : amis) {
            System.out.println("- " + ami.getPrenom() + " (pour " + ami.getDureeAmitie() + " jours)");
        }
    }

    // Méthode toString() pour afficher les détails
    @Override
    public String toString() {
        return "Nom: " + nom + "\n" +
               "Prénom: " + prenom + "\n" +
               "Âge: " + age;
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Homme h = new Homme("Doe", "John", 30);
        Femme f = new Femme("Smith", "Jane", 28);
        
        // Déclarer que l'homme est ami de la femme pour 200 jours (valeur non-défaut)
        h.ami(f, 200);
        
        // Afficher la liste d'amis de l'homme et de la femme
        System.out.println("Amis de " + h.getPrenom() + ":");
        h.afficherAmis();
        
        System.out.println("\nAmis de " + f.getPrenom() + ":");
        f.afficherAmis();
    }
    
}
