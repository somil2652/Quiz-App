
import java.awt.event.*;
import java.awt.*;


import javax.swing.*;

public class Score extends JFrame implements ActionListener {
	
	Score(String name,int score){
		
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0, 200, 300, 200);
		add(image);
		
		JLabel heading=new JLabel("Thankyou "+ name +" For Playing Simple Minds");
		heading.setBounds(80,30,950,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
		heading.setForeground(Color.blue);
		add(heading);
		
		JLabel yrscore=new JLabel("Your Score Is : " +score);
		yrscore.setBounds(300,150,350,30);
		yrscore.setFont(new Font("Viner Hand ITC",Font.PLAIN,40));
		yrscore.setForeground(Color.gray);
		add(yrscore);
		
		JButton submit=new JButton("Play Again");
			submit.setBounds(400, 270, 150, 40);
			submit.setFont(new Font("roboto",Font.PLAIN,20));
			submit.setBackground(Color.blue);
			submit.setForeground(Color.white);
			
			submit.addActionListener(this);
			add(submit);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}

	

	public static void main(String[] args) {
		new Score("User",0);

	}

}
