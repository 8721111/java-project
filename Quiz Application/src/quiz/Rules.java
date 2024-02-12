package quiz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Rules extends JFrame implements ActionListener {
String name;
JButton start,back;
	Rules(String name){
	this.name=name;
		getContentPane().setBackground(Color.WHITE);
	setLayout(null);
	JLabel heading=new JLabel("	Welcome"+ name+"to simple Minds");
	heading.setBounds(50,20,700,30);
	heading.setFont(new Font("Mingolian Baiti",Font.BOLD,28));
	heading.setForeground(Color.BLUE);
	add(heading);
	JLabel rules=new JLabel();
	rules.setBounds(20,90,700,350);
	rules.setFont(new Font("Mingolian Baiti",Font.BOLD,18));
	rules.setForeground(Color.BLUE);
	rules.setText(
			"<html>"+
	"1. Pick a trivia master. The trivia master is responsible for reading the questions and keeping the score. ...\r\n"+"<br><br>"+
	 "2. Divide the players into two or more teams. If you’re playing in person, assign each player to a team. ...\r\n"+"<br><br>"+
	 "3. Decide on a time limit and how long each round will be. ...\r\n"+"<br><br>"+
	"4. Variety of questions. ...\r\n"+"<br><br>"+
	 
	 "5. Scorekeeping and rewards. ..."+"<br><br>"+
	"<html>"
	);
	add(rules);
	
	 back = new JButton("Start");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254)); 
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		 start = new JButton("Back");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(30,144,254)); 
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
	setSize(850,650);
	setLocation(350,150);
	setVisible(true);
}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
			setVisible(false);
			new Quiz(name,score);
		}else {
			setVisible(false);
			new Login();
		}
	}
public static void main(String[]args) {
	new Rules("user");}
}