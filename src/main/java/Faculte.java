import java.util.List;
import java.util.stream.Collectors;

public class Faculte {
    private String nom;
    private String adresse;

    private List<Classe> classes;

    Faculte(String nom, String adresse, List<Classe> classes) {
        this.nom = nom;
        this.adresse = adresse;
        this.classes = classes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Faculte: " + this.nom + " " + this.adresse;
    }

    // Stream
    public List<Classe> getClassesByAnneeScolaire(String anneeScolaire) {
        return classes
                .stream()
                .filter(classe -> classe.getAnneeScolaire().equals(anneeScolaire))
                .collect(Collectors.toList());
    }

}
