package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class agregarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarUsuario frame = new agregarUsuario();
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
	public agregarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(UIManager.getColor("Button.disabledText"));
		txtUsuario.setText("Nombre");
		txtUsuario.setBounds(57, 155, 266, 45);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setForeground(UIManager.getColor("Button.disabledText"));
		txtContrasea.setBackground(UIManager.getColor("Button.highlight"));
		txtContrasea.setText("Email");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(57, 212, 266, 45);
		contentPane.add(txtContrasea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/ChibchaWeb/assets/user.png"));
		label.setBounds(28, 6, 51, 104);
		contentPane.add(label);
		
		JLabel lblInicioDeSesion = new JLabel("Agregar Usuario");
		lblInicioDeSesion.setIcon(new ImageIcon(agregarUsuario.class.getResource("/assets/package.png")));
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(46, 34, 297, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Por favor ingrese los datos solicitados");
		lblUsuario.setBounds(93, 90, 186, 16);
		contentPane.add(lblUsuario);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setIcon(new ImageIcon(agregarUsuario.class.getResource("/assets/plus.png")));
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 336, 117, 36);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rol"}));
		comboBox.setToolTipText("Rol");
		comboBox.setBounds(57, 267, 266, 57);
		contentPane.add(comboBox);
	}
}
