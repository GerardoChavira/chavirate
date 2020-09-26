package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
		        int n = 0;
		        int V1 = Integer.parseInt(textField.getText());
		        int V2 = Integer.parseInt(textField_1.getText());
		        int V3 = Integer.parseInt(textField_2.getText());
		        while (n <= V3) 
		        {   
	                int V4 = V1 + V2;
			        System.out.println(V4);    
	                V1 = V2;
	                V2 = V4;		        	
		            n++;
		        }
			}
		});
		btnNewButton.setBounds(68, 158, 120, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Primer n\u00FAmero");
		lblNewLabel.setBounds(10, 21, 83, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmeroFinal = new JLabel("Segundo n\u00FAmero");
		lblNmeroFinal.setBounds(10, 59, 83, 23);
		contentPane.add(lblNmeroFinal);
		
		textField = new JTextField();
		textField.setBounds(102, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 60, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Cantidad de Iteraciones");
		lblNewLabel_1.setBounds(10, 103, 128, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 100, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
