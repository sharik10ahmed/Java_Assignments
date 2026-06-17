package Day_10;

public class arr_syntax1 {
    public static void main(String[] args){
        int[] my_marks = new int[3];
        my_marks[0]=90;
        my_marks[1]=99;
        my_marks[2]=98;
        for (int myMark : my_marks) System.out.println(myMark);
    }
}
