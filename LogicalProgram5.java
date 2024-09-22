

public class LogicalProgram5 {
    public static void main(String[] args) {
        String mainString = "I Love Coding";
      
        System.out.println("For Love "+check("Love", mainString));
        System.out.println("For Progma "+check("progma", mainString));
   }
    static String check(String case1, String mainString){
        if (mainString.contains(case1)) {
            return "This Is contain";
        }else{
            return "Not contain";
        }
    }
    static String check2(String case2 , String mainString){
        if (mainString.contains(case2)) {
            return "Contain";
        }else{
            return "not contain";
        }
    }
}
