package entities;

public class Personne {
    private String nom;
    private String prenoms;
    private int age;

    public Personne(String nom, String prenoms, int age) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.age = age;
    }

    public Personne() {
    }

    //    List<String> autresPersonneListe;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
