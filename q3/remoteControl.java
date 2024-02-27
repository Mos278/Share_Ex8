public class remoteControl {
    private final int slot_size = 6;
    Command[] onCommands;
    Command[] offCommands;



    public remoteControl(){
        onCommands = new Command[slot_size];
        offCommands = new Command[slot_size];

        Command noOnCommand = new NoOnCommand();
        Command noOffCommand = new NoOffCommand();
        for(int i = 0; i < slot_size; i++){//flow noCommand
            onCommands[i] = noOnCommand;
            offCommands[i] = noOffCommand;
        }
    }

    public void setCommand(int slot,Command onCommand , Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
    }
}
