
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OPhoneXFilmTest.
 *
 * @author  Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneXFilmTest {
    /**
     * Default constructor for test class OPhoneXFilmTest
     */
    public OPhoneXFilmTest() {
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
        OPhoneXFilm testOPhoneXFilm = new OPhoneXFilm();
        
        assertEquals(1090.00, testOPhoneXFilm.getPrice());
        assertEquals(6.7, testOPhoneXFilm.getScreen());
        assertEquals(5, testOPhoneXFilm.getComm());
        
        assertEquals(12, testOPhoneXFilm.getCam());
        assertEquals("4K", testOPhoneXFilm.getVidRes());
        assertEquals("Slow motion", testOPhoneXFilm.getExtra());
    }
}
