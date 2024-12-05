
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhoneXTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneXTest {
    /**
     * Default constructor for test class OPhoneXTest
     */
    public OPhoneXTest() {
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
        OPhoneX testOPhoneX = new OPhoneX();
        
        assertEquals(870.00, testOPhoneX.getPrice());
        assertEquals(6.7, testOPhoneX.getScreen());
        assertEquals(5, testOPhoneX.getComm());
        
        assertEquals(12, testOPhoneX.getCam());
        assertEquals("1080p", testOPhoneX.getVidRes());
    }
}
