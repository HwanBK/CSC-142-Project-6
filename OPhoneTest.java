import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhoneTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneTest {
    /**
     * Default constructor for test class OPhoneTest
     */
    public OPhoneTest() {
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
        OPhone testOPhone = new OPhone();
        
        assertEquals(790.00, testOPhone.getPrice());
        assertEquals(4, testOPhone.getComm());
        assertEquals(8, testOPhone.getCam());
    }
}
