package �����1��������Ʈ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �α��������� {

	private JFrame frame;
	private JTextField ���̵�;
	private JPasswordField ��й�ȣ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�α��������� window = new �α���������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �α���������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����");
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		���̵� = new JTextField();
		���̵�.setBounds(166, 88, 205, 52);
		frame.getContentPane().add(���̵�);
		���̵�.setColumns(10);
		
		��й�ȣ = new JPasswordField();
		��й�ȣ.setBounds(166, 163, 205, 52);
		frame.getContentPane().add(��й�ȣ);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uC785\uB825");
		lblNewLabel.setBounds(70, 162, 84, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514 \uC785\uB825");
		lblId.setBounds(70, 87, 84, 52);
		frame.getContentPane().add(lblId);
		
		JButton btnNewButton = new JButton("\uC77C\uBC18\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//�α��� ��� ����
				
				�Ϲ�ȸ��_VO �Ϲ�vo = new �Ϲ�ȸ��_VO(���̵�.getText(), ��й�ȣ.getText());
				�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
				
				String result = �Ϲ�dao.logIN(�Ϲ�vo);
				
				if (result != null) {
					frame.dispose();
				} else {
				JOptionPane.showMessageDialog(null, "�α��ν��� : ���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			}
		});
		btnNewButton.setBounds(80, 245, 140, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC77C\uBC18\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ȸ������_�Ϲ�.main(null);
			}
		});
		btnNewButton_1.setBounds(122, 335, 205, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC8FC\uCD5C\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ȸ������_����.main(null);
			}
		});
		btnNewButton_1_1.setBounds(122, 397, 205, 52);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("\uC8FC\uCD5C\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//�α��� ��� ����
				
				����ȸ��_VO ����vo = new ����ȸ��_VO(���̵�.getText(), ��й�ȣ.getText());
				����ȸ��_DAO ����dao = new ����ȸ��_DAO();
				
				String result = ����dao.logIN(����vo);
				
				if (result != null) {
					frame.dispose();
				} else {
				JOptionPane.showMessageDialog(null, "�α��ν��� : ���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			}
		});
		btnNewButton_2.setBounds(232, 245, 140, 52);
		frame.getContentPane().add(btnNewButton_2);
	}
}
