

class PoorDog {
  // Instance variables always get a default value
  private int size;
  // even if you don't explicitly assign a value
  private String name;
  // to an instance variable or you don't call a setter
  private boolean isFriendly;
  // the instance variable still has a value
  private float weight;
  
  public int getSize() {
    // integers return 0 as a default value 
    // when no value was assigned to them
    return size;  // 0
  }

  public String getName() {
    // references return null as a default value
    // when no value was assigned to them
    return name;  // null
  }

  public boolean isFriendly() {
    // booleans return false as a default value
    // when no value was assigned to them
    return isFriendly;
  }

  public float getWeight() {
    // floating points return 0.0 as a default value
    // when no value was assigned to them
    return weight;
  }
}

public class PoorDogTestDrive {
  public static void main(String[] args) {
    PoorDog one = new PoorDog();
    System.out.println("Dog size is " + one.getSize()); // Dog size is 0
    System.out.println("Dog name is " + one.getName());       // Dog name is null
    System.out.println("Dog is friendly: " + one.isFriendly()); // Dog is friendly: false
    System.out.println("Dog weight is " + one.getWeight());   // Dog weight is 0.0
  }
}

/* 
You don’t have to initialize instance variables,
because they always have a default value. Number
primitives (including char) get 0, booleans get
false, and object reference variables get null.
(Remember, null just means a remote control that
isn’t controlling / programmed to anything. A
reference, but no actual object)
*/