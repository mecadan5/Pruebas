package IGU;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import javax.swing.JTabbedPane;

import javax.swing.JTable;

import javax.swing.JScrollPane;

public class facturacion extends JFrame {

	
	private static final String PERSISTENCE_UNIT_NAME = null;
	private JPanel contentPane;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facturacion frame = new facturacion();
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
	public facturacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 7500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/ChibchaWeb/assets/logochibcha.png"));
		label.setBounds(28, 6, 396, 104);
		contentPane.add(label);
		
		JLabel lblInicioDeSesion = new JLabel("Zona de Administraci\u00F3n para ");
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.LEFT);
		lblInicioDeSesion.setBounds(612, 43, 232, 25);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		lblUsuario_1.setBounds(843, 43, 86, 25);
		contentPane.add(lblUsuario_1);
		
		JLabel lblRolDeUsuario = new JLabel("Rol de Usuario");
		lblRolDeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblRolDeUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblRolDeUsuario.setBounds(837, 69, 92, 25);
		contentPane.add(lblRolDeUsuario);
		
		JButton btnFacturacin = new JButton("Facturaci\u00F3n");
		btnFacturacin.setEnabled(false);
		btnFacturacin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnFacturacin.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/chibchaweb/assets/bill.png"));
		btnFacturacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFacturacin.setBounds(6, 141, 221, 84);
		contentPane.add(btnFacturacin);
		
		JButton btnGestionDeUsuarios = new JButton("Gestion de Usuarios");
		btnGestionDeUsuarios.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnGestionDeUsuarios.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/chibchaweb/assets/user.png"));
		btnGestionDeUsuarios.setBounds(6, 249, 221, 84);
		contentPane.add(btnGestionDeUsuarios);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.setBounds(246, 141, 683, 600);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Paquetes", null, panel, null);
		panel.setLayout(null);
		
		JButton btnAgregarPaquete = new JButton("Agregar Paquete");
		btnAgregarPaquete.setBounds(469, 6, 187, 45);
		btnAgregarPaquete.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/ChibchaWeb/assets/plus.png"));
		panel.add(btnAgregarPaquete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 68, 650, 467);
		panel.add(scrollPane);
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		
		Object fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = ((EntityManagerFactory) fabrica).createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e ");
		List  a=q.getResultList();
		table.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre de Paquete","Opciones de Gestión"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		table.getTableHeader();
		
		
				
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comisiones", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 6, 650, 529);
		panel_1.add(scrollPane_1);
		JTable table1 = new JTable();
		scrollPane_1.setViewportView(table1);
		table1.setFillsViewportHeight(true);
		table1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.setToolTipText("");
		
	
	
		Query q1 = em.createQuery("SELECT e FROM Usuario e ");
		List  a1=q1.getResultList();
		table1.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre Distribuidor","Aprobada","Mes","Monto","Opciones de Gestión"
			}
		));
		table1.getColumnModel().getColumn(0).setPreferredWidth(180);
		table1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table1.getColumnModel().getColumn(2).setPreferredWidth(100);
		table1.getColumnModel().getColumn(3).setPreferredWidth(100);
		table1.getColumnModel().getColumn(4).setPreferredWidth(200);
		
		table1.getTableHeader();
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Peticiones de Compra", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 6, 650, 542);
		panel_2.add(scrollPane_2);
		
		JTable table2 = new JTable();
		scrollPane_2.setViewportView(table2);
		table2.setFillsViewportHeight(true);
		table2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table2.setToolTipText("");
		
	
	
		Query q2 = em.createQuery("SELECT e FROM Usuario e ");
		List  a2=q2.getResultList();
		table2.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre Cliente","Paquete","Aprobado","Fecha","Opciones de Gestión"
			}
		));
		table2.getColumnModel().getColumn(0).setPreferredWidth(180);
		table2.getColumnModel().getColumn(1).setPreferredWidth(100);
		table2.getColumnModel().getColumn(2).setPreferredWidth(100);
		table2.getColumnModel().getColumn(3).setPreferredWidth(100);
		table2.getColumnModel().getColumn(4).setPreferredWidth(200);
		
		table2.getTableHeader();
		
		
		
	}
	}

