/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 *
 * @author Karan_S
 */
public class Test extends Applet implements ActionListener {
    TextField text1;
    Button b1,b2;
    MenuFrame m;

    
    public void init() {
        // TODO start asynchronous download of heavy resources
        text1 = new TextField(10);
	add(text1);
        b1=new Button("Show");
        add(b1);
        b2=new Button("Hide");
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        m = new MenuFrame("Window");
	m.setSize(100, 100);


    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            m.setVisible(true);
        }
        
        if(e.getSource()==b2)
        {
            m.setVisible(true);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     class MenuFrame extends Frame {

        

                Menu menu1 ;
		MenuBar menubar1 ;
		MenuItem menuitem1, menuitem2, menuitem3 ;		
		TextField text2 ;
                MenuFrame(String title)
{
	super(title);
	text2 = new TextField("");
	add(text2);
	menubar1 = new MenuBar();
	menu1 = new Menu("Window");
	menuitem1 = new MenuItem("File");
	menu1.add(menuitem1);
	menuitem1.addActionListener((ActionListener) menuitem1);	

	menuitem2 = new MenuItem("Edit");
	menu1.add(menuitem1);
	//menuitem2.addActionListener((ActionListener) this);	

	
        
    }

     }   
}