import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExoStream {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant("Bourdieu", "Pierre", 12));
        etudiants.add(new Etudiant("Mauss", "Marcel", 10));
        etudiants.add(new Etudiant("VanDeKerkoove", "Jean", 8));
        etudiants.add(new Etudiant("Van Kleur", "Jules", 10));

        // Exo 1
        System.out.println("Exo 1");
        etudiants.forEach(System.out::println);

        // Exo 2
        System.out.println("Exo 2");
        etudiants.stream()
                .filter(e -> e.getNom().charAt(0) == 'V')
                .forEach(System.out::println);

        // Exo 3
        System.out.println("Exo 3");
        etudiants.stream()
                .filter(e -> e.getNom().charAt(0) == 'V' && e.getResultat() > 9)
                .forEach(System.out::println);

        // Exo 4
        System.out.println("Exo 4");
        List<String> emails = etudiants.stream()
                .map(e -> e.getLogin() + "@gmail.com")
                .toList();

        System.out.println(emails);
    }
}
