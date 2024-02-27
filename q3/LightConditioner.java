//receiver
public class LightConditioner {
    private String roomName;
    public LightConditioner(String roomName) {
        this.roomName = roomName;
    }
    public void on() {
        System.out.println("Light is on... in " + roomName);
    }  
    public void off() {
        System.out.println("Light is off... in " + roomName);
    }  
    public String getRoomName() {
        return roomName;
    }
}
