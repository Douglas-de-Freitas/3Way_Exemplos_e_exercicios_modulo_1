package br.com.douglas.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppSwing extends JFrame {

	JButton botao;
	JLabel label;

	public AppSwing() {
		super("Primeira aplicação Swing");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		initialize();
	}

	private void initialize() {
		botao = new JButton("Um botão");

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("cliquei no botão");

			}
		});

		label = new JLabel("algum rotulo");
		getContentPane().add(botao);
		getContentPane().add(label);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppSwing app = new AppSwing();
		app.setVisible(Boolean.TRUE);
	}

}
