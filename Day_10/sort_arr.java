package Day_10;
import java.util.*;
public class sort_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size-> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter a value for index %d-> ",i);
            arr[i] = sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("The array is in sorted order");
        }
        else{
            System.out.println("The array is not in sorted order");
        }
    }
}
