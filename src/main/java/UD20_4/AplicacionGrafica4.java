package UD20_4;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class AplicacionGrafica4 extends JFrame {
	
	// Variables
	private JPanel contentPane;
	private JLabel textoEventos;
	private JLabel textoRatonClic;
	private JLabel textoRatonEntrado;
	private JLabel textoRatonSalido;
	private Font fuente;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		
		textoEventos = new JLabel("Eventos");
		textoEventos.setBounds(200,80,100,20);
		fuente = new Font("Arial", Font.BOLD, 15);
		textoEventos.setFont(fuente);
		contentPane.add(textoEventos);
		
		textoRatonClic = new JLabel("");
		textoRatonClic.setBounds(200,100,100,20);
		textoRatonEntrado = new JLabel("");
		textoRatonEntrado.setBounds(200,110,100,20);
		textoRatonSalido = new JLabel("");
		textoRatonSalido.setBounds(200, 120, 100, 20);
		contentPane.add(textoRatonClic);
		contentPane.add(textoRatonEntrado);
		contentPane.add(textoRatonSalido);
		
		// Listener del puntero
		MouseListener ml = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				textoRatonSalido.setText("Puntero salido en la ventana");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				textoRatonEntrado.setText("Puntero entrado en la ventana");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				textoRatonClic.setText("Ventana clicada");
			}
		};
		contentPane.addMouseListener(ml);
	}

}
