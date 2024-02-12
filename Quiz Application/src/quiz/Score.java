package quiz;

import java.awt.*;



import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
Score(String name,int score){
	setBounds(600,150,750,550);
	getContentPane().setBackground(Color.WHITE);
	setLayout(null);
	
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
	Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(0, 200, 300, 250);
		add(image);
		JLabel heading=new JLabel("Thankyou" + name+"for playing Simple Mind");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(heading);
		JLabel Ibscore=new JLabel("Your score is" +score);
		Ibscore.setBounds(355, 200, 300, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(Ibscore);
		JButton submit = new JButton("play again");
		submit.setBounds(400,270,120,30);
		submit.setBackground(new Color(30,144,254)); 
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
	setVisible(false);
	new Login();
}
	public static void main(String[] args) {
		new Score("user",0);
	}
}
