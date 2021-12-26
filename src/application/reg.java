package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg frame = new reg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public reg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFaceDetectionSystem = new JLabel("FACE DETECTION SYSTEM");
		lblFaceDetectionSystem.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFaceDetectionSystem.setBounds(62, 11, 394, 64);
		contentPane.add(lblFaceDetectionSystem);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main1 m = new Main1();
				String[] args= {};
				m.main(args);
			}
			
		});
		btnNewButton.setBounds(105, 232, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enable Security");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				String[] args= {};
				m.main(args);
			}
		});
		btnNewButton_1.setBounds(322, 232, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogBook = new JButton("Log Book");
		btnLogBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				LogBook l = new LogBook();
				l.setVisible(true);
			}
		});
		btnLogBook.setBounds(206, 284, 89, 23);
		contentPane.add(btnLogBook);
	}
}
