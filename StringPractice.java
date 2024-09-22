public class StringPractice {
    public static void main(String[] args) {
        example();
    }

    static void example() {
        String name = "Dhruv Radadiya";
        StringBuilder newName = new StringBuilder();
        String[] spliteStrings = name.split(" ");
        for (String word : spliteStrings) {
            String reversedString = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedString += word.charAt(i);
            }
            newName.append(reversedString).append(" ");
        }
        System.out.println(newName);
    }

}
