package Day_13.String_builder;

public class insert_Char{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("app");
        // insert char
        sb.insert(0,'T');
        System.out.print(sb);
    }
}