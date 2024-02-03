public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String adresse;

    private Classe classe;

    Etudiant(String nom, String prenom, int age, String adresse, Classe classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.classe = classe;
    }

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant: " + this.nom + " " + this.prenom + " " + this.age + " " + this.adresse + " " + this.classe;
    }

    @Override
    public int hashCode() {
        return this.nom.hashCode() + this.prenom.hashCode() + this.adresse.hashCode() + this.classe.hashCode();
    }
}
