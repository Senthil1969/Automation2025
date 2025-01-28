package TestNGListenersPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListenersPractice {

    @Test
    public void testRss() {
        Assert.assertTrue(true);
        System.out.println("This is Listeners Test");
    }
    @Test
    public void testR1() {
        Assert.assertTrue(false);
        System.out.println("This is Listeners Test");
    }
}
