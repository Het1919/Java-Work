import java.awt.*;
import java.awt.event.*;

class MyFrame19 extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	Canvas c=new Canvas();
	
	public MyFrame19()
	{
		super("Practice");
		c1=new Checkbox("Red");
		c2=new Checkbox("Green");
		c3=new Checkbox("Blue");
		
		
		c.setSize(50,50);
		c.setBackground(Color.black);
		
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(c);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}


	public void itemStateChanged(ItemEvent e) {
		if(c1.getState() && c2.getState())
		{
			c.setBackground(Color.yellow);
		}
		if(!c1.getState() && !c2.getState() && !c3.getState())
		{
			c.setBackground(Color.black);
		}
	}
	
	
}

public class Practice {

	public static void main(String[] args) {
		
		MyFrame19 f=new MyFrame19();
		f.setSize(400,400);
		f.setVisible(true);

	}

}