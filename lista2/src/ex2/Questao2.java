package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCadastro;
	private JTextField textFieldMaiorNumero;
	private JTextField textFieldMenorNumero;
	private ArrayList<Double> lista;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Questao2() {

		lista = new ArrayList<Double>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnCadastrar.setBounds(293, 82, 99, 28);
		btnCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String numerosStr = textFieldCadastro.getText();

				if (!numerosStr.isEmpty()) {
					Double numero = Double.valueOf(numerosStr);

					lista.add(numero);
					
					JOptionPane.showMessageDialog(null, "Numero cadastrado!");
					textFieldCadastro.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Insira um número:");

				}
			}

		});

		contentPane.add(btnCadastrar);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExibir.setBounds(293, 170, 99, 28);
		btnExibir.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
		
				
				// pega o menor valor existente dentro da lista
				Double min = Collections.min(lista);
				// pega o maior valor existente dentro da lista
				Double max = Collections.max(lista);
				
				textFieldMaiorNumero.setText(max.toString());
				textFieldMenorNumero.setText(min.toString());
			}
			
		});
		contentPane.add(btnExibir);

		textFieldCadastro = new JTextField();
		textFieldCadastro.setBounds(23, 55, 86, 20);
		contentPane.add(textFieldCadastro);
		textFieldCadastro.setColumns(10);

		textFieldMaiorNumero = new JTextField();
		textFieldMaiorNumero.setEditable(false);
		textFieldMaiorNumero.setBounds(23, 118, 86, 20);
		contentPane.add(textFieldMaiorNumero);
		textFieldMaiorNumero.setColumns(10);

		textFieldMenorNumero = new JTextField();
		textFieldMenorNumero.setEditable(false);
		textFieldMenorNumero.setBounds(23, 204, 86, 20);
		contentPane.add(textFieldMenorNumero);
		textFieldMenorNumero.setColumns(10);

		JLabel lblCadastroNumero = new JLabel("Cadaste um número:");
		lblCadastroNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblCadastroNumero.setBounds(23, 26, 124, 14);
		contentPane.add(lblCadastroNumero);

		JLabel lblMaiorNumero = new JLabel("Maior número cadastrado:");
		lblMaiorNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblMaiorNumero.setBounds(23, 86, 154, 14);
		contentPane.add(lblMaiorNumero);

		JLabel lblMenorNumero = new JLabel("Menor número cadastrado:");
		lblMenorNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblMenorNumero.setBounds(23, 179, 154, 14);
		contentPane.add(lblMenorNumero);
	}
}