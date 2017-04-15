
package permutation;

import java.util.Arrays;

public class Permutation {

   
    public static void main(String[] args) {
        String str1="dog is p";
        String str2="god ps i";
         if (str1.length() != str2.length())
             System.out.println("Not a permutation");
      

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

         Arrays.sort(a);
         Arrays.sort(b);

         if(Arrays.equals(a, b))
             System.out.println("Yes");
         else
             System.out.println("No");
        
        
        
        
       
    }
    
}
