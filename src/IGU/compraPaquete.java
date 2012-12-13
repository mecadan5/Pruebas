package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class compraPaquete {

	private JPanel contentPane;
	private JTable table;
	JFrame frame= new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compraPaquete frame = new compraPaquete();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public compraPaquete() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 845, 476);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setVisible(true);
		
		
		
		JLabel lblTitulito = new JLabel("Comprar Paquete");
		lblTitulito.setIcon(new ImageIcon(compraPaquete.class.getResource("/assets/1355371030_shopping_cart.png")));
		lblTitulito.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblTitulito.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulito.setBounds(234, 34, 317, 45);
		contentPane.add(lblTitulito);
		
		JLabel lblUsuario = new JLabel("Por favor ingrese los datos solicitados");
		lblUsuario.setBounds(282, 87, 234, 16);
		contentPane.add(lblUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 809, 299);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBorder( new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
				"Nombre Paquete" ,"OS","Trafico","# BD","# Correos","Espacio","PHP","Comprar"
			}
		));
		
		
		
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(300);
		
		table.getTableHeader();
		int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		
		Action comprar = new AbstractAction()
		{	
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        
		        JOptionPane.showMessageDialog(null,"Compraste el paquete rechimba"); 
		   
		    }
		};
		
		
		/*for (int i = 0; i <15; i++) {
			
			DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
			String datos[] = new String[3];
			
			for (int j = 0; j<3; j++) {
			datos[j]="Algo"+j;
			}
		
			modelo.addRow(datos);

			}*/
		
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
		
		DefaultTableModel modelo = (DefaultTableModel)this.table.getModel();
		String datos[] = new String[7];
		datos[0]="1";
		datos[1]="2";
		datos[2]="3";
		datos[3]="3";
		datos[4]="1";
		datos[5]="2";
		datos[6]="3";

		modelo.addRow(datos);
		ButtonColumn botonEditar = new ButtonColumn(table, comprar,7);
		botonEditar.setMnemonic(KeyEvent.VK_D);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		this.frame.setVisible(b);
	}
}
