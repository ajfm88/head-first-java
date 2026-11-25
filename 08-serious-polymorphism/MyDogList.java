public class MyDogList {

    // Use a plain old Dog array behind the scenes.
    private Dog[] dogs = new Dog[5];

    // We'll increment this each time a new Dog is added.
    private int nextIndex = 0;

    public void add(Dog d) {
        // If we're not already at the limit of the dogs array,
        // add the Dog and print a message.
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);

            // increment, to give us the next index to use
            nextIndex++;
        }
    }
}