
package whitespace;

import java.util.Arrays;


public class WhiteSpace {

    
    public static void main(String[] args) {
        String str1="Mr John Smith    ";
        int trueLength=13;
        int count=0;
        int index;
        int i;
        char[] str=str1.toCharArray();
        for(i=0;i<trueLength;i++)
        {
            if(str[i]==' ')
            count++;
        }
        
        index=trueLength+count*2;
        for(i=trueLength-1;i>=0;i--)
        {
            if(str[i]==' ')
            {
                str[index-1]='0';
                str[index-2]='2';
                str[index-3]='%';
                index=index-3;
            }
            
            else
            {
                str[index-1]=str[i];
                index--;
            }
              
        }
            
     System.out.println(Arrays.toString(str));   
    }
    
}
