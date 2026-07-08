package Day_12;
import java.util.*;
public class String_array {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter array size-> ");
            int size = sc.nextInt();
            String[] array = new String[size];
            int totLength = 0;

            System.out.println("Enter Strings to count characters total: ");
            for(int i=0; i<size; i++) {
                array[i] = sc.next();
                totLength += array[i].length();
            }
            System.out.println(totLength);
        }
    }
