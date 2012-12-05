package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

import modelo.Usuario;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasea;
	private String usuario;
	private String contasenia;
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private EntityManagerFactory fabrica;
	
	public String getUsuario() {
		this.usuario = txtUsuario.getText();
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContasenia() {
		this.contasenia = txtContrasea.getText();
		return contasenia;
	}

	public void setContasenia(String contasenia) {
		this.contasenia = contasenia;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(UIManager.getColor("Button.disabledText"));
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(88, 243, 266, 45);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JPasswordField();
		txtContrasea.setForeground(UIManager.getColor("Button.disabledText"));
		txtContrasea.setBackground(UIManager.getColor("Button.highlight"));
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(88, 318, 266, 45);
		contentPane.add(txtContrasea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/ChibchaWeb/assets/logochibcha.png"));
		label.setBounds(28, 6, 396, 104);
		contentPane.add(label);
		
		JLabel lblInicioDeSesion = new JLabel("Inicio de Sesi\u00F3n");
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(88, 116, 266, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Por Favor ingrese su usuario y contrase\u00F1a");
		lblUsuario.setBounds(88, 185, 266, 16);
		contentPane.add(lblUsuario);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					
				
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.nombre = :primerNombre AND e.contrasenia = :contrasenia");
				q.setParameter("primerNombre",getUsuario() );//campo de arriba "Juana_0"  getUsuario()   "sssss"
				q.setParameter("contrasenia", getContasenia() );//campo de abajo "de Asnab"  getContasenia()      "sss"
				Usuario usuario1 = (Usuario) q.getSingleResult();
				List a =q.getResultList();
				a.size();
				String b = a.get(0).toString();
				if(b.indexOf("Registrador")==7){
					System.out.println("Es registrador");
					IguRegistrador frame = new IguRegistrador();
					frame.setVisible(true);
					contentPane.setVisible(false);
								}
				if(b.indexOf("Esposa")==7){
					System.out.println("Es Esposa");
					JOptionPane.showMessageDialog(null, "El Aplicativo no esta preparado para los beneficiarios pronto estara");
								}
				if(b.indexOf("Poligamo")==7){
					System.out.println("Es Poligamo");
					JOptionPane.showMessageDialog(null, "El Aplicativo no esta preparado para los Afiliados pronto estara");
								}
				if(b.indexOf("Administrador")==7){
					System.out.println("Administrador");
					IguAdministrador frame = new IguAdministrador();
					frame.setVisible(true);
					contentPane.setVisible(false);
								}
				System.out.println(usuario1.getcontrasenia());
				em.getTransaction().commit();
				em.close();
				
				
			}
		});
		btnNewButton.setBounds(237, 391, 117, 36);
		contentPane.add(btnNewButton);
		
	}
}
