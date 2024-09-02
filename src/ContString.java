package src;

import java.util.Scanner;

public class ContString {
    public static int countA(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int quantidade = countA(input);
        System.out.println("A letra 'a' ocorre " + quantidade + " vezes na string.");
        scanner.close();
    }
}
