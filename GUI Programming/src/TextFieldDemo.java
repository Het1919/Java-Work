import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame
{
	Label l1,l2;
	TextField tf;
	
	public MyFrame4()
	{
		super("TextField Demo");
		
		l1=new Label("No text is Entered yet");
		l2=new Label("Enter key is not hit yet");
		tf=new TextField(20);
		tf.setEchoChar('*');
		
		Handler h=new Handler();
		
		tf.addTextListener(h);
		tf.addActionListener(h);
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(l2);
		add(tf);	
	}
    
	class Handler implements TextListener,ActionListener
	{
		public void textValueChanged(TextEvent e) {
			
			l1.setText(tf.getText());
		}

		public void actionPerformed(ActionEvent e) {
			
			l2.setText(tf.getText());
			
		}
	}
	

}
public class TextFieldDemo {

	public static void main(String[] args) {
		MyFrame4 f=new MyFrame4();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
