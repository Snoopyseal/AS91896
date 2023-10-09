
/**
 * Write a description of class board here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (9/10/23)
 * @Version (11)
 * @Git (https://github.com/Snoopyseal/AS91896)
 * I'm creatting conways game of life as a learning exsosise
 */
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
            System.out.println("Conways Game Of Life");
            System.out.println();
            while (startAnEnd == false) // this repeates untill the player has put betwen 4-180
            {
                
                //Player picking game size/array size
                System.out.println("Pick Your Size");
                System.out.println();
                System.out.println("A number bettwen 4-180 using the keypads");
                System.out.println();
                Scanner playerSize; //setting up scanner
                playerSize= new Scanner(System.in); //allows player to imput
                
                //Stops player from imputting letters
                try //trying the code before needed for catching
                {
                    arraySize = playerSize.nextInt(); // getitng the player imput
                }
        
                catch (java.util.InputMismatchException e) // catching the error messing if letters are put in
                {
                    System.out.println(); 
                }
                
                
                
                //stops player imput being to small or big
                if (arraySize >= 4 && arraySize <= 180){ // chedcking if less than 4 or mor than 180
                    startAnEnd= true;} // changes the while to true to stop in
                else{ //sends us back and tells us what we did wrong
                 System.out.println("Not a valid character. Please pick bettwen 4 - 180");
                 System.out.println();
                }
            }
            
            while (countEndanStart == false)// this repeates untill the player has put betwen 4-180
            {
                //Player picking how many cells to start with
                System.out.println("Pick How Many Cell's To start Off With");
                System.out.println();
                System.out.println("A number bettwen 4-180 using the keypads");
                System.out.println();
                Scanner cellStartSize; //setting up scanner
                cellStartSize= new Scanner(System.in);
                
                //Stops player from imputting letters
                try//trying the code before needed for catching
                {
                    cellSize=cellStartSize.nextInt();// getitng the player imput
                }
        
                catch (java.util.InputMismatchException e)// catching the error messing if letters are put in
                {
                    System.out.println();
                }
                
                
                
                //stops player imput being to small or big
                    if (cellSize >= 4 && cellSize <= 180){ // chedcking if less than 4 or mor than 180
                    countEndanStart= true;} // changes the while to true to stop in
                else{//sends us back and tells us what we did wrong
                    System.out.println("Not a valid character. Please pick bettwen 4 - 180");
                    System.out.println();
                }
            }
            //grenerating random numbers(inintergers) in range of 0-arraysize -1
            //deffine boolean arry for the cell has life
            cellHasLife = new boolean[arraySize][arraySize]; // setting boolean array that needs data from prevoise var
            countN = new int[arraySize][arraySize];// seeting up int array that needs data from previose var
        
            //insalsing countN array
            for(int x=0;x <arraySize;x++){ //setting the arrays x value
                for(int y=0;y <arraySize;y++){ //setting the arrays Y value
                    countN[x][y] =0; // deffining where in te boolion x and y will sit
                }
            }
            
            //creatting the randommised effect for where the cells can sit
            for(int i=0; i <cellSize;i++){
                int rand_int1 = rand.nextInt(arraySize);
                int rand_int2 = rand.nextInt(arraySize);
                cellHasLife[rand_int1][rand_int2] =true;
            }
            
            
            
            
            
            //space to sperate there two bits of code
            
            
            
            // genarteing the array
                while  (counter<100) //how many times it will run before stopping
                {
                //duging messgae of time/ how many times the code runs for stopping
                //System.out.println("counter "+ counter);
                counter++; // adding to our counter
                try{  //this is a dellay so the action doesn't happen so fast we can't see it
                    TimeUnit.SECONDS.sleep(1); 
                }
                catch(Exception e){System.out.print(e);}
                
                System.out.print('\u000C'); // clears the screen
                System.out.println("Watch as the change");
                System.out.println();
                for (int x=0;x <arraySize;x++){
                    //above is the array for the x Row
                    for (int y=0;y <arraySize;y++){
                        //above is the array for the Y collem
                        // checking what cells are true and false
                        if (cellHasLife[x][y]==true){
                            //System.out.print("True"); 
                            System.out.print("⬛"); // this is what an alive cell should look like
                            
                            }
                        else {
                            //System.out.print("False");
                            System.out.print("⬜"); //this is what a dead cell should look like
                        }
                        System.out.print(" "); // gives them so space
                    }
                    System.out.println();
                }
                System.out.println();
                
                //checking cells next too to see if they are alive to create more
                    for (int x=0;x <arraySize;x++){
                    for (int y=0;y <arraySize;y++){
                        //checking alive cells
                        
                        //checking to the right on x
                        if((x<arraySize -1) && (cellHasLife[x+1][y] == true))
                        {
                            countN[x][y] ++; //adds a number to the y or x
                        }
                        //checking down
                        if((y<arraySize -1) && (cellHasLife[x][y+1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //cheking to the left
                        if((x>0) && (cellHasLife[x-1][y] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //cheking up
                        if((y>0) && (cellHasLife[x][y-1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //cheking ot the left and up
                        if((x>0 && y>0) && (cellHasLife[x-1][y-1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //checking to the right and down
                        if((x<arraySize -1 && y<arraySize -1) && (cellHasLife[x+1][y+1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //checking to the left and down
                        if((x>0 && y<arraySize -1) && (cellHasLife[x-1][y+1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //checking to the right and up
                        if((x<arraySize -1 && y>0) && (cellHasLife[x+1][y-1] == true))
                        {
                            countN[x][y] ++;//adds a number to the y or x
                        }
                        //checking to 
                        // if ((x<arraySize -1 && y<arraySize -1) && (cellHasLife[x][y] == true))
                        // {
                            // countN[x][y] ++;//adds a number to the y or x
                        // }
                        //debugin message
                        //System.out.print(countN[x][y]+" ");
                    }
                }
                
                for (int x=0;x <arraySize;x++){
                    //test
                    for (int y=0;y <arraySize;y++){
                        // if(cellHasLife[x][y] == true && countN[x][y] < 1) {
                            // cellHasLife[x][y] = false;
                        // }
                        //this is out games logic // the rulles
                        if (cellHasLife[x][y] = true && countN[x][y] < 4) //more than four cell dies
                        {
                            cellHasLife[x][y] = false;
                        }
                        if (cellHasLife[x][y] =true && countN[x][y] > 2) //less than two dies
                        {
                            cellHasLife[x][y] = false;
                        }
                        if (cellHasLife[x][y] = false && countN[x][y] == 3) // creates a new cell if three are alive
                        {
                            cellHasLife[x][y] = true;
                        }  
                        if (cellHasLife[x][y] = true && countN[x][y] == 3) // keeps cell alive if has three naugbours
                        {
                            cellHasLife[x][y] = true;
                        } 
                        //if it doesn't fit into any of these it stays the same
                        countN[x][y] = 0;
                        } 
                        }
            }
        }
}  

