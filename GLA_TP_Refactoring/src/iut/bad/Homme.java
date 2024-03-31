package iut.bad;

public class Homme {
    private String nom;
    private String prenom;
    private int age;

    public Homme(String nom, String prenom, int age) {
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
        return "Homme [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Homme h = new Homme("Doe", "John", 30);
        System.out.println(h.toString());
    }
}
