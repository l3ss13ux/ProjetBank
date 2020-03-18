public class Run {
    public static void main(String[] args) {
        Compte compte1 = new Compte(10001, 235.50);
        Compte compte2 = new Compte(10002, 578.22);
        Compte compte3 = new Compte(10003,1403.10);

        Client client1 = new Client("Dupont", "Thomas",22, 8);
        client1.ajouterCompte(compte1);
        client1.ajouterCompte(compte2);
        client1.ajouterCompte(compte3);

        compte1.ajouter(15.0);
        compte3.retirer(200.0);

        System.out.println("compte 1 : " +compte1.getSolde() + "€, compte 2 : " +compte2.getSolde() + "€, compte 3 : "
                +compte3.getSolde() + "€.");

        System.out.println("Comptes du client 1 : " +client1.getComptes()[0]);

    }
}
