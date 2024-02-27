import java.util.Scanner;
 
public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Head H1 = new Head();
        Registrant_A A = new Registrant_A();
        Registrant_B B = new Registrant_B();
        H1.add(A);
        H1.add(B);
        loopinput(H1);
    }

    public static void loopinput(Head H1){
        while(true){
            String input = sc.nextLine();
            System.out.println(input);
            if(input.equals(""))break;
            System.out.println("Enter Score " + input);
            H1.setData(input);
        }
    }
}