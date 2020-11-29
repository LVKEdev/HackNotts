package bank;

import java.util.ArrayList;
import java.util.Random;

public class VisibilityManager extends Data {
	Start start;
	long balance = 20000;
	
	public VisibilityManager(Start userInterface) {
		start = userInterface;
	}


	public void showTitleScreen() {
		start.title.setVisible(true);
		start.buttonPanel.setVisible(true);
		start.mainTextPanel.setVisible(false);
		start.choiceButtonPanel.setVisible(false);
		start.fundsPanel.setVisible(false);
		start.endPanel.setVisible(false);
		//start.instructionPanel.setVisible(false);
	}

	/*
	public void titleToInstructions() {
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(false);
		start.choiceButtonPanel.setVisible(false);
		start.fundsPanel.setVisible(false);
		start.endPanel.setVisible(false);
		start.instructionPanel.setVisible(true);
	}

	public void instructionsToMain() {
		start.title.setVisible(true);
		start.buttonPanel.setVisible(true);
		start.mainTextPanel.setVisible(false);
		start.choiceButtonPanel.setVisible(false);
		start.fundsPanel.setVisible(false);
		start.endPanel.setVisible(false);
		start.instructionPanel.setVisible(false);

	}*/


	
	public void titleToMain() {
		int r = new Random().nextInt(Data.names.length);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		start.endPanel.setVisible(false);
		
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Required Funds: $" + funds[r] + "\n");  
		start.mainTextArea1.append("\n");
		String creditRating;
		if (credit[r]==850) {
			creditRating="(A+)";
		}else if (credit[r]>800) {
			creditRating="(A)";
		}else if (credit[r]>750) {
			creditRating="(A-)";
		}else if (credit[r]>700) {
			creditRating="(B+)";
		}else if (credit[r]>650) {
			creditRating="(B)";
		}else if (credit[r]>600) {
			creditRating="(B-)";
		}else if (credit[r]>550) {
			creditRating="(C+)";
		}else if (credit[r]>500) {
			creditRating="(C)";
		}else if (credit[r]>450) {
			creditRating="(C-)";
		}else if (credit[r]>400) {
			creditRating="(D+)";
		}else if (credit[r]>350) {
			creditRating="(D)";
		}else if (credit[r]>=300) {
			creditRating="(D-)";
		}else {
			creditRating="(?)";
		}
		start.mainTextArea1.append("Credit: " + Integer.toString(credit[r]) + " " + creditRating + "\n");
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		start.fundsLabel.setText("Your Funds: $" + Long.toString(this.balance));
		
	}
	
	public void accept() {
        int r = new Random().nextInt(Data.names.length);
       // int r2 = new Random().nextInt(Data.names.length);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		start.endPanel.setVisible(false);
		
		start.mainTextArea1.selectAll();
		start.mainTextArea1.replaceSelection("");

		Integer rand = new Random().nextInt(100000);
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Required Funds: $" + funds[r] + "\n");
		start.mainTextArea1.append("\n");
		String creditRating;
		if (credit[r]==850) {
			creditRating="(A+)";
		}else if (credit[r]>800) {
			creditRating="(A)";
		}else if (credit[r]>750) {
			creditRating="(A-)";
		}else if (credit[r]>700) {
			creditRating="(B+)";
		}else if (credit[r]>650) {
			creditRating="(B)";
		}else if (credit[r]>600) {
			creditRating="(B-)";
		}else if (credit[r]>550) {
			creditRating="(C+)";
		}else if (credit[r]>500) {
			creditRating="(C)";
		}else if (credit[r]>450) {
			creditRating="(C-)";
		}else if (credit[r]>400) {
			creditRating="(D+)";
		}else if (credit[r]>350) {
			creditRating="(D)";
		}else if (credit[r]>=300) {
			creditRating="(D-)";
		}else {
			creditRating="(?)";
		}
		start.mainTextArea1.append("Credit: " + Integer.toString(credit[r]) + " " + creditRating + "\n");
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		this.balance = calculateBalance(riskiness[r], fundsRequired[r], credit[r]);
		
		
		start.fundsLabel.setText("Your Funds: $" + Long.toString(this.balance));
		
	}
	
	public void reject() {
        int r = new Random().nextInt(Data.credit.length);
		
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
		start.endPanel.setVisible(false);
		
		start.mainTextArea1.selectAll();
		start.mainTextArea1.replaceSelection("");
		
		start.mainTextArea1.append("Name: " + names[r] + "\n"); 
		start.mainTextArea1.append("\n");
		start.mainTextArea1.append("Required Funds: $" + funds[r] + "\n");  
		start.mainTextArea1.append("\n");
		String creditRating;
		if (credit[r]==850) {
			creditRating="(A+)";
		}else if (credit[r]>=800) {
			creditRating="(A)";
		}else if (credit[r]>750) {
			creditRating="(A-)";
		}else if (credit[r]>700) {
			creditRating="(B+)";
		}else if (credit[r]>650) {
			creditRating="(B)";
		}else if (credit[r]>600) {
			creditRating="(B-)";
		}else if (credit[r]>550) {
			creditRating="(C+)";
		}else if (credit[r]>500) {
			creditRating="(C)";
		}else if (credit[r]>450) {
			creditRating="(C-)";
		}else if (credit[r]>400) {
			creditRating="(D+)";
		}else if (credit[r]>350) {
			creditRating="(D)";
		}else if (credit[r]>300) {
			creditRating="(D-)";
		}else {
			creditRating="(?)";
		}
		start.mainTextArea1.append("Credit: " + Integer.toString(credit[r]) + " " + creditRating + "\n");
		
		start.mainTextArea2.selectAll();
		start.mainTextArea2.replaceSelection("");
		start.mainTextArea2.append(pitch[r]);
		
		start.fundsLabel.setText("Your Funds: $" + Long.toString(this.balance));
		
	}
	
