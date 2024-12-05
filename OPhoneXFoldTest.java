
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhoneXFoldTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneXFoldTest {
    /**
     * Default constructor for test class OPhoneXFoldTest
     */
    public OPhoneXFoldTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }
    
    
    // HAPPY PATH TESTS //
    /**
     * Tests the accessor methods of the class.
     */
    @Test
    public void testGets() {
        OPhoneXFold testOPhoneXFold = new OPhoneXFold();
        
        assertEquals(1000.00, testOPhoneXFold.getPrice());
        assertEquals(7.5, testOPhoneXFold.getScreen());
        assertEquals(5, testOPhoneXFold.getComm());
        
        assertEquals(12, testOPhoneXFold.getCam());
        assertEquals("1080p", testOPhoneXFold.getVidRes());
        assertEquals("Foldable", testOPhoneXFold.getExtra());
    }
}
