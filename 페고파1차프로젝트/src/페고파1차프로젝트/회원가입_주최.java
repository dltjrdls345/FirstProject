package �����1��������Ʈ;

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

public class ȸ������_���� {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField ���̵�;
	private JTextField ��й�ȣ;
	private JTextField ��й�ȣȮ��;
	private JTextField �ּ�;
	private JTextField �����;
	private JTextField ���ǿ���ó;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ȸ������_���� window = new ȸ������_����();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ȸ������_����() {
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
		
		���̵� = new JTextField();
		���̵�.setColumns(10);
		���̵�.setBounds(155, 100, 248, 21);
		panel.add(���̵�);
		
		��й�ȣ = new JTextField();
		��й�ȣ.setColumns(10);
		��й�ȣ.setBounds(155, 145, 248, 21);
		panel.add(��й�ȣ);
		
		��й�ȣȮ�� = new JTextField();
		��й�ȣȮ��.setColumns(10);
		��й�ȣȮ��.setBounds(155, 190, 248, 21);
		panel.add(��й�ȣȮ��);
		
		�ּ� = new JTextField();
		�ּ�.setColumns(10);
		�ּ�.setBounds(155, 280, 248, 21);
		panel.add(�ּ�);
		
		����� = new JTextField();
		�����.setColumns(10);
		�����.setBounds(155, 235, 248, 21);
		panel.add(�����);
		
		���ǿ���ó = new JTextField();
		���ǿ���ó.setColumns(10);
		���ǿ���ó.setBounds(155, 325, 248, 21);
		panel.add(���ǿ���ó);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ȸ������â �ݱ�
				frame.dispose();
				//�α��������� �ҷ�����
				�α���������.main(null);
			}
		});
		btnNewButton.setBounds(50, 400, 97, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ŭ���ϸ� ����Ǵ� �ڵ�
				����ȸ��_VO ����vo = new ����ȸ��_VO(���̵�.getText(), ��й�ȣ.getText(), �����.getText(), �ּ�.getText(), ���ǿ���ó.getText());
				����ȸ��_DAO ����dao = new ����ȸ��_DAO();
				int cnt = 0;
				if (��й�ȣ.getText().equals(��й�ȣȮ��.getText())) {
					cnt = ����dao.insert(����vo);
				}
				
				if(cnt > 0) {
					//�������� �˾��޽���
					JOptionPane.showMessageDialog(null, "ȸ������ ����! �α��� �������� �̵��մϴ�.");
					//ȸ������â �ݱ�
					frame.dispose();
					//�α��������� �ҷ�����
					�α���������.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "ȸ������ ���� : �ߺ��� ���̵�ų� ��й�ȣ�� �ٸ��ų� ��ĭ�� �ֽ��ϴ�.");
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
		lblNewLabel_1.setFont(new Font("���ʷҹ���", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(50, 28, 166, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_5.setBounds(62, 190, 81, 21);
		panel.add(lblNewLabel_5);
	}

}
