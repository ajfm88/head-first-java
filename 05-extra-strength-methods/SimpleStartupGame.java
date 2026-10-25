public class SimpleStartupGame {
  public static void main(String[] args) {
    // Make a variable to track how
    // many guesses the user makes.
    int numOfGuesses = 0;

    // This is a special class we wrote that has
    // the method for getting user input. For
    // now, pretend it’s part of Java.
    GameHelper helper = new GameHelper();

    // Make the Startup object.
    SimpleStartup theStartup = new SimpleStartup();

    // Make a random number for the
    // first cell, and use it to make
    // the cell locations array.
    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    // Give the Startup its locations
    // (the array).
    theStartup.setLocationCells(locations);

    // Make a boolean variable to track whether the
    // game is still alive, to use in the while loop test.
    // repeat while game is still alive.
    boolean isAlive = true;

    while (isAlive) {
      // Get user guess.
      int guess = helper.getUserInput("enter a number");
      // Ask the Startup to check the
      // guess; save the returned result.
      String result = theStartup.checkYourself(guess);
      // Increment guess count by one
      numOfGuesses++;

      // Was it a “kill”? if so, set isAlive to false (so we won’t
      // re-enter the loop) and print user guess count.
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      } // close if
    } // close while
  } // close main
}
