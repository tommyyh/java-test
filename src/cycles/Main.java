package cycles;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo: ");

        int input = sc.nextInt();

        boolean prime = true;

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                prime = false;

                break;
            }

            System.out.println("Je prvocislo? " + prime);
        }
    }
}