
import java.util.ArrayList;


public class Recipe {
    
    private String recipeTitle;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeTitle, int cookTime, ArrayList<String> ingredients) {
        this.recipeTitle = recipeTitle;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public int getCookTime() {
        return cookTime;
    }

    @Override
    public String toString() {
        return recipeTitle + ", cooking time: " + cookTime;
    }
    
    
    
    
}
