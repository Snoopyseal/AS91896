
/**
 * Write a description of class AS91896 here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (29/5/23)
 * @Version (3)
 * I'm creatting conways game of life
 */
//2d buillin if statmnt if true x in not 0
import java.util.Scanner;
public class AS91896
{
    /**
     * Constructor for objects of class AS91896
     */
    public AS91896()
    {
        //Variables
        int arrySize = 0;
        int cellSize = 0;
        boolean[][] cellHasLife;
        System.out.println("Conways Game Of Life");
        
        //Player picking game size/array size
        System.out.println("Pick Your Size");
        Scanner playerSize;
        playerSize= new Scanner(System.in);
        arrySize=playerSize.nextInt();
        //deffine boolean arry
        
        cellHasLife = new boolean[arrySize][arrySize];
        
        
        //Player picking how many cells to start with
        System.out.println("Pick How Many Cell's To start Off With");
        Scanner cellStartSize;
        cellStartSize= new Scanner(System.in);
        cellSize=cellStartSize.nextInt();
        
        //Boolean printing true or false
        if (cellHasLife=true) System.out.print("Ture");
        else System.out.print("False");
            
        
        
    
        //The array
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
