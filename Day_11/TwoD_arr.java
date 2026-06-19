package Day_11;
import java.util.*;
public class TwoD_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter rows size-> ");
        rows = sc.nextInt(); // rows
        System.out.print("Enter cols size-> ");
        cols = sc.nextInt(); // cols
        int[][] arr = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.printf("Enter value at row %d & cols %d-> ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array :-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
