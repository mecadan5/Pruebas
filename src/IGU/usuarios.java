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
import java.awt.Color;
import java.util.List;

public class usuarios extends JFrame {

	
	private static final String PERSISTENCE_UNIT_NAME = null;
	private JPanel contentPane;
	private JTextField txtIntroduzcaNombreUsuario;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuarios frame = new usuarios();
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
	public usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 750);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		String absolutePath = System.getProperty("user.dir");
		System.out.print(absolutePath);
		label.setIcon(new ImageIcon(absolutePath+"/src/assets/logochibcha.png"));
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
		btnFacturacin.setIcon(new ImageIcon(absolutePath+"/src/assets/bill.png"));
		btnFacturacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFacturacin.setBounds(6, 141, 221, 84);
		contentPane.add(btnFacturacin);
		
		JButton btnGestionDeUsuarios = new JButton("Gestion de Usuarios");
		btnGestionDeUsuarios.setEnabled(false);
		btnGestionDeUsuarios.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnGestionDeUsuarios.setIcon(new ImageIcon(absolutePath+"/src/assets/user.png"));
		btnGestionDeUsuarios.setBounds(6, 249, 221, 84);
		contentPane.add(btnGestionDeUsuarios);
		
		JPanel panel = new JPanel();
		panel.setBounds(239, 141, 690, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		lblBusqueda.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblBusqueda.setIcon(new ImageIcon(absolutePath+"/src/assets/search.png"));
		lblBusqueda.setBounds(25, 26, 151, 32);
		panel.add(lblBusqueda);
		
		txtIntroduzcaNombreUsuario = new JTextField();
		txtIntroduzcaNombreUsuario.setForeground(Color.GRAY);
		txtIntroduzcaNombreUsuario.setText("Introduzca Nombre Usuario");
		txtIntroduzcaNombreUsuario.setBounds(156, 23, 198, 40);
		panel.add(txtIntroduzcaNombreUsuario);
		txtIntroduzcaNombreUsuario.setColumns(10);
		
		JButton button = new JButton("Agregar Paquete");
		button.setIcon(new ImageIcon(absolutePath+"/src/assets/plus.png"));
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
		
		Object fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = ((EntityManagerFactory) fabrica).createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT e FROM Usuario e ");
		List  a=q.getResultList();
		
								
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {,},
			new String[] {
				"Nombre", "# Orden" ,"Pagado","Paquete","Plan de Pago","Opciones de Gestion","Editar","Borrar"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(180);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(300);
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
		
		for (int i = 0; i <15; i++) {
			
			DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
			String datos[] = new String[3];
			
			for (int j = 0; j<3; j++) {
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
		ButtonColumn botonEditar = new ButtonColumn(table, editar, 7);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		ButtonColumn botonEliminar = new ButtonColumn(table, eliminar, 8);
		botonEliminar.setMnemonic(KeyEvent.VK_D);
		
		
		
		
	}
	}

