package ZOO;

public class Visiteurs {
    private String nom;
    private int age;
    private boolean ticket;

    public Visiteurs(String nom, int age, boolean ticket) {
        this.nom = nom;
        this.age = age;
        this.ticket = ticket;

        if (age < 16) {
            System.out.println("Billet enfant");
        }else{
            System.out.println("Billet adulte");
        }
    }

}

