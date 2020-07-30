package fegopa;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 마이페이지_일반 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					마이페이지_일반 window = new 마이페이지_일반();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 마이페이지_일반() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(264, 10, 67, 48);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(224, 83, 107, 27);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("\uBD80\uC2A4\uC2E0\uCCAD");
		btnNewButton_1_1.setBounds(30, 164, 280, 55);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_2 = new JButton("\uBD80\uC2A4\uC2E0\uCCAD\uC11C_\uC218/\uC0AD");
		btnNewButton_1_1_2.setBounds(30, 244, 269, 60);
		frame.getContentPane().add(btnNewButton_1_1_2);

		JButton btnNewButton_1_1_3 = new JButton("\uC2E0\uCCAD\uD604\uD669\uC870\uD68C");
		btnNewButton_1_1_3.setBounds(30, 324, 269, 60);
		frame.getContentPane().add(btnNewButton_1_1_3);

		JButton btnNewButton_1_1_4 = new JButton("\uAC1C\uC778\uC815\uBCF4 \uC218/\uD0C8");
		btnNewButton_1_1_4.setBounds(30, 405, 269, 66);
		frame.getContentPane().add(btnNewButton_1_1_4);

		JLabel lbl_기관명 = new JLabel("\uC131\uBA85\uB744\uC6B0\uAE30");
		lbl_기관명.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_기관명.setBounds(72, 78, 92, 32);
		frame.getContentPane().add(lbl_기관명);

		JLabel lbl_연락처 = new JLabel("\uC774\uBA54\uC77C\uB744\uC704\uAE30");
		lbl_연락처.setBounds(72, 114, 92, 15);
		frame.getContentPane().add(lbl_연락처);

		String url = getClass().getResource("").getPath();
		System.out.print(url);
		Image image17 = new ImageIcon(url + "image/17.png").getImage();
		JLabel lbl_img17 = new JLabel(new ImageIcon(image17.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img17.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img17);

	}

}
