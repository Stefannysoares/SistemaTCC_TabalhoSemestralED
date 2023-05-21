package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private static final long serialVersionUID = -8533024649811972087L;
	private JPanel contentPane;
	private JTextField tfAlunoNome;
	private JTextField tfAlunoRa;
	private JTextField tfGrupoTema;
	private JTextField tfGrupoArea;
	private JTextField tfGrupoSubarea;
	private JTextField tfGrupoNomeAluno;
	private JTextField tfIDGrupo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setTitle("Sistema de TCC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 634, 441);
		contentPane.add(tabbedPane);
		
		JPanel tabAluno = new JPanel();
		tabbedPane.addTab("Registrar Aluno", null, tabAluno, "Registrar Alunos");
		tabAluno.setLayout(null);
		
		JLabel lblAlunoNome = new JLabel("Nome");
		lblAlunoNome.setBounds(148, 120, 60, 30);
		tabAluno.add(lblAlunoNome);
		
		tfAlunoNome = new JTextField();
		tfAlunoNome.setBounds(208, 120, 258, 30);
		tabAluno.add(tfAlunoNome);
		tfAlunoNome.setColumns(10);
		
		JLabel lblAlunoRa = new JLabel("RA");
		lblAlunoRa.setBounds(148, 169, 60, 30);
		tabAluno.add(lblAlunoRa);
		
		tfAlunoRa = new JTextField();
		tfAlunoRa.setColumns(10);
		tfAlunoRa.setBounds(208, 174, 258, 30);
		tabAluno.add(tfAlunoRa);
		
		JButton btnAlunoCadastrar = new JButton("Registrar");
		btnAlunoCadastrar.setForeground(new Color(0, 0, 0));
		btnAlunoCadastrar.setBackground(new Color(0, 255, 64));
		btnAlunoCadastrar.setBounds(294, 228, 89, 23);
		tabAluno.add(btnAlunoCadastrar);
		
		JButton btnAlunoSair = new JButton("Sair ->");
		btnAlunoSair.setBounds(530, 11, 89, 23);
		tabAluno.add(btnAlunoSair);
		
		JPanel tabGrupo = new JPanel();
		tabbedPane.addTab("Registrar Grupo", null, tabGrupo, "Registrar Grupos");
		tabGrupo.setLayout(null);
		
		JButton btnGrupoSair = new JButton("Sair ->");
		btnGrupoSair.setBounds(530, 11, 89, 23);
		tabGrupo.add(btnGrupoSair);
		
		JLabel lblGrupoTema = new JLabel("Tema");
		lblGrupoTema.setBounds(58, 53, 60, 30);
		tabGrupo.add(lblGrupoTema);
		
		tfGrupoTema = new JTextField();
		tfGrupoTema.setColumns(10);
		tfGrupoTema.setBounds(118, 53, 397, 30);
		tabGrupo.add(tfGrupoTema);
		
		JLabel lblGrupoArea = new JLabel("Área");
		lblGrupoArea.setBounds(58, 94, 60, 30);
		tabGrupo.add(lblGrupoArea);
		
		tfGrupoArea = new JTextField();
		tfGrupoArea.setColumns(10);
		tfGrupoArea.setBounds(118, 94, 160, 30);
		tabGrupo.add(tfGrupoArea);
		
		JLabel lblGrupoSubarea = new JLabel("Subárea");
		lblGrupoSubarea.setBounds(295, 94, 60, 30);
		tabGrupo.add(lblGrupoSubarea);
		
		tfGrupoSubarea = new JTextField();
		tfGrupoSubarea.setColumns(10);
		tfGrupoSubarea.setBounds(355, 94, 160, 30);
		tabGrupo.add(tfGrupoSubarea);
		
		JLabel lblGrupoNomeAluno = new JLabel("Nome do Aluno");
		lblGrupoNomeAluno.setBounds(10, 135, 108, 30);
		tabGrupo.add(lblGrupoNomeAluno);
		
		tfGrupoNomeAluno = new JTextField();
		tfGrupoNomeAluno.setColumns(10);
		tfGrupoNomeAluno.setBounds(118, 135, 348, 30);
		tabGrupo.add(tfGrupoNomeAluno);
		
		JTextArea taGrupoListaAluno = new JTextArea();
		taGrupoListaAluno.setBounds(118, 176, 397, 141);
		tabGrupo.add(taGrupoListaAluno);
		
		JLabel lblGrupoListaAluno = new JLabel("Lista de Alunos");
		lblGrupoListaAluno.setBounds(10, 176, 108, 30);
		tabGrupo.add(lblGrupoListaAluno);
		
		JButton btnGrupoAdicionaAluno = new JButton("Adicionar Aluno");
		btnGrupoAdicionaAluno.setBackground(new Color(0, 255, 64));
		btnGrupoAdicionaAluno.setBounds(492, 135, 127, 30);
		tabGrupo.add(btnGrupoAdicionaAluno);
		
		JButton btnGrupoCadastrar = new JButton("Registrar Grupo");
		btnGrupoCadastrar.setBackground(new Color(0, 255, 64));
		btnGrupoCadastrar.setBounds(266, 328, 89, 23);
		tabGrupo.add(btnGrupoCadastrar);
		
		JPanel tabID = new JPanel();
		tabID.setLayout(null);
		tabbedPane.addTab("Localizar Grupo", null, tabID, "Localizar Grupo Por ID");
		
		JButton btnIDSair = new JButton("Sair ->");
		btnIDSair.setBounds(530, 11, 89, 23);
		tabID.add(btnIDSair);
		
		JLabel lblIDTema = new JLabel("Tema");
		lblIDTema.setBounds(58, 94, 60, 30);
		tabID.add(lblIDTema);
		
		JLabel lblIDArea = new JLabel("Área");
		lblIDArea.setBounds(58, 135, 60, 30);
		tabID.add(lblIDArea);
		
		JLabel lblIDSubarea = new JLabel("Subárea");
		lblIDSubarea.setBounds(295, 135, 60, 30);
		tabID.add(lblIDSubarea);
		
		JLabel lblIDGrupo = new JLabel("ID do Grupo");
		lblIDGrupo.setBounds(10, 53, 108, 30);
		tabID.add(lblIDGrupo);
		
		tfIDGrupo = new JTextField();
		tfIDGrupo.setColumns(10);
		tfIDGrupo.setBounds(118, 53, 348, 30);
		tabID.add(tfIDGrupo);
		
		JTextArea taIDLista = new JTextArea();
		taIDLista.setBounds(118, 176, 397, 141);
		tabID.add(taIDLista);
		
		JLabel lblIDLista = new JLabel("Integrantes");
		lblIDLista.setBounds(10, 176, 108, 30);
		tabID.add(lblIDLista);
		
		JButton btnIDBuscar = new JButton("Buscar Grupo");
		btnIDBuscar.setBackground(new Color(0, 255, 64));
		btnIDBuscar.setBounds(492, 53, 127, 30);
		tabID.add(btnIDBuscar);
		
		JButton btnID = new JButton("Registrar Grupo");
		btnID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnID.setBackground(new Color(0, 255, 64));
		btnID.setBounds(426, 328, 89, 23);
		tabID.add(btnID);
		
		JTextArea taIDTema = new JTextArea();
		taIDTema.setBounds(118, 94, 397, 30);
		tabID.add(taIDTema);
		
		JTextArea taIDArea = new JTextArea();
		taIDArea.setBounds(118, 135, 160, 30);
		tabID.add(taIDArea);
		
		JTextArea taIDSubarea = new JTextArea();
		taIDSubarea.setBounds(355, 135, 160, 30);
		tabID.add(taIDSubarea);
		
		JPanel tabOrientacao = new JPanel();
		tabbedPane.addTab("Definir Orientação", null, tabOrientacao, "Defina Uma Orientação Para Algum Grupo");
		tabOrientacao.setLayout(null);
		
		JPanel tabConsultaOrientacao = new JPanel();
		tabbedPane.addTab("Última Orientação", null, tabConsultaOrientacao, "Consulte a Última Orientação Definida");
		tabConsultaOrientacao.setLayout(null);
		
		JPanel tabConsultaSubarea = new JPanel();
		tabbedPane.addTab("Consultar Por Subárea", null, tabConsultaSubarea, "Consulte Uma Lista de Grupos Por Subárea");
		tabConsultaSubarea.setLayout(null);
	}
}
