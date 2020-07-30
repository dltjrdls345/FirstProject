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

public class 수정탈퇴_일반 {

	private JFrame frame;
	private JTextField 비밀번호;
	private JTextField 비밀번호확인;
	private JTextField 주소;
	private JTextField 이름;
	private JTextField 연락처;
	private JTextField 생년월일;
	private JTextField 이메일;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	
	일반회원_DAO 일반dao = new 일반회원_DAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					수정탈퇴_일반 window = new 수정탈퇴_일반();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 수정탈퇴_일반() {
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
		비밀번호.setText(일반dao.showCustomerInfo().getPW());
		비밀번호.setDropMode(DropMode.INSERT);
		비밀번호.setBounds(130, 93, 291, 37);
		frame.getContentPane().add(비밀번호);
		비밀번호.setColumns(10);
		
		비밀번호확인 = new JTextField();
		비밀번호확인.setDropMode(DropMode.INSERT);
		비밀번호확인.setColumns(10);
		비밀번호확인.setBounds(130, 143, 291, 37);
		frame.getContentPane().add(비밀번호확인);
		
		주소 = new JTextField();
		주소.setText(일반dao.showCustomerInfo().get주소());
		주소.setDropMode(DropMode.INSERT);
		주소.setColumns(10);
		주소.setBounds(130, 193, 291, 37);
		frame.getContentPane().add(주소);
		
		이름 = new JTextField();
		이름.setText(일반dao.showCustomerInfo().get이름());
		이름.setDropMode(DropMode.INSERT);
		이름.setColumns(10);
		이름.setBounds(130, 243, 291, 37);
		frame.getContentPane().add(이름);
		
		연락처 = new JTextField();
		연락처.setText(일반dao.showCustomerInfo().get연락처());
		연락처.setDropMode(DropMode.INSERT);
		연락처.setColumns(10);
		연락처.setBounds(130, 293, 291, 37);
		frame.getContentPane().add(연락처);
		
		생년월일 = new JTextField();
		생년월일.setText(일반dao.showCustomerInfo().get생년월일());
		생년월일.setDropMode(DropMode.INSERT);
		생년월일.setColumns(10);
		생년월일.setBounds(130, 390, 291, 37);
		frame.getContentPane().add(생년월일);
		
		이메일 = new JTextField();
		이메일.setText(일반dao.showCustomerInfo().get이메일());
		이메일.setDropMode(DropMode.INSERT);
		이메일.setColumns(10);
		이메일.setBounds(130, 343, 291, 37);
		frame.getContentPane().add(이메일);
		
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
				
				일반회원_VO vo = new 일반회원_VO(비밀번호.getText(), 주소.getText(), 이름.getText(), 연락처.getText(), 생년월일.getText(), 이메일.getText());
				
				if (비밀번호.getText().equals(비밀번호확인.getText())) {
					일반dao.updateCustomerInfo(vo);
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
				
				일반dao.deleteCustomer();
				
				JOptionPane.showMessageDialog(null, "회원탈퇴 되었습니다.");
				
			}
		});
		btn_delAccount.setBounds(29, 423, 96, 30);
		frame.getContentPane().add(btn_delAccount);
		
		lblNewLabel_1 = new JLabel("\uBCC0\uACBD\uD560 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(29, 104, 96, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setBounds(29, 154, 89, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uBCC0\uACBD\uD560 \uC8FC\uC18C");
		lblNewLabel_3.setBounds(29, 204, 89, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\uBCC0\uACBD\uD560 \uC774\uB984");
		lblNewLabel_4.setBounds(29, 254, 89, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uBCC0\uACBD\uD560 \uC5F0\uB77D\uCC98");
		lblNewLabel_5.setBounds(29, 304, 89, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("\uBCC0\uACBD\uD560 \uC774\uBA54\uC77C");
		lblNewLabel_6.setBounds(29, 354, 89, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		lblNewLabel_7 = new JLabel("\uBCC0\uACBD\uD560 \uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_7.setBounds(29, 401, 96, 15);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
