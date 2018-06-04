//classe pour l'onglet 3
static class Recipe{

  String nameRecette;
  String complexity;
  //minutes
  int time;
  String ingredient [] = new String [20];
  int quantity[]= new int[20];

  double totalCost;

}
//début de la partie création de recette
public static void creator(){

  //initialisation de la boucle des ingrédients
  int ing = 1;

  //création du champs de saisie
  Scanner scanner2 = new Scanner(System.in);

  //nom de la section
  System.out.println("Recipe creator\n");

  //nom de la recette
  System.out.println("Recipe name : ");
  String nameRecette = scanner2.next();

  //Difficulté de préparation
  System.out.println("Difficulty : ");
  String complexity = scanner2.next();

  //Temps de préparation de la recette
  System.out.println("Time : ");
  int time = scanner2.nextInt();

  //cout total de la recette
  System.out.println("Total cost : ");
  float totalCost = scanner2.nextFloat();

  //début de la boucle pour l'intégration des ingrédients et les quantités
  while ( ing == 1) {
  System.out.println("ingredient : ");
  String ingredient = scanner2.next();

  System.out.println("quantity");
  int quantity = scanner2.nextInt();

  System.out.println("Avez-vous fini ? (y/n)\n");
  String choix = scanner2.next();

  if (choix.equals("y")) {
      ing++;
      System.out.println("Game over !");
  }
}
}
