package DefiningUsingClasses;

public class DogLauncher {
    public static void main(String[] args) {
     Dog d = new Dog(25);
     Dog d2= new Dog(100);

     Dog bigger = Dog.maxDog(d,d2);
     d.makeNoise();
        bigger.makeNoise();
    }



}
