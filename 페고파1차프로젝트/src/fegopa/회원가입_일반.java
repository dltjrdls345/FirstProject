package fegopa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입_일반 {

	private JFrame frame;
	private JTextField 아이디;
	private JTextField 비밀번호;
	private JTextField 비밀번호확인;
	private JTextField 주소;
	private JTextField 이름;
	private JTextField 연락처;
	private JTextField 이메일;
	private JTextField 생년월일;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입_일반 window = new 회원가입_일반();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 회원가입_일반() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("페고파");
		frame.setBounds(100,100,359,520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,0,0,0));
		panel.setBounds(0, 0, 358, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		아이디 = new JTextField();
		아이디.setColumns(10);
		아이디.setBounds(97, 100, 195, 21);
		panel.add(아이디);
		
		비밀번호 = new JTextField();
		비밀번호.setColumns(10);
		비밀번호.setBounds(97, 145, 189, 21);
		panel.add(비밀번호);
		
		비밀번호확인 = new JTextField();
		비밀번호확인.setColumns(10);
		비밀번호확인.setBounds(97, 190, 195, 21);
		panel.add(비밀번호확인);
		
		이름 = new JTextField();
		이름.setColumns(10);
		이름.setBounds(97, 235, 195, 21);
		panel.add(이름);
		
		생년월일 = new JTextField();
		생년월일.setBounds(97, 263, 195, 21);
		panel.add(생년월일);
		생년월일.setColumns(10);
		
		주소 = new JTextField();
		주소.setColumns(10);
		주소.setBounds(97, 294, 180, 21);
		panel.add(주소);
		
		연락처 = new JTextField();
		연락처.setColumns(10);
		연락처.setBounds(97, 325, 195, 21);
		panel.add(연락처);
		
		이메일 = new JTextField();
		이메일.setColumns(10);
		이메일.setBounds(97, 370, 180, 21);
		panel.add(이메일);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입창 닫기
				frame.dispose();
				//로그인페이지 불러오기
				로그인페이지.main(null);
			}
		});
		btnNewButton.setBounds(50, 423, 97, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//클릭하면 실행되는 코드
				일반회원_VO 일반vo = new 일반회원_VO(아이디.getText(), 비밀번호.getText(), 이름.getText(), 생년월일.getText(), 주소.getText(), 연락처.getText(), 이메일.getText());
				일반회원_DAO 일반dao = new 일반회원_DAO();
				int cnt = 0;
				if (비밀번호.getText().equals(비밀번호확인.getText())) {
					cnt = 일반dao.insert(일반vo);
				}
				
				if(cnt > 0) {
					//성공실패 팝업메시지
					JOptionPane.showMessageDialog(null, "회원가입 성공! 로그인 페이지로 이동합니다.");
					//회원가입창 닫기
					frame.dispose();
					//로그인페이지 불러오기
					로그인페이지.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "회원가입 실패 : 중복된 아이디거나 비밀번호가 다르거나 빈칸이 있습니다.");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(177, 423, 97, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(28, 100, 57, 21);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPw.setBounds(28, 145, 57, 21);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(28, 294, 57, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setBounds(28, 235, 57, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBounds(28, 325, 57, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_5.setBounds(28, 370, 57, 21);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("\uC77C\uBC18\uD68C\uC6D0 \uAC00\uC785");
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(108, 28, 166, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_5_1.setBounds(28, 190, 57, 35);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_6.setBounds(28, 266, 57, 15);
		panel.add(lblNewLabel_6);
		
		
		String img8 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\8.png";
		Image image8 = new ImageIcon(img8).getImage();
		JLabel lbl_img8 = new JLabel(new ImageIcon(image8.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img8.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img8);
	}
}
