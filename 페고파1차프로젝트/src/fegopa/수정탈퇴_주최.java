package fegopa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 수정탈퇴_주최 {

	private JFrame frame;
	private JTextField 비밀번호;
	private JTextField 비밀번호확인;
	private JTextField 주소;
	private JTextField 기관명;
	private JTextField 연락처;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	
	주최회원_DAO 주최dao = new 주최회원_DAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					수정탈퇴_주최 window = new 수정탈퇴_주최();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 수정탈퇴_주최() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778\uC815\uBCF4 \uC218\uC815 / \uD0C8\uD1F4");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 30, 259, 37);
		frame.getContentPane().add(lblNewLabel);
		
		비밀번호 = new JTextField();
		비밀번호.setText(주최dao.showHostInfo().getPW());
		비밀번호.setDropMode(DropMode.INSERT);
		비밀번호.setBounds(130, 124, 291, 37);
		frame.getContentPane().add(비밀번호);
		비밀번호.setColumns(10);
		
		비밀번호확인 = new JTextField();
		비밀번호확인.setDropMode(DropMode.INSERT);
		비밀번호확인.setColumns(10);
		비밀번호확인.setBounds(130, 174, 291, 37);
		frame.getContentPane().add(비밀번호확인);
		
		주소 = new JTextField();
		주소.setText(주최dao.showHostInfo().get주소());
		주소.setDropMode(DropMode.INSERT);
		주소.setColumns(10);
		주소.setBounds(130, 224, 291, 37);
		frame.getContentPane().add(주소);
		
		기관명 = new JTextField();
		기관명.setText(주최dao.showHostInfo().get기관명());
		기관명.setDropMode(DropMode.INSERT);
		기관명.setColumns(10);
		기관명.setBounds(130, 274, 291, 37);
		frame.getContentPane().add(기관명);
		
		연락처 = new JTextField();
		연락처.setText(주최dao.showHostInfo().get연락처());
		연락처.setDropMode(DropMode.INSERT);
		연락처.setColumns(10);
		연락처.setBounds(130, 324, 291, 37);
		frame.getContentPane().add(연락처);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(153, 416, 128, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC815\uBCF4\uBCC0\uACBD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				주최회원_VO vo = new 주최회원_VO(비밀번호.getText(), 주소.getText(), 기관명.getText(), 연락처.getText());
				
				if (비밀번호.getText().equals(비밀번호확인.getText())) {
					주최dao.updateHostInfo(vo);
					JOptionPane.showMessageDialog(null, "회원정보 변경 성공");
				} else {
					JOptionPane.showMessageDialog(null, "회원정보 변경 실패");
				}
				
			}
		});
		btnNewButton_1.setBounds(293, 416, 128, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_delAccount = new JButton("\uACC4\uC815 \uD0C8\uD1F4 ");
		btn_delAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				주최dao.deleteHost();
				
				JOptionPane.showMessageDialog(null, "회원탈퇴 되었습니다.");
				
			}
		});
		btn_delAccount.setBounds(29, 423, 96, 30);
		frame.getContentPane().add(btn_delAccount);
		
		lblNewLabel_1 = new JLabel("\uBCC0\uACBD\uD560 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(29, 135, 96, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setBounds(29, 185, 89, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uBCC0\uACBD\uD560 \uC8FC\uC18C");
		lblNewLabel_3.setBounds(29, 235, 89, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\uBCC0\uACBD\uD560 \uAE30\uAD00\uBA85");
		lblNewLabel_4.setBounds(29, 285, 89, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uBCC0\uACBD\uD560 \uC5F0\uB77D\uCC98");
		lblNewLabel_5.setBounds(29, 335, 89, 15);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
