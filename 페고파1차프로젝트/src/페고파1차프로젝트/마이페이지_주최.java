package 페고파1차프로젝트;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class 마이페이지_주최 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					마이페이지_주최 window = new 마이페이지_주최();
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
	public 마이페이지_주최() {
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(264, 10, 67, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(224, 83, 107, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uCD95\uC81C\uB4F1\uB85D");
		btnNewButton_1_1.setBounds(41, 155, 269, 48);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\uCD95\uC81C \uB4F1\uB85D\uC11C \uC218/\uC0AD");
		btnNewButton_1_1_1.setBounds(41, 218, 269, 48);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("\uB098\uC758 \uCD95\uC81C \uB4F1\uB85D\uC11C \uC870\uD68C");
		btnNewButton_1_1_2.setBounds(41, 284, 269, 48);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("\uBD80\uC2A4 \uC2E0\uCCAD\uC11C \uC870\uD68C");
		btnNewButton_1_1_3.setBounds(41, 342, 269, 48);
		frame.getContentPane().add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("\uAC1C\uC778\uC815\uBCF4 \uC218/\uD0C8");
		btnNewButton_1_1_4.setBounds(41, 407, 269, 48);
		frame.getContentPane().add(btnNewButton_1_1_4);
		
		JLabel lbl_기관명 = new JLabel("\uAE30\uAD00\uBA85\uB744\uC6B0\uAE30");
		lbl_기관명.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_기관명.setBounds(72, 78, 92, 32);
		frame.getContentPane().add(lbl_기관명);
		
		JLabel lbl_연락처 = new JLabel("\uC5F0\uB77D\uCC98\uB744\uC6B0\uAE30");
		lbl_연락처.setBounds(72, 114, 92, 15);
		frame.getContentPane().add(lbl_연락처);
		
		
		String img9 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\9.png";
		Image image9 = new ImageIcon(img9).getImage();
		JLabel lbl_img9 = new JLabel(new ImageIcon(image9.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img9.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img9);

	}
}
