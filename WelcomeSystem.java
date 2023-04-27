package NULibrary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;

public class WelcomeSystem {

	private JFrame frmNuLibrarySystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeSystem window = new WelcomeSystem();
					window.frmNuLibrarySystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuLibrarySystem = new JFrame();
		frmNuLibrarySystem.setTitle("SUCCESSFULLY LOGIN!");
		frmNuLibrarySystem.setBounds(100, 100, 450, 300);
		frmNuLibrarySystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuLibrarySystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\" Welcome to NU Library System \"");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(71, 97, 299, 48);
		frmNuLibrarySystem.getContentPane().add(lblNewLabel);
	}

}
