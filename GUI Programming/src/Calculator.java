import java.awt.*;
import java.awt.event.*;

class MyFrame21 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;
	
	public MyFrame21()
	{
		super("GUI Calculator");
		
		l1=new Label("Num 1");
		l2=new Label("Num 2");
		l3=new Label("Result");
		tf1=new TextField(4);
		tf2=new TextField(4);
		tf3=new TextField(4);
		b1=new Button("Add");
		b2=new Button("Sub");
		b3=new Button("Mul");
		b4=new Button("Div");
		
		Panel p1=new Panel();
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		
		Panel p2=new Panel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		add("North",p1);
		add("South",p2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		int no1,no2;
		no1=Integer.parseInt(tf1.getText().trim());
		no2=Integer.parseInt(tf2.getText().trim());
        if(str.equals("Add"))
        {
        	int result=no1+no2;
        	tf3.setText(" "+result);
        }
        else if(str.equals("Sub"))
        {
        	int result=no1-no2;
        	tf3.setText(" "+result);
        }
        if(str.equals("Mul"))
        {
        	int result=no1*no2;
        	tf3.setText(" "+result);
        }
        if(str.equals("Div"))
        {
        	int result=no1/no2;
        	tf3.setText(" "+result);
        }
	}
}
public class Calculator {

	public static void main(String[] args) {
		
		MyFrame21 f=new MyFrame21();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
