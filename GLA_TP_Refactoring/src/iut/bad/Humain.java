package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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
        Femme f = new Femme("Doe", "Jane", 25);
        
        // Appel de la méthode toString()
        System.out.println("Détails de l'homme :");
        System.out.println(h.toString());
        
        System.out.println("\nDétails de la femme :");
        System.out.println(f.toString());
    }
}
