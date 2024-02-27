public class Light_off implements Command {
    private LightConditioner light;
    public Light_off(LightConditioner light){
        this.light = light;

    }

    @Override
    public void execute(){
        light.off();
    }
    
}
