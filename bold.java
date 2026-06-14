public class bold {
    public static void main(String[] args) {
        // ANSI escape codes
        String bold = "\u001B[1m";
        String reset = "\u001B[0m";

        System.out.println(bold + "This text will be BOLD!" + reset);
        System.out.println("This text is normal.");
    }
}
