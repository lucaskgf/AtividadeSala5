package ted05;

import java.util.Scanner;

public class Dois {

        public static void main(String[] args) {
            Scanner num_scanner = new Scanner(System.in);
            System.out.print("Digite um número:");
            int num = num_scanner.nextInt();
            for(int count=0;count<num+1;count++)
                System.out.print(count+" ");
        }
}
