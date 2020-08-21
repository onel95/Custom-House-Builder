/**
 * Onel Hirmez August 18, 2020.
 */

package edu.bu.met.cs665;

/**
 * This class represents a template for a house that will be custom built by a user. It includes a
 * nested class which is the builder class that will specify the attributes of the House.
 * 
 * @author ohirmez
 */
public final class House {
  private String houseColor;
  private boolean hasBasement;
  private boolean hasPool;
  private int squareFootage;
  private int floors;
  private int bedrooms;
  private int bathrooms;
  private int garages;

  /**
   * Private House constructor that can only be accessed by the nested class.
   * 
   * @param houseBuilder is an instance of the HouseBuilder nested class.
   */
  private House(HouseBuilder houseBuilder) {
    this.houseColor = houseBuilder.houseColor;
    this.hasBasement = houseBuilder.hasBasement;
    this.hasPool = houseBuilder.hasPool;
    this.squareFootage = houseBuilder.squareFootage;
    this.floors = houseBuilder.floors;
    this.bedrooms = houseBuilder.bedrooms;
    this.bathrooms = houseBuilder.bathrooms;
    this.garages = houseBuilder.garages;
  }

  /**
   * Getter for house color.
   * 
   * @return houseColor.
   */
  public String getHouseColor() {
    return this.houseColor;
  }

  /**
   * Getter for basement.
   * 
   * @return whether it has basement or not.
   */
  public boolean getBasement() {
    return this.hasBasement;
  }

  /**
   * Getter for pool.
   * 
   * @return whether house has pool.
   */
  public boolean getPool() {
    return this.hasPool;
  }

  /**
   * Getter for square footage.
   * 
   * @return square footage integer.
   */
  public int getSquareFootage() {
    return this.squareFootage;
  }

  /**
   * Getter for number of floors.
   * 
   * @return integer for floors.
   */
  public int getFloors() {
    return this.floors;
  }

  /**
   * Getter for bedrooms in house.
   * 
   * @return integer for bedrooms.
   */
  public int getBedrooms() {
    return this.bedrooms;
  }

  /**
   * Getter for number of bathrooms.
   * 
   * @return integer for bathrooms.
   */
  public int getBathrooms() {
    return this.bathrooms;
  }

  /**
   * Getter for garages available.
   * 
   * @return integer for garages.
   */
  public int getGarages() {
    return this.garages;
  }

  /**
   * This is the builder class for the House parent class. This class will construct a House object
   * with complicated attributes and return it.
   * 
   * @author ohirmez
   *
   */
  public static class HouseBuilder {
    private String houseColor;
    private boolean hasBasement;
    private boolean hasPool;
    private int squareFootage;
    private int floors;
    private int bedrooms;
    private int bathrooms;
    private int garages;

    /**
     * Constructor for the HouseBuilder class.
     * 
     * @param squareFootage integer for the square footage of house.
     * @param houseColor describes the color of the house in a string.
     */
    public HouseBuilder(int squareFootage, String houseColor) {
      if (squareFootage == 0 || houseColor == null) {
        throw new IllegalArgumentException("squareFootage or houseColor cannot be left empty.");
      }
      this.squareFootage = squareFootage;
      this.houseColor = houseColor;
    }

    /**
     * Sets the hasBasement attribute for House.
     * 
     * @param hasBasement boolean for whether house has basement.
     * @return instance of the house builder class.
     */
    public HouseBuilder withBasement(boolean hasBasement) {
      this.hasBasement = hasBasement;
      return this;
    }

    /**
     * Sets the hasPool attribute for House.
     * 
     * @param hasPool boolean for whether house has a pool.
     * @return instance of the house builder class.
     */
    public HouseBuilder withPool(boolean hasPool) {
      this.hasPool = hasPool;
      return this;
    }

    /**
     * Sets the floors attribute for House.
     * 
     * @param floors integer for number of floors.
     * @return instance of the house builder class.
     */
    public HouseBuilder withFloors(int floors) {
      this.floors = floors;
      return this;
    }

    /**
     * Sets bedrooms attribute for the house.
     * 
     * @param bedrooms describes bedrooms in house.
     * @return instance of HouseBuilder.
     */
    public HouseBuilder withBedrooms(int bedrooms) {
      this.bedrooms = bedrooms;
      return this;
    }

    /**
     * Sets bathrooms attribute for house.
     * 
     * @param bathrooms for number of bathrooms.
     * @return object of HouseBuilder.
     */
    public HouseBuilder withBathrooms(int bathrooms) {
      this.bathrooms = bathrooms;
      return this;
    }

    /**
     * Sets garages attribute of House.
     * 
     * @param garages for number of garages.
     * @return object of HouseBuilder.
     */
    public HouseBuilder withGarages(int garages) {
      this.garages = garages;
      return this;
    }

    /**
     * Builds a new object of House using the given attributes.
     * 
     * @return an object of House.
     */
    public House build() {
      return new House(this);
    }
  }
}
