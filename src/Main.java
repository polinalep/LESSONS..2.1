import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String ST = "";
        for ( int i = 0; i < 10; i++) {
            System.out.println("User:");
            ST = S.nextLine();
            System.out.printf("Hello, %S!\n", ST);
        }
    }
}