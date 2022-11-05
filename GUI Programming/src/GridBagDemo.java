import java.awt.*;

class MyFrame10 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	
	MyFrame10()
	{
		super("GridBagLayoutDemo");
		
		GridBagLayout gb=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		
		setLayout(gb);
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
	    
		gbc.gridx=1;
		gbc.gridy=1;
		add(b1,gbc);
		
		gbc.gridx=3;
		gbc.gridy=1;
		add(b2,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		add(b3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		add(b4,gbc);
		
		gbc.gridx=3;
		gbc.gridy=3;
		add(b5,gbc);
//		add(b6);

		
	}
}
public class GridBagDemo {

	public static void main(String[] args) {
		
		MyFrame10 f=new MyFrame10();
		f.setSize(800,800);
		f.setVisible(true);

	}
}
