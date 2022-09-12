package ted05;

public class Um {
    public static void main(String[] args) {
        int sum = 0;
        for(int count=1;count<100;count++ )
            if (count%2==1){
                sum+=count;
            }
        System.out.printf("A soma dos inteiros ímpares de 1 a 99 é: %d",sum);
    }
}
