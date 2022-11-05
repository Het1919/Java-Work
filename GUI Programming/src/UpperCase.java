import java.awt.*;
import java.awt.event.*;

class MyFrame22 extends Frame implements TextListener
{
	TextField tf1,tf2;
	
	public MyFrame22()
	{
		super("Lower To Upper");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		
		setLayout(new FlowLayout());
		add(tf1);
		add(tf2);
		
		tf1.addTextListener(this);
	}
	
	public void textValueChanged(TextEvent e)
	{
		String str=tf1.getText();
		tf2.setText(str.toUpperCase());
	}
}
public class UpperCase {

	public static void main(String[] args) {
		
		MyFrame22 f=new MyFrame22();
		f.setSize(300,300);
		f.setVisible(true);
	}

}
