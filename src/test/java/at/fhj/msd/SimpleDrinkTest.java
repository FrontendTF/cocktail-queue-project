package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for SimpleDrink functionality.
 */
public class SimpleDrinkTest {

    private Liquid water;
    private Liquid vodka;

    /**
     * Set up liquids before each test.
     */
    @BeforeEach
    void setup() {
        water = new Liquid("Water", 0.1, 0.0);
        vodka = new Liquid("Vodka", 0.2, 40.0);
    }

    /**
     * Tests getting volume from a drink.
     */
    @Test
    void testGetVolume() {
        SimpleDrink drink = new SimpleDrink("Pure Shot", vodka);
        assertEquals(0.2, drink.getVolume());
    }

    /**
     * Tests getting alcohol percentage from a drink.
     */
    @Test
    void TestGetAlcoholPercent() {
        SimpleDrink drink = new SimpleDrink("Pure Shot", vodka);
        assertEquals(40, drink.getAlcoholPercent());
    }

    /**
     * Tests if drink is alcoholic or not.
     */
    @Test
    void testIsAlcoholic() {
        SimpleDrink drink = new SimpleDrink("Pure Shot", vodka);
        assertEquals(true, drink.isAlcoholic());
    }

    /**
     * Tests if drink is alcoholic or not.
     */
    @Test
    void testIsNotAlcoholic() {
        SimpleDrink drink = new SimpleDrink("Refresher", water);
        assertEquals(false, drink.isAlcoholic());
    }
}