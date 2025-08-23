package assignment_3;
import java.util.Scanner;

public class Split_sentence_into_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.println(word);
                word = "";
            }
        }

        if (!word.equals("")) {
            System.out.println(word);
        }

	}

}
