package Billingtool;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class login extends Applet implements ActionListener {
	
public static void main(String[] args) {
		
		
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	String s="";

	public void init() {
	
	setFont(new Font("Arial", Font.PLAIN,25));
	setForeground(Color.BLUE);
	
	l1=new Label("UserName");
	l1=new Label("Password");
	
	t1=new TextField(12);
	t2=new TextField(12);
	t2.setEchoChar('*');
	
    b1=new Button("Submit");
    b1=new Button("Cancel");
    
    add(l1);
    add(l2);
    add(t1);
    add(t2);
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
   }
@Override
public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	if(ae.getSource()==b1) {
		String s1=t1.getText();
		String s2=t2.getText();
		
		if(s1.equalsIgnoreCase("Srivalli") && (s2.equalsIgnoreCase("vishnu"))) {
			
			s="Login Successfully";
		}
		else
			s="Invali Username && Password";
	    }
	else {
		
		t1.setText("");
		t2.setText("");
	}
	repaint();
	}

public void paint(Graphics g) {
	
	g.setFont(new Font("Red",Font.BOLD,35));
	g.setColor(Color.BLUE);
	g.drawString(s, 200, 200);
}

}

