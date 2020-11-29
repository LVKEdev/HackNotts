package bank;

import bank.Game.ChoiceHandler;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;


public class Start {
  JFrame frame;
  JPanel title, buttonPanel, mainTextPanel, fundsPanel, choiceButtonPanel, endPanel;
  JLabel fundsLabel;
  JButton accept, reject, cashIn;
  JTextArea mainTextArea1, mainTextArea2, end;
  JTextField name, money, credit;
  Container con;
  CardLayout cl;
  Font       titleFont    = new Font("Arial", Font.PLAIN, 90);
  Font       subtitleFont = new Font("Times New Roman", Font.ITALIC, 30);
  Font       buttonFont   = new Font("Arial", Font.PLAIN, 30);
  Font       smallFont    = new Font("Arial", Font.PLAIN, 17);
  Border     border       = BorderFactory.createLineBorder(Color.WHITE);


  public void drawGUI(ChoiceHandler cHandler) {
    frame = new JFrame("Hedgefunds");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.getContentPane().setBackground(Color.BLACK);

    //Title Screen
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
    buttonPanel.setBounds(300, 400, 200, 100);
    buttonPanel.setBackground(Color.BLACK);

    JButton start = new JButton("START");
    start.setBackground(Color.BLACK);
    start.setForeground(Color.WHITE);
    start.setBounds(800, 700, 200, 100);
    start.setBorder(new LineBorder(Color.WHITE));
    start.setFont(buttonFont);
    start.addActionListener(cHandler);
    start.setActionCommand("start");

    buttonPanel.add(start);
    frame.add(title);
    frame.add(buttonPanel);

    //Instruction Screen
		/*instructionPanel = new JPanel();
		instructionPanel.setBounds(100, 100, 600, 150);
		instructionPanel.setBackground(Color.BLACK);
    JLabel instructionText = new JLabel("HEDGE FUNDS + " +
    "Inspired by the wealth of Jeff " + "BEARzos, you aim to become the " +
																				"richest hedgehog in the animal " +
																				"kingdom. You save up every penny you own and decide to start your own hedgehog investment bank: HEDGE FUNDS INC." +

 "Your goal is to climb to the top of the animal kingdom's rich list " +
"by investing your money in worthwhile projects. Budding entrepreneurs will " +
																				"come to you to finance their " +
																				"projects and it's up to you to decide whether to ACCEPT or REJECT their proposals using the financial information provided."
 + "Good luck !"
);

    buttonPanel = new JPanel();
    buttonPanel.setBounds(300, 400, 200, 100);
    buttonPanel.setBackground(Color.BLACK);

    JButton go = new JButton("GO");
    start.setBackground(Color.BLACK);
    start.setForeground(Color.WHITE);
    start.setBounds(800, 700, 200, 100);
    start.setBorder(new LineBorder(Color.WHITE));
    start.setFont(buttonFont);
    start.addActionListener(cHandler);
    start.setActionCommand("go");

    buttonPanel.add(go);
    frame.add(instructionPanel);
    frame.add(buttonPanel); */

    //Game Screen
    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(100, 100, 600, 250);
    mainTextPanel.setBackground(Color.BLACK);
    mainTextPanel.setLayout(new GridLayout(1, 2));
    frame.add(mainTextPanel); 
    
    mainTextArea1 = new JTextArea();
    mainTextArea1.setBorder(border);
    mainTextArea1.setBackground(Color.BLACK);
    mainTextArea1.setForeground(Color.WHITE);
    mainTextArea1.setFont(buttonFont);
    mainTextArea1.setLineWrap(true);
    mainTextArea1.setWrapStyleWord(true);
    mainTextArea1.setEditable(true);


    mainTextPanel.add(mainTextArea1);

    mainTextArea2 = new JTextArea();
    mainTextArea2.setBorder(border);
    mainTextArea2.setBackground(Color.BLACK);
    mainTextArea2.setForeground(Color.WHITE);
    mainTextArea2.setFont(smallFont);
    mainTextArea2.setLineWrap(true);
    mainTextArea2.setWrapStyleWord(true);
    mainTextArea2.setEditable(true);
    mainTextPanel.add(mainTextArea2);

    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(250, 350, 300, 150);
    choiceButtonPanel.setBackground(Color.black);
    choiceButtonPanel.setLayout(new GridLayout(3, 1));

    accept = new JButton("Accept");
    accept.setBackground(Color.WHITE);
    accept.setForeground(Color.BLACK);
    accept.setFont(buttonFont);
    accept.setFocusPainted(false);
    accept.addActionListener(cHandler);
    accept.setActionCommand("accept");
    choiceButtonPanel.add(accept);
    reject = new JButton("Reject");
    reject.setBackground(Color.WHITE);
    reject.setForeground(Color.BLACK);
    reject.setFont(buttonFont);
    reject.setFocusPainted(false);
    reject.addActionListener(cHandler);
    reject.setActionCommand("reject");
    choiceButtonPanel.add(reject);
    cashIn = new JButton("Cash In");
    cashIn.setBackground(Color.WHITE);
    cashIn.setForeground(Color.BLACK);
    cashIn.setFont(buttonFont);
    cashIn.setFocusPainted(false);
    cashIn.addActionListener(cHandler);
    cashIn.setActionCommand("cashIn");
    choiceButtonPanel.add(cashIn);
    frame.add(choiceButtonPanel);

    fundsPanel = new JPanel();
    fundsPanel.setBounds(100, 15, 600, 50);
    fundsPanel.setBackground(Color.BLACK);
    fundsPanel.setLayout(new GridLayout(1, 1));


    fundsLabel = new JLabel("Funds: ");
    fundsLabel.setFont(buttonFont);
    fundsLabel.setForeground(Color.WHITE);
    fundsPanel.add(fundsLabel);
    frame.add(fundsPanel);

    endPanel = new JPanel();
    endPanel.setBounds(100, 100, 600, 400);
    endPanel.setBackground(Color.BLACK);
    end = new JTextArea();
    end.setBackground(Color.BLACK);
    end.setForeground(Color.WHITE);
    end.setFont(buttonFont);
    endPanel.add(end);
    frame.add(endPanel);

    frame.setVisible(true);
  }


}
