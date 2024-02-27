package q2;

public class Registrant_B  implements Observer{
    @Override
    public void show(Source s){
        System.out.println("B live result: " + ((Head)s).getData());
    }
}
