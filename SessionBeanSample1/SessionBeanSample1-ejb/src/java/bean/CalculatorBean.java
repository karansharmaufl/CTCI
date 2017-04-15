
package bean;

import javax.ejb.Stateless;


@Stateless
public class CalculatorBean implements CalculatorBeanLocal {

   public int beanAdd(int a , int b)
   {
       return (a+b);
   }
   
    public int beanSub(int a , int b)
   {
       return (a-b);
   }
}
