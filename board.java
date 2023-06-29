
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
import java.util.Random;
public class board
{
    /**
     * Constructor for objects of class board
     */
    public board()
    {
        //reacteing a instance of random calss called rand
        Random rand = new Random();
        
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
        
        //grenerating random numbers(inintergers) in range of 0-arraysize -1
        
        int rand_int1 = rand.nextInt(arraySize);
        int rand_int2 = rand.nextInt(arraySize);
        
        
        //deffine boolean arry for the cell has life
        cellHasLife = new boolean[arraySize][arraySize];
        
        
        //Player picking how many cells to start with

        cellHasLife[rand_int1][rand_int2] =true;
        
        
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
        //debuging
        for(int x=0;x <arraySize;x++){
            for (int y=0;y <arraySize;y++){
                //making sure that we aren't checking out size or the arrays size
                if(x<arraySize-1){
                    //cheking though agreasnet cells, if the cell bellow me is true it'd printing out
                        if (cellHasLife[x+1][y]==true){
                         // if (x<arraySize||y<arraySize){ 
                        System.out.print("cell bellow is alive "+x+","+y);
                        // }
                           System.out.println(" ");
                        }
                    else {
                    //System.out.print("False");
                    // System.out.print(" ");
                    }
                    // System.out.print(" ");
                    }
                
                if(y<arraySize-1){
                    //cheking though agreasnet cells, if the cell bellow me is true it'd printing out
                        if (cellHasLife[x][y+1]==true){
                         // if (x<arraySize||y<arraySize){ 
                        System.out.print("cell next to is alive "+x+","+y);
                        // }
                           System.out.println(" ");
                        }
                    else {
                    //System.out.print("False");
                    // System.out.print(" ");
                    }
                    // System.out.print(" ");
                    }
            }
            System.out.println();
        }
        //print random intergers
        System.out.println("random:"+rand_int1);
        System.out.println("random:"+rand_int2);
    }

}
