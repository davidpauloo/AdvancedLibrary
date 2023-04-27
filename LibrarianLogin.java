package LibrarianLog;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import NULibrary.WelcomeSystem;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin {

	private JFrame frmAdminLogin;
	private JTextField usernamefield2;
	private JPasswordField passwordfield2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin window = new LibrarianLogin();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setTitle("LIBRARIAN LOGIN");
		frmAdminLogin.setBounds(100, 100, 450, 300);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 61, 98, 20);
		frmAdminLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(48, 141, 98, 14);
		frmAdminLogin.getContentPane().add(lblPassword);
		
		usernamefield2 = new JTextField();
		usernamefield2.setBounds(48, 88, 236, 31);
		frmAdminLogin.getContentPane().add(usernamefield2);
		usernamefield2.setColumns(10);
		
		passwordfield2 = new JPasswordField();
		passwordfield2.setBounds(48, 166, 236, 31);
		frmAdminLogin.getContentPane().add(passwordfield2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String libuser = usernamefield2.getText();
				String libpass = passwordfield2.getText();
				   
				String [] userlib = {"Librarian_01", "Librarian_02", "Librarian_03"};
				String [] passlib = {"LibOne", "LibTwo", "LibThree"};
				
				  if(libuser.contains(userlib[0]) && libpass.contains(passlib[0])) {
					  usernamefield2.setText(null);
					  passwordfield2.setText(null);
					  
					  WelcomeSystem.main(null); }
					  
					  else if (libuser.contains(userlib[1]) && libpass.contains(passlib[1])) {
						  usernamefield2.setText(null);
						  passwordfield2.setText(null);
						  
						  WelcomeSystem.main(null);	}
					 
					  else if (libuser.contains(userlib[2]) && libpass.contains(passlib[2])) {
						  usernamefield2.setText(null);
						  passwordfield2.setText(null);
						  
						  WelcomeSystem.main(null);	  
			}
		}});
		btnNewButton.setFont(UIManager.getFont("FileChooser.listFont"));
		btnNewButton.setBounds(48, 208, 89, 23);
		frmAdminLogin.getContentPane().add(btnNewButton);
		
		
	}
}
