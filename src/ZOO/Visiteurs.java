package ZOO;

public class Visiteurs {
    private String nom;
    private int age;
    private boolean ticket;

    public Visiteurs(String nom, int age, boolean ticket) {
        this.nom = nom;
        this.age = age;
        this.ticket = ticket;

        if (ticket==false) {
            System.out.println("Vous avez pas de ticket! Veuillez en acheter un");
        }else{
            System.out.println("Bienvenue, vous pouvez entrer!");
        }
        if (age < 16) {
            System.out.println("Billet enfant");
        }else{
            System.out.println("Billet adulte");
        }
    }

}

