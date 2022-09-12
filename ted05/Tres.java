package ted05;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner num_scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        int num = num_scanner.nextInt();
        for(int count=num;count>=0;count--)
            System.out.print(count+" ");
    }
}
