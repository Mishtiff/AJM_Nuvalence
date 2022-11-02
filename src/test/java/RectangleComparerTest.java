import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RectangleComparerTest extends TestCase {

    public RectangleComparerTest( String name ) {
        super( name );
    }

    public static Test suite() {
        return new TestSuite( RectangleComparerTest.class );
    }

    public void testUserInputAdjacentProper() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        new RectangleComparer(new String[] {"1,1,1,1", "1,2,1,1"});
        System.setOut(stdout);
        
        assertTrue(byteArrayOutputStream.toString().contains("These Rectangles are adjacent Proper"));
    }

    public void testUserInputIncorrectArgs() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        new RectangleComparer(new String[] {"error"});
        System.setOut(stdout);
        
        assertTrue(byteArrayOutputStream.toString().contains("The input format is: \"1,2,3,4 4,3,2,1\""));
    }

    public void testUserInputNumberFormatException() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        new RectangleComparer(new String[] {"1,2,3,4", "a,b,c,d"});
        System.setOut(stdout);
        
        assertTrue(byteArrayOutputStream.toString().contains("The input format is: \"1,2,3,4 4,3,2,1\""));
    }

}
