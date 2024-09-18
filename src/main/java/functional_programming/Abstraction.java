package functional_programming;

class Recipe extends Abstraction {

    void greReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensil");
    }

    void doTHeDish() {
        System.out.println("do the dish");
    }

    void Cleanup() {
        System.out.println("Cleanup");
    }

}

class RecipeWithMircoWave extends Abstraction {

    void greReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    void doTHeDish() {
        System.out.println("get stuff ready");
    }

    void Cleanup() {
        System.out.println("Cleanup");
        System.out.println("Switch off the microwave");
    }

}

public abstract class Abstraction {
    public void execute() {
        greReady();
        doTHeDish();
        Cleanup();
    }

    abstract void greReady();

    abstract void doTHeDish();

    abstract void Cleanup();

}

// Abstraction in Java is the process in which we only show essential details/functionality to the user.
// The non-essential implementation details are not displayed to the user.

class RecipeRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Recipe recipe = new Recipe();
        recipe.execute();

        RecipeWithMircoWave recipeWm = new RecipeWithMircoWave();
        recipeWm.execute();

    }

}