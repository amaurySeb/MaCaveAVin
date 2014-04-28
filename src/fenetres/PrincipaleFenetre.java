package fenetres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PrincipaleFenetre extends JFrame implements ActionListener{

	JMenuBar barreMenu = new JMenuBar ();
	JMenu menu = new JMenu("Application");
	JMenu apropos = new JMenu ("?");
	

	JMenuItem itemAjout = new JMenuItem ("Ajouter");
	JMenuItem itemModif = new JMenuItem ("Modifier");
	JMenuItem itemSupp = new JMenuItem ("Supprimer");
	JMenuItem itemlist = new JMenuItem ("Lister");
	JMenuItem itemQuit = new JMenuItem ("Quitter");
	
	
	
	public PrincipaleFenetre (){
		super ();
		build();
	}
	
	private void build() {
		// TODO Auto-generated method stub
		setTitle("Cave a vin"); // On donne un titre à l'application
		setSize(750, 550); // On donne une taille à notre fenêtre
		setLocationRelativeTo(null); // On centre la fenêtre sur l'écran
		setResizable(true); // On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit à
														// l'application de se
														// fermer lors du clic
														// sur la croix
	
	
		//ajout des menus a ma jmenubarre
	
		this.menu.add(itemAjout);
		this.menu.add(itemModif);
		this.menu.add(itemSupp);
		this.menu.add(itemlist);
		this.menu.addSeparator();
		itemQuit.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		this.menu.add(itemQuit);
		
		this.barreMenu.add(menu);
		this.barreMenu.add(apropos);
		
		this.setJMenuBar(barreMenu);
	
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
