package cbu.egr.capstone.filmapp;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class ChooseApplication extends JPanel {
	private JTextField txtCompany;
	private JTextField txtCoAddress;
	private JTextField txtCoPhone;
	private JTextField txtCoFax;
	private JTextField txtProjTitle;
	private JTextField txtProdType;
	private JTextField txtTotalPersonnel;
	private JTextField txtTotalVehicle;
	private JTextField txtGenerators;
	private JTextField txtCars;
	private JTextField txtTrucks;
	private JTextField txtRV;
	private JTextField txtOtherEquip;
	private JTextField txtInsuranceCompany;
	private JTextField txtStuntsSPFX;
	private JTextField txtPyro;
	private JTextField txtHazard;
	private JTextField txtAnimals;
	private JTextField txtAerial;

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
		lblCoFax.setBounds(180, 160, 55, 14);
		add(lblCoFax);
		
		JLabel lblProductionDates = new JLabel("Production Dates:");
		lblProductionDates.setBounds(10, 383, 105, 14);
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
		lblOther.setBounds(478, 502, 46, 14);
		add(lblOther);
		
		JLabel lblInsurance = new JLabel("Insurance:");
		lblInsurance.setBounds(10, 527, 85, 14);
		add(lblInsurance);
		
		JLabel lblInsuranceCompany = new JLabel("Insurance Company:");
		lblInsuranceCompany.setBounds(23, 552, 116, 14);
		add(lblInsuranceCompany);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date:");
		lblExpirationDate.setBounds(250, 552, 116, 14);
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
		lblTraffic.setBounds(600, 75, 46, 14);
		add(lblTraffic);
		
		JLabel lblStunts = new JLabel("Stunts/Special Effects:");
		lblStunts.setBounds(600, 100, 150, 14);
		add(lblStunts);
		
		JLabel lblPyro = new JLabel("Pyrotechnic Specifics:");
		lblPyro.setBounds(600, 125, 150, 14);
		add(lblPyro);
		
		JLabel lblHazard = new JLabel("Hazardous Materials to be Used:");
		lblHazard.setBounds(600, 150, 185, 14);
		add(lblHazard);
		
		JLabel lblAnimals = new JLabel("Animals to be Used:");
		lblAnimals.setBounds(600, 175, 125, 14);
		add(lblAnimals);
		
		JLabel lblAerial = new JLabel("Aerial Stunts/Elements:");
		lblAerial.setBounds(600, 200, 150, 14);
		add(lblAerial);
		
		txtCompany = new JTextField();
		txtCompany.setBounds(70, 107, 293, 20);
		add(txtCompany);
		txtCompany.setColumns(10);
		
		txtCoAddress = new JTextField();
		txtCoAddress.setBounds(64, 132, 299, 20);
		add(txtCoAddress);
		txtCoAddress.setColumns(10);
		
		txtCoPhone = new JTextField();
		txtCoPhone.setBounds(72, 157, 105, 20);
		add(txtCoPhone);
		txtCoPhone.setColumns(10);
		
		txtCoFax = new JTextField();
		txtCoFax.setBounds(227, 157, 128, 20);
		add(txtCoFax);
		txtCoFax.setColumns(10);
		
		txtProjTitle = new JTextField();
		txtProjTitle.setBounds(83, 355, 279, 20);
		add(txtProjTitle);
		txtProjTitle.setColumns(10);
		
		JComboBox cmboxMonth_1 = new JComboBox();
		cmboxMonth_1.setMaximumRowCount(12);
		cmboxMonth_1.setBounds(115, 379, 77, 20);
		add(cmboxMonth_1);
		cmboxMonth_1.setMaximumRowCount(12);
		cmboxMonth_1.addItem("January");
		cmboxMonth_1.addItem("February");
		cmboxMonth_1.addItem("March");
		cmboxMonth_1.addItem("April");
		cmboxMonth_1.addItem("May");
		cmboxMonth_1.addItem("June");
		cmboxMonth_1.addItem("July");
		cmboxMonth_1.addItem("August");
		cmboxMonth_1.addItem("September");
		cmboxMonth_1.addItem("October");
		cmboxMonth_1.addItem("November");
		cmboxMonth_1.addItem("December");
		
		JComboBox cmbxDay_1 = new JComboBox();
		cmbxDay_1.setBounds(202, 379, 55, 20);
		add(cmbxDay_1);
		cmbxDay_1.addItem(1);
		cmbxDay_1.addItem(2);
		cmbxDay_1.addItem(3);
		cmbxDay_1.addItem(4);
		cmbxDay_1.addItem(5);
		cmbxDay_1.addItem(6);
		cmbxDay_1.addItem(7);
		cmbxDay_1.addItem(8);
		cmbxDay_1.addItem(9);
		cmbxDay_1.addItem(10);
		cmbxDay_1.addItem(11);
		cmbxDay_1.addItem(12);
		cmbxDay_1.addItem(13);
		cmbxDay_1.addItem(14);
		cmbxDay_1.addItem(15);
		cmbxDay_1.addItem(16);
		cmbxDay_1.addItem(17);
		cmbxDay_1.addItem(18);
		cmbxDay_1.addItem(19);
		cmbxDay_1.addItem(20);
		cmbxDay_1.addItem(21);
		cmbxDay_1.addItem(22);
		cmbxDay_1.addItem(23);
		cmbxDay_1.addItem(24);
		cmbxDay_1.addItem(25);
		cmbxDay_1.addItem(26);
		cmbxDay_1.addItem(27);
		cmbxDay_1.addItem(28);
		cmbxDay_1.addItem(29);
		cmbxDay_1.addItem(30);
		cmbxDay_1.addItem(31);
		
		JComboBox cmboxYear_1 = new JComboBox();
		cmboxYear_1.setBounds(263, 379, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmboxYear_1.addItem(i);
		}
		add(cmboxYear_1);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setBounds(328, 383, 46, 14);
		add(lblTo);
		
		JComboBox cmboxMonth_2 = new JComboBox();
		cmboxMonth_2.setMaximumRowCount(12);
		cmboxMonth_2.setBounds(349, 379, 77, 20);
		add(cmboxMonth_2);
		cmboxMonth_2.setMaximumRowCount(12);
		cmboxMonth_2.addItem("January");
		cmboxMonth_2.addItem("February");
		cmboxMonth_2.addItem("March");
		cmboxMonth_2.addItem("April");
		cmboxMonth_2.addItem("May");
		cmboxMonth_2.addItem("June");
		cmboxMonth_2.addItem("July");
		cmboxMonth_2.addItem("August");
		cmboxMonth_2.addItem("September");
		cmboxMonth_2.addItem("October");
		cmboxMonth_2.addItem("November");
		cmboxMonth_2.addItem("December");
		
		JComboBox cmbxDay_2 = new JComboBox();
		cmbxDay_2.setBounds(436, 379, 55, 20);
		add(cmbxDay_2);
		cmbxDay_2.addItem(1);
		cmbxDay_2.addItem(2);
		cmbxDay_2.addItem(3);
		cmbxDay_2.addItem(4);
		cmbxDay_2.addItem(5);
		cmbxDay_2.addItem(6);
		cmbxDay_2.addItem(7);
		cmbxDay_2.addItem(8);
		cmbxDay_2.addItem(9);
		cmbxDay_2.addItem(10);
		cmbxDay_2.addItem(11);
		cmbxDay_2.addItem(12);
		cmbxDay_2.addItem(13);
		cmbxDay_2.addItem(14);
		cmbxDay_2.addItem(15);
		cmbxDay_2.addItem(16);
		cmbxDay_2.addItem(17);
		cmbxDay_2.addItem(18);
		cmbxDay_2.addItem(19);
		cmbxDay_2.addItem(20);
		cmbxDay_2.addItem(21);
		cmbxDay_2.addItem(22);
		cmbxDay_2.addItem(23);
		cmbxDay_2.addItem(24);
		cmbxDay_2.addItem(25);
		cmbxDay_2.addItem(26);
		cmbxDay_2.addItem(27);
		cmbxDay_2.addItem(28);
		cmbxDay_2.addItem(29);
		cmbxDay_2.addItem(30);
		cmbxDay_2.addItem(31);
		
		JComboBox cmboxYear_2 = new JComboBox();
		cmboxYear_2.setBounds(496, 379, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmboxYear_2.addItem(i);
		}
		add(cmboxYear_2);
		
		txtProdType = new JTextField();
		txtProdType.setBounds(108, 407, 255, 20);
		add(txtProdType);
		txtProdType.setColumns(10);
		
		txtTotalPersonnel = new JTextField();
		txtTotalPersonnel.setBounds(105, 449, 86, 20);
		add(txtTotalPersonnel);
		txtTotalPersonnel.setColumns(10);
		
		txtTotalVehicle = new JTextField();
		txtTotalVehicle.setBounds(160, 474, 86, 20);
		add(txtTotalVehicle);
		txtTotalVehicle.setColumns(10);
		
		txtGenerators = new JTextField();
		txtGenerators.setBounds(93, 499, 59, 20);
		add(txtGenerators);
		txtGenerators.setColumns(10);
		
		txtCars = new JTextField();
		txtCars.setColumns(10);
		txtCars.setBounds(191, 499, 59, 20);
		add(txtCars);
		
		txtTrucks = new JTextField();
		txtTrucks.setColumns(10);
		txtTrucks.setBounds(309, 499, 59, 20);
		add(txtTrucks);
		
		txtRV = new JTextField();
		txtRV.setColumns(10);
		txtRV.setBounds(410, 499, 59, 20);
		add(txtRV);
		
		txtOtherEquip = new JTextField();
		txtOtherEquip.setColumns(10);
		txtOtherEquip.setBounds(516, 499, 59, 20);
		add(txtOtherEquip);
		
		txtInsuranceCompany = new JTextField();
		txtInsuranceCompany.setBounds(142, 551, 99, 20);
		add(txtInsuranceCompany);
		txtInsuranceCompany.setColumns(10);
		
		JComboBox cmboxMonth_3 = new JComboBox();
		cmboxMonth_3.setMaximumRowCount(12);
		cmboxMonth_3.setBounds(343, 548, 77, 20);
		add(cmboxMonth_3);
		cmboxMonth_3.setMaximumRowCount(12);
		cmboxMonth_3.addItem("January");
		cmboxMonth_3.addItem("February");
		cmboxMonth_3.addItem("March");
		cmboxMonth_3.addItem("April");
		cmboxMonth_3.addItem("May");
		cmboxMonth_3.addItem("June");
		cmboxMonth_3.addItem("July");
		cmboxMonth_3.addItem("August");
		cmboxMonth_3.addItem("September");
		cmboxMonth_3.addItem("October");
		cmboxMonth_3.addItem("November");
		cmboxMonth_3.addItem("December");
		
		JComboBox cmbxDay_3 = new JComboBox();
		cmbxDay_3.setBounds(430, 548, 55, 20);
		add(cmbxDay_3);
		cmbxDay_3.addItem(1);
		cmbxDay_3.addItem(2);
		cmbxDay_3.addItem(3);
		cmbxDay_3.addItem(4);
		cmbxDay_3.addItem(5);
		cmbxDay_3.addItem(6);
		cmbxDay_3.addItem(7);
		cmbxDay_3.addItem(8);
		cmbxDay_3.addItem(9);
		cmbxDay_3.addItem(10);
		cmbxDay_3.addItem(11);
		cmbxDay_3.addItem(12);
		cmbxDay_3.addItem(13);
		cmbxDay_3.addItem(14);
		cmbxDay_3.addItem(15);
		cmbxDay_3.addItem(16);
		cmbxDay_3.addItem(17);
		cmbxDay_3.addItem(18);
		cmbxDay_3.addItem(19);
		cmbxDay_3.addItem(20);
		cmbxDay_3.addItem(21);
		cmbxDay_3.addItem(22);
		cmbxDay_3.addItem(23);
		cmbxDay_3.addItem(24);
		cmbxDay_3.addItem(25);
		cmbxDay_3.addItem(26);
		cmbxDay_3.addItem(27);
		cmbxDay_3.addItem(28);
		cmbxDay_3.addItem(29);
		cmbxDay_3.addItem(30);
		cmbxDay_3.addItem(31);
		
		JComboBox cmboxYear_3 = new JComboBox();
		cmboxYear_3.setBounds(491, 548, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmboxYear_3.addItem(i);
		}
		add(cmboxYear_3);
		
		JCheckBox chckbxPropOwnPermission = new JCheckBox("Yes/No");
		chckbxPropOwnPermission.setBounds(225, 573, 97, 23);
		add(chckbxPropOwnPermission);
		
		JCheckBox chckbxRoadEncroach = new JCheckBox("Yes/No");
		chckbxRoadEncroach.setBounds(225, 595, 97, 23);
		add(chckbxRoadEncroach);
		
		JCheckBox chckbxPolice = new JCheckBox("Yes/No");
		chckbxPolice.setBounds(105, 618, 97, 23);
		add(chckbxPolice);
		
		JCheckBox chckbxFire = new JCheckBox("Yes/No");
		chckbxFire.setBounds(90, 641, 97, 23);
		add(chckbxFire);
		
		JCheckBox chckbxSitePlanAttached = new JCheckBox("Site Plan Attached");
		chckbxSitePlanAttached.setBounds(640, 71, 140, 23);
		add(chckbxSitePlanAttached);
		
		JCheckBox chckbxSitePlanSubmit = new JCheckBox("Site Plan will be submitted by ");
		chckbxSitePlanSubmit.setBounds(780, 71, 195, 23);
		add(chckbxSitePlanSubmit);
		
		JComboBox cmboxMonth_4 = new JComboBox();
		cmboxMonth_4.setMaximumRowCount(12);
		cmboxMonth_4.setBounds(980, 71, 77, 20);
		add(cmboxMonth_4);
		cmboxMonth_4.setMaximumRowCount(12);
		cmboxMonth_4.addItem("January");
		cmboxMonth_4.addItem("February");
		cmboxMonth_4.addItem("March");
		cmboxMonth_4.addItem("April");
		cmboxMonth_4.addItem("May");
		cmboxMonth_4.addItem("June");
		cmboxMonth_4.addItem("July");
		cmboxMonth_4.addItem("August");
		cmboxMonth_4.addItem("September");
		cmboxMonth_4.addItem("October");
		cmboxMonth_4.addItem("November");
		cmboxMonth_4.addItem("December");
	
		JComboBox cmbxDay_4 = new JComboBox();
		cmbxDay_4.setBounds(1065, 71, 55, 20);
		add(cmbxDay_4);
		cmbxDay_4.addItem(1);
		cmbxDay_4.addItem(2);
		cmbxDay_4.addItem(3);
		cmbxDay_4.addItem(4);
		cmbxDay_4.addItem(5);
		cmbxDay_4.addItem(6);
		cmbxDay_4.addItem(7);
		cmbxDay_4.addItem(8);
		cmbxDay_4.addItem(9);
		cmbxDay_4.addItem(10);
		cmbxDay_4.addItem(11);
		cmbxDay_4.addItem(12);
		cmbxDay_4.addItem(13);
		cmbxDay_4.addItem(14);
		cmbxDay_4.addItem(15);
		cmbxDay_4.addItem(16);
		cmbxDay_4.addItem(17);
		cmbxDay_4.addItem(18);
		cmbxDay_4.addItem(19);
		cmbxDay_4.addItem(20);
		cmbxDay_4.addItem(21);
		cmbxDay_4.addItem(22);
		cmbxDay_4.addItem(23);
		cmbxDay_4.addItem(24);
		cmbxDay_4.addItem(25);
		cmbxDay_4.addItem(26);
		cmbxDay_4.addItem(27);
		cmbxDay_4.addItem(28);
		cmbxDay_4.addItem(29);
		cmbxDay_4.addItem(30);
		cmbxDay_4.addItem(31);
		
		JComboBox cmboxYear_4 = new JComboBox();
		cmboxYear_4.setBounds(1130, 71, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmboxYear_4.addItem(i);
		}
		add(cmboxYear_4);
		
		JCheckBox chckbxSitePlanNotAvailable = new JCheckBox("Site Plan not Available");
		chckbxSitePlanNotAvailable.setBounds(1195, 71, 150, 23);
		add(chckbxSitePlanNotAvailable);
		
		JCheckBox chckbxInsuranceAttached = new JCheckBox("Insurance Attached");
		chckbxInsuranceAttached.setBounds(77, 522, 140, 23);
		add(chckbxInsuranceAttached);
		
		JCheckBox chckbxInsuranceOnFile = new JCheckBox("Insurance on File");
		chckbxInsuranceOnFile.setBounds(220, 522, 130, 23);
		add(chckbxInsuranceOnFile);
		
		JCheckBox chckbxInsuranceSubmit = new JCheckBox("Insurance will be submitted by ");
		chckbxInsuranceSubmit.setBounds(355, 522, 200, 23);
		add(chckbxInsuranceSubmit);
		
		JComboBox cmboxMonth_5 = new JComboBox();
		cmboxMonth_5.setMaximumRowCount(12);
		cmboxMonth_5.setBounds(558, 523, 77, 20);
		add(cmboxMonth_5);
		cmboxMonth_5.setMaximumRowCount(12);
		cmboxMonth_5.addItem("January");
		cmboxMonth_5.addItem("February");
		cmboxMonth_5.addItem("March");
		cmboxMonth_5.addItem("April");
		cmboxMonth_5.addItem("May");
		cmboxMonth_5.addItem("June");
		cmboxMonth_5.addItem("July");
		cmboxMonth_5.addItem("August");
		cmboxMonth_5.addItem("September");
		cmboxMonth_5.addItem("October");
		cmboxMonth_5.addItem("November");
		cmboxMonth_5.addItem("December");
	
		JComboBox cmbxDay_5 = new JComboBox();
		cmbxDay_5.setBounds(645, 523, 55, 20);
		add(cmbxDay_5);
		cmbxDay_5.addItem(1);
		cmbxDay_5.addItem(2);
		cmbxDay_5.addItem(3);
		cmbxDay_5.addItem(4);
		cmbxDay_5.addItem(5);
		cmbxDay_5.addItem(6);
		cmbxDay_5.addItem(7);
		cmbxDay_5.addItem(8);
		cmbxDay_5.addItem(9);
		cmbxDay_5.addItem(10);
		cmbxDay_5.addItem(11);
		cmbxDay_5.addItem(12);
		cmbxDay_5.addItem(13);
		cmbxDay_5.addItem(14);
		cmbxDay_5.addItem(15);
		cmbxDay_5.addItem(16);
		cmbxDay_5.addItem(17);
		cmbxDay_5.addItem(18);
		cmbxDay_5.addItem(19);
		cmbxDay_5.addItem(20);
		cmbxDay_5.addItem(21);
		cmbxDay_5.addItem(22);
		cmbxDay_5.addItem(23);
		cmbxDay_5.addItem(24);
		cmbxDay_5.addItem(25);
		cmbxDay_5.addItem(26);
		cmbxDay_5.addItem(27);
		cmbxDay_5.addItem(28);
		cmbxDay_5.addItem(29);
		cmbxDay_5.addItem(30);
		cmbxDay_5.addItem(31);
		
		JComboBox cmboxYear_5 = new JComboBox();
		cmboxYear_5.setBounds(705, 523, 55, 20);
		for (int i = 2015; i < 2065; i++){
			cmboxYear_5.addItem(i);
		}
		add(cmboxYear_5);
		
		txtStuntsSPFX = new JTextField();
		txtStuntsSPFX.setBounds(735, 97, 602, 23);
		add(txtStuntsSPFX);
		
		txtPyro = new JTextField();
		txtPyro.setBounds(732, 122, 605, 23);
		add(txtPyro);
		
		txtHazard = new JTextField();
		txtHazard.setBounds(788, 147, 550, 23);
		add(txtHazard);
		
		txtAnimals = new JTextField();
		txtAnimals.setBounds(720, 172, 618, 23);
		add(txtAnimals);
		
		txtAerial = new JTextField();
		txtAerial.setBounds(736, 196, 602, 23);
		add(txtAerial);
		
		
		
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

	}
}
