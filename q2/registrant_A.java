public class Registrant_A implements Observer {
    @Override
    public void show(Source s){
        System.out.println("A live result: " + ((Head)s).getData());
    }
}
