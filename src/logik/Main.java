package logik;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import frames.FormManager;
import frames.CheckFrame;
import frames.ClientFrame;

public class Main implements FormManager{
private CheckFrame testFrame;
private ClientFrame ÑlientFrame;
private Connector connector = new Connector();

public static void main(String... args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Main();
        }
    });
}

public Main() {
	ÑlientFrame= new ClientFrame(this);
	testFrame = new CheckFrame(this);
	ÑlientFrame.setVisible(true);
	testFrame.setVisible(false);
	testFrame.prepareCombo();
	testFrame.prepareText();
}

@Override
public void goToQuestion() {
	if(connector.checkBlackRegion(ÑlientFrame.getActiveRegion())){
	ÑlientFrame.setVisible(false);
	testFrame.setVisible(true);}
	
}
	
@Override
public void goToClient() {
	ÑlientFrame.setVisible(true);
	testFrame.setVisible(false);
}
}
