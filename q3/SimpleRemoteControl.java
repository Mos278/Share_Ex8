public class SimpleRemoteControl {//invoker
    Command slot;

    public void setCommand(Command com){
        slot = com;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
