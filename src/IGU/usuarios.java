package IGU;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
import javax.swing.JTextField;

import modelo.PaqueteHosting;
import modelo.Usuario;

import java.awt.Color;
import java.util.List;

public class usuarios{

	
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private JPanel contentPane;
	private JTextField txtIntroduzcaNombreUsuario;
	private JTable table;
	private JTable tablez;
	JFrame frame= new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuarios frame = new usuarios();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public usuarios() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 960, 750);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);frame.setVisible(true);
		
		JLabel label = new JLabel("");
		
		label.setIcon(new ImageIcon(this.getClass().getResource("../assets/logochibcha.png")));
		
		label.setBounds(24, 6, 396, 104);
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
		btnFacturacin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

		btnFacturacin.setIcon(new ImageIcon(this.getClass().getResource("../assets/bill.png")));
		
		btnFacturacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facturacion fact = new facturacion();
				fact.setVisible(true);
				
			}
		});
		btnFacturacin.setBounds(6, 141, 221, 84);
		//contentPane.add(btnFacturacin);
		
		JButton btnGestionDeUsuarios = new JButton("Gestion de Usuarios");
		btnGestionDeUsuarios.setEnabled(false);
		btnGestionDeUsuarios.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnGestionDeUsuarios.setIcon(new ImageIcon(this.getClass().getResource("../assets/user.png")));
		
		btnGestionDeUsuarios.setBounds(6, 249, 221, 84);
		//contentPane.add(btnGestionDeUsuarios);
		
		JPanel panel = new JPanel();
		panel.setBounds(239, 141, 690, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		lblBusqueda.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblBusqueda.setIcon(new ImageIcon(this.getClass().getResource("../assets/search.png")));
		
		lblBusqueda.setBounds(25, 26, 151, 32);
		panel.add(lblBusqueda);
		
		txtIntroduzcaNombreUsuario = new JTextField();
		txtIntroduzcaNombreUsuario.setForeground(Color.GRAY);
		txtIntroduzcaNombreUsuario.setText("Introduzca Nombre Usuario");
		txtIntroduzcaNombreUsuario.setBounds(156, 23, 198, 40);
		panel.add(txtIntroduzcaNombreUsuario);
		txtIntroduzcaNombreUsuario.setColumns(10);
		
		JButton button = new JButton("Agregar Usuario");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarUsuario usu=new agregarUsuario();
				usu.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(this.getClass().getResource("../assets/plus.png")));
		button.setBounds(497, 18, 187, 45);
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 76, 678, 400);
		panel.add(scrollPane);
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		
		
		JTable table2 = new JTable();
		scrollPane.setViewportView(table2);
		table2.setFillsViewportHeight(true);
		table2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table2.setToolTipText("");
		
		//Object fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		//EntityManager em = ((EntityManagerFactory) fabrica).createEntityManager();
		//em.getTransaction().begin();
		//Query q = em.createQuery("SELECT e FROM Usuario e ");
		//List  a=q.getResultList();
		
								
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre", "E-Mail" ,"Tipo De Usuario","Editar","Borrar"
			}
		));
		
		
		///
		
		JTable tablez = new JTable();
		scrollPane.setViewportView(tablez);
		tablez.setFillsViewportHeight(true);
		tablez.setBorder( new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablez.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablez.setToolTipText("");
		
		EntityManagerFactory fabrica2 = Persistence.createEntityManagerFactory("gente");
		EntityManager em2 = fabrica2.createEntityManager();
		em2.getTransaction().begin();
		Query q2 = em2.createQuery("SELECT e FROM Usuario e ");
		List  a2=q2.getResultList();
		System.out.println(a2.size());
								

	        
		
		tablez.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
					"Nombre", "E-Mail" ,"Tipo De Usuario","Editar","Borrar"
			}
		));
		
		
		
		tablez.getColumnModel().getColumn(0).setPreferredWidth(300);
		tablez.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablez.getColumnModel().getColumn(2).setPreferredWidth(100);
		tablez.getColumnModel().getColumn(3).setPreferredWidth(100);
		tablez.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		
		tablez.getTableHeader();
		int numRows = tablez.getRowCount();
		int numCols = tablez.getColumnCount();
		
		for (int i = 1; i < a2.size(); i++) {
            
	        Usuario pkg1= (Usuario) a2.get(i);
	        String b = a2.get(i).toString();
	       // DefaultTableModel modelo2 = (DefaultTableModel)this.tablez.getModel();
	        DefaultTableModel modelo2= (DefaultTableModel)this.tablez.getModel();
	        String datos[] = new String[5];
	        datos[0]="a";
	        System.out.println(b);
	        datos[1]=pkg1.getEmail();
	        System.out.println(pkg1.getNombre());
	        datos[2]="ilimitado";
	        datos[3]="editar";
	        datos[4]="borrar";
	        
	        
	        
	        
	        modelo2.addRow(datos);}
		
		
		
		///
		table.getColumnModel().getColumn(0).setPreferredWidth(180);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);

		table.getTableHeader();
		
		int numRows2 = table.getRowCount();
		int numCols2 = table.getColumnCount();
		/*
		for (int i = 0; i < a.size(); i++) {
			Usuario usuario1= (Usuario) a.get(i);
			String b = a.get(i).toString();
			DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
			String datos[] = new String[5];
			datos[0]=usuario1.getNombre();
			datos[1]=usuario1.getEmail();
			datos[2]=b;
			datos[3]="borrar";
			datos[4]="editar";
			modelo.addRow(datos);}*/
		
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
		
		
		
		
		
		
		
		//modelo.addRow(gay,gay2,gay3);
		
		ButtonColumn botonEditar = new ButtonColumn(tablez, editar, 5);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonEliminar = new ButtonColumn(tablez, eliminar, 6);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		this.frame.setVisible(b);
	}
	}

