package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 부스신청서 {

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
					부스신청서 window = new 부스신청서();
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
	public 부스신청서() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		textField = new JTextField();
		textField.setBounds(65, 85, 218, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 121, 218, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(65, 156, 218, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(65, 191, 218, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(65, 226, 218, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(65, 263, 218, 21);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(65, 305, 218, 56);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(57, 421, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(193, 421, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton 파일불러오기 = new JButton("New button");
		파일불러오기.setBounds(127, 387, 97, 23);
		frame.getContentPane().add(파일불러오기);
		
		String img18 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\18.png";
		Image image18 = new ImageIcon(img18).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_img18 = new JLabel(new ImageIcon(image18.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img18.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img18);
		
		
	}

}
