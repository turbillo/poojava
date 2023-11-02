import java.util.ArrayList;

public class alexample {
    public static void main(String[] args) {
        ArrayList<String> sentence = new ArrayList<String>();
        sentence.add("Hello");
        sentence.add(" ");
        sentence.add("World");
        sentence.add("!");
        for (String word : sentence) {
            System.out.print(word);
        }
        System.out.println();
        sentence.add(" ");
        sentence.add("I");
        sentence.add(" ");
        sentence.add("am");
        sentence.add(" ");
        sentence.add("your");
        sentence.add(" ");
        sentence.add("teacher");

        for (String word : sentence) {
            System.out.print(word);
        }
        System.out.println();

        String oneWord = sentence.get(0);
        sentence.remove(oneWord);

        for (String word : sentence) {
            System.out.print(word);
        }
        System.out.println();

        sentence.remove(1);

        for (String word : sentence) {
            System.out.print(word);
        }
        System.out.println();

        sentence.add(0, "Hello");
        sentence.add(2, "World");

        for (String word : sentence) {
            System.out.print(word);
        }
        System.out.println();
    }
}
