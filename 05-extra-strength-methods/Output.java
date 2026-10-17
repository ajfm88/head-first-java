class Output {
  public static void main(String[] args) {
    Output output = new Output();
    output.go();
  }

  private static void go(){
    int value = 7;
    for (int i = 1; i < 8; i++){
      value++;
      if (i > 4){
        System.out.print(++value + " ");
      }
      if (value > 14){
        System.out.println("i = " + i);
        break;
      }
    }
  }
}

// Output is:
// % java Output
// 13 15 x = 6