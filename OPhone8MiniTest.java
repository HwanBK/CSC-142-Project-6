
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhone8MiniTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone8MiniTest {
    /**
     * Default constructor for test class OPhone8MiniTest
     */
    public OPhone8MiniTest() {
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
        OPhone8Mini testOPhone8Mini = new OPhone8Mini();
        
        assertEquals(520.00, testOPhone8Mini.getPrice());
        assertEquals(4.6, testOPhone8Mini.getScreen());
        assertEquals(4, testOPhone8Mini.getComm());
        
        assertEquals(8, testOPhone8Mini.getCam());
        assertEquals("720p", testOPhone8Mini.getVidRes());
    }
}
