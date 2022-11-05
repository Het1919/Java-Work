import java.awt.*;

class MyFrame30 extends Frame
{
	Label l1,l2;
	TextField tf1,tf2;
	Button b;
	
	public MyFrame30()
	{
		super("LoginForm");
		
		l1=new Label("User Name: ");
		l2=new Label("Surname: ");
		tf1=new TextField();
		tf2=new TextField();
		b=new Button("Submit");
		
		setLayout(new GridLayout(3,2));
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(b);
	}
}
public class LoginForm {

	public static void main(String[] args) {
		
		MyFrame30 f=new MyFrame30();
		f.setSize(300,300);
		f.setVisible(true);

	}

}
