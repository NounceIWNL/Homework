package Tasks31_01_2024.Strings;

public class TaskWithStrings_02 {
    public static void main(String[] args) {
        String sentence = "Все его символы, стоящие на четных местах, заменить буквой ы";
        char[] sentenceArr = new char[sentence.length()];
        sentence.getChars(0, sentence.length(), sentenceArr, 0);

        for (int i = 0; i < sentenceArr.length; i++) {
            if(i %2 != 0) sentenceArr[i] = 'ы';
        }
        System.out.println(sentenceArr);
    }
}
