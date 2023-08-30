import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton rules,exit;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image =new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		
		JLabel heading=new JLabel("Simple Minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(Color.blue);
		
		add(heading);
		
		JLabel name=new JLabel("Your Name is");
		name.setBounds(810,150,300,25);
		name.setFont(new Font("Roboto",Font.BOLD,20));
		name.setForeground(Color.blue);
		add(name);
		
		tfname=new JTextField();
		tfname.setFont(new Font("Times New Roman",Font.ITALIC,18));
		tfname.setBounds(735, 200, 300, 25);
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(735, 270, 120, 25);
		rules.setBackground(Color.blue);
		rules.setForeground(Color.white);
		rules.addActionListener(this);
		add(rules);
		
	    exit=new JButton("Exit");
		exit.setBounds(915, 270, 120, 25);
		exit.setBackground(Color.blue);
		exit.setForeground(Color.white);
		exit.addActionListener(this);
		add(exit);
		
		
		setSize(1200,500);
		setLocation(200,100);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
			
		}else if(ae.getSource()==exit) {
			setVisible(false);
			
		}
		
	}
	
	

	public static void main(String []args) {
		new Login();
	}
}
