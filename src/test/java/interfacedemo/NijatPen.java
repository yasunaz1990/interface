package interfacedemo;

public class NijatPen implements CanDraw {
    @Override
    public void printLine() {
        System.out.println("--------------------");
    }

    @Override
    public void printLine(int num) {
        String line = "--------------------";
        for (int i = 0; i < num; i++) {
            System.out.println(line);
        }
    }
}
