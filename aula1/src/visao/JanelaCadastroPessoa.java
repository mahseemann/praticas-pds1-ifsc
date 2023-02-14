package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.FuncionarioDAO;
import Modelo.Funcionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 102));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(158, 13, 27, 14);
		contentPane.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(190, 10, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(158, 38, 27, 14);
		contentPane.add(lblCpf);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(190, 35, 86, 20);
		contentPane.add(txtCpf);

		JButton btnSalvar = new JButton("New button");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();

				if (!nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCPF(Long.valueOf(cpf));

//				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
//				bdPessoa.inserir(func);

			}
		});
		btnSalvar.setBounds(187, 66, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(190, 66, 89, 23);

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextField() {
		return txtNome;
	}

	public void setTextField(JTextField textField) {
		this.txtNome = textField;
	}

	public JTextField getTextField_1() {
		return txtCpf;
	}

	public void setTextField_1(JTextField textField_1) {
		this.txtCpf = textField_1;
	}
}
