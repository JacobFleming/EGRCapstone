package cbu.egr.capstone.filmapp;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class ChooseApplication extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChooseApplication() {
		setLayout(null);
		
		JButton btnFilmPermitApp = new JButton("Film Permit Application");
		btnFilmPermitApp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnFilmPermitApp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				File filmPermit = new File("C:\\Users\\Owner\\Documents\\CBU\\Super Senior\\EGR 401 - Capstone\\Applications\\FilmingPermitApplication.pdf");
				try {
					Desktop.getDesktop().open(filmPermit);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnFilmPermitApp.setBounds(276, 23, 139, 23);
		add(btnFilmPermitApp);
		
		JButton btnRoadPermit = new JButton("Road Permit");
		btnRoadPermit.setBounds(276, 69, 139, 23);
		add(btnRoadPermit);
		
		JButton btnAnimalStip = new JButton("Animal Stipulations");
		btnAnimalStip.setBounds(276, 115, 139, 23);
		add(btnAnimalStip);
		
		JButton btnCreditsAgreement = new JButton("Credits Agreement");
		btnCreditsAgreement.setBounds(276, 161, 139, 23);
		add(btnCreditsAgreement);
		
		JButton btnCommercialFilmStip = new JButton("Commercial Film Stipulations");
		btnCommercialFilmStip.setBounds(250, 207, 165, 23);
		add(btnCommercialFilmStip);
		
		JButton btnSpecialEffects = new JButton("Special Effects / Hazardous Conditions");
		btnSpecialEffects.setBounds(198, 253, 217, 23);
		add(btnSpecialEffects);
		
		JLabel lblSelectAnApplication = new JLabel("Select an Application");
		lblSelectAnApplication.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectAnApplication.setBounds(69, 94, 139, 19);
		add(lblSelectAnApplication);
		
		JLabel lblToFillOut = new JLabel("To Fill Out");
		lblToFillOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblToFillOut.setBounds(101, 124, 74, 14);
		add(lblToFillOut);

	}
}