package fenetre;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe graphique
 * 
 * @author Diesnis
 * @version 1
 */

public class Graphique extends JFrame implements ActionListener {

	private JPanel containerPanel;

	/**
	 * bouton de selection
	 */
	private JButton boutonvalidation;
	private JButton boutonsaisirclient;
	private JButton boutonsaisirmaintenance;
	private JButton boutonsaisiroperateur;
	private JButton boutonmodifierdevis;
	private JButton boutonaffecteroperateur;
	private JButton boutonmodifierfiche;
	private JButton boutonfacturation;
	private JButton boutonsuivireglement;
	private JButton boutoncloturedossier;
	private JButton boutoneditionrapport;

	/**
	 * Constructeur Définit la fenêtre et ses composants - affiche la fenêtre
	 */
	public Graphique() {
		// on instancie la classe Comptable DAO
		// this.DAO = new DAO();

		// on fixe le titre de la fenêtre
		this.setTitle("Menu");
		// initialisation de la taille de la fenêtre
		this.setSize(500, 630);
		this.setLocationRelativeTo(null);
		// création du conteneur
		containerPanel = new JPanel();

		// choix du Layout pour ce conteneur
		// il permet de gérer la position des éléments
		// il autorisera un retaillage de la fenêtre en conservant la
		// présentation
		// BoxLayout permet par exemple de positionner les élements sur une
		// colonne ( PAGE_AXIS )
		containerPanel.setLayout(null);

		// choix de la couleur pour le conteneur
		containerPanel.setBackground(Color.lightGray);
		// instantiation des composants graphiques

		boutonvalidation = new JButton("validation");

		boutonsaisirclient = new JButton("saisirclient");

		boutonsaisirmaintenance = new JButton("saisirmaintenance");
		boutonsaisirmaintenance.addActionListener(this);

		boutonsaisiroperateur = new JButton("saisiroperateur");

		boutonmodifierdevis = new JButton("modifierdevis");

		boutonaffecteroperateur = new JButton("affecteroperateur");

		boutonmodifierfiche = new JButton("modifierfiche");

		boutonfacturation = new JButton("facturation de preComptable");

		boutonsuivireglement = new JButton("suivi du reglement");
		boutonsuivireglement.addActionListener(this);

		boutoncloturedossier = new JButton("cloture du dossier");

		boutoneditionrapport = new JButton("edition du rapport d'activite au client");

		// ajout des composants sur le container
		// introduire une espace constant entre le champ texte et le composant
		// suivant
		boutonvalidation.setBounds(175, 22, 150, 30);
		boutonsaisirclient.setBounds(175, 74, 150, 30);
		boutonsaisirmaintenance.setBounds(175, 126, 150, 30);
		boutonsaisiroperateur.setBounds(175, 178, 150, 30);
		boutonmodifierdevis.setBounds(175, 230, 150, 30);
		boutonaffecteroperateur.setBounds(175, 282, 150, 30);
		boutonmodifierfiche.setBounds(175, 334, 150, 30);
		boutonfacturation.setBounds(150, 386, 200, 30);
		boutonsuivireglement.setBounds(175, 438, 150, 30);
		boutoncloturedossier.setBounds(175, 490, 150, 30);
		boutoneditionrapport.setBounds(125, 542, 250, 30);
		
		
		containerPanel.add(boutonvalidation);
		containerPanel.add(boutonsaisirclient);
		containerPanel.add(boutonsaisirmaintenance);
		containerPanel.add(boutonsaisiroperateur);
		containerPanel.add(boutonmodifierdevis);	
		containerPanel.add(boutonaffecteroperateur);
		containerPanel.add(boutonmodifierfiche);
		containerPanel.add(boutonfacturation);
		containerPanel.add(boutonsuivireglement);
		containerPanel.add(boutoncloturedossier);
		containerPanel.add(boutoneditionrapport);


		// ajouter une bordure vide de taille constante autour de l'ensemble des
		// composants
		containerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 5));

		// permet de quitter l'application si on ferme la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(containerPanel);

		// affichage de la fenêtre
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == boutonsaisirmaintenance) {
			this.dispose();
			Graphiquemaintenance ap = new Graphiquemaintenance();
		}
		if (ae.getSource() == boutonsuivireglement) {
			this.dispose();
			Graphique_Yang apa = new Graphique_Yang();
		}
	}
}