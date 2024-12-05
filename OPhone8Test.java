
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhone8Test.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone8Test {
    /**
     * Default constructor for test class OPhone8Test
     */
    public OPhone8Test() {
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
        OPhone8 testOPhone8 = new OPhone8();
        
        assertEquals(470.00, testOPhone8.getPrice());
        assertEquals(5.5, testOPhone8.getScreen());
        assertEquals(4, testOPhone8.getComm());
        
        assertEquals(8, testOPhone8.getCam());
        assertEquals("720p", testOPhone8.getVidRes());
    }
}
