
package bean;

import javax.ejb.Local;

/**
 *
 * @author Karan_S
 */
@Local
public interface CalculatorBeanLocal {
    
       public int beanAdd(int a , int b);
       public int beanSub(int a , int b);   
}
