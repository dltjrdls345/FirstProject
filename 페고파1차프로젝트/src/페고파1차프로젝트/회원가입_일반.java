package �����1��������Ʈ;

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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ȸ������_�Ϲ� {

	private JFrame frame;
	private JTextField ���̵�;
	private JTextField ��й�ȣ;
	private JTextField ��й�ȣȮ��;
	private JTextField �ּ�;
	private JTextField �̸�;
	private JTextField ����ó;
	private JTextField �̸���;
	private JTextField �������;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ȸ������_�Ϲ� window = new ȸ������_�Ϲ�();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ȸ������_�Ϲ�() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����");
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 454, 504);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		
		�̸� = new JTextField();
		�̸�.setColumns(10);
		�̸�.setBounds(155, 235, 248, 21);
		panel.add(�̸�);
		
		������� = new JTextField();
		�������.setBounds(155, 263, 248, 21);
		panel.add(�������);
		�������.setColumns(10);
		
		�ּ� = new JTextField();
		�ּ�.setColumns(10);
		�ּ�.setBounds(155, 294, 248, 21);
		panel.add(�ּ�);
		
		����ó = new JTextField();
		����ó.setColumns(10);
		����ó.setBounds(155, 325, 248, 21);
		panel.add(����ó);
		
		�̸��� = new JTextField();
		�̸���.setColumns(10);
		�̸���.setBounds(155, 370, 248, 21);
		panel.add(�̸���);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ȸ������â �ݱ�
				frame.dispose();
				//�α��������� �ҷ�����
				�α���������.main(null);
			}
		});
		btnNewButton.setBounds(50, 423, 97, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785\uC644\uB8CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ŭ���ϸ� ����Ǵ� �ڵ�
				�Ϲ�ȸ��_VO �Ϲ�vo = new �Ϲ�ȸ��_VO(���̵�.getText(), ��й�ȣ.getText(), �̸�.getText(), �������.getText(), �ּ�.getText(), ����ó.getText(), �̸���.getText());
				�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
				int cnt = 0;
				if (��й�ȣ.getText().equals(��й�ȣȮ��.getText())) {
					cnt = �Ϲ�dao.insert(�Ϲ�vo);
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
		btnNewButton_1.setBounds(306, 423, 97, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(62, 100, 57, 21);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPw.setBounds(62, 145, 57, 21);
		panel.add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(62, 294, 57, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setBounds(62, 235, 57, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setBounds(62, 325, 57, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_5.setBounds(62, 370, 57, 21);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("\uC77C\uBC18\uD68C\uC6D0 \uAC00\uC785");
		lblNewLabel_1.setFont(new Font("���ʷҹ���", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(50, 28, 166, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_5_1.setBounds(62, 190, 81, 21);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_6.setBounds(62, 266, 57, 15);
		panel.add(lblNewLabel_6);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 454, 504);
		frame.getContentPane().add(tabbedPane);
	}
}
