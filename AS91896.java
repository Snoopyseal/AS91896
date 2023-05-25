
/**
 * Write a description of class AS91896 here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (25/5/23)
 * @version (1)
 * I'm creatting conways game of life
 */
import java.util.Scanner;
public class AS91896
{
    /**
     * Constructor for objects of class AS91896
     */
    public AS91896()
    {
        // initialise instance variables
        System.out.println("Conways Game Of Life");
        int arrySize = 30;
        System.out.println("Pick Your Size");
        Scanner playerSize;
        playerSize= new Scanner(System.in);
        arrySize=playerSize.nextInt();
        for (int x=0;x<arrySize;x++) {
            /*System.out.print(x+" ");*/
            for (int y=0;y<arrySize;y++) {
                System.out.print("0");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
