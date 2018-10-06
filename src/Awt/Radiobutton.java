package Awt;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Radiobutton {

	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(300,400);
		f.setBackground(Color.cyan);
		f.setLayout(new FlowLayout());
		
		Label l1=new Label("Qualification");
		Label l2=new Label("Gender");
		Checkbox cb1=new Checkbox("10th",true);
		Checkbox cb2=new Checkbox("inter");
		Checkbox cb3=new Checkbox("Bsc");
		Checkbox cb4=new Checkbox("MBA");
		
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox c1=new Checkbox("male",cg,true);
		Checkbox c2=new Checkbox("Female",cg,false);
		
		f.add(l1);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.add(l2);
		f.add(c1);
		f.add(c2);

	}



}
