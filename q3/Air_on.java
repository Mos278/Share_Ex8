public class Air_on implements Command {
    private Airconditioner air;

    public Air_on(Airconditioner air){
        this.air = air;
    }
    @Override
    public void execute(){
        air.on();
        air.setTemp(25);
        
    }
}
