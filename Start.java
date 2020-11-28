package bank;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Start {
	JFrame frame;
	JPanel title;
	JPanel buttonPanel;
	Container con;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font buttonFont = new Font("Times New Roman", Font.PLAIN, 30);
	
	
	Start(){
		frame = new JFrame("Hedgefunds");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		con = frame.getContentPane();
		con.setBackground(Color.BLACK);
		
		title = new JPanel();
		title.setBounds(100, 100, 600, 150);
		title.setBackground(Color.BLACK);
		JLabel titleText = new JLabel("Hedgefunds");
		titleText.setForeground(Color.WHITE);
		titleText.setFont(titleFont);
		title.add(titleText);
		JLabel intro = new JLabel("by Joel, Luke, Jonathan & Melodie");
		intro.setForeground(Color.WHITE);
		intro.setFont(buttonFont);
		title.add(intro);
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 400, 220, 120);
		buttonPanel.setBackground(Color.BLACK);
		
		JButton start = new JButton("START");
		start.setBackground(Color.BLACK);
		start.setForeground(Color.WHITE);
		start.setBounds(800, 700, 200, 100);
		start.setBorder(new LineBorder(Color.WHITE));
		start.setFont(buttonFont);
		
		
		buttonPanel.add(start);
		
		con.add(buttonPanel);
		con.add(title);
		
	}
	
	public static void main(String args[]) {
		new Start();
	}

}
