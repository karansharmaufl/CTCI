
package question;

public class Question {

   
    public static void main(String[] args) {
        StackWithMin s=new StackWithMin();
        s.push(28);
        s.push(50);
        s.push(10);
        s.push(35);
        s.pop();
        s.min();
        s.push(30);
        s.push(100);
        s.push(56);
        s.pop();
        s.min();
        
    }
    
}
