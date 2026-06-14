package Day_7.Exercise;
import java.util.*;
public class Q7count {
    public static void count(){

        int zerocount=0,positive=0,negative=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number (or stop to finish)-> ");
            String input = sc.next();

            if(input.equals("stop")) break;
            int n = Integer.parseInt(input);

            if(n>0) positive++;

            else if(n<0) negative++;

            else zerocount++;

        }while(true);

        System.out.printf("Positive: %d, Negative: %d, Zeros: %d%n", positive, negative, zerocount);
        sc.close();
    }
    public static void main(String[] args){
        count();
    }
}
