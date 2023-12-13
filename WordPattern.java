package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s){
        String[] input = s.split(" ");

        if (input.length != pattern.length()) return false;

        HashMap<Character, String> out = new HashMap<>();

        for (int i=0; i<input.length; i++){
            if (out.containsKey(pattern.charAt(i))){
                if (out.get(pattern.charAt(i)).equals(input[i])){
                    continue;
                }else {
                    return false;
                }
            }else {
                if (out.containsValue(input[i])){
                    return false;
                }
                out.put(pattern.charAt(i), input[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }
}
