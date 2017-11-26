package logik;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import frames.FormManager;
import frames.CheckFrame;
import frames.ClientFrame;

public class Main implements FormManager{
private CheckFrame testFrame;
private ClientFrame сlientFrame;


public static void main(String... args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Main();
        }
    });
}

public Main() {
	сlientFrame= new ClientFrame(this);
	testFrame = new CheckFrame(this);
	сlientFrame.setVisible(true);
	testFrame.setVisible(false);
	testFrame.prepareCombo();
	testFrame.prepareText();
}

@Override
public void goToQuestion() {
	if(сlientFrame.getActiveRegion().equals("Чечьнья")){
	сlientFrame.setVisible(false);
	testFrame.setVisible(true);}
	
}
	
@Override
public void goToClient() {
	сlientFrame.setVisible(true);
	testFrame.setVisible(false);
}
}
