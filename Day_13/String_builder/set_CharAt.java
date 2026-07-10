package Day_13.String_builder;

public class set_CharAt{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Pony");
        // Set Char
        sb.setCharAt(0, 'S');
        System.out.print(sb);
    }
}