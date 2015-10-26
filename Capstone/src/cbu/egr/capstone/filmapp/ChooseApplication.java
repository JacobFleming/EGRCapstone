package cbu.egr.capstone.filmapp;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JComboBox;

public class ChooseApplication extends JPanel {

	/**
	 * Create the panel.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ChooseApplication() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		setLayout(null);
		
		JLabel lblFilmPermitApplication = new JLabel("Film Permit Application");
		lblFilmPermitApplication.setBounds(302, 11, 165, 53);
		add(lblFilmPermitApplication);
		lblFilmPermitApplication.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(10, 59, 59, 53);
		add(lblDate);
		
		JComboBox cmbxMonth = new JComboBox();
		cmbxMonth.setBounds(49, 75, 77, 20);
		add(cmbxMonth);
		cmbxMonth.setMaximumRowCount(12);
		cmbxMonth.addItem("January");
		cmbxMonth.addItem("February");
		cmbxMonth.addItem("March");
		cmbxMonth.addItem("April");
		cmbxMonth.addItem("May");
		cmbxMonth.addItem("June");
		cmbxMonth.addItem("July");
		cmbxMonth.addItem("August");
		cmbxMonth.addItem("September");
		cmbxMonth.addItem("October");
		cmbxMonth.addItem("November");
		cmbxMonth.addItem("December");
		
		JComboBox cmbxDay = new JComboBox();
		cmbxDay.setBounds(136, 75, 55, 20);
		add(cmbxDay);
		cmbxDay.addItem(1);
		cmbxDay.addItem(2);
		cmbxDay.addItem(3);
		cmbxDay.addItem(4);
		cmbxDay.addItem(5);
		cmbxDay.addItem(6);
		cmbxDay.addItem(7);
		cmbxDay.addItem(8);
		cmbxDay.addItem(9);
		cmbxDay.addItem(10);
		cmbxDay.addItem(11);
		cmbxDay.addItem(12);
		cmbxDay.addItem(13);
		cmbxDay.addItem(14);
		cmbxDay.addItem(15);
		cmbxDay.addItem(16);
		cmbxDay.addItem(17);
		cmbxDay.addItem(18);
		cmbxDay.addItem(19);
		cmbxDay.addItem(20);
		cmbxDay.addItem(21);
		cmbxDay.addItem(22);
		cmbxDay.addItem(23);
		cmbxDay.addItem(24);
		cmbxDay.addItem(25);
		cmbxDay.addItem(26);
		cmbxDay.addItem(27);
		cmbxDay.addItem(28);
		cmbxDay.addItem(29);
		cmbxDay.addItem(30);
		cmbxDay.addItem(31);
		
		JComboBox cmbxYear = new JComboBox();
		cmbxYear.setBounds(197, 75, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmbxYear.addItem(i);
		}
		add(cmbxYear);
		
		JLabel lblCompany = new JLabel("Company:");
		lblCompany.setBounds(10, 110, 59, 14);
		add(lblCompany);
		
		JLabel lblProjectTitle = new JLabel("Project Title:");
		lblProjectTitle.setBounds(10, 358, 77, 14);
		add(lblProjectTitle);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 135, 55, 14);
		add(lblAddress);
		
		JLabel lblCoPhone = new JLabel("CO Phone:");
		lblCoPhone.setBounds(10, 160, 59, 14);
		add(lblCoPhone);
		
		JLabel lblCoFax = new JLabel("CO Fax:");
		lblCoFax.setBounds(177, 160, 55, 14);
		add(lblCoFax);
		
		JLabel lblProductionDates = new JLabel("Production Dates:");
		lblProductionDates.setBounds(10, 383, 92, 14);
		add(lblProductionDates);
		
		JLabel lblLocationManager = new JLabel("Location Manager:");
		lblLocationManager.setBounds(10, 207, 92, 14);
		add(lblLocationManager);
		
		JLabel lblLMPhone = new JLabel("Phone:");
		lblLMPhone.setBounds(23, 232, 46, 14);
		add(lblLMPhone);
		
		JLabel lblProductionManager = new JLabel("Production Manager:");
		lblProductionManager.setBounds(10, 257, 116, 14);
		add(lblProductionManager);
		
		JLabel lblPMPhone = new JLabel("Phone:");
		lblPMPhone.setBounds(23, 282, 46, 14);
		add(lblPMPhone);
		
		JLabel lblOtherContact = new JLabel("Other Contact:");
		lblOtherContact.setBounds(10, 307, 77, 14);
		add(lblOtherContact);
		
		JLabel lblProductionType = new JLabel("Production Type:");
		lblProductionType.setBounds(10, 408, 116, 14);
		add(lblProductionType);
		
		JLabel lblTotalPersonnel = new JLabel("Total Personnel:");
		lblTotalPersonnel.setBounds(10, 452, 100, 14);
		add(lblTotalPersonnel);
		
		JLabel lblTotalVehicles = new JLabel("Total Vehicles/Equipment:");
		lblTotalVehicles.setBounds(10, 477, 155, 14);
		add(lblTotalVehicles);
		
		JLabel lblGenerators = new JLabel("Generators:");
		lblGenerators.setBounds(23, 502, 85, 14);
		add(lblGenerators);
		
		JLabel lblCars = new JLabel("Cars:");
		lblCars.setBounds(156, 502, 46, 14);
		add(lblCars);
		
		JLabel lblTrucks = new JLabel("Trucks:");
		lblTrucks.setBounds(264, 502, 46, 14);
		add(lblTrucks);
		
		JLabel lblRvs = new JLabel("RV's:");
		lblRvs.setBounds(379, 502, 46, 14);
		add(lblRvs);
		
		JLabel lblOther = new JLabel("Other:");
		lblOther.setBounds(497, 502, 46, 14);
		add(lblOther);
		
		JLabel lblInsurance = new JLabel("Insurance:");
		lblInsurance.setBounds(10, 527, 85, 14);
		add(lblInsurance);
		
		JLabel lblInsuranceCompany = new JLabel("Insurance Company:");
		lblInsuranceCompany.setBounds(23, 552, 116, 14);
		add(lblInsuranceCompany);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date:");
		lblExpirationDate.setBounds(236, 552, 116, 14);
		add(lblExpirationDate);
		
		JLabel lblPropertyOwnerPermission = new JLabel("Property Owner Permission Required:");
		lblPropertyOwnerPermission.setBounds(10, 577, 230, 14);
		add(lblPropertyOwnerPermission);
		
		JLabel lblRoadEncroachmentPermitRequired = new JLabel("Road Encroachment Permit Required:");
		lblRoadEncroachmentPermitRequired.setBounds(10, 600, 230, 14);
		add(lblRoadEncroachmentPermitRequired);
		
		JLabel lblPoliceRequired = new JLabel("Police Required:");
		lblPoliceRequired.setBounds(10, 623, 150, 14);
		add(lblPoliceRequired);
		
		JLabel lblFireRequired = new JLabel("Fire Required:");
		lblFireRequired.setBounds(10, 646, 150, 14);
		add(lblFireRequired);
		
		JLabel lblTraffic = new JLabel("Traffic:");
		lblTraffic.setBounds(600, 75, 75, 14);
		add(lblTraffic);
		
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

	}
}
