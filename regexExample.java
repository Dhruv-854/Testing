import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample {
    public static void main(String[] args) {
        ExtractingDataUsingGroups();
    }
    static void dotRegex(){
        String pattern = "abc";
        String text = "abcde";
        if (text.matches(pattern + ".*")) {
            System.out.println("Pattern found");
        }
    }
    static void splitingRegex(){
        String text = "apple.mango.banana.greps";
        String[] fruits = text.split("\\.");
        StringBuilder newFruits = new StringBuilder();
        //method one
        for(String Fruits : fruits){
            newFruits.append(Fruits).append(" ");
        }
        //mehod two
        for(String Fruits : fruits){
            System.out.print(Fruits+" ");
        }
        System.out.println(newFruits);
    }
    static void replacingParts(){
        String text = "I have 2 apples and 3 bananas.";
        //here d means any digit 
        String replaced = text.replaceAll("\\d", "#");
        System.out.println(replaced);
    }
    static void ExtractingDataUsingGroups(){
        String text = "John Doe , age 30";
        // w for one or more word characters (letters , digits , underscores)
        String pattern = "(\\w+) (\\w+) , age (\\d+)";
        Pattern complPattern = Pattern.compile(pattern);
        Matcher matcher = complPattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));

            System.out.println(matcher.group(3));

        }
    }
}
