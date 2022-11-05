import java.awt.*;
import java.awt.event.*;

class MyFrame6 extends Frame implements ItemListener,ActionListener
{
	List l;
	Choice c;
	TextArea ta;
	
	MyFrame6()
	{
		super("ListBox Demo");
		
		l=new List(4,true);
		c=new Choice();
		ta=new TextArea(20,30);
		
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		
		c.add("January");
		c.add("February");
		c.add("March");
		c.add("April");
		c.add("May");
		c.add("June");
		c.add("July");
		c.add("August");
		c.add("September");
		
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		
		l.addItemListener(this);
		c.addItemListener(this);
//		l.addActionListener(this);
		
	}

	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource()==l)
		{
			ta.setText(l.getSelectedItem());
		}
		else
		{
			ta.setText(c.getSelectedItem());
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String[] list=l.getSelectedItems();
		String txt="";
		
		for(String x:list)
		{
			txt+=x+"\n";
		}
		ta.setText(txt);
	}
}
public class ListBoxDemo {

	public static void main(String[] args) {
		
		MyFrame6 f=new MyFrame6();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
