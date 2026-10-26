public class SimpleStartupTestDrive {
  public static  void main(String[] args) {
    // Instantiate a SimpleStartup object
    SimpleStartup dot = new SimpleStartup();

    // Make an int array for the location
    // of the Startup (3 consecutive ints
    // out of a possible 7).
    int[] locations = {2, 3, 4};
    // Invoke the setter method on the Startup
    dot.setLocationCells(locations);

    // Make a fake user guess.
    int userGuess = 2;
    // Invoke the checkYourself() method on the Startup
    // object, and pass it the fake guess.
    String result = dot.checkYourself(userGuess);

    String testResult = "failed";
    // If the fake guess (2) gives back a “hit”,
    // it’s working
    if(result.equals("hit")) {
      testResult = "passed";
    }

    // Print out the test result
    // (“passed” or “failed”)
    System.out.println(testResult);
  }    
}

class SimpleStartup {
  private int[] locationCells;
  private int numOfHits = 0;

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(int guess) {
    // Make a variable to hold the result we’ll
    // return. Put “miss” in as the default
    // (i.e., we assume a “miss”)
    String result = "miss";

    // Repeat with each thing in the array
    for (int cell : locationCells) {
      // Compare the user guess to this element
      // (cell) in the array
      if (guess == cell) {
        /* Here’s where it
        goes wrong. We
        counted a hit every
        time the user
        guessed a cell
        location, even if
        that location had
        already been hit! */
        result = "hit";
        /* We need a way to
        know that when
        a user makes a
        hit, they haven’t
        previously hit that
        cell. If they have,
        then we don’t want
        to count it as a hit. */
        numOfHits++;
        // Get out of the loop,
        // no need to test the other cells
        break;
      } // end if
    } // end for

    // We’re out of the loop, but let’s see if we’re
    // now ‘dead’ (hit 3 times) and change the
    // result String to “Kill”
    if (numOfHits == locationCells.length) {
      result = "kill";
    } // end if

    // Display the result for the user (“miss”,
    // unless it was changed to “hit” or “kill”)
    System.out.println(result);
    // Return the result back to
    // the calling method
    return result;
  } // end method
}