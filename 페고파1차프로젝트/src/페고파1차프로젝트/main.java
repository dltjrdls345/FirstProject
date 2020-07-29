package 페고파1차프로젝트;

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

public class main {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;

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
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(124, 129, 197, 149);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 61, 116, 21);
		textField.setText("\uB85C\uACE0");
		textField.setToolTipText("");
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_next = new JPanel();
		panel_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main1.main(null);
				
			}
		});
		panel_next.setLayout(null);
		panel_next.setBackground(Color.YELLOW);
		panel_next.setBounds(351, 183, 79, 57);
		frame.getContentPane().add(panel_next);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC55E\uC73C\uB85C");
		textField_2.setColumns(10);
		textField_2.setBounds(25, 10, 42, 21);
		panel_next.add(textField_2);
		
	}
}
