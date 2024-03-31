package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Humain> amis; // Liste d'amis

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>();
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


    // Méthode pour ajouter un ami
    public void ami(Humain ami) {
        this.amis.add(ami);
        ami.amis.add(this); // Pour ajouter l'humain courant à la liste d'amis de l'ami
        System.out.println(this.prenom + " est maintenant ami avec " + ami.getPrenom());
    }

    // Méthode pour afficher les amis
    public void afficherAmis() {
        System.out.println("Liste d'amis de " + this.prenom + ":");
        for (Humain ami : amis) {
            System.out.println("- " + ami.getPrenom());
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
        Homme h1 = new Homme("Doe", "John", 30);
        Homme h2 = new Homme("Smith", "Alex", 28);
        
        // Ajouter une amitié entre h1 et h2
        h1.ami(h2);
        
        // Afficher la liste d'amis de h1 et h2
        System.out.println("\nAmis de " + h1.getPrenom() + ":");
        h1.afficherAmis();
        
        System.out.println("\nAmis de " + h2.getPrenom() + ":");
        h2.afficherAmis();
    }
    
}
