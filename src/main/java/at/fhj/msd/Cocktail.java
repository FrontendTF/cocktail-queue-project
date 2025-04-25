package at.fhj.msd;

import java.util.List;

/**
 * Provides methods to calculate the total volume, alcohol percentage,
 * and whether the cocktail is alcoholic or not.
 *
 * @author Markus Rossmann
 */
public class Cocktail extends Drink {
    private final List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with the given name and a list of ingredients.
     *
     * @param name        the name of the cocktail
     * @param ingredients a list of Liquid objects representing the ingredients
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Calculates and returns volume of a cocktail
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid ingredient : ingredients) {
            totalVolume += ingredient.getVolume();
        }

        return totalVolume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        // check to prevent division by zero if Liquid volume input is mistakenly 0
        if (totalVolume == 0) {
            return 0;
        }

        double alcoholVolume = 0.0;
        for (Liquid ingredient : ingredients) {
            alcoholVolume += ingredient.getVolume() * (ingredient.getAlcoholPercent() / 100);
        }

        return (alcoholVolume / totalVolume) * 100;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid ingredient : ingredients) {
            if (ingredient.getAlcoholPercent() > 0.0) {
                return true;
            }
        }

        return false;
    }
}