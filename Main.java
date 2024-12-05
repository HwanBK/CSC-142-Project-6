
/**
 * For displaying OPhone classes on the terminal.
 *
 * @author Hwansu Kim (Billy)
 * @version 03/05/2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.print('\u000c');
        
        OPhone[] phoneModels = new OPhone[8];
        
        phoneModels[0] = new OPhone();
        phoneModels[1] = new OPhone8();
        phoneModels[2] = new OPhone8Mini();
        phoneModels[3] = new OPhone9();
        phoneModels[4] = new OPhone9Max();
        phoneModels[5] = new OPhoneX();
        phoneModels[6] = new OPhoneXFold();
        phoneModels[7] = new OPhoneXFilm();
        
        for (OPhone eachModel : phoneModels) {
            System.out.println(eachModel);
            System.out.println();
        }
    }
}
