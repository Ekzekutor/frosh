package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings({"serial","unused","rawtypes","unchecked"})
public class ClientFrame extends JFrame {

	private final FormManager manager;
	private JPanel contentPane;
	JButton nextButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_3;
	private JLabel label;
	private JTextField textField_4;
	private JLabel lblNewLabel_2;
	private JLabel label_1;
	private JComboBox regionBox;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	public ClientFrame(final FormManager manager) {
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
		
		JLabel textLbl = new JLabel("Имя");
		textLbl.setBounds(22, 39, 61, 16);
		contentPane.add(textLbl);
		
		nextButton = new JButton("Продолжить");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.goToQuestion();
				
				
			}
		});
		nextButton.setEnabled(true);
		nextButton.setBounds(22, 225, 403, 29);
		contentPane.add(nextButton);
		
		textField = new JTextField();
		textField.setBounds(145, 34, 280, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 62, 280, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 92, 280, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel = new JLabel("Фамилия");
		lblNewLabel.setBounds(22, 67, 61, 16);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Отчество");
		lblNewLabel_1.setBounds(22, 97, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 120, 280, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		label = new JLabel("Дата рождения");
		label.setBounds(22, 125, 111, 16);
		contentPane.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(145, 151, 280, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Паспорт");
		lblNewLabel_2.setBounds(22, 156, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		label_1 = new JLabel("Регион");
		label_1.setBounds(22, 186, 61, 16);
		contentPane.add(label_1);
		
		regionBox = new JComboBox();
		regionBox.addItem("Московская обл.");
		regionBox.addItem("Чечьнья");
		regionBox.addItem("респ. Крым");
		regionBox.addItem("Рязанская обл.");
		regionBox.setBounds(145, 182, 280, 27);
		contentPane.add(regionBox);
		
	}
	public void prepareCombo(){
		regionBox.setVisible(true);
		
	}
	public void prepareText(){
		textField.setVisible(true);
		
	}
	
	public String getActiveRegion(){
		return regionBox.getSelectedItem().toString();
	}
}
