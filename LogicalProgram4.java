import java.util.ArrayList;
import java.util.Arrays;

public class LogicalProgram4 {
    public static void main(String[] args) {
        int num = 123;
        int rem=0;
        int[] numers = new int[3];
        for(int i =0 ; i < 3 ; i++) {
            rem = num %10;
            numers[i] = rem;
            num = num/10;
        }
        System.out.println();
        
    }
}
