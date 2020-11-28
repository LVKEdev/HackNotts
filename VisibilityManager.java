package bank;

import java.util.ArrayList;
import java.util.Random;

public class VisibilityManager extends Data {
	Start start;
	long balance = 10000;
	
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
		start.mainTextArea1.append("Credit " + Integer.toString(credit[r]) + "\n");
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		start.fundsLabel.setText("Funds: " + Long.toString(this.balance));
		
	}
	
	public void accept() {
        int r = new Random().nextInt(2+1);
        int r2 = new Random().nextInt(2+1);
		
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
		start.mainTextArea1.append("Credit " + Integer.toString(credit[r]) + "\n");
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r2]);
		
		this.balance = calculateBalance(riskiness[r], fundsRequired[r], credit[r]);
		
		
		start.fundsLabel.setText("Funds: " + Long.toString(this.balance));
		
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
		start.mainTextArea1.append("Credit " + Integer.toString(credit[r]) + "\n"); 
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		start.fundsLabel.setText("Funds: " + Long.toString(this.balance));
		
	}
	
	
	public long calculateBalance(float riskiness, int fundsRequiredForProject, int creditScore) {

	        long profit = (long)(fundsRequiredForProject+fundsRequiredForProject*riskiness);
	        float chanceOfFailure = ((1000 - creditScore)/2000f)*riskiness;
	        System.out.println(chanceOfFailure);
	        double random = Math.random();
	        if(random>chanceOfFailure) {
	            //CODE IF INVESTMENT PAYS OFF
	            this.balance+=profit;
	        }else {
	            //CODE IF INVESTMENT FAILS
	            this.balance-=fundsRequiredForProject;
	        }
	        
	        return this.balance;
	    
	}
	
	
	
	
}
