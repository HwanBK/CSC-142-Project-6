
/**
 * OPhoneXFilm sub-class; inherits from OPhoneX class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneXFilm extends OPhoneX {
    // PRIVATE CONSTANTS //
    private static final String VIDEORESOLUTION = "4K";
    private static final String EXTRA = "Slow motion";
    
    
    /**
     * Constructor for objects of class OPhoneXFilm
     */
    public OPhoneXFilm() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhoneXFilm.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * 1.25 / 10) * 10;
    }
    
    
    /**
     * Accessor for the video resolution of class OPhoneXFilm.
     * @return      The video resolution of the phone.
     */
    @Override
    public String getVidRes() {
        return VIDEORESOLUTION;
    }
    
    
    /**
     * Accessor for the extra feature of class OPhoneXFilm.
     * @return      The extra feature of the phone.
     */
    public String getExtra() {
        return EXTRA;
    }
    
    
    /**
     * String output for OPhoneXFilm class.
     * @return      One line list of phone details.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Extra: %s", getExtra());
    }
}
