public class LogicalProgram8 {
    public static void main(String[] args) {
        String name = "india is     Great";
        
        String removeWhiteSpace = name.replaceAll("\\s+", " ");

        System.out.println("Original : " +name);
        System.out.println("New String : " + removeWhiteSpace);
        System.out.println(removeExtra(name));
    }
    static String removeExtra(String nameString){
        StringBuilder result = new StringBuilder();
        boolean inSpace = false;
        for(int i =0 ; i < nameString.length() ; i++){
            char currentChar = nameString.charAt(i);
            if (currentChar != ' ') {
                result.append(currentChar);
                inSpace = false;
            }else{
                if (!inSpace) {
                    result.append(' ');
                    inSpace = true;
                }
            }
        }
        return result.toString();
    }
}
