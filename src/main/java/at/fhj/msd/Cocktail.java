package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid ingredient : ingredients) {
            totalVolume += ingredient.getVolume();
        }

        return totalVolume;
    }

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