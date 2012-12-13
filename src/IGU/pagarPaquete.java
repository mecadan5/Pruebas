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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import modelo.PaqueteHosting;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pagarPaquete {

    private JPanel contentPane;
    private JTextField txtContrasea;
    JFrame frame= new JFrame();
    private JLabel lblFechaDeVencimiento;
    private JLabel lblNombreDistribuidor;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pagarPaquete frame = new pagarPaquete();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public pagarPaquete(PaqueteHosting pa) {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(100, 100, 599, 502);
        contentPane = new JPanel();
        contentPane.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);
        frame.setVisible(true);
        
        txtContrasea = new JTextField();
        txtContrasea.setForeground(UIManager.getColor("Button.disabledText"));
        txtContrasea.setBackground(UIManager.getColor("Button.highlight"));
        txtContrasea.setColumns(10);
        txtContrasea.setBounds(250, 211, 294, 45);
        contentPane.add(txtContrasea);
        
        
        
        JLabel lblTitulito = new JLabel("Pagar Paquete");
        lblTitulito.setIcon(new ImageIcon(pagarPaquete.class.getResource("/assets/1355383959_credit-cards.png")));
        lblTitulito.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
        lblTitulito.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulito.setBounds(155, 36, 317, 45);
        contentPane.add(lblTitulito);
        
        JLabel lblUsuario = new JLabel("Por favor ingrese los datos solicitados");
        lblUsuario.setBounds(219, 92, 190, 16);
        contentPane.add(lblUsuario);
        
        JButton btnNewButton = new JButton("Pagar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Usted ha agregado un nuevo paquete"); 
                frame.setVisible(false);
            }
        });
        btnNewButton.setIcon(new ImageIcon(pagarPaquete.class.getResource("/assets/plus.png")));
        btnNewButton.setBackground(UIManager.getColor("Button.light"));
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBounds(427, 416, 117, 36);
        contentPane.add(btnNewButton);
        
        JComboBox comboBox = new JComboBox();
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox c= (JComboBox)e.getSource();
                if (c.getSelectedIndex() == 0)
                {
                System.out.println("selecciono visa");
                }
                else if (c.getSelectedIndex() == 1)
                {
                System.out.println("selecciono master");
                }
                else if (c.getSelectedIndex() == 2)
                {
                System.out.println("selecciono american");
                }
                
            
            }
        });
        
        comboBox.addItem("Visa");
        comboBox.addItem("Master Card");
        comboBox.addItem("American Express");
        
        comboBox.setToolTipText("Rol");
        comboBox.setBounds(250, 141, 294, 45);
        contentPane.add(comboBox);
        
        JLabel lblTipoDeTarjeta = new JLabel("Tipo de Tarjeta");
        lblTipoDeTarjeta.setBounds(62, 156, 105, 14);
        contentPane.add(lblTipoDeTarjeta);
        
        lblFechaDeVencimiento = new JLabel("Fecha de Vencimiento");
        lblFechaDeVencimiento.setBounds(61, 226, 123, 14);
        contentPane.add(lblFechaDeVencimiento);
        
        lblNombreDistribuidor = new JLabel("Nombre Propietario");
        lblNombreDistribuidor.setBounds(61, 293, 123, 14);
        contentPane.add(lblNombreDistribuidor);
        
        textField = new JTextField();
        textField.setForeground((Color) null);
        textField.setColumns(10);
        textField.setBackground(Color.WHITE);
        textField.setBounds(250, 276, 294, 45);
        contentPane.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setForeground((Color) null);
        textField_1.setColumns(10);
        textField_1.setBackground(Color.WHITE);
        textField_1.setBounds(250, 350, 294, 45);
        contentPane.add(textField_1);
        
        JLabel lblNumeroDeTarjeta = new JLabel("Numero de Tarjeta");
        lblNumeroDeTarjeta.setBounds(62, 365, 123, 14);
        contentPane.add(lblNumeroDeTarjeta);
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        this.frame.setVisible(b);
    }
}