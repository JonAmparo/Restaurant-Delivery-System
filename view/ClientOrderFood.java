package view;

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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;

public class ClientOrderFood extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfPostalCode;
	private JTextField tfMealItem;
	private JTextField tfPrice;
	private JTextField tfQuantity;
	private JTextField tfTotal;

	private JButton btnAdd, btnRemove, btnOrder;
	
	private JList listRestaurant, listMenu, listOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientOrderFood frame = new ClientOrderFood();
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
	public ClientOrderFood() {
		setTitle("Client - Order Food | Restuarant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);

		JMenuItem menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);

		JMenuItem menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);

		JMenu menuAccount = new JMenu("Account");
		menuAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuAccount);

		JMenuItem menuItemEditAccount = new JMenuItem("Edit Account");
		menuItemEditAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemEditAccount);

		JMenuItem menuItemCloseAccount = new JMenuItem("Close Account");
		menuItemCloseAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemCloseAccount);

		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);

		JMenuItem menuItemOrderFood = new JMenuItem("Order Food");
		menuItemOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderFood);

		JMenuItem menuItemOrderHistory = new JMenuItem("Order History");
		menuItemOrderHistory.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderHistory);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOrderFood = new JLabel("Order Food");
		lblOrderFood.setFont(new Font("Arial", Font.BOLD, 18));
		lblOrderFood.setBounds(441, 0, 125, 61);
		contentPane.add(lblOrderFood);

		JLabel lblDeliveryDate = new JLabel("Delivery Time:");
		lblDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryDate.setBounds(325, 93, 183, 33);
		contentPane.add(lblDeliveryDate);

		tfDeliveryDate = new JTextField();
		tfDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		tfDeliveryDate.setBounds(515, 67, 109, 25);
		contentPane.add(tfDeliveryDate);
		tfDeliveryDate.setColumns(10);

		JLabel label = new JLabel("Delivery date(yyyy/mm/dd):");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(325, 59, 183, 33);
		contentPane.add(label);

		JComboBox cbDeliveryTime = new JComboBox();
		cbDeliveryTime.setBounds(515, 98, 110, 25);
		contentPane.add(cbDeliveryTime);

		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(325, 124, 183, 33);
		contentPane.add(lblPostalCode);

		tfPostalCode = new JTextField();
		tfPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		tfPostalCode.setColumns(10);
		tfPostalCode.setBounds(515, 128, 109, 25);
		contentPane.add(tfPostalCode);

		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(95, 201, 83, 33);
		contentPane.add(lblRestaurant);

		listRestaurant = new JList();
		listRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		listRestaurant.setBounds(24, 229, 230, 361);
		contentPane.add(listRestaurant);

		listMenu = new JList();
		listMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		listMenu.setBounds(273, 229, 230, 361);
		contentPane.add(listMenu);

		listOrder = new JList();
		listOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		listOrder.setBounds(722, 229, 230, 361);
		contentPane.add(listOrder);

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Arial", Font.BOLD, 15));
		lblMenu.setBounds(361, 205, 47, 25);
		contentPane.add(lblMenu);

		JLabel lblOrder = new JLabel("Order");
		lblOrder.setFont(new Font("Arial", Font.BOLD, 15));
		lblOrder.setBounds(823, 205, 47, 25);
		contentPane.add(lblOrder);

		JLabel lblMealItem = new JLabel("Meal Item:");
		lblMealItem.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMealItem.setBounds(513, 323, 72, 25);
		contentPane.add(lblMealItem);

		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPrice.setBounds(513, 359, 72, 25);
		contentPane.add(lblPrice);

		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Arial", Font.PLAIN, 15));
		lblQuantity.setBounds(513, 395, 72, 25);
		contentPane.add(lblQuantity);

		tfMealItem = new JTextField();
		tfMealItem.setFont(new Font("Arial", Font.PLAIN, 15));
		tfMealItem.setColumns(10);
		tfMealItem.setBounds(595, 323, 109, 25);
		contentPane.add(tfMealItem);

		tfPrice = new JTextField();
		tfPrice.setFont(new Font("Arial", Font.PLAIN, 15));
		tfPrice.setColumns(10);
		tfPrice.setBounds(595, 359, 109, 25);
		contentPane.add(tfPrice);

		tfQuantity = new JTextField();
		tfQuantity.setFont(new Font("Arial", Font.PLAIN, 15));
		tfQuantity.setColumns(10);
		tfQuantity.setBounds(595, 395, 109, 25);
		contentPane.add(tfQuantity);

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdd.setBounds(568, 457, 95, 33);
		contentPane.add(btnAdd);

		btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Arial", Font.PLAIN, 15));
		btnRemove.setBounds(568, 506, 95, 33);
		contentPane.add(btnRemove);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTotal.setBounds(505, 627, 47, 33);
		contentPane.add(lblTotal);

		tfTotal = new JTextField();
		tfTotal.setFont(new Font("Arial", Font.PLAIN, 15));
		tfTotal.setColumns(10);
		tfTotal.setBounds(554, 634, 109, 25);
		contentPane.add(tfTotal);

		JLabel lblMoneySign = new JLabel("$");
		lblMoneySign.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMoneySign.setBounds(673, 627, 16, 33);
		contentPane.add(lblMoneySign);

		btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		btnOrder.setBounds(705, 633, 95, 33);
		contentPane.add(btnOrder);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	 * @return the tfMealItem
	 */
	public JTextField getTfMealItem() {
		return tfMealItem;
	}

	/**
	 * @param tfMealItem the tfMealItem to set
	 */
	public void setTfMealItem(JTextField tfMealItem) {
		this.tfMealItem = tfMealItem;
	}

	/**
	 * @return the tfPrice
	 */
	public JTextField getTfPrice() {
		return tfPrice;
	}

	/**
	 * @param tfPrice the tfPrice to set
	 */
	public void setTfPrice(JTextField tfPrice) {
		this.tfPrice = tfPrice;
	}

	/**
	 * @return the tfQuantity
	 */
	public JTextField getTfQuantity() {
		return tfQuantity;
	}

	/**
	 * @param tfQuantity the tfQuantity to set
	 */
	public void setTfQuantity(JTextField tfQuantity) {
		this.tfQuantity = tfQuantity;
	}

	/**
	 * @return the tfTotal
	 */
	public JTextField getTfTotal() {
		return tfTotal;
	}

	/**
	 * @param tfTotal the tfTotal to set
	 */
	public void setTfTotal(JTextField tfTotal) {
		this.tfTotal = tfTotal;
	}

	/**
	 * @return the btnAdd
	 */
	public JButton getBtnAdd() {
		return btnAdd;
	}

	/**
	 * @param btnAdd the btnAdd to set
	 */
	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	/**
	 * @return the btnRemove
	 */
	public JButton getBtnRemove() {
		return btnRemove;
	}

	/**
	 * @param btnRemove the btnRemove to set
	 */
	public void setBtnRemove(JButton btnRemove) {
		this.btnRemove = btnRemove;
	}

	/**
	 * @return the btnOrder
	 */
	public JButton getBtnOrder() {
		return btnOrder;
	}

	/**
	 * @param btnOrder the btnOrder to set
	 */
	public void setBtnOrder(JButton btnOrder) {
		this.btnOrder = btnOrder;
	}

	/**
	 * @return the listRestaurant
	 */
	public JList getListRestaurant() {
		return listRestaurant;
	}

	/**
	 * @param listRestaurant the listRestaurant to set
	 */
	public void setListRestaurant(JList listRestaurant) {
		this.listRestaurant = listRestaurant;
	}

	/**
	 * @return the listMenu
	 */
	public JList getListMenu() {
		return listMenu;
	}

	/**
	 * @param listMenu the listMenu to set
	 */
	public void setListMenu(JList listMenu) {
		this.listMenu = listMenu;
	}

	/**
	 * @return the listOrder
	 */
	public JList getListOrder() {
		return listOrder;
	}

	/**
	 * @param listOrder the listOrder to set
	 */
	public void setListOrder(JList listOrder) {
		this.listOrder = listOrder;
	}
	
	

}
