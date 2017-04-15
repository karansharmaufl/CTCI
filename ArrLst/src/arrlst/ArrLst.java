
package arrlst;

import java.util.ArrayList;


public class ArrLst {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alphabets={"a","b","c","d"};
        ArrayList<String> al=new ArrayList<String>();
        for(String x:alphabets)
            al.add(x);
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));
            
        
        
    }
    
}
