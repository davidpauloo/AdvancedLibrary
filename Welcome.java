package LibraryWelcome;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;

import AdminLog.AdminLogin;
import LibrarianLog.LibrarianLogin;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
	

public class Welcome {

	private JFrame frmWelcomeToThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmWelcomeToThe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToThe = new JFrame();
		frmWelcomeToThe.setForeground(new Color(0, 0, 205));
		frmWelcomeToThe.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 12));
		frmWelcomeToThe.setTitle("Welcome to the Library!");
		frmWelcomeToThe.setBounds(100, 100, 450, 300);
		frmWelcomeToThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToThe.getContentPane().setLayout(null);
		
		JLabel Welcome = new JLabel("Library Management");
		Welcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		Welcome.setBounds(141, 11, 156, 31);
		frmWelcomeToThe.getContentPane().add(Welcome);
		
		JButton forAdmin = new JButton("ADMIN LOGIN");
		forAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminLogin.main(null);
			}
		});
		forAdmin.setForeground(new Color(0, 100, 0));
		forAdmin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		forAdmin.setBounds(141, 74, 156, 40);
		frmWelcomeToThe.getContentPane().add(forAdmin);
		
		JButton forLibrarian = new JButton("LIBRARIAN LOGIN");
		forLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LibrarianLogin.main(null);
			}
		});
		forLibrarian.setForeground(new Color(0, 100, 0));
		forLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 12));
		forLibrarian.setBounds(141, 173, 156, 40);
		frmWelcomeToThe.getContentPane().add(forLibrarian);
	}

}
