package ram.io.anagram;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "BCDA";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        System.out.println("CharArray1: " + Arrays.toString(chars1));
        System.out.println("CharArray2: " + Arrays.toString(chars2));

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println("CharArray1: " + Arrays.toString(chars1));
        System.out.println("CharArray2: " + Arrays.toString(chars2));

        boolean isEquals = Arrays.equals(chars1, chars2);
        System.out.println("Anagram are " + isEquals);
    }
}
