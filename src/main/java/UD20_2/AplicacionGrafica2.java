package UD20_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.SystemColor;

public class AplicacionGrafica2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana con interacción");
		setBounds(400,200,250,300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel(" ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 88, 193, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Button 1");
		btnNewButton.setBounds(10, 40, 89, 14);
		contentPane.add(btnNewButton);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado el botón 1");
			}
		};
		
		JButton btnNewButton_1 = new JButton("Button 2");
		btnNewButton_1.setBounds(128, 40, 96, 14);
		contentPane.add(btnNewButton_1);
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado el botón 2");
			}
		};
		btnNewButton.addActionListener(al);
		btnNewButton_1.addActionListener(al2);
		setVisible(true);
		
	}

}
