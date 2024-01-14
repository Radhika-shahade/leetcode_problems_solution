package leetcodeproblems.easy;
//1704:s = "book"
public class StringHalves {
    public boolean halvesAreAlike(String s) {
    int length= s.length()/2;
        String stringA = s.substring(0, length);
        String stringB= s.substring(length,s.length());
        System.out.println(stringA);
        System.out.println(stringB);
        int countA= countVowels(stringA);
        int countB= countVowels(stringB);
        return countA==countB;
    }

    private int countVowels(String s) {
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        int count=0;
        for(char element : s.toCharArray()){

            for( char vowels1 :vowels)
            {
                if(vowels1==element)
                {
                  count++;
                  break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringHalves stringHalves= new StringHalves();
        System.out.println(stringHalves.halvesAreAlike("book"));
    }
}
