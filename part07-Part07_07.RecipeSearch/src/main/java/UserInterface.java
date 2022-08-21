
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    private ArrayList<String> list;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
        this.list = new ArrayList<>();
    }
    
    public void startUserInterface() {
        System.out.print("File to read: ");
        String input = scanner.nextLine();
        this.readFile(input);
        
        System.out.println("\nCommands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            if(command.equals("list")) {
                this.printRecipes();
                System.out.println("");
            }
            if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String nameToFind = scanner.nextLine();
                searchRecipes(nameToFind);
                System.out.println("");
            }
            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                searchByCookTime(maxCookingTime);
            }
            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                searchIngredients(ingredient);
            }
        }
    }
    
    public void readFile(String file) {
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
               String line = fileReader.nextLine();
               this.list.add(line);
            } 
        } catch(Exception e) {
            System.out.println("Error " + e);
        }
        this.addToRecipes();
    }
    
    public void addToRecipes() {
        int i = 0;
        while(i < list.size()) {
            ArrayList<String> ingredients = new ArrayList<>();
            if(list.get(i).isEmpty()) {
                i++;
                continue;
            }
            String recipeName = list.get(i);
            i++;
            int cookTime = Integer.valueOf(list.get(i));
            i++;

            while(i < list.size() && (!(list.get(i).isEmpty()))) {
                ingredients.add(list.get(i));
                i++;
            }
            this.recipes.add(new Recipe(recipeName, cookTime, ingredients));
        }
    }
    
    public void printRecipes() {
        System.out.println("Recipes:");
        for(Recipe recipe : recipes) {
            System.out.println(recipe.toString());
            
        }
    }
    
    public void searchRecipes(String name) {
        System.out.println("Recipes:");
        for(Recipe recipe : recipes) {
            if(recipe.getRecipeTitle().contains(name)) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void searchByCookTime(int time) {
        System.out.println("Recipes:");
        for(Recipe recipe : recipes) {
            if(recipe.getCookTime() <= time) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void searchIngredients(String ingredient) {
        System.out.println("Recipes: ");
        for(Recipe recipe : recipes) {
            ArrayList list = recipe.getIngredients();
            for(int i = 0; i < list.size(); i++) {
                //System.out.println(list.get(i));
                if(list.get(i).equals(ingredient)) {
                    System.out.println(recipe.toString());
                }
            }
        }
    }
    
    
}
