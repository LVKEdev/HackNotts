package bank;

public class VisibilityManager {
	Start start;
         
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
		start.title.setVisible(false);
		start.buttonPanel.setVisible(false);
		start.mainTextPanel.setVisible(true);
		start.choiceButtonPanel.setVisible(true);
		start.fundsPanel.setVisible(true);
	}
	
	
}
