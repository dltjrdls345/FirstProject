package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 일반신청현황조회 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					일반신청현황조회 window = new 일반신청현황조회();
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
	public 일반신청현황조회() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 319, 461);
		frame.getContentPane().add(panel);
		
		JButton btn_뒤로가기 = new JButton("");
		btn_뒤로가기.setBounds(256, 0, 63, 53);
		btn_뒤로가기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btn_뒤로가기);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 84, 295, 356);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		
		String img20 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\20.png";
		Image image20 = new ImageIcon(img20).getImage();
		JLabel lbl_img20 = new JLabel(new ImageIcon(image20.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img20.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img20);

	}
}
