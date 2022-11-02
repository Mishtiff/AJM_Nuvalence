import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RectangleExtTest extends TestCase {
	RectangleExt rectangleExt;

    public RectangleExtTest( String name ) {
        super( name );
    }

    public static Test suite() {
        return new TestSuite( RectangleExtTest.class );
    }
	
    public void testRectangleDimensions() throws Exception {
    	int expectedX = 1;
    	int expectedY = 2;
    	int expectedWidth = 3;
    	int expectedHeight = 4;
    	rectangleExt = new RectangleExt(expectedX, expectedY, expectedWidth, expectedHeight);

        assertTrue(rectangleExt.x == expectedX);
        assertTrue(rectangleExt.y == expectedY);
        assertTrue(rectangleExt.width == expectedWidth);
        assertTrue(rectangleExt.height == expectedHeight);
    }

    public void testRectangleAdjacentNone() throws Exception {
    	rectangleExt = new RectangleExt(1, 1, 1, 1);
    	RectangleExt rectangleExt2 = new RectangleExt(3, 3, 1, 1);

        assertTrue(rectangleExt.adjacent(rectangleExt2).equals("none"));
    }
    
    public void testRectangleAdjacentProper() throws Exception {
    	rectangleExt = new RectangleExt(1, 1, 1, 1);
    	RectangleExt rectangleExt2 = new RectangleExt(2, 1, 1, 1);

        assertTrue(rectangleExt.adjacent(rectangleExt2).equals("Proper"));
    }
    
    public void testRectangleSubLineProper() throws Exception {
    	rectangleExt = new RectangleExt(1, 1, 1, 3);
    	RectangleExt rectangleExt2 = new RectangleExt(2, 1, 1, 1);

        assertTrue(rectangleExt.adjacent(rectangleExt2).equals("Sub-Line"));
    }
    
    public void testRectanglePartialProper() throws Exception {
    	rectangleExt = new RectangleExt(1, 2, 1, 2);
    	RectangleExt rectangleExt2 = new RectangleExt(2, 1, 1, 2);

        assertTrue(rectangleExt.adjacent(rectangleExt2).equals("Partial"));
    }

}
