// ragged as== jagged array 
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int r;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        r=obj.nextInt();
        int arr[][] = new int[r][];
  
        // Creating a ragged array in a pyramid form
        for (int i=0; i<arr.length; i++)
            arr[i] = new int[i+1];
  
        // Putting values into the array
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter the element at ["+i+"]["+j+"]:");
                arr[i][j]=obj.nextInt();
            }
        
        // Displaying the Ragged array
        System.out.println("Contents of Ragged Array");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
 }
}
}