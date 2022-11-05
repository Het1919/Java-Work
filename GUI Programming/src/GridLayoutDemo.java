import java.awt.*;

class MyFrame9 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	MyFrame9()
	{
		super("GridLayoutDemo");
		
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
	    
		setLayout(new GridLayout(3,2));
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);

		
	}
}
public class GridLayoutDemo {

	public static void main(String[] args) {
		
		MyFrame9 f=new MyFrame9();
		f.setSize(800,800);
		f.setVisible(true);

	}

}
