import java.awt.*;

class MyFrame7 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	MyFrame7()
	{
		super("FlowLayoutDemo");
		
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		
		FlowLayout fl=new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		setLayout(fl);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}

public class FlowLayoutDemo {

	public static void main(String[] args) {
		
		MyFrame7 f=new MyFrame7();
		f.setSize(1000,1000);
		f.setVisible(true);
		
	}

}
