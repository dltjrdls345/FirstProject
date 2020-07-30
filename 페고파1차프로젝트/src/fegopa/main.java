package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class main {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("페고파");
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String img1 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\1.png";
		Image image1 = new ImageIcon(img1).getImage();
		JLabel lbl_img1 = new JLabel(new ImageIcon(image1.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img1.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img1);
		
		JPanel panel_nextpg = new JPanel();
		panel_nextpg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main1.main(null);
				
			}
		});
		panel_nextpg.setLayout(null);
		panel_nextpg.setBackground(Color.YELLOW);
		panel_nextpg.setBounds(246, 202, 79, 57);
		frame.getContentPane().add(panel_nextpg);
		
		
	}
}
