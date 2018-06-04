public class US03Ad {

    //Liste pour quantité, prix de chaque ingredient, nom des produits
    //initialiser les tableaux en fonction de la recette choisie
    //utiliser une boucle pour parcourir les tableaux et print le prix des ingredient
    //utiliser la fonction counter pour calculer le prix total de la recette q^_^p

    public static void main(String[] args) {

      //création de tableaux de Liste
      String [] ingredientsList = {"oeuf      " , "beurre    " , "sel       " , "poivre    "};
      int [] quantitiesList = {7 , 1 , 1 , 1};
      float [] priceList = {0.25f , 2 , 0.30f , 0.30f};
      float resultat = 0;
      float prixFinal = 0;

      //Affichage de l'en-tête
      System.out.println("+------------------------------------------------------+");
      System.out.println("                        COOKIFY            ");
      System.out.println("\nRecipe : Omelette");
      System.out.println("Time : 15 minutes");
      System.out.println("difficulty : easy ");
      System.out.println("shopping list (total ingredients : " + ingredientsList.length + " )");

      System.out.println("\n+------------------------------------------------------+\n");
      for (int i = 0; i < ingredientsList.length ; i++) {
        //calcul du prix en fonction des ingrédients et de la quantité
        resultat = priceList[i] * quantitiesList[i];
        //Calcul du prix total
        prixFinal = prixFinal + resultat;
        //Affichage des valeurs
        System.out.println("* " + ingredientsList[i]+ "x" + quantitiesList[i] +"     "+ resultat + " €");

      }
      System.out.println("\n+------------------------------------------------------+\n");
      //Affichage du prix total
      System.out.println("Total price : " + prixFinal + " €");
    }
}
