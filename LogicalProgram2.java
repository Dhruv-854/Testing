public class LogicalProgram2{
    public static void main(String[] args) {
        question2(5);
    }

    //pattern2
    static void question2(int n){
        int formula = n;
        for(int i = 1 ; i < n ; i++){
            int space = 2 * (n-i);
            for(int j = 1 ; j <=i ; j++){
                System.out.print(formula);
            }
            for(int j = 1 ; j <=space ; j++){

                System.out.print(" ");
            }
            for(int j = 1 ; j <=i ; j++){
                System.out.print(formula);
            }
            
            formula = formula -1;
            System.out.println();
        }
        for(int i = n ; i >=1 ; i--){
            int space = 2 * (n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(formula);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(formula);
            }
            formula = formula + 1;
            System.out.println();
        }

    }

}