package bank;

import java.util.ArrayList;
import java.util.Random;

public class VisibilityManager extends Data {
	Start start;
	int balance = 1000;
	
	public VisibilityManager(Start userInterface) {
		start = userInterface;
	}
	
	public void showTitleScreen() {
		start.title.setVisible(true);
		start.buttonPanel.setVisible(true);
		start.mainTextPanel.setVisible(false);
		start.choiceButtonPanel.setVisible(false);
		start.fundsPanel.setVisible(false);
	}
	
	public void titleToMain() {
		int r = new Random().nextInt(2+1);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Funds: " + funds[r] + "\n");  
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Credit " + credit[r] + "\n"); 
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		
		start.fundsLabel.setText("Funds: " + Integer.toString(balance));
		
	}
	
	public void accept() {
        int r = new Random().nextInt(2+1);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		
		start.mainTextArea1.selectAll();
		start.mainTextArea1.replaceSelection("");
		
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Funds: " + funds[r] + "\n");  
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Credit " + credit[r] + "\n"); 
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		
		start.fundsLabel.setText("Funds: " + Integer.toString(balance));
		
	}
	
	public void reject() {
        int r = new Random().nextInt(2+1);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		
		start.mainTextArea1.selectAll();
		start.mainTextArea1.replaceSelection("");
		
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Funds: " + funds[r] + "\n");  
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Credit " + credit[r] + "\n"); 
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		start.fundsLabel.setText("Funds: " + Integer.toString(balance));
		
	}
	
	
	
	
}
