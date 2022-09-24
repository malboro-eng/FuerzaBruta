package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class Algoritmo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField buscar;
	private JTextArea mostrar;
	private JScrollPane archivo;
	private JButton bsearch;
	private JButton bvolver;
	private JLabel numrep;
	private String norep = "";
	private static final String FUENTE = "Verdana";

	public Algoritmo(Controller c) {
		setVisible(false);
		setOpaque(false);
		setLayout(null);

		numrep = new JLabel("Total:" + norep);
		numrep.setFont(new Font(FUENTE, Font.BOLD, 15));
		numrep.setForeground(Color.WHITE);
		numrep.setBounds(350, 250, 80, 20);

		bsearch = new JButton("BUSCAR");
		bsearch.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearch.setBounds(20, 20, 100, 20);

		buscar = new JTextField();
		buscar.setFont(new Font(FUENTE, Font.BOLD, 10));
		buscar.setBounds(140, 18, 500, 20);

		mostrar = new JTextArea();
		archivo = new JScrollPane(mostrar);
		archivo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		archivo.setBounds(20, 65, 320, 380);
		
		bvolver = new JButton("VOLVER");
		bvolver.setFont(new Font(FUENTE, Font.BOLD, 12));
		bvolver.setBounds(420, 410, 100, 20);

		add(buscar);
		add(bvolver);
		add(archivo);
		add(bsearch);
		add(numrep);


	}

	public JButton getBsearch() {
		return bsearch;
	}

	public void setBsearch(JButton bsearch) {
		this.bsearch = bsearch;
	}

	public JButton getBvolver() {
		return bvolver;
	}

	public void setBvolver(JButton bvolver) {
		this.bvolver = bvolver;
	}

	public String getNorep() {
		return norep;
	}

	public void setNorep(String norep) {
		this.norep = norep;
	}



}