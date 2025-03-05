import java.util.Scanner;

public class Voiture {
    //Attributs
     String marque;
     String modele;
     String couleur;
     public static String coloAutorized = {"Vert", "Rouge", "Jaune", "Blanc", "Noir"};


    //Methodes
    void demarrer(){
        System.out.println("La voiture démarre");
    }
    void accelerer(){
        System.out.println("La voiture  accelère");
    }
    void freiner(){
        System.out.println("La voiture freine");
    }
    
}
