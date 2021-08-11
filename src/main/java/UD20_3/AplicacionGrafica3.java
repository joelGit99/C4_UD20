package UD20_3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import java.awt.Color;

public class AplicacionGrafica3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica3() {
		
		setTitle("Contador de veces pulsadas");
		setBounds(60, 20, 314, 282);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Botón 1:");
		etiqueta.setBounds(22, 18, 44, 20);
		contentPane.add(etiqueta);
		JLabel etiqueta2 = new JLabel("0");
		etiqueta2.setBounds(68, 18, 20, 20);
		contentPane.add(etiqueta2);
		
		JLabel lblNewLabel = new JLabel(" veces");
		lblNewLabel.setBounds(76, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Botón 2:");
		lblNewLabel_1.setBounds(124, 21, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(170, 21, 14, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("veces");
		lblNewLabel_3.setBounds(180, 21, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.setBounds(22, 49, 89, 23);
		contentPane.add(btnNewButton);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = etiqueta.getText();
				int num = Integer.parseInt(texto);
				num++;
				String numConv = Integer.toString(num);
				etiqueta.setText(numConv);
			}
		};
		
		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.setBounds(134, 49, 89, 23);
		contentPane.add(btnNewButton_1);
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = etiqueta2.getText();
				int num = Integer.parseInt(texto);
				num++;
				String numConv = Integer.toString(num);
				etiqueta2.setText(numConv);
			}
		};
		btnNewButton.addActionListener(al);
		btnNewButton_1.addActionListener(al2);
		setVisible(true);
	}

}
