package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class agregarPaquete extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasea;
	private JTextField txtCorreosCorporativos;
	private JTextField txtNumerobasededatos;
	private JTextField txtTraficoMensual;
	private JTextField txtValorAnual;
	private JTextField txtValorMensual;
	private JTextField txtValorSemestral;
	private JTextField txtValorTrimestral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarPaquete frame = new agregarPaquete();
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
	public agregarPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 550);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(UIManager.getColor("Button.disabledText"));
		txtUsuario.setText("Nombre");
		txtUsuario.setBounds(61, 155, 246, 45);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setForeground(UIManager.getColor("Button.disabledText"));
		txtContrasea.setBackground(UIManager.getColor("Button.highlight"));
		txtContrasea.setText("Espacio en Disco");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(62, 242, 157, 45);
		contentPane.add(txtContrasea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Volumes/SHARED HD/Ingenieria de Software 1/ChibchaWeb/assets/package.png"));
		label.setBounds(126, 6, 51, 104);
		contentPane.add(label);
		
		JLabel lblInicioDeSesion = new JLabel("Agregar Paquete");
		lblInicioDeSesion.setIcon(new ImageIcon(agregarPaquete.class.getResource("/assets/package.png")));
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(155, 36, 317, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Por favor ingrese los datos solicitados");
		lblUsuario.setBounds(219, 92, 190, 16);
		contentPane.add(lblUsuario);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setIcon(new ImageIcon(agregarPaquete.class.getResource("/assets/plus.png")));
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(439, 459, 117, 36);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PHP Version"}));
		comboBox.setToolTipText("Rol");
		comboBox.setBounds(250, 309, 134, 57);
		contentPane.add(comboBox);
		
		txtCorreosCorporativos = new JTextField();
		txtCorreosCorporativos.setText("Correos Corporativos");
		txtCorreosCorporativos.setForeground(Color.GRAY);
		txtCorreosCorporativos.setColumns(10);
		txtCorreosCorporativos.setBounds(61, 314, 169, 45);
		contentPane.add(txtCorreosCorporativos);
		
		txtNumerobasededatos = new JTextField();
		txtNumerobasededatos.setText("# Base de Datos");
		txtNumerobasededatos.setForeground(Color.GRAY);
		txtNumerobasededatos.setColumns(10);
		txtNumerobasededatos.setBounds(401, 242, 143, 45);
		contentPane.add(txtNumerobasededatos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Plataforma (SO)"}));
		comboBox_1.setToolTipText("Rol");
		comboBox_1.setBounds(396, 309, 148, 57);
		contentPane.add(comboBox_1);
		
		txtTraficoMensual = new JTextField();
		txtTraficoMensual.setText("Trafico Mensual");
		txtTraficoMensual.setForeground(Color.GRAY);
		txtTraficoMensual.setColumns(10);
		txtTraficoMensual.setBackground(Color.WHITE);
		txtTraficoMensual.setBounds(250, 242, 134, 45);
		contentPane.add(txtTraficoMensual);
		
		txtValorAnual = new JTextField();
		txtValorAnual.setText("Valor Anual");
		txtValorAnual.setForeground(Color.GRAY);
		txtValorAnual.setColumns(10);
		txtValorAnual.setBackground(Color.WHITE);
		txtValorAnual.setBounds(314, 385, 113, 45);
		contentPane.add(txtValorAnual);
		
		txtValorMensual = new JTextField();
		txtValorMensual.setText("Valor Mensual");
		txtValorMensual.setForeground(Color.GRAY);
		txtValorMensual.setColumns(10);
		txtValorMensual.setBackground(Color.WHITE);
		txtValorMensual.setBounds(194, 385, 113, 45);
		contentPane.add(txtValorMensual);
		
		txtValorSemestral = new JTextField();
		txtValorSemestral.setText("Valor Semestral");
		txtValorSemestral.setForeground(Color.GRAY);
		txtValorSemestral.setColumns(10);
		txtValorSemestral.setBackground(Color.WHITE);
		txtValorSemestral.setBounds(61, 385, 123, 45);
		contentPane.add(txtValorSemestral);
		
		txtValorTrimestral = new JTextField();
		txtValorTrimestral.setText("Valor Trimestral");
		txtValorTrimestral.setForeground(Color.GRAY);
		txtValorTrimestral.setColumns(10);
		txtValorTrimestral.setBackground(Color.WHITE);
		txtValorTrimestral.setBounds(439, 385, 117, 45);
		contentPane.add(txtValorTrimestral);
	}
}
