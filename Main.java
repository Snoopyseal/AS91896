
/**
 * Write a description of class board here.
 *
 * @author (Helene)
 * @Start Date (23/5/23)
 * @Version Date (26,8,23)
 * @Version (1.1)
 * I'm creatting conways game of life
 */
import java.util.Scanner;
import java.util.Random;

public class Main
{   
    //setting up my varrbiles
    int cells[];
    int arraySize = 0;
    int cellSize = 0;
    int cellHasLife = 0;
    void setup(){
        System.out.println("Conways Game Of Life");
        
        
        //Player picking game size/array size
        System.out.println("Pick Your Size");
        Scanner playerSize;
        playerSize= new Scanner(System.in);
        arraySize=playerSize.nextInt();
        
        
        //Player picking how many cells to start with
        
        System.out.println("Pick How Many Cell's To start Off With");
        Scanner cellStartSize;
        cellStartSize= new Scanner(System.in);
        cellSize=cellStartSize.nextInt();
     }
    void drawCells(){
        for (int x=0;x <arraySize;x++){
            for (int y=0;y <arraySize;y++){
                System.out.print("⬜");
                }
            System.out.println();
        }
    }
    int pos(int x, int y) {
        x = constrain(x, 0, arraySize -1);
        y = constrain(x, 0, arraySize -1);
        return x + y;
    }
}
