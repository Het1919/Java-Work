import java.awt.*;
import java.awt.event.*;

class MyFrame20 extends Frame implements ActionListener
{
	Label l1,l2;
	Button b1,b2,b3;
	int count1=0;
	int count2=0;
	
	public MyFrame20()
	{
		super("Practice");
		
		l1=new Label(" "+count1);
		l2=new Label(" "+count2);
		b1=new Button("Red Score!");
		b2=new Button("Blue Score!");
		b3=new Button("Reset Score");
		
		setLayout(new GridLayout(4,1));
		Panel p1=new Panel();
		p1.add(new Label("Red Team"));
		p1.add(new Label("Blue Team"));
		
		Panel p2=new Panel();
		p2.add(l1);
		p2.add(l2);
		
		Panel p3=new Panel();
		p3.add(b1);
		p3.add(b2);
		
		Panel p4=new Panel();
		p4.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			count1++;
			l1.setText(" "+count1);
		}
		if(e.getSource()==b2)
		{
			count2++;
			l2.setText(" "+count2);
		}
		if(e.getSource()==b3)
		{
			count1=0;
			count2=0;
			l1.setText(" "+count1);
			l2.setText(" "+count2);
		}
	}
}
public class Practice2 {

	public static void main(String[] args) {
		
		MyFrame20 f=new MyFrame20();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