	public void cashIN() {
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(false);
		start.choiceButtonPanel.setVisible(false);
		start.fundsPanel.setVisible(false);
		start.endPanel.setVisible(true);

		String bal2 = Long.toString(this.balance + 13l);
		String bal = Long.toString(this.balance);
		start.end.setText("MEOW YORK TIMES RICH LIST 2020");
		if(this.balance < 88_401_493_129l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Elion Musk: $136,144,004,411");
			start.end.append("\n3. Krill Gates: $129,954,241,394");
			start.end.append("\n4. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n5. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n6. Warren Buffalo: $88,401,493,129");
			start.end.append("\n...");
			if(this.balance < 88_401_493_129l && this.balance >= 82_739_932_031l) {
				start.end.append("\n7. Hedgey the Hedgehog: $"+bal);
				start.end.append("\n8. Larry Phage: $82,739,932,031");
			}else if(this.balance<82_739_932_031l && this.balance >= 10_000_000_000l) {
				start.end.append("\n7. Larry Phage: $"+bal2);
				start.end.append("\n8. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<10_000_000_000l && this.balance >= 100_000_000_000l) {
				start.end.append("\n512. Kim Kardaschundian: $"+bal2);
				start.end.append("\n513. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<100_000_000l && this.balance >= 20_000_000l) {
				start.end.append("\n10,213. Geese Witherspoon: $"+bal2);
				start.end.append("\n10,214. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<20_000_000_000l && this.balance >=2_500_000) {
				start.end.append("\n94,390. Llama Del Rey: $"+bal2);
				start.end.append("\n94,391. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<2_500_000l && this.balance >= 300_000l) {
				start.end.append("\n122,311. Justin Timbersnake: $"+bal2);
				start.end.append("\n122,312. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<300_000l && this.balance >= 100_000l) {
				start.end.append("\n322,311. Nutty Squirrelson: $"+bal2);
				start.end.append("\n322,312. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<100_000l && this.balance >= 25_000l) {
				start.end.append("\n522,311. Crocker Dyle: $"+bal2);
				start.end.append("\n522,312. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<25_000l && this.balance >= 15_000l) {
				start.end.append("\n912,466. Saddington: $"+bal2);
				start.end.append("\n912,467. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<15_000l && this.balance >= 1_000l) {
				start.end.append("\n999,998. Lasagna Cat: $"+bal2);
				start.end.append("\n999,999. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<1_000l && this.balance >= 0l) {
				start.end.append("\n N/A. Hedgey the Hedgehog: $"+bal);
			}else if(this.balance<0) {
				start.end.append("\n N/A. Gnome Money: $0");
				start.end.append("\n N/A. Hedgey the Hedgehog: $"+bal);
			}
		}else if(this.balance >= 88_401_493_129l && this.balance < 105_931_104_943l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Elion Musk: $136,144,004,411");
			start.end.append("\n3. Krill Gates: $129,954,241,394");
			start.end.append("\n4. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n5. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n6. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
		}else if(this.balance >= 105_931_104_943l && this.balance < 106_349_833_001l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Elion Musk: $136,144,004,411");
			start.end.append("\n3. Krill Gates: $129,954,241,394");
			start.end.append("\n4. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n5. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n6. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
		}else if(this.balance >= 106_349_833_001l && this.balance < 129_954_241_394l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Elion Musk: $136,144,004,411");
			start.end.append("\n3. Krill Gates: $129,954,241,394");
			start.end.append("\n4. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n5. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n6. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
		}else if(this.balance >= 129_954_241_394l && this.balance < 136_144_004_411l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Elion Musk: $136,144,004,411");
			start.end.append("\n3. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n4. Krill Gates: $129,954,241,394");
			start.end.append("\n5. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n6. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
		}else if(this.balance >= 136_144_004_411l && this.balance < 183_104_314_531l) {
			start.end.append("\n1. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n2. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n3. Elion Musk: $136,144,004,411");
			start.end.append("\n4. Krill Gates: $129,954,241,394");
			start.end.append("\n5. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n6. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
		}else if(this.balance >= 183_104_314_531l) {
			start.end.append("\n1. Hedgey the Hedgehog: $"+bal);
			start.end.append("\n2. Jeff Bearzos: $183,104,314,531");
			start.end.append("\n3. Elion Musk: $136,144,004,411");
			start.end.append("\n4. Krill Gates: $129,954,241,394");
			start.end.append("\n5. Mark Zucowberg: $106,349,833,001");
			start.end.append("\n6. Bernard Arnewt: $105,931,104,943");
			start.end.append("\n7. Warren Buffalo: $88,401,493,129");
			start.end.append("\n YOU'RE THE RICHEST HOG OF ALL! BUT HOW???");
		}
	}

	
	
	public long calculateBalance(float riskiness, int fundsRequiredForProject, int creditScore) {

	        long profit = (long)(fundsRequiredForProject+fundsRequiredForProject*riskiness);
	        float chanceOfFailure = 3*((1000 - creditScore)/2000f)*riskiness;
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
