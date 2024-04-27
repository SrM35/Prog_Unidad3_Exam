package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	
	String nombreUsuario;
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
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.login(frame);
	}
	
	public void login(JFrame frame) {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(0, 0, 128));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuario");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_2);
		
		ImagePanel panel = new ImagePanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(150, 75, 320, 285);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(39, 139, 238, 20);
		textField.setBorder(null);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(39, 191, 238, 20);
		passwordField.setBorder(null);
		panel_1.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(39, 158, 238, 2);
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(39, 210, 238, 2);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 114, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		panel.add(lblNewLabel);
	
		JLabel person2 = new JLabel(new ImageIcon(getClass().getResource("personA.png")));
		person2.setLocation(125, 25);
		person2.setSize(75, 75);
		panel_1.add(person2);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(39, 117, 109, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(39, 170, 109, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setBounds(122, 237, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean userState = false, passState = false;
				
				if(textField.getText().length() <= 0) {
					panel_2.setBackground(Color.red);
				} else {
					panel_2.setBackground(new Color(0, 0, 0));
					userState = true;
				}
				
				String contrasenia = new String(passwordField.getPassword());
				
				if (contrasenia.length() <= 0) {
					panel_2_1.setBackground(Color.red);
				} else {
					panel_2_1.setBackground(new Color(0, 0, 0));
					passState = true;
				}
				
				if(passState && userState) {
					nombreUsuario = textField.getText();
					JOptionPane.showMessageDialog(null, "dasdasdasdsad");
					frame.getContentPane().remove(panel);
					frame.getContentPane().remove(menuBar);
					frame.getContentPane().repaint();
					frame.getContentPane().revalidate();
					
					menuInicio(frame);
				}
				
			}
			
		});
		panel_1.add(btnNewButton);
	}
	
	public void menuInicio(JFrame frame) {
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Hola " +nombreUsuario+"!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(166, 123, 312, 122);
		panel.add(lblNewLabel_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(0, 0, 128));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuario");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_2);
		
		
	}
}
