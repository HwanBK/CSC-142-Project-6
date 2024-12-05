
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhone9Test.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone9Test {
    /**
     * Default constructor for test class OPhone9Test
     */
    public OPhone9Test() {
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
        OPhone9 testOPhone9 = new OPhone9();
        
        assertEquals(630.00, testOPhone9.getPrice());
        assertEquals(5.6, testOPhone9.getScreen());
        assertEquals(5, testOPhone9.getComm());
        
        assertEquals(10, testOPhone9.getCam());
        assertEquals("1080p", testOPhone9.getVidRes());
    }
}
