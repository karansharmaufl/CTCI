

import java.applet.Applet;
//import java.awt.Color;
import java.awt.*;

public class Test extends Applet {

    
    public void init()
    {
        
        setBackground(Color.blue);
        setForeground(Color.black);
        Button b = new Button("Click Me");
        add(b);
        
        
    }
    
    public void start()
    {
        Thread t = new Thread();
        t.start();
        
    }
    
    public void paint(Graphics g)
    {
      g.drawRect(10, 10, 400, 400);
      g.drawOval(25, 25, 100, 100);
      
    }
    
    public void run()
    {
        
        
    }
    
    public void ActionPerformed(ActiveEvent e)
    {
        
    }
    
    public void stop()
    {
        
    }
   
}
