package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 축제등록서_수정pg2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					축제등록서_수정pg2 window = new 축제등록서_수정pg2();
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
	public 축제등록서_수정pg2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359,520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(63, 58, 22, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(147, 58, 22, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(235, 58, 22, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		textField = new JTextField();
		textField.setBounds(44, 163, 77, 221);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 163, 77, 221);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(222, 163, 77, 221);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 87, 37, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(179, 87, 37, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(262, 87, 37, 21);
		frame.getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(45, 412, 77, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(133, 412, 77, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(222, 412, 77, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		String img13 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\13.png";
		Image image13 = new ImageIcon(img13).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_img13 = new JLabel(new ImageIcon(image13.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img13.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img13);
		
	}

}
