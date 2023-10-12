
/**
 * 
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (9/10/23)
 * @Version (11)
 * @Git (https://github.com/Snoopyseal/AS91896)
 * I'm creating Conway's game of life as a learning exercise for CSC223 @ WHS
 */
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class board
{
    /**
     * Constructor for objects of class board
     */
    public board()
    {
        //reacting a instance of random calls called rand
        Random rand = new Random();
        
        //Variables
        //counter is for testing purposes
        int counter = 0; //how many times the game should run though
        int arraySize = 0; //player imput for arraySize
        int cellSize = 0; //player imput for cellSize
        boolean[][] cellHasLife; // tells if there should be life there
        int[][] countN; //counting how many cells are alive next to the cell that's being looked at
        boolean startAnEnd; // a while loop for catching
        boolean countEndanStart; // a while loop for catching
        int cellLifeCounter =0; // how many cells are alive in a int
        boolean lastRun = false; // flag to stop game
        
        startAnEnd = false;
        countEndanStart = false;
        
        //rules & instudiotns 
        System.out.println("Conways Game Of Life");
        System.out.println();
        System.out.println("Conways is a simulation based 'game'");
        System.out.println();
        System.out.println("Rules");
        System.out.println();
        System.out.println();
        System.out.println("For a space that is populated:");
        System.out.println();
        System.out.println("Each cell with one or no neighbours dies, as if by solitude.");
        System.out.println();
        System.out.println("Each cell with four or more neighbours dies, as if by overpopulation.");
        System.out.println();
        System.out.println("Each cell with two or three neighbours it survives.");
        System.out.println();
        System.out.println();
        System.out.println("For a space that is empty or unpopulated:");
        System.out.println();
        System.out.println("Each cell with three neighbours becomes populated.");
        System.out.println();
        System.out.println("The Game will automaticaly stop when all cells die off ");
        System.out.println();
        System.out.println("You will pick the grid size that your Cell's will live on and how many live there to start with ");
        System.out.println();
        System.out.println();
        
        while (startAnEnd == false) // this repeats until the player has put betwen 4-180
        {
            
            //Player picking game size/array size
            System.out.println("Pick Your Size");
            System.out.println();
            System.out.println("A number bettwen 4-40 using the keypads");
            System.out.println();
            Scanner playerSize; //setting up scanner
            playerSize= new Scanner(System.in); //allows player to input
            
            //Stops player from inputting letters
            try //trying the code before needed for catching
            {
                arraySize = playerSize.nextInt(); // getting the player imput
            }
    
            catch (java.util.InputMismatchException e) // catching the error message if letters are put in
            {
                System.out.println(); 
            }
            
            
            
            //stops player input being to small or big
            if (arraySize >= 4 && arraySize <= 40){ // checking if less than 4 or more than 180
                startAnEnd= true;} // changes the while to true to stop in
            else{ //sends us back and tells us what we did wrong
             System.out.println("Not a valid character. Please pick between 4 - 180");
             System.out.println();
            }
        }
        
        while (countEndanStart == false)// this repeats until the player has put betwen 4-180
        {
            //Player picking how many cells to start with
            System.out.println("Pick How Many Cell's To start Off With");
            System.out.println();
            
            System.out.println("A number between 4-1600 using the keypads");
            System.out.println();
            
            Scanner cellStartSize; //setting up scanner
            cellStartSize= new Scanner(System.in);
            
            //Stops player from inputing letters
            try//trying the code before, needed for catching
            {
                cellSize=cellStartSize.nextInt();// getting the player input
            }
    
            catch (java.util.InputMismatchException e)// catching the error message if letters are put in
            {
                System.out.println();
            }
            
            
            
            //stops player input being to small or big
                if (cellSize >= 4 && cellSize <= 1600){ // chedcking if less than 4 or mor than 180
                countEndanStart= true;} // changes the while to true to stop in
            else{//sends us back and tells us what we did wrong
                System.out.println("Not a valid character. Please pick between 4 - 180");
                System.out.println();
            }
        }
        //generating random numbers(inintergers) in range of 0-arraysize -1
        
        //define boolean array for the cell has life
        cellHasLife = new boolean[arraySize][arraySize]; // setting boolean array that needs data from previous var
        countN = new int[arraySize][arraySize];// setting up int array that needs data from previous var
        
        
        //if count is greater than array x - if less that add and do this for y also and the angles
    
        //initialising countN array - this is to count if a cell is alive near other cells
        for(int x=0;x <arraySize;x++){ //setting the arrays x value
            for(int y=0;y <arraySize;y++){ //setting the arrays Y value
                countN[x][y] =0; // defining where in the boolean x and y will sit
            }
        }
        
        //creating the randommised effect for what cells are alive
        for(int i=1; i <= cellSize;i++){
            int rand_int1 = rand.nextInt(arraySize -1); // X - picks a random number bettwen 0 and arraySize for our x cord
            int rand_int2 = rand.nextInt(arraySize -1); // Y - picks a random number bettwen 0 and arraySize for our y cord
            cellHasLife[rand_int1][rand_int2] =true; // turning those random numbers into x and y cords for cells that are alive
            // if(Arrays.equals(rand_int1,rand_int2)){
            // }
        }
        // when the numbers are added to a list i need to compare it to the 2darray list and then if each number is n
        
        //https://www.geeksforgeeks.org/compare-two-arrays-java/
        
        
        // generating the array
        while  (counter<100) //how many times it will run before stopping
            {
            //debugging message of time/ how many times the code runs for stopping
            //System.out.println("counter "+ counter);
            cellLifeCounter = 0;
            
            counter++; // adding to our counter
            try{  //this is a delay so the action doesn't happen so fast we can't see it
                TimeUnit.SECONDS.sleep(1); 
            }
            catch(Exception e){System.out.print(e);}
            
            System.out.print('\u000C'); // clears the screen
            System.out.println("Watch as the cells change");
            System.out.println();
            
            for (int x=0;x <arraySize;x++){
                //above is the array for the x Row
                for (int y=0;y <arraySize;y++){
                    //above is the array for the Y collumn
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
                    
                    //checking to the left
                    if((x>0) && (cellHasLife[x-1][y] == true))
                    {
                        countN[x][y] ++;//adds a number to the y or x
                    }
                    //checking up
                    if((y>0) && (cellHasLife[x][y-1] == true))
                    {
                        countN[x][y] ++;//adds a number to the y or x
                    }
                    //checking to the left and up
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
                    //debugging message
                    //System.out.print(countN[x][y]+" ");
                }
            }
            
            for (int x=0;x <arraySize;x++){
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
                    if (cellHasLife[x][y] = true && countN[x][y] == 3) // keeps cell alive if has three neighbours
                    {
                        cellHasLife[x][y] = true;
                    } 
                    //if it doesn't fit into any of these it stays the same
                    countN[x][y] = 0;
                    
                    
                    if (cellHasLife[x][y] == true){ // checking how many cells are alive
                        cellLifeCounter ++;// adds one to a counter
                    }
                    
                    }
                } 
            //System.out.println(cellLifeCounter); //debugging message
            
            // stops the game if all cells die
            if(lastRun){ //resevers flags
                System.out.println("Game Has Finshed All Cells Died");
                System.exit(0);
            }
            if (cellLifeCounter == 0){ //checking all cells are dead
              lastRun =true; // sets up a flag to run one last time
            }
            }
    }
}


