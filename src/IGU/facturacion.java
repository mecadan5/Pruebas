package IGU;


import java.awt.EventQueue;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import IGU.ButtonColumn;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

import javax.swing.JTabbedPane;

import javax.swing.JTable;

import javax.swing.JScrollPane;

public class facturacion extends JFrame {

	
	
	private static final String PERSISTENCE_UNIT_NAME = null;
	private JPanel contentPane;
	private JTable table,table2,table3;
	
	
	

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
		label.setIcon(new ImageIcon(this.getClass().getResource("../assets/logochibcha.png")));
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
		btnFacturacin.setIcon(new ImageIcon(this.getClass().getResource("../assets/bill.png")));
		btnFacturacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFacturacin.setBounds(6, 141, 221, 84);
		contentPane.add(btnFacturacin);
		
		JButton btnGestionDeUsuarios = new JButton("Gestion de Usuarios");
		btnGestionDeUsuarios.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnGestionDeUsuarios.setIcon(new ImageIcon(this.getClass().getResource("../assets/user.png")));
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
		btnAgregarPaquete.setIcon(new ImageIcon(this.getClass().getResource("../assets/plus.png")));
		panel.add(btnAgregarPaquete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 68, 650, 467);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("gente");
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e ");
		List  a=q.getResultList();
		
		
								
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre de Paquete" ,"Editar","Borrar"
			}
		));
		
		JButton btnNewButton = new JButton("New button");
		scrollPane.setColumnHeaderView(btnNewButton);
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getTableHeader();
		
	int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		
		Action editar = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		Action eliminar = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		
		
		
		
		for (int i = 0; i < a.size(); i++) {
		Usuario usuario1= (Usuario) a.get(i);
		String b = a.get(i).toString();
		DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
		String datos[] = new String[3];
		datos[0]=usuario1.getNombre();
		
		modelo.addRow(datos);
		
		
		
		}
		
		
		ButtonColumn botonEditar = new ButtonColumn(table, editar, 1);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonEliminar = new ButtonColumn(table, eliminar, 2);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		
		
		
		
		
				
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comisiones", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 6, 650, 529);
		panel_1.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setViewportView(table2);
		table2.setFillsViewportHeight(true);
		table2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table2.setToolTipText("");
		
	/*Object fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e ");
		List  a=q.getResultList();*/
		
		
								
		
		
		table2.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre Distribuidor" ,"Aprobada","Mes","Monto","Aprobar","Editar","Borrar"
			}
		));
		
	
		table2.getColumnModel().getColumn(0).setPreferredWidth(300);
		table2.getColumnModel().getColumn(1).setPreferredWidth(100);
		table2.getColumnModel().getColumn(2).setPreferredWidth(100);
		table2.getColumnModel().getColumn(3).setPreferredWidth(300);
		table2.getColumnModel().getColumn(4).setPreferredWidth(100);
		table2.getColumnModel().getColumn(5).setPreferredWidth(100);
		table2.getColumnModel().getColumn(6).setPreferredWidth(100);
		table2.getTableHeader();
		
	int numRows2 = table2.getRowCount();
		int numCols2 = table2.getColumnCount();
		
		Action editarCom = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table2 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table2.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		Action aprobarCom = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table2 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table2.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		Action eliminarCom = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table2 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table2.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		
		for (int i = 0; i <15; i++) {
			
			DefaultTableModel modelo = (DefaultTableModel)this.table2.getModel();
			String datos[] = new String[7];
			for (int j = 0; j<7; j++) {
			datos[j]="Algo"+j;
			}
		
			modelo.addRow(datos);

			}
		
		/*
		for (int i = 0; i < a.size(); i++) {
		Usuario usuario1= (Usuario) a.get(i);
		String b = a.get(i).toString();
		DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
		String datos[] = new String[4];
		datos[0]=String.valueOf(usuario1.getId());
		datos[1]=usuario1.getcontrasenia();
		datos[2]=usuario1.getNombre();
		datos[3]=b.substring(7);
		modelo.addRow(datos);
		
		
		//modelo.addRow(gay,gay2,gay3);
		}*/
		ButtonColumn botonEditarCom = new ButtonColumn(table2, editarCom, 6);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonEliminarCom = new ButtonColumn(table2, eliminarCom, 7);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonAprobarCom = new ButtonColumn(table2, aprobarCom, 5);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Peticiones de Compra", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(6, 6, 650, 542);
		panel_2.add(scrollPane_3);
		
		table3 = new JTable();
		scrollPane_3.setViewportView(table3);
		table3.setFillsViewportHeight(true);
		table3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table3.setToolTipText("");
		
	/*Object fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = fabrica.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e ");
		List  a=q.getResultList();*/

		table3.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre Cliente","Paquete" ,"Aprobado","Fecha","Monto","Aprobar","Editar","Borrar"
			}
		));
		
		
		table3.getColumnModel().getColumn(0).setPreferredWidth(300);
		table3.getColumnModel().getColumn(1).setPreferredWidth(100);
		table3.getColumnModel().getColumn(2).setPreferredWidth(100);
		table3.getColumnModel().getColumn(3).setPreferredWidth(300);
		table3.getColumnModel().getColumn(4).setPreferredWidth(100);
		table3.getColumnModel().getColumn(5).setPreferredWidth(100);
		table3.getColumnModel().getColumn(6).setPreferredWidth(100);
		table3.getColumnModel().getColumn(6).setPreferredWidth(100);
		table3.getTableHeader();
		
	int numRows3 = table2.getRowCount();
		int numCols3 = table2.getColumnCount();
		
		Action editarPet = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table3 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table3.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		Action aprobarPet = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table3 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table3.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		Action eliminarPet = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table2 = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table2.getModel()).removeRow(modelRow);
		        JOptionPane.showMessageDialog(null,"Hola"); 
		   
		    }
		};
		
		for (int i = 0; i <15; i++) {
			
			DefaultTableModel modelo = (DefaultTableModel)this.table3.getModel();
			String datos[] = new String[8];
			for (int j = 0; j<8; j++) {
			datos[j]="Algo"+j;
			}
			modelo.addRow(datos);

			}
		
		/*
		for (int i = 0; i < a.size(); i++) {
		Usuario usuario1= (Usuario) a.get(i);
		String b = a.get(i).toString();
		DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
		String datos[] = new String[4];
		datos[0]=String.valueOf(usuario1.getId());
		datos[1]=usuario1.getcontrasenia();
		datos[2]=usuario1.getNombre();
		datos[3]=b.substring(7);
		modelo.addRow(datos);
		
		
		//modelo.addRow(gay,gay2,gay3);
		}*/
		ButtonColumn botonEditarPet = new ButtonColumn(table3, editarCom, 7);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonEliminarPet = new ButtonColumn(table3, eliminarCom, 8);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonAprobarPet = new ButtonColumn(table3, aprobarCom, 6);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		
		
		
		
	}
	}

