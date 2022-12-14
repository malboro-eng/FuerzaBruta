package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Inicio inicio;
	private ImagenPrincipal img;
	private Algoritmo alg;
	private AlgoritmoBm alg2;
	
	/**
	 * Se instancian los diferentes componentes para nustra interface
	 * y se les pasa un action listenr a nustros botones.
	 * @param c
	 */
	public View(Controller c) {
	
		img = new ImagenPrincipal();
		setSize(500, 400);
		setContentPane(img);
		setResizable(false);
		setVisible(true);
		setTitle("Algoritmos de fuerza bruta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		inicio = new Inicio(c);
		inicio.setSize(500, 400);
		getContentPane().add(inicio);

		alg = new Algoritmo(c);
		alg2 = new AlgoritmoBm(c);
		alg.setSize(700, 500);
		getContentPane().add(alg);
		alg2.setSize(700, 500);
		getContentPane().add(alg2);
		
		alg.getBsearchkmp().addActionListener(c);
		alg.getBsearchmkmp().addActionListener(c);
		alg.getBvolver().addActionListener(c);
		alg.getBsubir().addActionListener(c);
		
		alg2.getBsearchbm().addActionListener(c);
		alg2.getBsearchmbm().addActionListener(c);
		alg2.getBvolver1().addActionListener(c);
		alg2.getBsubir1().addActionListener(c);


		inicio.getBm().addActionListener(c);
		inicio.getKmp().addActionListener(c);

		inicio.updateUI();
		alg2.updateUI();
		alg.updateUI();
	}


	public Algoritmo getAlg() {
		return alg;
	}

	public void setAlg(Algoritmo alg) {
		this.alg = alg;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public AlgoritmoBm getAlg2() {
		return alg2;
	}

	public void setAlg2(AlgoritmoBm alg2) {
		this.alg2 = alg2;
	}

}
