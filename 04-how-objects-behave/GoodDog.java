public class GoodDog {
  // Make the instance variable private
  private int size;

  // Make the getter and setter methods public
  public int getSize() {
    return size;
  }
    
  public void setSize(int s) {
    size = s;
  }
  /* Even though the methods don’t really
  add new functionality, the nice thing
  is that you can change your mind later.
  You can come back and make a method
  safer, faster, better.*/

  void bark() {
    if (size > 60) {
      System.out.println("Woof! Woof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}

class GoodDogTestDrive {
  public static void main(String[] args) {
    GoodDog one = new GoodDog();
    one.setSize(70);
    GoodDog two = new GoodDog();
    two.setSize(8);
    System.out.println("Dog one: " + one.getSize());
    System.out.println("Dog two: " + two.getSize());
    one.bark();
    two.bark();
  }
}