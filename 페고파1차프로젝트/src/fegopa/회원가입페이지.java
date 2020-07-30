package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
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
		frame.setBounds(100, 100, 359,520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250,0,0,0));
		panel.setBounds(0, 0, 343, 471);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC77C\uBC18\uD68C\uC6D0");
		rdbtnNewRadioButton.setBounds(198, 73, 73, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC8FC\uCD5C\uD68C\uC6D0");
		rdbtnNewRadioButton_1.setBounds(76, 73, 73, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setText("\uC544\uC774\uB514\uB97C \uC785\uB825\uD558\uC138\uC694");
		textField.setColumns(10);
		textField.setBounds(64, 120, 213, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		textField_1.setColumns(10);
		textField_1.setBounds(64, 166, 213, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		textField_2.setColumns(10);
		textField_2.setBounds(64, 218, 213, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(64, 271, 213, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(64, 329, 213, 21);
		panel.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(58, 380, 213, 21);
		panel.add(textField_6);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.setBounds(58, 411, 103, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.setBounds(180, 411, 103, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(42, 123, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setBounds(42, 169, 57, 15);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(42, 274, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uAE30\uAD00\uBA85");
		lblNewLabel_3.setBounds(42, 332, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBounds(27, 383, 57, 15);
		panel.add(lblNewLabel_4);
		
		String img6 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\6.png";
		Image image6 = new ImageIcon(img6).getImage();
		JLabel lbl_img6 = new JLabel(new ImageIcon(image6.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img6.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img6);

	}
}
