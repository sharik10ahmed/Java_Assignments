package Day_11;
import java.util.*;
public class arr_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols,target,i,j,col_temp=0,row_temp=0;
        boolean found=false;
        System.out.print("Enter row size-> ");
        rows = sc.nextInt();
        System.out.print("Enter cols size-> ");
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.printf("Enter value for row %d col %d-> ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array:-");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter a number to search-> ");
        target = sc.nextInt();

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(target==arr[i][j]){
                    found=true;
                    row_temp=i;
                    col_temp=j;
                    break;
                }
            }
        }
        if(!found){
            System.out.printf("%d Number not found in array!",target);
        }
        else{
            System.out.printf("Number found at row %d col %d -> %d",row_temp,col_temp,target);
        }

    }
}
