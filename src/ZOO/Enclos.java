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
public void degradationChaqueJours (int degradation){
        degradation(10);
}

    private void degradation(int i) {
        if (proprete == 100){
            System.out.println("L'enclos est propre et n'a pas besoin d'être nettoyé");
        return;
        }
        proprete -= i;
        if (proprete <= 0){

        }
    }

    public void infoDegradation() {
        if (proprete == 100) {
            System.out.println("L'enclos est tout propre et n'a pas besoin d'être nettoyé.");
        }else if (proprete >= 70) {
            System.out.println("L'enclos  commence à être sale");
        }else if (proprete >= 50) {
            System.out.println("L'enclos est sale et doit être lavé");
        }else if (proprete >= 40) {
            System.out.println("L'enclos est très sale et doit absolument être lavé");
        }

    }

    public void nettoyage(int proprete) {
        while (proprete >= 90 ) {



        }

    }
}
