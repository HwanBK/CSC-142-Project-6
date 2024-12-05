
/**
 * OPhone8Mini sub-class; inherits from OPhone8 class.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class OPhone8Mini extends OPhone8 {
    // CONSTRUCTOR //
    /**
     * Constructor for objects of class OPhone8Mini
     */
    public OPhone8Mini() {
        
    }
    
    
    // ACCESSORS //
    /**
     * Accessor for the price of class OPhone8Mini.
     * @return      The price of the phone; rounded to the nearest ten.
     */
    @Override
    public double getPrice() {
        return Math.round(super.getPrice() * 1.1 / 10) * 10;
    }
    
    
    /**
     * Accessor for the screen size of class OPhone8Mini.
     * @return      The screen size of the phone.
     */
    @Override
    public double getScreen() {
        return super.getScreen() - .9;
    }
    
    
    /**
     * String output for OPhone8Mini class.
     * @return      One line list of phone details.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
