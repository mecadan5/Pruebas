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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import modelo.Administrador;
import modelo.Cupo;
import modelo.Esposa;
import modelo.Poligamo;
import modelo.Registrador;
import modelo.Usuario;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JSeparator;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionListener;

public class IguAdministrador extends JFrame {

	private JPanel contentPane;
	private String usuario;
	private static final String PERSISTENCE_UNIT_NAME = "gente";
	private EntityManagerFactory fabrica;
	private JTextField textField_Nombre;
	private JTextField textField_1;
	private JTextField txtIDafi;
	private JTextField txtNmbreAfi;
	private JTextField txtvalorcupoafi;
	private JTextField txtsobrecupoafi;
	public  static  JTable table;
	public JTable table_1;
	private JTextField Idbenefiario;
	private JTextField IdNombre;
	private JTextField txcupo;
	private JTextField txSocupo;
	private JTextField textFieldbuscar;
	private JTextField textAfiBus;
	private JLabel lblTipoDeUsuario_1;
	private JTextField txtrespuestanombre;
	private JTextField txtrespuestaTipo;
	private JTextField textAfiliado;
	private JTextField txtvalorconsumido;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IguAdministrador frame = new IguAdministrador();
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
	public IguAdministrador() {
		setTitle("Modulo Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 734, 352);
		contentPane.add(tabbedPane);
		
		
		
 
       
		
		final JLayeredPane lp_lu = new JLayeredPane();
		tabbedPane.addTab("Listar Usuarios", null, lp_lu, null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 644, 168);
		lp_lu.add(scrollPane);
		
		
				
				table = new JTable();
				scrollPane.setViewportView(table);
				table.setFillsViewportHeight(true);
				table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table.setToolTipText("");
				
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e ");
				List  a=q.getResultList();
				
										
				
				
				table.setModel(new DefaultTableModel(
					new Object[][] {,},
					new String[] {
						"id", "Nombre" ,"Contrasenia","Tipo","Boton"
					}
				));
				
				JButton btnNewButton = new JButton("New button");
				scrollPane.setColumnHeaderView(btnNewButton);
				table.getColumnModel().getColumn(0).setPreferredWidth(134);
				table.getColumnModel().getColumn(1).setPreferredWidth(144);
				table.getColumnModel().getColumn(2).setPreferredWidth(228);
				table.getColumnModel().getColumn(3).setPreferredWidth(300);
				table.getColumnModel().getColumn(4).setPreferredWidth(300);
				table.getTableHeader();
				
				int numRows = table.getRowCount();
				int numCols = table.getColumnCount();
				javax.swing.table.TableModel model = table.getModel();
				Action delete = new AbstractAction()
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
				String datos[] = new String[4];
				datos[0]=String.valueOf(usuario1.getId());
				datos[1]=usuario1.getcontrasenia();
				datos[2]=usuario1.getNombre();
				datos[3]=b.substring(7);
				JLabel gay= new JLabel("Chimba");
				JLabel gay2= new JLabel("Chimba2");
				JLabel gay3= new JLabel("Chimba3");
				modelo.addRow(datos);
				ButtonColumn buttonColumn = new ButtonColumn(table, delete, 4);
				buttonColumn.setMnemonic(KeyEvent.VK_D);
				buttonColumn.addTextLabel("borrar");
				
				//modelo.addRow(gay,gay2,gay3);
				}
				
				
				
		//		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, tabbedPane, layeredPane_1, table, layeredPane, btnRegistrar, textField_Id, lblNombre, lblDocumentiid, textField_Nombre, lblTipoDeUsuario, comboBox, lblContrasea, textField_1, layeredPane_2, lbAfiliado, lblNombreAfiliado, lblValorCupo, lblValorSobrecupo, btnModificar, btnGestionarBeneficiarios, txtIDafi, txtNmbreAfi, txtvalorcupoafi, txtsobrecupoafi, tabbedPane_1}));
        
        
        
		
		final JLayeredPane lpRegis = new JLayeredPane();
		lpRegis.setBackground(Color.WHITE);
		tabbedPane.addTab("Registrar Usuarios", null, lpRegis, null);
		
		JButton btnRegistrar = new JButton("Registrar");
		
		
		
		btnRegistrar.setBounds(13, 272, 89, 23);
		lpRegis.add(btnRegistrar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(13, 73, 46, 14);
		lpRegis.add(lblNombre);
		
		JLabel lblDocumentiid = new JLabel("Registrar Usuario");
		lblDocumentiid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDocumentiid.setBounds(13, 48, 155, 14);
		lpRegis.add(lblDocumentiid);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(13, 101, 122, 20);
		lpRegis.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de usuario");
		lblTipoDeUsuario.setBounds(13, 200, 105, 14);
		lpRegis.add(lblTipoDeUsuario);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Afiliado", "Beneficiario", "Registrador", "Administrador"}));
		comboBox.setBounds(13, 220, 122, 20);
		lpRegis.add(comboBox);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(13, 131, 89, 14);
		lpRegis.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 156, 125, 20);
		lpRegis.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBuscarUsuario = new JLabel("Buscar usuario");
		lblBuscarUsuario.setBounds(327, 17, 122, 14);
		lpRegis.add(lblBuscarUsuario);
		
		textFieldbuscar = new JTextField();
		textFieldbuscar.setBounds(327, 70, 122, 20);
		lpRegis.add(textFieldbuscar);
		textFieldbuscar.setColumns(10);
		
		JLabel lblDocumentoId = new JLabel("Documento ID");
		lblDocumentoId.setBounds(327, 45, 115, 14);
		lpRegis.add(lblDocumentoId);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id2");
				q.setParameter("id2",Integer.parseInt(textFieldbuscar.getText()) );//campo de arriba "Juana_0"  getUsuario()   "sssss"
				Usuario usuario1 = (Usuario) q.getSingleResult();
				txtrespuestanombre.setText(usuario1.getNombre());
				txtrespuestaTipo.setText(usuario1.getClass().toString().substring(13));
				em.close();
				
			}
		});
		
		btnBuscar.setBounds(526, 31, 139, 59);
		lpRegis.add(btnBuscar);
		
		JLabel lblEncontroCon = new JLabel("Encontro con");
		lblEncontroCon.setBounds(327, 104, 95, 14);
		lpRegis.add(lblEncontroCon);
		
		JLabel lblBuscarNombre_2 = new JLabel("Nombre:");
		lblBuscarNombre_2.setFont(lblBuscarNombre_2.getFont().deriveFont(lblBuscarNombre_2.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		lblBuscarNombre_2.setBounds(327, 131, 272, 14);
		lpRegis.add(lblBuscarNombre_2);
		
		lblTipoDeUsuario_1 = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTipoDeUsuario_1.setBounds(327, 172, 284, 14);
		lpRegis.add(lblTipoDeUsuario_1);
		
		txtrespuestanombre = new JTextField();
		txtrespuestanombre.setEditable(false);
		txtrespuestanombre.setBounds(425, 128, 211, 20);
		lpRegis.add(txtrespuestanombre);
		txtrespuestanombre.setColumns(10);
		
		txtrespuestaTipo = new JTextField();
		txtrespuestaTipo.setEditable(false);
		txtrespuestaTipo.setBounds(425, 169, 211, 20);
		lpRegis.add(txtrespuestaTipo);
		txtrespuestaTipo.setColumns(10);
		
		final JLayeredPane lpgesafi = new JLayeredPane();
		tabbedPane.addTab("Gestionar Afiliados", null, lpgesafi, null);
		
		JLabel lbAfiliado = new JLabel("Id Afiliado");
		lbAfiliado.setBounds(10, 21, 66, 14);
		lpgesafi.add(lbAfiliado);
		
		JLabel lblNombreAfiliado = new JLabel("Nombre Afiliado");
		lblNombreAfiliado.setBounds(10, 72, 92, 14);
		lpgesafi.add(lblNombreAfiliado);
		
		JLabel lblValorCupo = new JLabel("Valor Cupo");
		lblValorCupo.setBounds(10, 127, 92, 14);
		lpgesafi.add(lblValorCupo);
		
		JLabel lblValorSobrecupo = new JLabel("Valor Sobrecupo");
		lblValorSobrecupo.setBounds(10, 187, 150, 14);
		lpgesafi.add(lblValorSobrecupo);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				// Empezar una transaccion local para poder crear persistencias
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id2");
				q.setParameter("id2",Integer.parseInt(txtIDafi.getText()) );//campo de arriba "Juana_0"  getUsuario()   "sssss"
				Poligamo usuario1 = (Poligamo) q.getSingleResult();
				Poligamo poligamo = new Poligamo();
				poligamo.setNombre(txtNmbreAfi.getText());
				
				poligamo.setFechaNacimiento(12151515);
				
				Cupo cupo =new Cupo();
				Long a =(long) Integer.parseInt(txtvalorcupoafi.getText());
				cupo.setCupo_asignado(a);
				a =(long) Integer.parseInt(txtsobrecupoafi.getText());
				cupo.setSobre_cupo_asignado(a);
				a =(long) Integer.parseInt(txtvalorconsumido.getText());
				cupo.setCupo_consumido(a);
				em.persist(cupo);
				poligamo.setCupo(cupo);
				em.persist(poligamo);
				em.getTransaction().commit();
				em.close();
				//
				//
			}///
			
			
		});
		
		
		btnModificar.setBounds(10, 254, 92, 23);
		lpgesafi.add(btnModificar);
		
		JButton btnGestionarBeneficiarios = new JButton("Gestionar Beneficiarios");
		btnGestionarBeneficiarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnGestionarBeneficiarios.setBounds(123, 254, 165, 23);
		lpgesafi.add(btnGestionarBeneficiarios);
		
		txtIDafi = new JTextField();
		txtIDafi.setBounds(10, 46, 86, 20);
		lpgesafi.add(txtIDafi);
		txtIDafi.setColumns(10);
		
		txtNmbreAfi = new JTextField();
		txtNmbreAfi.setBounds(10, 96, 86, 20);
		lpgesafi.add(txtNmbreAfi);
		txtNmbreAfi.setColumns(10);
		
		txtvalorcupoafi = new JTextField();
		txtvalorcupoafi.setBounds(10, 156, 86, 20);
		lpgesafi.add(txtvalorcupoafi);
		txtvalorcupoafi.setColumns(10);
		
		txtsobrecupoafi = new JTextField();
		txtsobrecupoafi.setBounds(10, 212, 86, 20);
		lpgesafi.add(txtsobrecupoafi);
		txtsobrecupoafi.setColumns(10);
		
		JLabel lblValorConsu = new JLabel("ValorConsumido");
		lblValorConsu.setBounds(138, 127, 103, 14);
		lpgesafi.add(lblValorConsu);
		
		txtvalorconsumido = new JTextField();
		txtvalorconsumido.setBounds(138, 156, 86, 20);
		lpgesafi.add(txtvalorconsumido);
		txtvalorconsumido.setColumns(10);
		
		JLayeredPane lp_gesben = new JLayeredPane();
		lp_gesben.setToolTipText(" ");
		tabbedPane.addTab("Gestionar Beneficiarios", null, lp_gesben, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 644, 168);
		lp_gesben.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{,},
				
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.setToolTipText("");
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(table_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar);
		
		JLabel lblIdbeneficiario = new JLabel("IdBeneficiario");
		lblIdbeneficiario.setBounds(10, 190, 78, 14);
		lp_gesben.add(lblIdbeneficiario);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(193, 190, 46, 14);
		lp_gesben.add(lblNombre_1);
		
		JLabel lblCupo = new JLabel("Cupo");
		lblCupo.setBounds(358, 190, 46, 14);
		lp_gesben.add(lblCupo);
		
		JLabel lblSobrecupo = new JLabel("Sobrecupo");
		lblSobrecupo.setBounds(491, 190, 68, 14);
		lp_gesben.add(lblSobrecupo);
		
		Idbenefiario = new JTextField();
		Idbenefiario.setBounds(97, 187, 86, 20);
		lp_gesben.add(Idbenefiario);
		Idbenefiario.setColumns(10);
		
		IdNombre = new JTextField();
		IdNombre.setBounds(239, 187, 109, 20);
		lp_gesben.add(IdNombre);
		IdNombre.setColumns(10);
		
		txcupo = new JTextField();
		txcupo.setBounds(395, 187, 86, 20);
		lp_gesben.add(txcupo);
		txcupo.setColumns(10);
		
		txSocupo = new JTextField();
		txSocupo.setBounds(555, 187, 86, 20);
		lp_gesben.add(txSocupo);
		txSocupo.setColumns(10);
		
		JButton btnAsignar = new JButton("Asignar");
		btnAsignar.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
			
			
			
		});
		
		
		btnAsignar.setBounds(552, 217, 89, 23);
		lp_gesben.add(btnAsignar);
		
		JLabel lblIdafiliado = new JLabel("IdAfiliado");
		lblIdafiliado.setBounds(10, 260, 78, 14);
		lp_gesben.add(lblIdafiliado);
		
		textAfiBus = new JTextField();
		textAfiBus.setBounds(97, 257, 86, 20);
		lp_gesben.add(textAfiBus);
		textAfiBus.setColumns(10);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				EntityManager em = fabrica.createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("SELECT e FROM Usuario e WHERE e.id = :id2");
				q.setParameter("id2",Integer.parseInt(textAfiBus.getText()) );//campo de arriba "Juana_0"  getUsuario()   "sssss"
				Poligamo usuario1 = (Poligamo) q.getSingleResult();
				List  a=usuario1.getEsposas();
				
				javax.swing.table.TableModel model = table.getModel();
				for (int i = 0; i < a.size(); i++) {
				Esposa espos= (Esposa) a.get(i);
				String b = a.get(i).toString();
				DefaultTableModel modelo = (DefaultTableModel)table_1.getModel();
			    String datos[] = new String[4];
				datos[0]=String.valueOf(espos.getId());
				datos[1]=espos.getcontrasenia();
				datos[2]=espos.getNombre();
				//datos[3]=b.substring(7);
				
				modelo.addRow(datos);
				}
				em.close();
				//boton de listar beneficiarios
				}
			
			
			
		});
		
		
		
		btnBuscar_1.setBounds(203, 256, 89, 23);
		lp_gesben.add(btnBuscar_1);
		
		JLabel lblIdafiliado_1 = new JLabel("IdAfiliado");
		lblIdafiliado_1.setBounds(10, 215, 46, 14);
		lp_gesben.add(lblIdafiliado_1);
		
		textAfiliado = new JTextField();
		textAfiliado.setBounds(97, 218, 86, 20);
		lp_gesben.add(textAfiliado);
		textAfiliado.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(350, 350, -30, -326);
		contentPane.add(separator);
		tabbedPane.doLayout();
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//tabbedPane.setTabPlacement(2);
				if(String.valueOf( comboBox.getSelectedItem())=="Afiliado"){
					fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
					EntityManager em = fabrica.createEntityManager();

					// Empezar una transaccion local para poder crear persistencias
					em.getTransaction().begin();
					tabbedPane.setSelectedComponent(lpgesafi);
					Poligamo poligamo = new Poligamo();
					poligamo.setNombre(textField_Nombre.getText());
					poligamo.setcontrasenia(textField_1.getText());
					poligamo.setFechaNacimiento(12011967);
					poligamo.getId();
					em.persist(poligamo);
					em.getTransaction().commit();
					Cupo cupo2 =new Cupo();
					Long aw =(long)0;
					cupo2.setCupo_asignado((Long) aw);
					cupo2.setSobre_cupo_asignado((Long) aw);
					cupo2.setCupo_consumido((Long) aw);
					cupo2=poligamo.getCupo();
					
					txtIDafi.setText(poligamo.getId().toString());
					txtNmbreAfi.setText(poligamo.getNombre());
					txtvalorcupoafi.setText(Long.toString(cupo2.getCupo_asignado()));
					txtsobrecupoafi.setText(Long.toString(cupo2.getSobre_cupo_asignado()));
					txtvalorconsumido.setText(Long.toString(cupo2.getCupo_consumido()));
					
					
				
					
					em.close();
					
					
				}
				if(String.valueOf( comboBox.getSelectedItem())=="Beneficiario"){
					fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
					EntityManager em = fabrica.createEntityManager();

					// Empezar una transaccion local para poder crear persistencias
					em.getTransaction().begin();
					//tabbedPane.setSelectedComponent(lpgesafi);
					Esposa Beneficiario = new Esposa();
					
					Beneficiario.setNombre(textField_Nombre.getText());
					Beneficiario.setcontrasenia(textField_1.getText());
					
					em.persist(Beneficiario);
					em.getTransaction().commit();
					em.close(); 
					
				}
				if(String.valueOf( comboBox.getSelectedItem())=="Registrador"){
					fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
					EntityManager em = fabrica.createEntityManager();

					// Empezar una transaccion local para poder crear persistencias
					em.getTransaction().begin();
					//tabbedPane.setSelectedComponent(lpgesafi);
					//tabbedPane.setSelectedComponent(lpgesafi);
					 Registrador registrador = new Registrador();
					 registrador.setNombre(textField_Nombre.getText());
					 registrador.setcontrasenia(textField_1.getText());
						
						em.persist(registrador);
						em.getTransaction().commit();
						em.close();
				}
				if(String.valueOf( comboBox.getSelectedItem())=="Administrador"){
					fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
					EntityManager em = fabrica.createEntityManager();

					// Empezar una transaccion local para poder crear persistencias
					em.getTransaction().begin();
					//tabbedPane.setSelectedComponent(lpgesafi);
					//tabbedPane.setSelectedComponent(lpgesafi);
					 Administrador admin = new Administrador();
					 admin.setNombre(textField_Nombre.getText());
					 admin.setcontrasenia(textField_1.getText());
						
					em.persist(admin);
					em.getTransaction().commit();
					em.close();
				}
				//tabbedPane.
				}
		});
	}
	}
