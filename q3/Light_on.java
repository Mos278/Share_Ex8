public class Light_on implements Command {
    private LightConditioner light;
    public Light_on(LightConditioner light){
        this.light = light;

    }

    @Override
    public void execute(){
        light.on();
    }
    
}
