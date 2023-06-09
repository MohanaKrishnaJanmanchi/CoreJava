package June07;

import java.util.Arrays;

public class StringManipulations {
    public String vowelCount(String input){
    String string = input;
    int numOfVowels = string.replaceAll("[^aeiouAEIOU]","").length();
    return input +": "+numOfVowels;
    }
    public String checkAnagram(String s1, String s2){
        char[] sortedChars1 = s1.toCharArray();
        char[] sortedChars2 = s2.toCharArray();
        Arrays.sort(sortedChars1);
        Arrays.sort(sortedChars2);
        if(Arrays.equals(sortedChars1,sortedChars2))
            return s1 +" and "+s2+" are Anagrams";
        return s1 +" and "+s2+" are not Anagrams";
    }

    public void reversingEachWord(String text){
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++){
            String temp = words[i];
            for(int j = temp.length() - 1; j >= 0; j--){
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public boolean checkIfRotated(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
