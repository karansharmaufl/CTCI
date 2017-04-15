

import java.applet.*;
import java.awt.*;


public class FirstApplet extends Applet {

   String m;
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        m = "Inside init() ";
        }
    
    public void start()
    {
        m += "Inside start() ";
    }
    
    public void stop()
    {
        m += "Inside stop()";
    }
    public void paint(Graphics g)
    {
        g.drawString(m,10,30);
        //g.drawLine(40, 40, 260, 260);
        g.drawRect(100, 100, 200, 150);
        g.fillRect(400, 100, 200, 150);
        g.drawRoundRect(700, 100, 200, 150, 20, 20);
        int x[] ={35,85,100,12,98,25,35};
        int y[] ={63,56,98,68,62,54,35};
        int pts = x.length;
        Polygon p =new Polygon(x,y,pts);
        g.drawPolygon(p);
        g.drawOval(100, 100, 30, 30);
        g.drawArc(400, 400, 100, 100, 90, ABORT);
        
        
        
    }
    
    

  
}
