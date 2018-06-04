import java.util.Scanner;

public class PrenomSc {
    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);
        System.out.println("Quel est votre prénom ? : ");
        String name = keybord.next();
        System.out.println("Salut " + name + " quel âge as-tu ? : ");

        int age = keybord.nextInt();
        System.out.println("tu as vraiment " + age + "? C'est pas si énorme !");
    }
}
