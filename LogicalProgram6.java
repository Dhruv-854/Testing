import java.util.Scanner;

public class LogicalProgram6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        
        int num = sc.nextInt();
        int sum = sumDigit(num);
        int firstDigit = getFirstDigit(num);
        int Multiply = sum * firstDigit;
        System.out.println("The Sum is : " + sum);
        System.out.println("The Multiply is : " +Multiply);

    }
    static int sumDigit(int num){
        int sum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num %10;
            sum = sum +rem;
            num = num /10;
        }
        return sum;
    }
    static int getFirstDigit(int num){
        while (num >=20) {
            num /=10;
        }
        return num;
    }
}
