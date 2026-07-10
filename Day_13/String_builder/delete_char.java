package Day_13.String_builder;

public class delete_char {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        //inser Char
        sb.insert(2,'n');
        System.out.printf("Insert-> %s",sb);
        // delete Char
        sb.delete(2,3);
        System.out.printf("%nDelete-> %s",sb);
    }
}
