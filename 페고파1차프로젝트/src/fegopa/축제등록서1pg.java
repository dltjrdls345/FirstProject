package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class 축제등록서1pg {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btn_loadFiles;
	private JButton btn_back;
	private JButton btn_next;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					축제등록서1pg window = new 축제등록서1pg();
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
	public 축제등록서1pg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 92, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(56, 132, 228, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(56, 167, 228, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(56, 211, 228, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(56, 250, 228, 88);
		frame.getContentPane().add(textField_4);
		
		btn_loadFiles = new JButton("New button");
		btn_loadFiles.setBounds(127, 381, 97, 23);
		frame.getContentPane().add(btn_loadFiles);
		
		btn_back = new JButton("");
		btn_back.setBackground(Color.ORANGE);
		btn_back.setEnabled(true);
		btn_back.setBounds(54, 422, 107, 21);
		frame.getContentPane().add(btn_back);
		
		btn_next = new JButton("");
		btn_next.setEnabled(true);
		btn_next.setBackground(Color.ORANGE);
		btn_next.setBounds(185, 422, 107, 21);
		frame.getContentPane().add(btn_next);
		
		
		
		String img10 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\10.png";
		Image image10 = new ImageIcon(img10).getImage();
		JLabel lbl_img10 = new JLabel(new ImageIcon(image10.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img10.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img10);
		
	}

}
