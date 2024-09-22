public class LogicalProgram10 {
    public static void main(String[] args) {
        char startChar = 'e';
        int n = startChar - 'a' +1;
        
        for (int i = 1 ; i <=n ; i++ ){
            char currentChar = (char)(startChar - i +1);
            int space = 2 * (n-i);
            for(int j = 1 ; j <=i ;j++){
                System.out.print(currentChar);
            }
            for(int j = 1 ; j <=space ; j++){
                System.out.print(" ");
            }
            for(int j = i ; j >=1 ; j--){
                System.out.print(currentChar);
            }
            System.out.println();
        } 
    }
}
