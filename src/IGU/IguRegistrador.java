
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
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import modelo.Esposa;
import modelo.Transaccion;
import modelo.Usuario;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class IguRegistrador extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAfiliado;
	private String usuario;
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private EntityManagerFactory fabrica;
	private JTextField textField_compra;
	private JTextField textField_fecompra;
	
	public String getUsuario() {
		this.usuario = textFieldAfiliado.getText();
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	


	
	public JTextField getTextField() {
		
		return textFieldAfiliado;
	}

	public void setTextField(JTextField textField) {
		this.textFieldAfiliado = textField;
	}

	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IguRegistrador frame = new IguRegistrador();
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
	public IguRegistrador() {
		setTitle("REGISTRAR COMPRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldAfiliado = new JTextField();
		textFieldAfiliado.setBounds(10, 64, 125, 22);
		contentPane.add(textFieldAfiliado);
		textFieldAfiliado.setColumns(10);
		textFieldAfiliado.getText();
		JLabel lblUsuario = new JLabel("idBeneficiario");
		lblUsuario.setBounds(10, 39, 138, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Valor de Compra");
		lblContrasea.setBounds(171, 39, 100, 14);
		contentPane.add(lblContrasea);
		
		JButton btnValidar = new JButton("Efectuar Compra");
		
		
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/*System.out.println(getContasenia());
				System.out.println("ddd");
				System.out.println(getUsuario());*/
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id2");
				q.setParameter("id2", Integer.parseInt(textFieldAfiliado.getText()));
				Esposa usuario = (Esposa) q.getSingleResult();
				//System.out.println(usuario.getcupo_asignado());
				
				Transaccion compra = new Transaccion();
				compra.setFecha(Integer.parseInt(textField_fecompra.getText()));
				compra.setMonto(Integer.parseInt(textField_compra.getText()));
				em.persist(compra);
								
				usuario.getCompra().add(compra);
				
				em.persist(usuario);
				em.getTransaction().commit();
				em.close();
				
				
			}
		});
		btnValidar.setBounds(437, 64, 145, 23);
		contentPane.add(btnValidar);
		
		textField_compra = new JTextField();
		textField_compra.setBounds(171, 65, 96, 20);
		contentPane.add(textField_compra);
		textField_compra.setColumns(10);
		
		JLabel lblFechaDeLa = new JLabel("Fecha de la compra");
		lblFechaDeLa.setBounds(301, 39, 138, 14);
		contentPane.add(lblFechaDeLa);
		
		textField_fecompra = new JTextField();
		textField_fecompra.setBounds(301, 65, 86, 20);
		contentPane.add(textField_fecompra);
		textField_fecompra.setColumns(10);
	}
}
