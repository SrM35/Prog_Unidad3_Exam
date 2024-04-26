package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Examen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
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
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(65, 65, 65));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuario");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Preguntas f.");
		menuBar.add(mnNewMenu_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
	}

}
