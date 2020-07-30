package fegopa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main3 window = new main3();
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
	public main3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Æä°íÆÄ");
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
		textField.setText("\uC548\uB0B4 \uBC14\uB85C\uAC00\uAE30 \uBC84\uD2BC");
		textField.setToolTipText("");
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_back = new JPanel();
		panel_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main2.main(null);
			}
		});
		panel_back.setBackground(Color.YELLOW);
		panel_back.setBounds(12, 194, 79, 57);
		frame.getContentPane().add(panel_back);
		panel_back.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 10, 42, 21);
		textField_1.setText("\uB4A4\uB85C");
		panel_back.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_next = new JPanel();
		panel_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				
				
				
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
