
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhone9MaxTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone9MaxTest {
    /**
     * Default constructor for test class OPhone9MaxTest
     */
    public OPhone9MaxTest() {
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
        OPhone9Max testOPhone9Max = new OPhone9Max();
        
        assertEquals(760.00, testOPhone9Max.getPrice());
        assertEquals(6.5, testOPhone9Max.getScreen());
        assertEquals(5, testOPhone9Max.getComm());
        
        assertEquals(10, testOPhone9Max.getCam());
        assertEquals("1080p", testOPhone9Max.getVidRes());
    }
}
