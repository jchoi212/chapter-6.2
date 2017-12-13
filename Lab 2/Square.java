
// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
   
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
       
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sumRow = 0;
        for (int x = row; x < square.length; x++){
            for (int col = 0; col < square[0].length; col++){
                sumRow += square[x][col];
            }
        }
        return sumRow;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sumCol = 0;
        for (int x = col; x < square[0].length; x++){
            for (int row = 0; row < square[0].length; row++){
                sumCol += square[x][col];
            }
        }
        return sumCol;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        return 0;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        return 0;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //Change to work correctly
        return false;
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}