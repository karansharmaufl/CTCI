
package stringtest1;
import java.util.*;


public class Stringtest1 {
    StringBuilder t=new StringBuilder();

    
      public boolean palindrome(String s)
    {
        boolean a=true;
        for(int i=s.length()-1;i>=0;i--)
        {
            t.append(s.charAt(i));
        }
        
        String p;
        p=t.toString();
        if(p.equals(s))
        a=true;
        else 
        a=false;
        System.out.println(p);
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
    Stringtest1 s=new Stringtest1();
    s.palindrome("abba");
    String str="abcd";
    if(str.charAt(0)==str.charAt(1))
    {
        System.out.println("yes");
    }
    else
        System.out.println("no");
    }  
    
}
