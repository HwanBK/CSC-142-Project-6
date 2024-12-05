
/**
 * OPhone parent class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone {
    // PRIVATE CONSTANTS //
    private static final double ORIGINALPRICE = 790.00;
    private static final int ORIGINALCOMM = 4;
    private static final int ORIGINALCAM = 8;
    
    
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhone.
     */
    public OPhone() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhone.
     * @return      The price of the phone.
     */
    public double getPrice() {
        return ORIGINALPRICE;
    }
    
    
    /**
     * Accessor for the communication tech. of class OPhone.
     * @return      The communication tech. of the phone.
     */
    public int getComm() {
        return ORIGINALCOMM;
    }
    
    
    /**
     * Accessor for the camera capacity of class OPhone.
     * @return      The camera capacity of the phone; in megapixels (MP).
     */
    public int getCam() {
        return ORIGINALCAM;
    }
    
    
    /**
     * String output for OPhone class.
     * @return      One line list of phone details.
     */
    public String toString() {
        return String.format("%s: Price: $%.2f, Comm: %dG, Camera: %dMP",
                             getClass().getName(), getPrice(), getComm(), getCam());
    }
}
