package view_draft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class ChefAcceptView extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfDeliveryTime;
	private JTextField tfPostalCode;

	private JButton btnGoBack, btnAcceptOrder;
	private JList listMealInOrder, listRestaurantsOrders;
	private JMenuItem menuItemDisconnect, menuItemQuit, menuItemViewOrders, menuItemAcceptMarkOrders;


	/**
	 * Create the frame.
	 */
	public ChefAcceptView() {
		setTitle("Food Ordering Software");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);

		menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);

		menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);

		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);

		menuItemViewOrders = new JMenuItem("View Orders");
		menuItemViewOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemViewOrders);

		menuItemAcceptMarkOrders = new JMenuItem("Accept/Mark Orders");
		menuItemAcceptMarkOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemAcceptMarkOrders);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Accepting Orders");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(608, 2, 211, 62);
		contentPane.add(lblNewLabel);

		JLabel lblDeliveryDate = new JLabel("Delivery Date (yyyy/mm/dd):");
		lblDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryDate.setBounds(486, 75, 221, 26);
		contentPane.add(lblDeliveryDate);

		tfDeliveryDate = new JTextField();
		tfDeliveryDate.setEnabled(false);
		tfDeliveryDate.setBounds(717, 73, 186, 26);
		contentPane.add(tfDeliveryDate);
		tfDeliveryDate.setColumns(10);

		JLabel lblDeliveryTime = new JLabel("Delivery Time:");
		lblDeliveryTime.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryTime.setBounds(486, 101, 221, 26);
		contentPane.add(lblDeliveryTime);

		tfDeliveryTime = new JTextField();
		tfDeliveryTime.setEnabled(false);
		tfDeliveryTime.setColumns(10);
		tfDeliveryTime.setBounds(717, 102, 186, 26);
		contentPane.add(tfDeliveryTime);

		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(486, 131, 221, 26);
		contentPane.add(lblPostalCode);

		tfPostalCode = new JTextField();
		tfPostalCode.setEnabled(false);
		tfPostalCode.setColumns(10);
		tfPostalCode.setBounds(717, 132, 186, 26);
		contentPane.add(tfPostalCode);

		JLabel lblMealOrder = new JLabel("Meal in Order");
		lblMealOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMealOrder.setBounds(487, 183, 113, 26);
		contentPane.add(lblMealOrder);

		listMealInOrder = new JList();
		listMealInOrder.setEnabled(false);
		listMealInOrder.setBounds(486, 219, 417, 307);
		contentPane.add(listMealInOrder);

		JLabel lblRestaurant = new JLabel("Pending Orders");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(181, 45, 130, 26);
		contentPane.add(lblRestaurant);

		btnGoBack = new JButton("Go Back");
		btnGoBack.setFont(new Font("Arial", Font.PLAIN, 15));
		btnGoBack.setBounds(538, 551, 144, 34);
		contentPane.add(btnGoBack);

		listRestaurantsOrders = new JList();
		listRestaurantsOrders.setBorder(new CompoundBorder());
		listRestaurantsOrders.setBounds(67, 73, 359, 512);
		contentPane.add(listRestaurantsOrders);

		btnAcceptOrder = new JButton("Accept Order");
		btnAcceptOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAcceptOrder.setBounds(710, 551, 146, 34);
		contentPane.add(btnAcceptOrder);

		this.setVisible(false);
	}

	/**
	 * @return the tfDeliveryDate
	 */
	public JTextField getTfDeliveryDate() {
		return tfDeliveryDate;
	}

	/**
	 * @param tfDeliveryDate the tfDeliveryDate to set
	 */
	public void setTfDeliveryDate(JTextField tfDeliveryDate) {
		this.tfDeliveryDate = tfDeliveryDate;
	}

	/**
	 * @return the tfDeliveryTime
	 */
	public JTextField getTfDeliveryTime() {
		return tfDeliveryTime;
	}

	/**
	 * @param tfDeliveryTime the tfDeliveryTime to set
	 */
	public void setTfDeliveryTime(JTextField tfDeliveryTime) {
		this.tfDeliveryTime = tfDeliveryTime;
	}

	/**
	 * @return the tfPostalCode
	 */
	public JTextField getTfPostalCode() {
		return tfPostalCode;
	}

	/**
	 * @param tfPostalCode the tfPostalCode to set
	 */
	public void setTfPostalCode(JTextField tfPostalCode) {
		this.tfPostalCode = tfPostalCode;
	}

	/**
	 * @return the btnGoBack
	 */
	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	/**
	 * @param btnGoBack the btnGoBack to set
	 */
	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

	/**
	 * @return the btnAcceptOrder
	 */
	public JButton getBtnAcceptOrder() {
		return btnAcceptOrder;
	}

	/**
	 * @param btnAcceptOrder the btnAcceptOrder to set
	 */
	public void setBtnAcceptOrder(JButton btnAcceptOrder) {
		this.btnAcceptOrder = btnAcceptOrder;
	}

	/**
	 * @return the menuItemDisconnect
	 */
	public JMenuItem getMenuItemDisconnect() {
		return menuItemDisconnect;
	}

	/**
	 * @param menuItemDisconnect the menuItemDisconnect to set
	 */
	public void setMenuItemDisconnect(JMenuItem menuItemDisconnect) {
		this.menuItemDisconnect = menuItemDisconnect;
	}

	/**
	 * @return the menuItemQuit
	 */
	public JMenuItem getMenuItemQuit() {
		return menuItemQuit;
	}

	/**
	 * @param menuItemQuit the menuItemQuit to set
	 */
	public void setMenuItemQuit(JMenuItem menuItemQuit) {
		this.menuItemQuit = menuItemQuit;
	}

	/**
	 * @return the listMealInOrder
	 */
	public JList getListMealInOrder() {
		return listMealInOrder;
	}

	/**
	 * @param listMealInOrder the listMealInOrder to set
	 */
	public void setListMealInOrder(JList listMealInOrder) {
		this.listMealInOrder = listMealInOrder;
	}

	/**
	 * @return the listRestaurantsOrders
	 */
	public JList getListRestaurantsOrders() {
		return listRestaurantsOrders;
	}

	/**
	 * @param listRestaurantsOrders the listRestaurantsOrders to set
	 */
	public void setListRestaurantsOrders(JList listRestaurantsOrders) {
		this.listRestaurantsOrders = listRestaurantsOrders;
	}

	/**
	 * @return the menuItemViewOrders
	 */
	public JMenuItem getMenuItemViewOrders() {
		return menuItemViewOrders;
	}

	/**
	 * @param menuItemViewOrders the menuItemViewOrders to set
	 */
	public void setMenuItemViewOrders(JMenuItem menuItemViewOrders) {
		this.menuItemViewOrders = menuItemViewOrders;
	}

	/**
	 * @return the menuItemAcceptMarkOrders
	 */
	public JMenuItem getMenuItemAcceptMarkOrders() {
		return menuItemAcceptMarkOrders;
	}

	/**
	 * @param menuItemAcceptMarkOrders the menuItemAcceptMarkOrders to set
	 */
	public void setMenuItemAcceptMarkOrders(JMenuItem menuItemAcceptMarkOrders) {
		this.menuItemAcceptMarkOrders = menuItemAcceptMarkOrders;
	}	

}
