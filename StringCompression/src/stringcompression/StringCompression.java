
package stringcompression;

public class StringCompression {

    
    public static void main(String[] args) {
        String str="aaaabbbccddaabbee";
        StringBuilder cmp= new StringBuilder();
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            count++;
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1))
            {
                cmp.append(str.charAt(i));
                cmp.append(count);
                count=0;
            }
            
        }
        System.out.println(cmp);
    }
    
}
