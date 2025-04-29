package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Drink functionality.
 */
public class DrinkTest {

    private Drink drink;

    /**
     * Test Constructor from abstract Drink class.
     */
    private class TestDrink extends Drink {
        public TestDrink(String name) {
            super(name);
        }

        /**
         * Implements method getVolume() from abstract Drink class.
         */
        @Override
        public double getVolume() {
            return 0.0;
        }

        /**
         * Implements method getAlcoholPercent() from abstract Drink class.
         */
        @Override
        public double getAlcoholPercent() {
            return 0.0;
        }

        /**
         * Implements method isAlcoholic() from abstract Drink class.
         */
        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    /**
     * Set up Drink object before each test.
     */
    @BeforeEach
    void setup() {
        drink = new TestDrink("Pure Shot");
    }

    /**
     * Tests getting name of a drink.
     */
    @Test
    void testGetName() {
        assertEquals("Pure Shot", drink.getName());
    }

    /**
     * Tests setting name of a drink.
     */
    @Test
    void testSetName() {
        drink.setName("Vodka");
        assertEquals("Vodka", drink.getName());
    }
}