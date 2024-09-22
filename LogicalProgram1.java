import java.util.*;

public class LogicalProgram1 {
    public static void main(String[] args) {
        int num = 11;
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i < n ; i++){
            al.add(sc.nextInt());
        }
    }
    static boolean isPrime(int val){
        for(int i = 2 ; i * i <=val ; i++){
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void solution(ArrayList<Integer> al){
        for(int i = al.size()-1 ; i >= 0 ; i--){
            int val = al.get(i);
            if (isPrime(val) == true) {
                al.remove(i);
            }
        }
    }

}
