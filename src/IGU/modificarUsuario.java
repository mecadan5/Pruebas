package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class modificarUsuario {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasea;
	JFrame frame= new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificarUsuario frame = new modificarUsuario();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public modificarUsuario() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		frame.setVisible(true);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(UIManager.getColor("Button.disabledText"));
		txtUsuario.setText("Nombre");
		txtUsuario.setBounds(57, 155, 266, 45);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setForeground(UIManager.getColor("Button.disabledText"));
		txtContrasea.setBackground(UIManager.getColor("Button.highlight"));
		txtContrasea.setText("Email");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(57, 212, 266, 45);
		contentPane.add(txtContrasea);
		
		JLabel lblInicioDeSesion = new JLabel("Agregar Usuario");
		lblInicioDeSesion.setIcon(new ImageIcon(modificarUsuario.class.getResource("/assets/user.png")));
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(46, 34, 297, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Por favor ingrese los datos solicitados");
		lblUsuario.setBounds(93, 90, 186, 16);
		contentPane.add(lblUsuario);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(modificarUsuario.class.getResource("/assets/plus.png")));
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 336, 117, 36);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox c= (JComboBox)e.getSource();
				if (c.getSelectedIndex() == 0)
				{
				System.out.println("selecciono dist");
				}
				else if (c.getSelectedIndex() == 1)
				{
				System.out.println("selecciono cliente");
				}
				else if (c.getSelectedIndex() == 2)
				{
				System.out.println("selecciono asesor");
				}
				else if (c.getSelectedIndex() == 3)
				{
				System.out.println("selecciono admin");
				}
				else if (c.getSelectedIndex() == 4)
				{
				System.out.println("selecciono revisor");
				}
			
			}
		});
		
		comboBox.addItem("Distribuidor");
		comboBox.addItem("Cliente");
		comboBox.addItem("Asesor Comercial");
		comboBox.addItem("Administrador");
		comboBox.addItem("Revisor de Compra");
		
		
		comboBox.setToolTipText("Tipo de Usuario");
		comboBox.setBounds(57, 267, 266, 57);
		contentPane.add(comboBox);
	}


	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		this.frame.setVisible(b);
	}
}
