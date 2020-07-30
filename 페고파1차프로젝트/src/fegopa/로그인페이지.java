package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인페이지 {

	private JFrame frame;
	private JTextField 아이디;
	private JPasswordField 비밀번호;

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

	public 로그인페이지() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("페고파");
		frame.setBounds(100,100,359,520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		아이디 = new JTextField();
		아이디.setBounds(108, 164, 187, 43);
		frame.getContentPane().add(아이디);
		아이디.setColumns(10);
		
		비밀번호 = new JPasswordField();
		비밀번호.setBounds(109, 229, 187, 35);
		frame.getContentPane().add(비밀번호);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel.setBounds(67, 225, 40, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514 \uC785\uB825");
		lblId.setBounds(56, 168, 40, 35);
		frame.getContentPane().add(lblId);
		
		JButton btnNewButton = new JButton("\uC77C\uBC18\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//로그인 기능 연동
				
				일반회원_VO 일반vo = new 일반회원_VO(아이디.getText(), 비밀번호.getText());
				일반회원_DAO 일반dao = new 일반회원_DAO();
				
				String result = 일반dao.logIN(일반vo);
				
				if (result != null) {
					frame.dispose();
				} else {
				JOptionPane.showMessageDialog(null, "로그인실패 : 아이디 또는 비밀번호를 틀렸습니다.");
				}
				
			}
		});
		btnNewButton.setBounds(39, 287, 140, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC77C\uBC18\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				회원가입_일반.main(null);
			}
		});
		btnNewButton_1.setBounds(99, 362, 150, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC8FC\uCD5C\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//로그인 기능 연동
				
				주최회원_VO 주최vo = new 주최회원_VO(아이디.getText(), 비밀번호.getText());
				주최회원_DAO 주최dao = new 주최회원_DAO();
				
				String result = 주최dao.logIN(주최vo);
				
				if (result != null) {
					frame.dispose();
				} else {
				JOptionPane.showMessageDialog(null, "로그인실패 : 아이디 또는 비밀번호를 틀렸습니다.");
				}
				
			}
		});
		btnNewButton_2.setBounds(191, 287, 140, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		String img5 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\5.png";
		Image image5 = new ImageIcon(img5).getImage();
		JLabel lbl_img5 = new JLabel(new ImageIcon(image5.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img5.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img5);
		
		JButton btnNewButton_1_1 = new JButton("\uC77C\uBC18\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1_1.setBounds(99, 406, 150, 35);
		frame.getContentPane().add(btnNewButton_1_1);

	}
}
