package Day_11;
import java.util.*;
public class matrix_transpose {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your row size-> ");
            int row = sc.nextInt();
            System.out.print("Enter your col size-> ");
            int col = sc.nextInt();

            int[][] matrix = new int[row][col];
            for(int i=0; i<row; i++) {
                for(int j=0; j<col; j++) {
                    System.out.printf("Enter value for row %d column %d -> ",i,j);
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("The transpose is : ");
            //To print transpose
            for(int j=0; j<col ;j++) {
                for(int i=0; i<row; i++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
