package fenetres;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;

import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class FenetreEntrerVin extends JFrame  implements ActionListener{
	private JTextField textField;
	private JTextField textField_1;
	
    JButton btnAnnuler = new JButton("annuler ");
    JButton btnSauver = new JButton("sauver ");
    JLabel lblDescription = new JLabel("caracteristique");
	/**
	 * Create the panel.
	 */
	public FenetreEntrerVin() {
		this.setBounds(10, 10, 580, 324);
		getContentPane().setLayout(null);
		this.setTitle("entrer un vin" );
		JLabel lblDenomination = new JLabel("denomination");
		lblDenomination.setBounds(52, 47, 117, 20);
		getContentPane().add(lblDenomination);
		
		textField = new JTextField();
		textField.setBounds(154, 47, 133, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		btnSauver.addActionListener(this);
		btnSauver.setBounds(52, 176, 89, 23);
		getContentPane().add(btnSauver);
		
		
		btnAnnuler.setBounds(163, 176, 89, 23);
		getContentPane().add(btnAnnuler);
		btnAnnuler.addActionListener(this);
		
		
		lblDescription.setBounds(52, 78, 89, 14);
		getContentPane().add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 78, 133, 72);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == btnAnnuler)
		{
			textField.setText("");
			textField_1.setText("");
			
		}
	}
}
