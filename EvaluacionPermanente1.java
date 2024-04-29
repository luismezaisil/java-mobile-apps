import java.util.Scanner;


public class EvaluacionPermanente1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(digitsum(number));
        scanner.close();
    }

    public static int digitsum(int number){
        int digitsum = 0;
        while(number>0){
            digitsum = digitsum + (number%10);
            number = number/10;
        }
        return digitsum;
    }
}
