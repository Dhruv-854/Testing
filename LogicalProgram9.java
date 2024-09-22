public class LogicalProgram9 {
    public static void main(String[] args) {
        String name = "We love coding";
        String[] words = name.split(" ");

        StringBuilder result = new StringBuilder();
        for(String word : words){
            String reveString = new StringBuilder(word).reverse().toString();
            result.append(reveString).append(" ");
        }
        System.out.println(result);
        example();
    }

    static void example(){
        String name = "Dhruv Radadiya";

        String name2 = "My name is dhruv. what is your?";
        String[] newWord2 = name2.split("\\.");


        String[] newWord = name.split(" ");
        StringBuilder newName2 = new StringBuilder(); 
        StringBuilder newName = new StringBuilder();
        for(String word : newWord2){
            newName2.append(word).append(" ");
        }
        System.out.println(newName2);
        for(String word : newWord){
            String reversedWord = "";
            for(int i = word.length()-1 ; i>=0 ; i--){
                reversedWord += word.charAt(i);
            }
            newName.append(reversedWord).append(" ");
        }
        System.out.println(newName);
    }
}
