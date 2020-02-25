package paketesuma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField operando1;
	private JTextField operando2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Suma de N\u00FAmeros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operando1 = new JTextField();
		operando1.setBounds(92, 27, 280, 20);
		contentPane.add(operando1);
		operando1.setColumns(10);
		
		operando2 = new JTextField();
		operando2.setColumns(10);
		operando2.setBounds(92, 75, 280, 20);
		contentPane.add(operando2);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(92, 122, 280, 20);
		contentPane.add(resultado);
		
		JLabel lblNewLabel = new JLabel("Operando 1");
		lblNewLabel.setBounds(22, 30, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operando 2\t");
		lblNewLabel_1.setBounds(22, 78, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(22, 125, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAdd = new JButton("A\u00F1adir");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Primero definimos las variables float
				 float num1, num2, result;
				 // Convertimos el texto a float
				 num1 = Float.parseFloat(operando1.getText());
				 num2 = Float.parseFloat(operando2.getText());
				 // Realizamos la suma
				 result = num1 + num2;
				 // Pasamos el valor del resultado al jTextField3
				 // A la misma vez, pasamos el valor de float a string
				 resultado.setText(String.valueOf(result)); 
			}
		});
		btnAdd.setBounds(92, 168, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnClear = new JButton("Limpiar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1.setText("");
				operando2.setText("");
				resultado.setText("");
			}
		});
		btnClear.setBounds(283, 168, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(189, 230, 89, 23);
		contentPane.add(btnExit);
	}
}
