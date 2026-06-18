package Day_9;

public class even_index {
    public static void main(String[] args){
        int[] IDs = {101,102,103,104,105,106};
        for(int i=1;i<IDs.length;i++){
            if(i%2==0){
                System.out.print(IDs[i]+" ");
            }
        }
    }
}
