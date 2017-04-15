
package isunique;

public class IsUnique {

    public static void main(String[] args) {
        String str="abcdefghi";
        boolean[] char_set=new boolean[128];
        char val;
        
       for(int i=0;i<str.length();i++)
       {
            val=str.charAt(i);
       
       if(char_set[val])
           System.out.println("Repeated Characters");
       char_set[val]=true;
       }
       
       System.out.println("ok");
       
       
       
        
    }
    
}
