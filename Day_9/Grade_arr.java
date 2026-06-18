package Day_9;

public class Grade_arr {
    public static void main(String[] args){
        int[] scores = {85,78,92,60,88};
        //Modification
        for(int i=0;i<scores.length;i++){
            scores[i]+=5;
        }
        //Output
        System.out.print("Updated Marks-> ");
        for(int i:scores){
            System.out.print(i+" ");
        }

    }
}
