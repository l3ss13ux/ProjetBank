public class Compte {
    private Double solde;
    private int numero;

    public Compte(int unNumero, Double unSoldeInitial) {
        this.numero = unNumero;
        this.solde = unSoldeInitial;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " " + solde;
    }

    public void ajouter(Double unMontant) {
        this.solde = getSolde() + unMontant;
    }

    public void retirer(Double unMontant) {
        this.solde = getSolde() - unMontant;
    }
}
