package ZOO;

import java.util.ArrayList;

public class Enclos {

    private int numeroEnclos;
    private  int proprete;
    private int capacites;
    private ArrayList<Enclos> enclos;
    private Animal animal;


    public Enclos(int numeroEnclos, int proprete, int capacites) {
        this.numeroEnclos = numeroEnclos;
        this.proprete = 100;
        this.capacites = capacites;
        enclos = new ArrayList<Enclos>();
        animal = new Animal();
    }
    public void propreteEnclos () {
        proprete = 100;
    }

    public void degradation(int degradation) {
        if (degradation == 100) {
            System.out.println("L'enclos est tout propre et n'a pas besoin d'être nettoyé.");
            return;
        }
        proprete -= degradation;
        if (proprete == 50) {
            proprete = 0;
        }
        System.out.println("Point de dégradation : " + proprete+", l'enclos doit être nettoyé");
    }

    public void nettoyage(int proprete) {
        while (proprete >= 90 ) {



        }

    }
}
