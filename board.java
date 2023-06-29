
/**
 * Write a description of class board here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (29/5/23)
 * @Version (3)
 * I'm creatting conways game of life
 */
//2d buillin if statmnt if true x in not 0
import java.util.Scanner;
public class board
{
    /**
     * Constructor for objects of class board
     */
    public board()
    {
        //Variables
        int arraySize = 0;
        int cellSize = 0;
        boolean[][] cellHasLife;
        System.out.println("Conways Game Of Life");
        
        //Player picking game size/array size
        System.out.println("Pick Your Size");
        Scanner playerSize;
        playerSize= new Scanner(System.in);
        arraySize=playerSize.nextInt();
        
        
        //deffine boolean arry for the cell has life
        cellHasLife = new boolean[arraySize][arraySize];
        
        
        //Player picking how many cells to start with
        System.out.println("Pick How Many Cell's To start Off With");
        Scanner cellStartSize;
        cellStartSize= new Scanner(System.in);
        cellSize=cellStartSize.nextInt();
        

        cellHasLife[5][5] =true;
        
        // genarteing the array
        for (int x=0;x <arraySize;x++){
            for (int y=0;y <arraySize;y++){
                // checking what cells are true and false
                if (cellHasLife[x][y]==true){
                    //System.out.print("True"); 
                    System.out.print("⬛");
                    }
                else {
                    //System.out.print("False");
                    System.out.print("⬜");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //checking for life
        for(int x=0;x <arraySize;x++){
            for (int y=0;y <arraySize;y++){
                //making sure that we aren't checking out size or the arrays size
                if(x<arraySize-1){
                    //cheking though agreasnet cells, if the cell bellow me is true it'd printing out
                        if (cellHasLife[x+1][y]==true){
                         // if (x<arraySize||y<arraySize){
                            //System.out.print("True"); 
                        System.out.print("▣");
                        // }
                        
                        }
                    else {
                    //System.out.print("False");
                    System.out.print("⬜");
                    }
                    System.out.print(" ");
                    }
                
            }
            System.out.println();
        }
        //check though each cel
    
        // //The array
        // for (int x=0;x<arraySize;x++) {
            // /*System.out.print(x+" ");*/
            // for (int y=0;y<arraySize;y++) {
                // System.out.print("⬜");
                // System.out.print(" ");
            // }
            // System.out.println();
        // }
    }

}
