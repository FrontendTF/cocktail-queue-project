package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Liquid functionality.
 */
public class LiquidTest {

    private Liquid vodka;

    /**
     * Set up Liquid object before each test.
     */
    @BeforeEach
    void setup() {
        vodka = new Liquid("Vodka", 0.2, 40.0);
    }

    /**
     * Tests getting name of a drink.
     */
    @Test
    void testGetName() {
        assertEquals("Vodka", vodka.getName());
    }

    /**
     * Tests setting name of a drink.
     */
    @Test
    void testSetName() {
        vodka.setName("New Name");
        assertEquals("New Name", vodka.getName());
    }

    /**
     * Tests getting volume of a drink.
     */
    @Test
    void getGetVolume() {
        assertEquals(0.2, vodka.getVolume());
    }

    /**
     * Tests setting volume of a drink.
     */
    @Test
    void getSetVolume() {
        vodka.setVolume(0.3);
        assertEquals(0.3, vodka.getVolume());
    }

    /**
     * Tests getting alcohol percentage of a drink.
     */
    @Test
    void testGetAlcoholPercent() {
        assertEquals(40, vodka.getAlcoholPercent());
    }

    /**
     * Tests setting alcohol percentage of a drink.
     */
    @Test
    void testSetAlcoholPercent() {
        vodka.setAlcoholPercent(50);
        assertEquals(50, vodka.getAlcoholPercent());
    }
}