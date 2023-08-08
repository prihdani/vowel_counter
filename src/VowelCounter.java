import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a word/sentence: ");
        String wordOrSentence = scanner.nextLine();

        int vowelCounter = 0;

        for (int i = 0; i < wordOrSentence.length(); i++) {
            if(wordOrSentence.charAt(i) == 'a' || wordOrSentence.charAt(i) == 'e' || wordOrSentence.charAt(i) == 'i' || wordOrSentence.charAt(i) == 'o' || wordOrSentence.charAt(i) == 'u'){
                vowelCounter++;
            }
        }

        if(vowelCounter <= 1){
            System.out.println("There is " + vowelCounter + " vowel in the word/sentence!" );
        }else{
            System.out.println("There are " +vowelCounter + " vowels in the word/sentence!");
        }

    }
}