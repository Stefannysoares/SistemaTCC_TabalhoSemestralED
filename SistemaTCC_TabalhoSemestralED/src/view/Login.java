package view;
import entidades.Administrador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JDesktopPane;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txfUser;
	private JPasswordField passfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		Administrador adm = new Administrador("ADMIN","1234" );
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLOGIN = new JLabel("LOGIN");
		lblLOGIN.setBounds(262, 125, 78, 14);
		lblLOGIN.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(lblLOGIN);
		
		txfUser = new JTextField();
		txfUser.setBounds(166, 188, 245, 22);
		contentPane.add(txfUser);
		txfUser.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(166, 167, 59, 14);
		lblUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(166, 239, 46, 14);
		lblSenha.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		contentPane.add(lblSenha);
		
		JButton btnLogin = new JButton("ENTRAR");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = txfUser.getText();
				String senha = String.valueOf(passfSenha.getPassword());
				
				if (usuario.equals(adm.getUsuario())&& senha.equals(adm.getSenha())) {
					Tela m = new Tela();
					Login.this.dispose();
					m.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Dados de Login Inválidos!");
				}
			}
			
		});
		btnLogin.setBounds(225, 321, 130, 35);
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(128, 255, 128));
		contentPane.add(btnLogin);
		

		
		passfSenha = new JPasswordField();
		passfSenha.setBounds(166, 264, 245, 22);
		contentPane.add(passfSenha);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 597, 44);
		panel.setBackground(new Color(128, 128, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTítulo = new JLabel("SGOT- Sistema de Gerenciamento de Orientação de TCC's");
		lblTítulo.setBounds(91, 11, 462, 19);
		panel.add(lblTítulo);
		lblTítulo.setForeground(new Color(255, 255, 255));
		lblTítulo.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		JDesktopPane painelDesktop = new JDesktopPane();
		painelDesktop.setBounds(599, 449, -610, -487);
		contentPane.add(painelDesktop);
	}
}
