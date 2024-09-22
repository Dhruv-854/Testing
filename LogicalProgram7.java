public class LogicalProgram7 {
    public static void main(String[] args) {
        patternProgram(2 , 4);
        patternProgram(3 , 4);
    }
    static void patternProgram(int n , int layer){
        int formula = n;
        for(int i = 1 ; i <=layer ; i++){
            for(int j = 0 ; j < i ; j++){
                formula = formula * 2;
                System.out.print(formula +" ");
            }
            System.out.println();
        }
    }
}
