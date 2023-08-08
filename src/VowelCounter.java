import javax.swing.*;

public class VowelCounter {


    public static void main(String[] args) {

        int countVowels;

        String wordOrSentence = JOptionPane.showInputDialog(null,"Write a text or a word");

        countVowels= vowelCounter(wordOrSentence);

        if(countVowels == 0){
            JOptionPane.showMessageDialog(null, "There are no vowels in the word/sentence!");
        } else if (countVowels == 1) {
            JOptionPane.showMessageDialog(null,"There is 1 vowel in the word/sentence!");
        } else {
            JOptionPane.showMessageDialog(null,"There are " + countVowels + " vowels in the word/sentence!");
        }

    }

    static int vowelCounter(String something){
        int counter = 0;
        something = something.toLowerCase();

        for (int i = 0; i < something.length(); i++) {

            char toName = something.charAt(i);

            if(toName == 'a' || toName == 'e' || toName == 'i' || toName == 'o' || toName == 'u'){
                counter++;
            }
        }
        return counter;
    }
}