
/**
 * OPhone8 sub-class; inherits from OPhone class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone8 extends OPhone {
    // PRIVATE CONSTANTS //
    private static final double SCREENSIZE = 5.5;
    private static final String VIDEORESOLUTION = "720p";
    
    
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhone8
     */
    public OPhone8() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhone8.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * .6 / 10) * 10;
    }
    
    
    /**
     * Accessor for the screen size of class OPhone8.
     * @return      The screen size of the phone.
     */
    public double getScreen() {
        return SCREENSIZE;
    }
    
    
    /**
     * Accessor for the video resolution of class OPhone8.
     * @return      The video resolution of the phone.
     */
    public String getVidRes() {
        return VIDEORESOLUTION;
    }
    
    
    /**
     * String output for OPhone8 class.
     * @return      One line list of phone details.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Screen size: %.1f\", Vid Res: %s",
                                                getScreen(), getVidRes());
    }
}
