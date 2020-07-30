package fegopa;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class img {

	private JFrame frame;
	Image image1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					img window = new img();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public img() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//		절대경로 찾기..?
//		String url = getClass().getResource("").getPath();
//		System.out.println(url);
//		image1 = new ImageIcon(url + "1.png").getImage();
	
		
		String img1 = "C:\\Users\\SMT082\\git\\FirstProject\\페고파1차프로젝트\\image\\1.png";
		Image image1 = new ImageIcon(img1).getImage();
		JLabel lbl_img1 = new JLabel(new ImageIcon(image1.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img1.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img1);

	}

}
