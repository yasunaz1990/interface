package listdemo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    @Test
    public void listIntro() {
       List<Double> scores = new ArrayList<>();

       scores.add(670.90);
       scores.add(770.90);
       scores.add(970.90);

       System.out.println( scores         );
       System.out.println( scores.size()  );

       scores.remove(770.90);
       System.out.println( scores         );

       System.out.println(  scores.contains(470.90)  );
       scores.set(0, 470.90);
       System.out.println( scores         );
    }
}
