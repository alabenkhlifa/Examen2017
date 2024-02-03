import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Examen {

    Map<Faculte, ListeDesClasses> mapFaculte;

    // Stream "Mohamed"
    public List<Etudiant> getEtudiantThatHasNameMohamed() {
        return mapFaculte.values().stream()
                .map(ListeDesClasses-> ListeDesClasses.getClasseList())
                .flatMap(classes -> classes.stream())
                .map(classe -> classe.getEtudiants())
                .flatMap(etudiants -> etudiants.stream())
                .filter(etudiant -> etudiant.getNom().equalsIgnoreCase("Mohamed"))
                .collect(Collectors.toList());

    }
}
