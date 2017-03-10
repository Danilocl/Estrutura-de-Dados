package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddClientDialog extends JFrame {

	public AddClientDialog(MainFrame mainframe) {
		build(mainframe);
	}

	private void build(MainFrame mainframe) {
		// TODO Auto-generated method stub
		setLayout(new GridBagLayout());
		MenuBar();
		RegisterMenu();
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void MenuBar() {
		// TODO Auto-generated method stub

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu fileMenu = new JMenu("Arquivo");
		menuBar.add(fileMenu);

		JMenu registerMenu = new JMenu("Cadastro");
		menuBar.add(registerMenu);

		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);

		JMenu ExitMenu = new JMenu("Sair");
		menuBar.add(ExitMenu);
		
		
	}

	private void RegisterMenu() {

		JPanel panel = new JPanel(new GridBagLayout());
		JLabel NameItem = new JLabel("Nome");
		panel.add(NameItem, new GBC(0, 0).horizontal());
		JTextField textfield = new JTextField(20);
		panel.add(textfield, new GBC(1, 0).horizontal());

		JLabel NameItem2 = new JLabel("CPF");
		panel.add(NameItem2, new GBC(0, 1).horizontal());
		JTextField textfield2 = new JTextField(20);
		panel.add(textfield2, new GBC(1, 1).horizontal());

		JLabel NameItem3 = new JLabel("Data de Nascimento");
		panel.add(NameItem3, new GBC(0, 2).horizontal());
		JTextField textfield3 = new JTextField(20);
		panel.add(textfield3, new GBC(1, 2).horizontal());

		JButton newButton = new JButton("Salvar");
		panel.add(newButton, new GBC(3, 3).horizontal());

		add(panel, new GBC(1, 0));
	}

}
