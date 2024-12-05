
/**
 * OPhoneXFold sub-class; inherits from OPhoneX class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhoneXFold extends OPhoneX {
    // PRIVATE CONSTANTS //
    private static final String EXTRA = "Foldable";
    
    
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhoneXFold
     */
    public OPhoneXFold() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhoneXFold.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * 1.15 / 10) * 10;
    }
    
    
    /**
     * Accessor for the screen size of class OPhoneXFold.
     * @return      The screen size of the phone.
     */
    @Override
    public double getScreen() {
        return super.getScreen() + .8;
    }

    
    /**
     * Accessor for the extra feature of class OPhoneXFold.
     * @return      The extra feature of the phone.
     */
    public String getExtra() {
        return EXTRA;
    }
    
    
    /**
     * String output for OPhoneXFold class.
     * @return      One line list of phone details.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Extra: %s", getExtra());
    }
}
