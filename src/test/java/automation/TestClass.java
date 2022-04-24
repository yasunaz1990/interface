package automation;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(NijatTestDetectionAndReporter.class)
public class TestClass {

    @Test
    public void testCase1() {
        System.out.println("executed testcase 1");
    }

    @Test
    public void testCase2() {
        System.out.println("executed testcase 2");
    }

    @Test
    public void testCase3() {
        System.out.println("executed testcase 3");
    }

    @Test
    public void testCase4() {
        System.out.println("executed testcase 4");
    }
}