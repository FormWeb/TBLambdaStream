public class Etudiant {
    private String nom;
    private String prenom;
    private int resultat;

    public Etudiant(String nom, String prenom, int resultat) {
        this.nom = nom;
        this.prenom = prenom;
        this.resultat = resultat;
    }

    public String getLogin() {
        return (this.prenom.charAt(0) + this.nom).toLowerCase();
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

    public int getResultat() {
        return resultat;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s - %s",
                this.nom,
                this.prenom,
                this.getLogin(),
                this.resultat);
    }
}
