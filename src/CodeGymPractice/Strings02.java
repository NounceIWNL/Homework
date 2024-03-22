package CodeGymPractice;
/*
Write a program that reads a string from the keyboard.

The program should display three lines:

The first line must contain only the vowels from the entered string.
The second must contain only the consonants from the entered string.
The third line must contain only the punctuation marks from the entered string.
The letters should be separated by a space.

Example input:

"Sam I Am."
Example output:

a I A
S m m
" . "
Requirements:
•	The program must read data from the keyboard.
•	The program should display three lines.
•	The first line must contain only the vowels from the input string, separated by a space.
•	The second line must contain only the consonants from the input string, separated by a space.
•	The third line must contain only the punctuation marks from the input string, separated by a space.
 */

public class Strings02 {
    public static char[] vowels = "aeiou".toCharArray();
    public static char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();

    public static void main(String[] args) throws Exception {
        //write your code here

    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

    // The method checks whether a letter is a consonant
    public static boolean isConsonant(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : consonants) {  // Look for consonants in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}