
import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {

        Scanner num_scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = num_scanner.nextInt();

        Scanner num_scanner2 = new Scanner(System.in);
        System.out.print("Digite outro número: ");
        int num2 = num_scanner2.nextInt();

        int mult = num*num2;
        int num_count= 0;
        for (int count=1;count<num2;count++)
            if (count!=num2){
                System.out.print(num+"+");
        }

        System.out.println(num+"="+mult);
    }
}

