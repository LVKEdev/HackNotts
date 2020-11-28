package bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ChoiceHandler cHandler = new ChoiceHandler();
	Start start = new Start();
	VisibilityManager vm = new VisibilityManager(start);
	
	public static void main(String[] args) {
		
		new Game();
		
	}
	
	public Game() {
		start.drawGUI(cHandler);
		vm.showTitleScreen();
		
	}
	
	public class ChoiceHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String yourChoice = arg0.getActionCommand();
			
			switch(yourChoice) {
			case "start": vm.titleToMain(); break;
			case "accept": vm.accept(); break;
			case "reject": vm.reject(); break;
			}
			
			
		}
		
	}
	
}
