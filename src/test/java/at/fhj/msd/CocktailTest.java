package at.fhj.msd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {

    @Test
    void testVolumeCalculation() {
        Liquid vodka = new Liquid("Vodka", 0.2, 40);
        Liquid juice = new Liquid("Orange Juice", 0.3, 0);
        Cocktail cocktail = new Cocktail("Screwdriver", Arrays.asList(vodka, juice));
        assertEquals(0.5, cocktail.getVolume(), 0.0001);
    }

    @Test
    void testAlcoholPercentCalculation() {
        Liquid vodka = new Liquid("Vodka Soda", 0.2, 40);
        Liquid juice = new Liquid("Orange Juice", 0.3, 0);
        Cocktail cocktail = new Cocktail("Screwdriver", Arrays.asList(vodka, juice));
        assertEquals(16.0, cocktail.getAlcoholPercent(), 0.0001);
    }

    @Test
    void testIsAlcoholic() {
        Cocktail alcoholic = new Cocktail("Test", Arrays.asList(new Liquid("Gin", 0.1, 40)));
        Cocktail nonAlcoholic = new Cocktail("Juice Mix", Arrays.asList(new Liquid("Juice", 0.2, 0)));

        assertTrue(alcoholic.isAlcoholic());
        assertFalse(nonAlcoholic.isAlcoholic());
    }
    @Test
    void testZeroVolumeAlcoholPercent() {
        List<Liquid> zeroVolume = List.of(new Liquid("Nothing", 0.0, 50.0));
        Cocktail emptyCocktail = new Cocktail("Empty", zeroVolume);
        assertEquals(0.0, emptyCocktail.getAlcoholPercent());
}
}
