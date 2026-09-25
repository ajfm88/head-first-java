public class Exercise1c {
  public static void main(String[] args) { // needs a main method
    int x = 5;
    while (x > 1) { // while loop must be inside a method
      x = x - 1;
      if (x < 3) {
        System.out.println("small x");
      }
    } // it can't just be hanging out inside the class
  }
}
