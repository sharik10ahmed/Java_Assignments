void main() {
    String name = "Sharik Ahmed";
    int age = 20;
    double height = 5.9;
    boolean studentStatus = true;

    System.out.printf("""
        Name-> %s 
        Age-> %d 
        Height-> %.2f 
        Student Status-> %b 
        """, name, age, height, studentStatus);
}