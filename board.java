
/**
 * Write a description of class board here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (21/7/23)
 * @Version (6)
 * I'm creatting conways game of life
 */
//2d buillin if statmnt if true x in not 0
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
        //Methods
        //  public twoards (int x, int y){
        //code
         //   }

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
            //counter is for testing purposes
            int counter = 0;
            int arraySize = 0;
            int cellSize = 0;
            boolean[][] cellHasLife;
            int[][] countN;
            boolean startAnEnd;
            boolean countEndanStart;
            
            startAnEnd = false;
            countEndanStart = false;
            while (startAnEnd == false)
            {
                System.out.println("Conways Game Of Life");
                //Player picking game size/array size
                System.out.println("Pick Your Size");
                Scanner playerSize;
                playerSize= new Scanner(System.in);
                arraySize=playerSize.nextInt();
                //Player picking how many cells to start with
                if (arraySize >= 4 && arraySize <= 180){
                    startAnEnd= true;}
                else{
                    System.out.println(arraySize+ " is not a valid character. Please try again.");
                }
            }
            while (countEndanStart == false)
            {
                System.out.println("Pick How Many Cell's To start Off With");
                Scanner cellStartSize;
                cellStartSize= new Scanner(System.in);
                cellSize=cellStartSize.nextInt();
                //grenerating random numbers(inintergers) in range of 0-arraysize -1
                    if (cellSize >= 4 && cellSize <= 180){
                    countEndanStart= true;}
                else{
                    System.out.println(" is not a valid character. Please try again.");
                }
            }
           
            //deffine boolean arry for the cell has life
            cellHasLife = new boolean[arraySize][arraySize];
            countN = new int[arraySize][arraySize];
        
            //insalsing countN array
            for(int x=0;x <arraySize;x++){
                for(int y=0;y <arraySize;y++){
                    countN[x][y] =0;
                }
            }
            
            //Player picking how many cells to start with
            for(int i=0; i <cellSize;i++){
                int rand_int1 = rand.nextInt(arraySize);
                int rand_int2 = rand.nextInt(arraySize);
                cellHasLife[rand_int1][rand_int2] =true;
            }
            // genarteing the array
                while  (counter<100)
                {
                System.out.println("counter "+ counter);
                counter++;
                try{ 
                    TimeUnit.SECONDS.sleep(1); 
                }
                catch(Exception e){System.out.print(e);}
                //celaring the screen  
                System.out.print('\u000C');
                System.out.println("Watch as the change");
                for (int x=0;x <arraySize;x++){
                    //above is the array for the x Row
                    for (int y=0;y <arraySize;y++){
                        //above is the array for the Y collem
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
                //checking cells next too
                    for (int x=0;x <arraySize;x++){
                    for (int y=0;y <arraySize;y++){
                        // if (cellHasLife[x][y] ==true)
                        // {
                            // countN[x][y] ++;
                        // }
                        //checking to the right on x
                        if((x<arraySize -1) && (cellHasLife[x+1][y] == true))
                        {
                            countN[x][y] ++;
                        }
                        //checking down
                        if((y<arraySize -1) && (cellHasLife[x][y+1] == true))
                        {
                            countN[x][y] ++;
                        }
                        //cheking to the left
                        if((x>0) && (cellHasLife[x-1][y] == true))
                        {
                            countN[x][y] ++;
                        }
                        //cheking up
                        if((y>0) && (cellHasLife[x][y-1] == true))
                        {
                            countN[x][y] ++;
                        }
                        //cheking ot the left and up
                        if((x>0 && y>0) && (cellHasLife[x-1][y-1] == true))
                        {
                            countN[x][y] ++;
                        }
                        //checking to the right and down
                        if((x<arraySize -1 && y<arraySize -1) && (cellHasLife[x+1][y+1] == true))
                        {
                            countN[x][y] ++;
                        }
                        //checking to the left and down
                        if((x>0 && y<arraySize -1) && (cellHasLife[x-1][y+1] == true))
                        {
                            countN[x][y] ++;
                        }
                        //checking to the right and up
                        if((x<arraySize -1 && y>0) && (cellHasLife[x+1][y-1] == true))
                        {
                            countN[x][y] ++;
                        
                        }
                        if ((x<arraySize -1 && y<arraySize -1) && (cellHasLife[x][y] == true))
                        {
                            countN[x][y] ++;
                        }
                        // else{
                            // //System.out.println("dead");
                        // }
                    }
                }
                
                for (int x=0;x <arraySize;x++){
                    //test
                    for (int y=0;y <arraySize;y++){
                        // if(cellHasLife[x][y] == true && countN[x][y] < 1) {
                            // cellHasLife[x][y] = false;
                        // }
                        if (cellHasLife[x][y] = true && countN[x][y] < 4)
                        {
                            cellHasLife[x][y] = false;
                        }
                        if (cellHasLife[x][y] =true && countN[x][y] > 2)
                        {
                            cellHasLife[x][y] = false;
                        }
                        if (cellHasLife[x][y] = true && countN[x][y] == 3)
                        {
                            cellHasLife[x][y] = true;
                        }
                        // else
                        // {
                            // cellHasLife[x][y] = false;
                        // }
                        //System.out.print("CeNext."+ countN[x][y]+" ");                    
                        countN[x][y] = 0;
                        } 
                        }
            }
        }
}  

