package interfacedemo;

// Class A:  Nijat - Jr Dev
//
public class PaintUI {

    // --- Methods
    public void greetUser() {
        System.out.println("----alpha paint v2.0-----");
        System.out.println("Welcome to Alpha paint where");
        System.out.println("you paint your future..");
        System.out.println("--------------------------");
        System.out.println("Press 1 to draw a line");
    }

    public void drawLine(CanDraw drawObj) {
        drawObj.printLine();
    }
}