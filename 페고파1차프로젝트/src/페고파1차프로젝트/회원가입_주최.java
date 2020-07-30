package 페고파1차프로젝트;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입_주최 {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField 아이디;
	private JTextField 비밀번호;
	private JTextField 비밀번호확인;
	private JTextField 주소;
	private JTextField 기관명;
	private JTextField 문의연락처;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					회원가입_주최 window = new 회원가입_주최();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 회원가입_주최() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uD398\uACE0\uD30C");
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 454, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		아이디 = new JTextField();
		아이디.setColumns(10);
		아이디.setBounds(155, 100, 248, 21);
		panel.add(아이디);
		
		비밀번호 = new JTextField();
		비밀번호.setColumns(10);
		비밀번호.setBounds(155, 145, 248, 21);
		panel.add(비밀번호);
		
		비밀번호확인 = new JTextField();
		비밀번호확인.setColumns(10);
		비밀번호확인.setBounds(155, 190, 248, 21);
		panel.add(비밀번호확인);
		
		주소 = new JTextField();
		주소.setColumns(10);
		주소.setBounds(155, 280, 248, 21);
		panel.add(주소);
		
		기관명 = new JTextField();
		기관명.setColumns(10);
		기관명.setBounds(155, 235, 248, 21);
		panel.add(기관명);
		
		문의연락처 = new JTextField();
		문의연락처.setColumns(10);
		문의연락처.setBounds(155, 325, 248, 21);
		panel.add(문의연락처);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입창 닫기
				frame.dispose();
				//로그인페이지 불러오기
				로그인페이지.main(null);
			}
		});
		btnNewButton.setBounds(50, 400, 97, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//클릭하면 실행되는 코드
				주최회원_VO 주최vo = new 주최회원_VO(아이디.getText(), 비밀번호.getText(), 기관명.getText(), 주소.getText(), 문의연락처.getText());
				주최회원_DAO 주최dao = new 주최회원_DAO();
				int cnt = 0;
				if (비밀번호.getText().equals(비밀번호확인.getText())) {
					cnt = 주최dao.insert(주최vo);
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
		btnNewButton_1.setBounds(306, 400, 97, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(62, 100, 57, 21);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPw.setBounds(62, 145, 57, 21);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(62, 280, 57, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uAE30\uAD00\uBA85");
		lblNewLabel_3.setBounds(62, 235, 57, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uBB38\uC758\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBounds(62, 325, 69, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uCD5C\uD68C\uC6D0 \uAC00\uC785");
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(50, 28, 166, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_5.setBounds(62, 190, 81, 21);
		panel.add(lblNewLabel_5);
	}

}
