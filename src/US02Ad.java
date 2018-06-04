import java.util.Scanner;

public class US02Ad {
  public static void main(String[] args) {

    //initialisation de la variable BMI
    float bmi = 0;

    //Scanner des informations (taille/poids)
    Scanner sc = new Scanner (System.in);
    System.out.println("Pour calculer votre IMC, entrez votre taille en mètre avec virgule : ");
    float height = sc.nextFloat();
    System.out.println("Maintenant veuillez entrer votre poids : ");
    float weight = sc.nextFloat();

    //Calcul de l'IMC
    bmi = weight / (height*height);
    System.out.println("Votre IMC est de : " + bmi);

    //condition en fonction de l'IMC
    if (bmi < 16.5) {
        System.out.println("Vous êtes en sous nutrition, contactez un nutritionniste !");
    }
    if (bmi > 16.5 && bmi < 18.5) {
        System.out.println("Vous êtes maigre, mangez un peu plus !");
    }
    if (bmi > 18.5 && bmi < 25) {
        System.out.println("Votre IMC est normal, continuez !");
    }
    if (bmi > 25 && bmi < 30) {
        System.out.println("Vous êtes en surpoids !");
    }
    if (bmi > 30 && bmi < 35) {
        System.out.println("Vous êtes en obésité légère, faites attention à vous !");
    }
    if (bmi > 35 && bmi < 40) {
        System.out.println("Vous êtes en obésité sévère, allez consulter !");
    }
    if (bmi > 40) {
        System.out.println("Tiens, ça sent pas le sapin ?");
    }
  }
}
