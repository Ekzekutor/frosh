package logik;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import frames.FormManager;
import frames.CheckFrame;
import frames.ClientFrame;

public class Main implements FormManager{
private CheckFrame testFrame;
private ClientFrame �lientFrame;
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
	�lientFrame= new ClientFrame(this);
	testFrame = new CheckFrame(this);
	�lientFrame.setVisible(true);
	testFrame.setVisible(false);
	testFrame.prepareCombo();
	testFrame.prepareText();
}

@Override
public void goToQuestion() {
	if(connector.checkBlackRegion(�lientFrame.getActiveRegion())){
	�lientFrame.setVisible(false);
	testFrame.setVisible(true);}
	
}
	
@Override
public void goToClient() {
	�lientFrame.setVisible(true);
	testFrame.setVisible(false);
}
}
