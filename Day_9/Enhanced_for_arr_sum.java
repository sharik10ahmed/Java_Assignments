package Day_9;

public class Enhanced_for_arr_sum {
    public static void main(String[] args){
        int[] arr = {72,75,70,68,74,76,71};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("Sum-> "+sum);
    }
}
