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

    // Méthode toString() pour l'affichage
    @Override
    public String toString() {
        return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }

    // Méthode main pour tester
    
    public static void main(String[] args) {
        Humain h = new Homme("Doe", "John", 30);
        Humain f = new Femme("Doe", "Jane", 25);
        System.out.println(h.toString());
        System.out.println(f.toString());
    }
}
