package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import modelo.Esposa;
import modelo.Usuario;

import org.omg.CORBA.PRIVATE_MEMBER;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private String usuario;
	private String contasenia;
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private EntityManagerFactory fabrica;
	
	public String getUsuario() {
		this.usuario = textField.getText();
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContasenia() {
		this.contasenia = passwordField.getText();
		return contasenia;
	}

	public void setContasenia(String contasenia) {
		this.contasenia = contasenia;
	}


	
	public JTextField getTextField() {
		
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 172, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(32, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.getText();
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(49, 41, 69, 14);
		contentPane.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(32, 118, 86, 20);
		contentPane.add(passwordField);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(42, 97, 100, 14);
		contentPane.add(lblContrasea);
		
		JButton btnValidar = new JButton("VALIDAR");
		
		
		btnValidar.addMouseListener(new MouseAdapter() {
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
		btnValidar.setBounds(32, 152, 89, 23);
		contentPane.add(btnValidar);
	}
}
