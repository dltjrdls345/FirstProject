package 페고파1차프로젝트;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 로그인페이지 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					로그인페이지 window = new 로그인페이지();
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
	public 로그인페이지() {
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
		
		textField = new JTextField();
		textField.setBounds(122, 93, 205, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 162, 205, 52);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("PW\uC785\uB825");
		lblNewLabel.setBounds(53, 180, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID\uC785\uB825");
		lblId.setBounds(53, 108, 57, 15);
		frame.getContentPane().add(lblId);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778 \uBC84\uD2BC");
		btnNewButton.setBounds(116, 276, 211, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785 \uBC84\uD2BC");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				회원가입페이지.main(null);
			}
		});
		btnNewButton_1.setBounds(116, 377, 211, 52);
		frame.getContentPane().add(btnNewButton_1);
	}
}
