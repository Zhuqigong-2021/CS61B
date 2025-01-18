package DefiningUsingClass;

public class Dog {
    public int weightInPounds;

    public Dog(int w){
        weightInPounds=w;
    }

    public static Dog maxDog(Dog d, Dog d2) {
        if(d.weightInPounds>d2.weightInPounds){
            return d;
        }else{
            return d2;
        }
    }


    public void makeNoise() {
        if(weightInPounds <10){
            System.out.println("Yipyipyip");
        }else if(weightInPounds<30){
            System.out.println("bark. bark!");
        }else{
            System.out.println("Woof!");
        }

    }
}
