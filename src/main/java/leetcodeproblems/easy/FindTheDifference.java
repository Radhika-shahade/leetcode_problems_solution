package leetcodeproblems.easy;
//389

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

//Input: s = "abcd", t = "abcde"
//        Output: "e"
public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        for(int i=0;i<s.length();i++)
        {
           if(sChar[i]!=tChar[i])
           {
               return tChar[i];
           }
        }
    return sChar[0];
//            tChar[tChar.length-1];
    }
    public static void main(String[] args) {
String s= "abcd";
String t ="abcd";
        char theDifference = findTheDifference(s, t);
        System.out.println(theDifference);
    }
}
