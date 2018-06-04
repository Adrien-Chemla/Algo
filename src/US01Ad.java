public class US01Ad {

  //initialisation de NombreIngredient
  static int NombreIngredient = 1;
  static int NombreInt = 4;
  //initialisation des variables de cuisine
  static int oeuf = 7;
  static int beurre = 50;
  static int sel = 1;
  static int poivre = 1;

  //initialisation de la méthode main
  public static void main(String[] args) {

    //Affichage des ingredients
    System.out.println("+------------------------------------------------------+");
    System.out.println("                        COOKIFY            ");
    System.out.println("\nRecipe : Omelette");
    while (NombreIngredient <= NombreInt){
      if (NombreIngredient == 4) {
        System.out.println("Total ingredients : " + NombreIngredient);
      }
      NombreIngredient++;
    }

    System.out.println("\nOeufs : " + oeuf );
    System.out.println("Beurre : " + beurre + " g");
    System.out.println("Sel");
    System.out.println("Poivre");

    //Affichage de la recette
    System.out.println("\n+------------------------------------------------------+");
    System.out.println("\n                      Preparation : ");
    System.out.println("\n1. Battez les oeufs à la fourchette, salez et poivrez.");
    System.out.println("\n2. Faites chauffer le beurre, versez-en un peu dans les oeufs et mélangez. \nVersez les oeufs dans la poêle à feu vif, \nbaissez le feu et laissez cuire doucement en ramenant les bords de l'omelette au centre au fur et à mesure qu'ils prennent.");
    System.out.println("\n3. Secouez un peu la poêle pour éviter que l'omelette n'attache, \nvérifiez la texture baveuse ou bien prise.");
    System.out.println("\n4. Pliez l'omelette en deux et servez.\n");

  }
}
