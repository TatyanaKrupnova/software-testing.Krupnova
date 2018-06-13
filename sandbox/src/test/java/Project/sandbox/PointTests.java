package Project.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance1() {
        Point p1 = new Point(10, 1);
        Point p2 = new Point(-10, 1);
        Assert.assertEquals(p1.distance(p2), 20.0);
    }

    @Test
    public void testDistance2() {
        Point p3 = new Point(10, 1);
        Point p4 = new Point(-10, 1);
        Assert.assertEquals(p3.distance(p4), 120.0);
    }

    @Test
    public void testDistance3() {
        Point p5 = new Point(10, 1);
        Point p6 = new Point(-10, 1);
        Assert.assertEquals (p5.distance(p6), -20.0);

    }
}
