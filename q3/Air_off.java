public class Air_off implements Command {
    private Airconditioner air;

    public Air_off(Airconditioner air){
        this.air = air;
    }
    @Override
    public void execute(){
        air.off();
    }
}
