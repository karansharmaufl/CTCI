
package oneaway;


public class OneAway {

    public static void main(String[] args) {
        OneAway o=new OneAway();
        o.oneEditAway("main", "nain");
       
    }
    
    public boolean oneEditAway(String str1 , String str2)
    {
        if(str1.length()==str2.length())
            return oneReplace(str1,str2);
       /* else if(str1.length()+1==str2.length())
            return oneInsert(str1,str2);
        else if(str1.length()-1==str2.length())
            return oneInsert(str2,str1);*/
        
        return false;
    }
    
    public boolean oneReplace(String s1 , String s2)
    {
        boolean fd=false;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(fd)
                {
                    System.out.println("False");
                    return false;
                }
                fd=true;
            }
        }
            System.out.println("True");
            return true;
    }
    
    
}
