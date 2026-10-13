class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockStarUsesIt;

  // A Getter’s purpose is to send back, as a return
  // value, the value of whatever it is that particular 
  // Getter is supposed to be Getting. 
  String getBrand() {
    return brand;
  }

  // a Setter lives and breathes for the chance to take 
  // an argument value and use it to set the value of an 
  // instance variable.
  void setBrand(String aBrand) {
    brand = aBrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }

  void setNumOfPickups(int num) {
    numOfPickups = num;
  }

  boolean getRockStarUsesIt() {
    return rockStarUsesIt;
  }

  // We use void because you’re calling
  // this method for the work it does inside it,
  // rather than for what the method returns
  void setRockStarUsesIt(boolean yesOrNo) {
    rockStarUsesIt = yesOrNo;
  }
}
