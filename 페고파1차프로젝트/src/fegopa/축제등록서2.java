package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 축제등록서2 {

	private JFrame frame;
	private JTextField txt_price대;
	private JTextField txt_price중;
	private JTextField txt_price소;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btn_back;
	private JButton btn_등록하기;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					축제등록서2 window = new 축제등록서2();
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
	public 축제등록서2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
		JCheckBox ckbx_대 = new JCheckBox("");
		ckbx_대.setBounds(62, 58, 23, 23);
		frame.getContentPane().add(ckbx_대);
		
		JCheckBox ckbx_중 = new JCheckBox("");
		ckbx_중.setBounds(147, 58, 23, 23);
		frame.getContentPane().add(ckbx_중);
		
		JCheckBox ckbx_소 = new JCheckBox("");
		ckbx_소.setBounds(235, 58, 23, 23);
		frame.getContentPane().add(ckbx_소);
		
		txt_price대 = new JTextField();
		txt_price대.setBounds(88, 87, 39, 21);
		frame.getContentPane().add(txt_price대);
		txt_price대.setColumns(10);
		
		txt_price중 = new JTextField();
		txt_price중.setColumns(10);
		txt_price중.setBounds(179, 87, 39, 21);
		frame.getContentPane().add(txt_price중);
		
		txt_price소 = new JTextField();
		txt_price소.setColumns(10);
		txt_price소.setBounds(264, 87, 39, 21);
		frame.getContentPane().add(txt_price소);
		
		textField = new JTextField();
		textField.setBounds(46, 163, 74, 224);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 163, 78, 224);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(222, 163, 74, 224);
		frame.getContentPane().add(textField_2);
		
		btn_back = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btn_back.setBounds(55, 410, 103, 23);
		frame.getContentPane().add(btn_back);
		
		btn_등록하기 = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btn_등록하기.setBounds(179, 410, 117, 23);
		frame.getContentPane().add(btn_등록하기);
		
		String img11 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\11.png";
		Image image11 = new ImageIcon(img11).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_img11 = new JLabel(new ImageIcon(image11.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img11.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img11);
		
	}
}
