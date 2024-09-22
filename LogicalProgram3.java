import java.net.Socket;

/**
 * LogicalProgram3
 */
public class LogicalProgram3 {

    public static void main(String[] args) {
        method2();
    }
    static void method1(){
        String word = "defination";
        String vowels = "aeiouAEIOU";
        StringBuilder replaceWithAsterisk = new StringBuilder();
        StringBuilder removeVowels = new StringBuilder();
        int vowelCount = 0;
        for(char ch : word.toCharArray()){
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
                replaceWithAsterisk.append("*");
            }else{
                replaceWithAsterisk.append(ch);
                removeVowels.append(ch);
            }
        }

        System.out.println(word);
        System.out.println(removeVowels);
        System.out.println(replaceWithAsterisk);
        System.out.println(vowelCount);
    }
    static void method2(){
        String name = "defination";
        String replaceString = name.replaceAll("[aeiou]", "*");
        String removeVowels = name.replaceAll("[aeiou]", "");
        System.out.println(removeVowels);
        System.out.println(replaceString);
    }
    
}