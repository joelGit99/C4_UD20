package UD20_9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memory extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Memory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setForeground(Color.WHITE);
		tglbtnNewToggleButton.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton.setBounds(0, 0, 78, 69);
		contentPane.add(tglbtnNewToggleButton);
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		};
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1.setBounds(69, 0, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("");
		tglbtnNewToggleButton_1_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1.setBounds(139, 0, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1);
		
		JToggleButton tglbtnNewToggleButton_1_1_1 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1.setBounds(208, 0, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_1 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_1.setBounds(0, 66, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_1);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_2 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_2.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_2.setBounds(69, 66, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_2);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_3 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_3.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_3.setBounds(139, 66, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_3);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_4 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_4.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_4.setBounds(208, 66, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_4);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_5 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_5.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_5.setBounds(0, 130, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_5);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_6 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_6.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_6.setBounds(69, 130, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_6);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_7 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_7.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_7.setBounds(139, 130, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_7);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_8 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_8.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_8.setBounds(208, 130, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_8);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_9 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_9.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_9.setBounds(0, 197, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_9);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_10 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_10.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_10.setBounds(69, 197, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_10);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_11 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_11.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_11.setBounds(139, 197, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_11);
		
		JToggleButton tglbtnNewToggleButton_1_1_1_12 = new JToggleButton("");
		tglbtnNewToggleButton_1_1_1_12.setBackground(Color.LIGHT_GRAY);
		tglbtnNewToggleButton_1_1_1_12.setBounds(208, 197, 78, 69);
		contentPane.add(tglbtnNewToggleButton_1_1_1_12);
	}
}
