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
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class consultaComision extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultaComision frame = new consultaComision();
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
	public consultaComision() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 446);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInicioDeSesion = new JLabel("Comisi\u00F3n # 12");
		lblInicioDeSesion.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setBounds(97, 21, 266, 45);
		contentPane.add(lblInicioDeSesion);
		
		JLabel lblUsuario = new JLabel("Informaci\u00F3n de Comisi\u00F3n");
		lblUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblUsuario.setBounds(6, 107, 266, 16);
		contentPane.add(lblUsuario);
		
		JButton btnNewButton = new JButton("Aprobar");
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(6, 382, 117, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblDistribuidor = new JLabel("Distribuidor:");
		lblDistribuidor.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblDistribuidor.setBounds(6, 141, 86, 16);
		contentPane.add(lblDistribuidor);
		
		JLabel lblMes = new JLabel("Mes:");
		lblMes.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblMes.setBounds(6, 179, 86, 16);
		contentPane.add(lblMes);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblMonto.setBounds(6, 215, 86, 16);
		contentPane.add(lblMonto);
		
		JLabel lblFacturasPendientes = new JLabel("Facturas Pendientes:");
		lblFacturasPendientes.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblFacturasPendientes.setBounds(6, 354, 137, 16);
		contentPane.add(lblFacturasPendientes);
		
		JLabel lblVentasRealizadas = new JLabel("Ventas Realizadas");
		lblVentasRealizadas.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblVentasRealizadas.setBounds(6, 243, 137, 16);
		contentPane.add(lblVentasRealizadas);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(142, 243, 299, 106);
		contentPane.add(list);
		
		JLabel lblNombreDelDistribuidor = new JLabel("Nombre del Distribuidor");
		lblNombreDelDistribuidor.setForeground(SystemColor.controlHighlight);
		lblNombreDelDistribuidor.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNombreDelDistribuidor.setBounds(142, 141, 180, 16);
		contentPane.add(lblNombreDelDistribuidor);
		
		JLabel lblEneroDe = new JLabel("Enero de 2012");
		lblEneroDe.setForeground(SystemColor.controlHighlight);
		lblEneroDe.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblEneroDe.setBounds(142, 179, 180, 16);
		contentPane.add(lblEneroDe);
		
		JLabel label = new JLabel("$200000");
		label.setForeground(SystemColor.controlHighlight);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label.setBounds(142, 215, 180, 16);
		contentPane.add(label);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setForeground(UIManager.getColor("Button.select"));
		lblNo.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNo.setBounds(142, 354, 180, 16);
		contentPane.add(lblNo);
		
		JButton btnPendiente = new JButton("Pendiente");
		btnPendiente.setForeground(Color.BLACK);
		btnPendiente.setBackground(SystemColor.controlHighlight);
		btnPendiente.setBounds(137, 382, 117, 36);
		contentPane.add(btnPendiente);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setBackground(SystemColor.controlHighlight);
		btnEliminar.setBounds(266, 382, 117, 36);
		contentPane.add(btnEliminar);
	}
}
