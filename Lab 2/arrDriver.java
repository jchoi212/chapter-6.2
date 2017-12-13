
/**
 * Write a description of class avgDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrDriver
{
    public static void main (String[]args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        lab2Array test1 = new lab2Array(arr);
        int[] result = test1.sumColumns(arr);
        int[][] square = test1.squareArray(arr);
        
        System.out.println("The average of the array is: " + test1.averageArray(arr));
        for (int thing : result){
            System.out.print(thing + " , ");
            }
        for (int[] row : square){
            for (int num : row){
             System.out.println (num + ",");   
            }
        }
    }
}
