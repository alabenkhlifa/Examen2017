import java.util.List;
import java.util.stream.Collectors;

public class Classe {
    private String nom;
    private String niveau;
    private String anneeScolaire;

    private List<Etudiant> etudiants;
    private Faculte faculte;

    Classe(String nom, String niveau, String anneeScolaire, List<Etudiant> etudiants, Faculte faculte) {
        this.nom = nom;
        this.niveau = niveau;
        this.anneeScolaire = anneeScolaire;
        this.etudiants = etudiants;
        this.faculte = faculte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Classe: " + this.nom + " " + this.niveau + " " + this.anneeScolaire + " " + this.etudiants + " " + this.faculte;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Stream : affichage
    public void getEtudiantWithName(String nom) {
        etudiants.stream()
                .filter(e->e.getNom().equals(nom))
                .forEach(System.out::println);

    }

    // Stream
    public long getAgeSumOfStudents() {
        return etudiants.stream()
                .map(Etudiant::getAge)
                .count();
    }

    // Stream
    public void getEtudiantThatAreOlderThan(int age) {
        etudiants
                .stream()
                .map(Etudiant::getAge)
                .filter(ageEtudiant -> ageEtudiant > age)
                .collect(Collectors.toList());
    }
}
