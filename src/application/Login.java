package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Vrinda", Font.PLAIN, 18));
		lblNewLabel.setBounds(364, 81, 77, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(316, 127, 221, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					String name=textField.getText();
					String pass=passwordField.getText().toString();
					
					
					if(name.equals("admin")&&pass.equals("admin")) 
					{
						JOptionPane.showMessageDialog(null, "Login Sucessfull");
						reg r= new reg();
						r.setVisible(true);

						
								
					}else 
					{
						JOptionPane.showMessageDialog(null, "Login Failed");
						
					}
					
				}
				catch(Exception e1) {}
				
				
			}
		});
		btnNewButton.setBounds(331, 238, 155, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(205, 129, 62, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(205, 181, 62, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(316, 178, 221, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Door Unlocking via Face Recognition Based on IoT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(87, 11, 563, 31);
		contentPane.add(lblNewLabel_2);
	}
}
