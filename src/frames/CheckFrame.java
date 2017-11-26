package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckFrame extends JFrame {
	private final FormManager manager;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton nextButton;
	private JButton BackButton;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CheckFrame(final FormManager manager) {
		this.manager = manager;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel questionLabel = new JLabel("New label");
		questionLabel.setBounds(185, 6, 61, 16);
		contentPane.add(questionLabel);
		
		JLabel textLbl = new JLabel("Ответ:");
		textLbl.setBounds(163, 75, 61, 16);
		contentPane.add(textLbl);
		
		nextButton = new JButton("Следующий вопрос");
		nextButton.setEnabled(false);
		nextButton.setBounds(243, 228, 117, 29);
		contentPane.add(nextButton);
		
		textField = new JTextField();
		textField.setBounds(163, 136, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		comboBox = new JComboBox();
		comboBox.setBounds(173, 95, 117, 27);
		contentPane.add(comboBox);	
		
		BackButton = new JButton("Назад");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.goToClient();
			}
		});
		BackButton.setBounds(93, 228, 117, 29);
		contentPane.add(BackButton);
		comboBox.setVisible(false);
		
	}
	public void prepareCombo(){
		comboBox.setVisible(true);
		
	}
	public void prepareText(){
		textField.setVisible(true);
		
	}
}
