package AdminLog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

import NULibrary.WelcomeSystem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin {

	private JFrame frmAdminLogin;
	private JTextField usernamefield1;
	private JPasswordField passwordfield1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setTitle("ADMIN LOGIN");
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
		
		usernamefield1 = new JTextField();
		usernamefield1.setBounds(48, 88, 236, 31);
		frmAdminLogin.getContentPane().add(usernamefield1);
		usernamefield1.setColumns(10);
		
		passwordfield1 = new JPasswordField();
		passwordfield1.setBounds(48, 166, 236, 31);
		frmAdminLogin.getContentPane().add(passwordfield1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String adminuser = usernamefield1.getText();
				String adminpass = passwordfield1.getText();
				   
				String [] useradmin = {"Admin_01", "Admin_02", "Admin_03"};
				String [] passadmin = {"AdminOne", "AdminTwo", "AdminThree"};
				
				  if(adminuser.contains(useradmin[0]) && adminpass.contains(passadmin[0])) {
					  usernamefield1.setText(null);
					  passwordfield1.setText(null);
					  
					  WelcomeSystem.main(null); }
					  
					  else if (adminuser.contains(useradmin[1]) && adminpass.contains(passadmin[1])) {
						  usernamefield1.setText(null);
						  passwordfield1.setText(null);
						  
						  WelcomeSystem.main(null);	}
					 
					  else if (adminuser.contains(useradmin[2]) && adminpass.contains(passadmin[2])) {
						  usernamefield1.setText(null);
						  passwordfield1.setText(null);
						  
						  WelcomeSystem.main(null);	  
					
						  
					  
				  }
			}
		});
		btnNewButton.setFont(UIManager.getFont("FileChooser.listFont"));
		btnNewButton.setBounds(48, 208, 89, 23);
		frmAdminLogin.getContentPane().add(btnNewButton);
	}
}
