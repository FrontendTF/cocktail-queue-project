package at.fhj.msd;

/**
 * Represents a liquid ingredient used in drinks.
 * Contains information about name, volume and alcohol percentage.
 */
public class Liquid {
    /**
     * The name of the liquid (e.g., "Vodka", "Orange Juice").
     */
    private String name;
      /**
     * The volume of the liquid in liters.
     */
    private double volume;
    /**
     * The alcohol percentage of the liquid (e.g., 42.0 for 42%).
     */
    private double alcoholPercent;

     /**
     * Constructs a new Liquid object with the given name, volume, and alcohol percentage.
     *
     * @param name the name of the liquid
     * @param volume the volume in liters
     * @param alcoholPercent the alcohol content in percent
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }
     /**
     * Gets the name of the liquid.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the liquid.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the volume of the liquid in liters.
     *
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }
     /**
     * Sets the volume of the liquid in liters.
     *
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    /**
     * Gets the alcohol percentage of the liquid.
     *
     * @return the alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
     /**
     * Sets the alcohol percentage of the liquid.
     *
     * @param alcoholPercent the alcohol percentage to set
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
