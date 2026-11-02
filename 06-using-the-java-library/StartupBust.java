import java.util.ArrayList;

public class StartupBust {
  // Declare and initialize
  // the variables we’ll need.
  private GameHelper helper = new GameHelper();
  private ArrayList<Startup> startups = new ArrayList<Startup>();
  private int numOfGuesses = 0;

  private void setUpGame() {
    // first make some Startups and give them locations
    Startup one = new Startup();
    one.setName("poniez");
    Startup two = new Startup();
    two.setName("hacqi");
    Startup three = new Startup();
    three.setName("cabista");
    startups.add(one);
    startups.add(two);
    startups.add(three);

    //Print brief instructions for user.
    System.out.println("Your goal is to sink three Startups.");
    System.out.println("poniez, hacqi, cabista");
    System.out.println("Try to sink them all in the fewest number of guesses");

    // Repeat with each Startup in the list.
    for (Startup startup : startups) {
      // Ask the helper for a Startup location (an ArrayList of Strings)
      ArrayList<String> newLocation = helper.placeStartup(3);
      // Call the setter method on this
      // Startup to give it the location you
      // just got from the helper
      startup.setLocationCells(newLocation);
    } // close for loop
  } // close setUpGame method

  private void startPlaying() {
    // As long as the Startup list is NOT empty (the ! means NOT, it’s
    //the same as (startups.isEmpty() == false).
    while (!startups.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      // Call our own checkUserGuess method.
      checkUserGuess(userGuess);
    } // close while
    // Call our own finishGame method.
    finishGame();
  } // close startPlaying method

  private void checkUserGuess(String userGuess) {
    // Increment the number of guesses the user has made
    numOfGuesses++;
    String result = "miss"; // assume a miss until told otherwise

    // Repeat with all Startups in the list
    for (Startup startupToTest : startups) {
      // Ask the Startup to check the user
      // guess, looking for a hit (or kill)
      result = startupToTest.checkYourself(userGuess);

      if (result.equals("hit")) {
        // Get out of the loop early, no point
        // in testing the others
        break;
      }
      if (result.equals("kill")) {
        // This one’s dead, so take it out of the
        // Startups list then get out of the loop
        startups.remove(startupToTest); // he's gone
        break;
      }
    } // close for
    // Print the result for the user
    System.out.println(result);
  } // close method

  // Print a message telling the user how they did in the game
  private void finishGame() {
    System.out.println("All Startups are dead! Your stock is now worthless");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You got out before your options sank.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with your options");
    }
  } // close method

  public static void main(String[] args) {
    // Create the game object
    StartupBust game = new StartupBust();
    // Tell the game object to set up the game
    game.setUpGame();
    // Tell the game object to start the main
    // game play loop (keeps asking for user
    // input and checking the guess)
    game.startPlaying();
  } // close method
}