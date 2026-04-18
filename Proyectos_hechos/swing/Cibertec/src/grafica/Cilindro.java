package grafica;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Cilindro extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	// Declaración de variables
	private JLabel lblRadio;
	private JLabel lblAltura;
	private JTextField txtRadio;
	private JTextField txtAltura;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;
	// Lanza la aplicación
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cilindro frame = new Cilindro();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//Crea la GUI
public Cilindro() {
	setTitle("Cilindro");
	setBounds(100, 100, 450, 239);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	lblRadio = new JLabel("Radio");
	lblRadio.setBounds(10, 13, 80, 14);
	getContentPane().add(lblRadio);
	lblAltura = new JLabel("Altura");
	lblAltura.setBounds(10, 38, 80, 14);
	getContentPane().add(lblAltura);
	txtRadio = new JTextField();
	txtRadio.setBounds(90, 10, 90, 20);
	getContentPane().add(txtRadio);
	txtRadio.setColumns(10);
	txtAltura = new JTextField();
	txtAltura.setBounds(90, 35, 90, 20);
	getContentPane().add(txtAltura);
	txtAltura.setColumns(10);
	btnProcesar = new JButton("Procesar");
	btnProcesar.addActionListener(this);
	btnProcesar.setBounds(335, 9, 89, 23);
	getContentPane().add(btnProcesar);
	btnBorrar = new JButton("Borrar");
	btnBorrar.addActionListener(this);
	btnBorrar.setBounds(335, 34, 89, 23);
	getContentPane().add(btnBorrar);
	scpScroll = new JScrollPane();
	scpScroll.setBounds(10, 69, 414, 120);
	getContentPane().add(scpScroll);
	txtS = new JTextArea();
	txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
	scpScroll.setViewportView(txtS);
}
	//Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
	if (arg0.getSource() == btnProcesar) {
	actionPerformedBtnProcesar(arg0);
	}
	if (arg0.getSource() == btnBorrar) {
	actionPerformedBtnBorrar(arg0);
	}
	}
	//Procesa la pulsación del botón Procesar
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
	//Declaración de variables
		double r, h, are, vol;
		// Entrada de datos
		r = Double.parseDouble(txtRadio.getText());
		h = Double.parseDouble(txtAltura.getText());
		// Proceso
		are = 2 * Math.PI * r * (r + h);
		vol = 2 * Math.PI * r * r * h;
		// Salida de resultados
		txtS.setText("Area : " + are + "\n");
		txtS.append ("Volumen : " + vol);
		}
		// Procesa la pulsación del botón Borrar
		protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtRadio.setText("");
		txtAltura.setText("");
		txtS.setText("");
		txtRadio.requestFocus();
		}
	}
