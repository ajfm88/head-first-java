import java.util.ArrayList;

public class Startup {
  // Change the int array to an ArrayList that holds Strings
  private ArrayList<String> locationCells;
  private String name;

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public void setName(String n) {
    name = n;
  }

  // This is now a String - It needs to accept a value like "A3".
  public String checkYourself(String userInput) {  // New and improved argument name: userInput
    String result = "miss";
    // Find out if the user guess is in the
    // ArrayList, by asking for its index.
    // If it’s not in the list, then indexOf()
    // returns a -1.
    int index = locationCells.indexOf(userInput);

    // If index is greater than or equal to zero,
    // the user guess is definitely in the list, so
    // remove it.
    if (index >= 0) {
      locationCells.remove(index);
      // If the list is empty, this
      // was the killing blow!
      if (locationCells.isEmpty()) {
        result = "kill";
        System.out.println("Ouch! You sunk " + name + "   : ( ");
      } else {
        result = "hit";
      } // end if
    } // end outer if
    return result;
  } // end method
} // close class