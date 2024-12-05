
/**
 * OPhone9Max sub-class; inherits from OPhone9 class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone9Max extends OPhone9 {
    
    
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhone9Max
     */
    public OPhone9Max() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhone9Max.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * 1.2 / 10) * 10;
    }
    
    
    /**
     * Accessor for the screen size of class OPhone9Max.
     * @return      The screen size of the phone.
     */
    @Override
    public double getScreen() {
        return super.getScreen() + .9;
    }

    /**
     * String output for OPhone9Max class.
     * @return      One line list of phone details.
     */    
    @Override
    public String toString() {
        return super.toString();
    }
}
