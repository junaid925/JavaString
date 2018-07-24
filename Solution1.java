import java.util.*;

public class Solution1 {
   public static void main(String[] args) {

          String s="junaid";
          System.out.println(isUniqueChars(s));
          System.out.println(isUniqueChars1(s));


   }

   /* Time complexity: O(n^2)
   */


   static boolean isUniqueChars(String s){

       int j=0;

       for(int i=1;i<s.length();i++){
           if(s.charAt(j)==(s.charAt(i)))
               return false;
           j++;
       }
       return true;


   }

/* Time complexity: O(n)
 * Space complexity: O(n)
*/

    public static boolean isUniqueChars1(String str) {

        HashSet<Character> h = new HashSet<Character>();

        for(int i = 0; i < str.length(); i++) {
            if(h.contains(str.charAt(i)))
                return false;

            h.add(str.charAt(i));
        }

        return true;
    }




}
