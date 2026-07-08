package Day_12;

public class equality {
    public static void main(String[] args){
//        String name1 = "Sharik";
//        String name2 = "Sharik";
//
//        if(name1==name2){
//            System.out.println("They are the same String");
//        }
//        else{
//            System.out.println("They are the different String");
//        }
        //Gives incorrect answer here
        if(new String("Sharik") == new String("Sharik")) {
            System.out.println("They are the same string");
        }
        else {
            System.out.println("They are different strings");
        }

    }
}

