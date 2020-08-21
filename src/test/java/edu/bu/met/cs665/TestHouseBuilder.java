/**
 * Onel Hirmez August 18, 2020
 */
package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author ohirmez This is a tester class for the application in order to check that the builder
 *         functions properly.
 */
public class TestHouseBuilder {

  /*
   * Test method.
   */
  @Test
  public void test() {

    // Create an instance of House class using the builder nested class and add some attributes to
    // it.
    House mansion = new House.HouseBuilder(7000, "white").withBasement(true).withBathrooms(5)
        .withFloors(4).build();

    // Check whether the added attributes were successfully given to the House object.
    assertEquals(mansion.getBasement(), true);
    assertEquals(mansion.getHouseColor(), "white");
    assertEquals(mansion.getSquareFootage(), 7000);
    assertEquals(mansion.getBathrooms(), 5);
    assertEquals(mansion.getFloors(), 4);

    // Check for an attribute that was NOT given to the House.
    assertEquals(mansion.getBedrooms(), 0);
  }
}
