
package stringrotation;

public class StringRotation {

    public static void main(String[] args) {
        String s1="waterbottle";
        String s2="bottlewaght";
        String s3="";
        int len=s1.length();
        if(len==s2.length() && len>0)
            s3=s1+s1;
        
        boolean ret=s3.contains(s2);
        System.out.println(ret);
    }
    
}
