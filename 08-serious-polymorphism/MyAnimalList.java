public class MyAnimalList {
    /*Don’t panic. We’re not making a new Animal object; we’re making a new array object, of type Animal.
    (Remember, you cannot make a new instance of an abstract type, but you CAN make an array object 
    declared to HOLD that type.)*/
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
        animals[nextIndex] = a;
        System.out.println("Animal added at " + nextIndex);
        nextIndex++;
        }
    }
}