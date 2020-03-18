import java.util.ArrayList;

public class Client {
    private String nom, prenom;
    private int age, numero;
    private Compte comptes[];

    public Client(String unNom, String unPrenom, int unAge, int unNumero) {
        this.nom = unNom;
        this.prenom = unPrenom;
        this.age = unAge;
        this.numero = unNumero;
        this.comptes = new Compte[5];
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    @Override
    public String toString() {
        return nom + " "+prenom + " " +age + " " +numero;
    }

    public void ajouterCompte(Compte unCompte) {
        for (int i=0;i<comptes.length;i++) {
            if (comptes[i] == null) {
               comptes[i] = unCompte;
               break;
            }
            if (i == comptes.length - 1) {
                System.out.println("Vous ne pouvez plus ajouter de compte pour ce client.");
            }
        }
    }

    public Compte getCompte(int numeroCompte) {
        for (Compte unCompte : comptes) {
            if (numeroCompte == unCompte.getNumero()) {
                return unCompte;
            }
        }
        System.out.println("Le numéro ne fait pas partie des comptes du client.");
        return null;
    }


}
