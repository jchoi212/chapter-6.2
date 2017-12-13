
/**
 * Write a description of class AverageArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lab2Array
{
    int[][] arr = {{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12}};
                   
    int[] testC = {1,2,3,4,5};
                //{1,4,9,16,25};
    public lab2Array(int[][] nums){
        averageArray(arr);
        sumColumns(arr);
        }   
    public double averageArray(int[][] arr){
        double avg = 0;
        double total  = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col <arr[0].length; col++){
                avg += arr[row][col];
            }
        }
        total = arr.length*arr[0].length;
        return (avg)/total;  
    }
    public int[] sumColumns(int[][] arr){
        int[] result = new int[arr[0].length];
        for (int col = 0; col < arr[0].length; col++){
            int sum = 0;
            for (int row = 0; row < arr.length; row++){    
                sum += arr[row][col];
            }
            result[col] = sum;
        }   
        return result;
    }
    public int[][] squareArray(int[][] arr){
        int[][] square = new int[arr.length][arr[0].length];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                int value = arr[row][col];
                square[row][col] = value*value;
            }
        }
        return square;
    }
}
