public class SimpleStartupTestDrive {
  public static  void main(String[] args) {
    // Instantiate a SimpleStartup object
    SimpleStartup dot = new SimpleStartup();

    // Make an int array for the location
    // of the Startup (3 consecutive ints
    // out of a possible 7).
    int[] locations = {2, 3, 4}
    // Invoke the setter method on the Startup
    dot.setLocationCells(locations);

    // Make a fake user guess.
    int userGuess = 2;
    // Invoke the checkYourself() method on the Startup
    // object, and pass it the fake guess.
    String result = dot.checkYourself(userGuess);

    String testResult = "failed";
    // If the fake guess (2) gives back a "hit",
    // it's working
    if(result.equals("hit")) {
      testResult = "passed";
    }

    // Print out the test result
    // ("passed" or "failed")
    System.out.println(testResult);
  }    
}
