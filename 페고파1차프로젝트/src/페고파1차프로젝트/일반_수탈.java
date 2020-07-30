package 페고파1차프로젝트;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일반_수탈 {

	private JFrame frame;
	private JTextField txt_pw;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					일반_수탈 window = new 일반_수탈();
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
	public 일반_수탈() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778\uD68C\uC6D0 \uAC1C\uC778\uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(35, 10, 259, 37);
		frame.getContentPane().add(lblNewLabel);
		
		txt_pw = new JTextField();
		txt_pw.setText("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		txt_pw.setDropMode(DropMode.INSERT);
		txt_pw.setBounds(22, 57, 291, 37);
		frame.getContentPane().add(txt_pw);
		txt_pw.setColumns(10);
		
		textField = new JTextField();
		textField.setText("\uBE44\uBC00\uBC88\uD638\uB97C \uD655\uC785\uD569\uB2C8\uB2E4");
		textField.setDropMode(DropMode.INSERT);
		textField.setColumns(10);
		textField.setBounds(22, 109, 291, 37);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\uC8FC\uC18C");
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setColumns(10);
		textField_1.setBounds(22, 161, 291, 37);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC131\uBA85");
		textField_2.setDropMode(DropMode.INSERT);
		textField_2.setColumns(10);
		textField_2.setBounds(22, 213, 291, 37);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\uC5F0\uB77D\uCC98");
		textField_3.setDropMode(DropMode.INSERT);
		textField_3.setColumns(10);
		textField_3.setBounds(22, 265, 291, 37);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("\uC774\uBA54\uC77C");
		textField_4.setDropMode(DropMode.INSERT);
		textField_4.setColumns(10);
		textField_4.setBounds(22, 317, 291, 37);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(22, 412, 128, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(166, 412, 128, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_delAccount = new JButton("\uACC4\uC815 \uD0C8\uD1F4 ");
		btn_delAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_delAccount.setBounds(22, 365, 89, 30);
		frame.getContentPane().add(btn_delAccount);
	}
}
