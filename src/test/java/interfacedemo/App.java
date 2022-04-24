package interfacedemo;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        // ---- Object creations
        Scanner scan = new Scanner(System.in);
        PaintUI paintUi = new PaintUI();
        CanDraw canDraw = new Draw("*");  // Fawad's code


        paintUi.greetUser();

        String cmd = scan.nextLine();
        if( cmd.contains("1") ) {
            System.out.println("Drawing a line...");
            paintUi.drawLine(canDraw);   // nijat's code
        }
        else{
            System.out.println("Command not found");
            System.out.println("closing this app..");
        }
    }
}
