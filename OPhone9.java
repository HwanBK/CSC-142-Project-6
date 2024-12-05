
/**
 * OPhone9 sub-class; inherits from OPhone class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone9 extends OPhone {
    // PRIVATE CONSTANTS //
    private static final double SCREENSIZE = 5.6;
    private static final String VIDEORESOLUTION = "1080p";
    
    
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhone9
     */
    public OPhone9() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhone9.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * .8 / 10) * 10;
    }
    
    
    /**
     * Accessor for the communication tech. of class OPhone9.
     * @return      The communication tech. of the phone.
     */
    @Override
    public int getComm() {
        return super.getComm() + 1;
    }
    
    
    /**
     * Accessor for the screen size of class OPhone9.
     * @return      The screen size of the phone.
     */
    public double getScreen() {
        return SCREENSIZE;
    }
    
    
    /**
     * Accessor for the camera capacity of class OPhone9.
     * @return      The camera capacity of the phone; in megapixels (MP).
     */
    @Override
    public int getCam() {
        return super.getCam() + 2;
    }
    
    
    /**
     * Accessor for the video resolution of class OPhone9.
     * @return      The video resolution of the phone.
     */
    public String getVidRes() {
        return VIDEORESOLUTION;
    }
    
    
    /**
     * String output for OPhone9 class.
     * @return      One line list of phone details.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Screen size: %.1f\", Vid Res: %s",
                                                getScreen(), getVidRes());
    }
}
