package UD20_1;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import java.awt.event.*;

public class AplicacionGrafica1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica1() {
		setBackground(SystemColor.activeCaption);
		setTitle("Cambiar tamaño");
		setBounds(400,200,250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Etiqueta");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setSize(new Dimension(20, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(68, 22, 74, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(68, 79, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el ancho");
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(68, 54, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Introduce el alto");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(44, 120, 121, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Cambiar tamaño");
		btnNewButton.setBounds(57, 185, 113, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 145, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		ActionListener al = new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String f1 = textField.getText();
				int field1 = Integer.parseInt(f1);
				String f2 = textField_1.getText();
				int field2 = Integer.parseInt(f2);
				lblNewLabel.setBounds(68,22,field1,field2);
			}
		};
		btnNewButton.addActionListener(al);
		setVisible(true);
	}
}
