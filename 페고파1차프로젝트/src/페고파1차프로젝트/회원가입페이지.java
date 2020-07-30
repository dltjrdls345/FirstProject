package 페고파1차프로젝트;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class 회원가입페이지 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입페이지 window = new 회원가입페이지();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 회원가입페이지() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("페고파");
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 454, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC77C\uBC18\uD68C\uC6D0");
		rdbtnNewRadioButton.setBounds(210, 58, 121, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC8FC\uCD5C\uD68C\uC6D0");
		rdbtnNewRadioButton_1.setBounds(62, 58, 121, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setText("\uC544\uC774\uB514\uB97C \uC785\uB825\uD558\uC138\uC694");
		textField.setColumns(10);
		textField.setBounds(155, 103, 248, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		textField_1.setColumns(10);
		textField_1.setBounds(155, 145, 248, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		textField_2.setColumns(10);
		textField_2.setBounds(155, 191, 248, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 237, 248, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(150, 286, 248, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(150, 329, 248, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(150, 380, 248, 21);
		panel.add(textField_6);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.setBounds(50, 423, 97, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.setBounds(306, 423, 97, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(62, 106, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setBounds(62, 148, 57, 15);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(62, 240, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setBounds(62, 289, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBounds(62, 332, 57, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_5.setBounds(62, 383, 57, 15);
		panel.add(lblNewLabel_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 454, 504);
		frame.getContentPane().add(tabbedPane);
	}
}
