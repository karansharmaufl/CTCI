
package palindromepermutation;


public class PalindromePermutation {

    public static void main(String[] args) {
      // String str="tact coa";
       int[] table=new int[26];
       PalindromePermutation p =new PalindromePermutation();
     //  p.getCharNumber(c);
       p.charFrequency("tact co");
       //p.checkMaxOneOdd(int table[]);
       p.finalCheck("tact co");
       
       
    }
    public int getCharNumber(char c)
       {
       int a=Character.getNumericValue('a');
       int z=Character.getNumericValue('z');
       int val=Character.getNumericValue(c);
       
       if(a<=val && val<=z)
           val=val-a;
       
       else
           val=-1;
       
        return val;
       }
    
    public int[] charFrequency(String str)
    {
        int[] table=new int[26];
        for(char c:str.toCharArray())
        {
            int x=getCharNumber(c);
            if(x!=-1)
                table[x]++;
        }
        return table;
        }
    
    public boolean checkMaxOneOdd(int[] table)
    {
        boolean foundOdd=false;
        for(int count:table)
        {
            if(count%2==1)
            {
                if(foundOdd)
                {
                    System.out.println("No");
                    return false;
                }
                foundOdd=true;
            }
        }
        System.out.println("Yes");
    return true;
    }
    
    public boolean finalCheck(String str)
    {
        int[] table=charFrequency(str);
        return checkMaxOneOdd(table);
    }
       
       
    
}
