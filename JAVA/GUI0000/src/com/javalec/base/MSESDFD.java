package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class MSESDFD extends JFrame {

	private JPanel contentPane;
	private JTextField strNum2;
	private JTextField strNum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MSESDFD frame = new MSESDFD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MSESDFD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		strNum2 = new JTextField();
		strNum2.setBounds(235, 92, 96, 21);
		contentPane.add(strNum2);
		strNum2.setColumns(10);
		
		strNum1 = new JTextField();
		strNum1.setText("asd");
		strNum1.setColumns(10);
		strNum1.setBounds(92, 92, 96, 21);
		contentPane.add(strNum1);
	}
	public void showMessage() {
	//	String str = strNum1.getText()	;
		String str = Integer.toString(Integer.parseInt(strNum1.getText() +Integer.parseInt(strNum2.getText()))); 
		JOptionPane.showMessageDialog(null, str);
		
	}
	
}
	
	
	





