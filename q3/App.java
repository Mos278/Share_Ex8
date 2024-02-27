

public class App {
    static remoteControl remote = new remoteControl();
    public static void main(String[] args) {
        SetUp();
        UnitTest();

    }


    public static void SetUp(){
       
        LightConditioner L_BedRoom = new LightConditioner("Bed Room");
        LightConditioner L_KitChen = new LightConditioner("KitChen");
  
        remote.setCommand(0,new Light_on(L_BedRoom), new Light_off(L_BedRoom));
  
        remote.setCommand(1,new Light_on(L_KitChen), new Light_off(L_KitChen));
       
  
        Airconditioner A_BedRoom = new Airconditioner("Bed Room");
        remote.setCommand(2,new Air_on(A_BedRoom), new Air_off(A_BedRoom));
    }

    public static void UnitTest(){
         //-----------------------------------------------------
        System.out.println("slot 0, light Bed Room");
        remote.onButton(0);
        remote.offButton(0);
        System.out.println();
        //-----------------------------------------------------

        System.out.println("slot 1, light Kitchen");
        remote.onButton(1);
        remote.offButton(1);
        System.out.println();
         //-----------------------------------------------------

        System.out.println("slot 2, AC Bed Room");
        remote.onButton(2);
        remote.offButton(2);
        System.out.println();
         //-----------------------------------------------------


        System.out.println("test one unavailable slot, slot 3");
        remote.onButton(3);
        remote.offButton(3);
         //-----------------------------------------------------
    }
}

