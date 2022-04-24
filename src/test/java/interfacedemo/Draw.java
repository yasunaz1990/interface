package interfacedemo;

import org.openqa.selenium.WebDriver;

import java.util.List;

// Class B: Sr.Fawad
//
public class Draw implements CanDraw{
    // --- Fields---
    private String symbol;

    // --- Constructor---
    public Draw(String inputSymb) {
        this.symbol = inputSymb;
    }

    // --- Methods----

    public void fawad() {
        System.out.println("hello");
    }

    public void printLine() {
        String line = "";
        for(int i = 0; i < 10; i++) {
            line += symbol;
        }
        System.out.println(line);
    }

    public void printLine(int num) {
        String line = "";
        for(int i = 0; i < num; i++) {
            line += symbol;
        }
        System.out.println(line);
    }
}

