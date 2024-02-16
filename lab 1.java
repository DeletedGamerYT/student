//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static int Main_algarithm(int a, int b, int c){
        for (int x = 1; x < c;x++){
            if (((c-a*x)%b) == 0 ){
                int y = (c - a * x) / b;
                if (y > 0) {
                    System.out.print("x = "+ x + "y = "+ y + "\n");
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("090304-РПИа-о23 Коваленко Н.М.");
        while (true) {
            System.out.println("Enter a, b and c (for ex. 12 3 5)\n>>>");
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            if ((a > 0) || (b > 0) || (c > 0)) {
                if (Main_algarithm(a, b, c) == 0) System.out.println("incorrect");
            }
        }
    }
}