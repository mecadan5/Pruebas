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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pruebita extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebita frame = new pruebita();
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
	public pruebita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("../assets/logochibcha.png")));
		label.setBounds(65, 6, 396, 104);
		contentPane.add(label);
		
		JLabel lblInicioDeSesion = new JLabel("Pruebita");
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(124, 113, 266, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario");
		lblUsuario.setForeground(new Color(204, 153, 0));
		lblUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(124, 157, 266, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblRolDeUsuario = new JLabel("Rol de Usuario");
		lblRolDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblRolDeUsuario.setForeground(new Color(51, 153, 255));
		lblRolDeUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblRolDeUsuario.setBounds(124, 185, 266, 16);
		contentPane.add(lblRolDeUsuario);
		
		JButton btnFacturacin = new JButton("Facturaci\u00F3n");
		btnFacturacin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				facturacion facti = new facturacion();
			
			}
		});
		btnFacturacin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnFacturacin.setIcon(new ImageIcon(this.getClass().getResource("../assets/bill.png")));
		
		btnFacturacin.setBounds(65, 244, 149, 84);
		contentPane.add(btnFacturacin);
		
		JButton btnGestionDeUsuarios = new JButton("Gestion de Usuarios");
		btnGestionDeUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usuarios user = new usuarios();
				user.setVisible(true);
			}
		});
		btnGestionDeUsuarios.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnGestionDeUsuarios.setIcon(new ImageIcon(this.getClass().getResource("../assets/profile.png")));
		
		btnGestionDeUsuarios.setBounds(273, 244, 215, 84);
		contentPane.add(btnGestionDeUsuarios);
	}
}
