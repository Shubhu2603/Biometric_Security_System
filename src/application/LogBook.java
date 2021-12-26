package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.swing.ListSelectionModel;

public class LogBook extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogBook frame = new LogBook();
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
	public LogBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadDetails = new JButton("Load Details");
		btnLoadDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					 String Database_name = "ghosteye";
					 String Database_user = "root";
					 String Database_pass = "root";
					Class.forName("com.mysql.jdbc.Driver");
					DateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm");
					Date d= new Date();
					String time=df.format(d);
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Database_name, Database_user,
							Database_pass);
					int a=0;
					
					
					Statement st = (Statement) con.createStatement();
					
					ResultSet rs = st.executeQuery("Select * from LogBook");
					
					DefaultTableModel dt= (DefaultTableModel)table.getModel();
					while(rs.next())
					{
						
						Object o[]= {rs.getString(1),rs.getString(2)};
						System.out.println(rs.getString(1));
						System.out.println(rs.getString(2));
//			//			
											
							dt.addRow(o);
					
					
					}
					
					
		
		
					
				} catch (SQLException e1) {

					
					System.out.println(e1.getMessage());

					

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		btnLoadDetails.setBounds(107, 228, 240, 23);
		contentPane.add(btnLoadDetails);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 38, 341, 169);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "DateTime"
			}
		));
		scrollPane.setViewportView(table);
	}
}
