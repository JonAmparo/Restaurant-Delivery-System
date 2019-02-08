package view_draft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class ClientOrderFoodView extends JFrame {

	private JPanel contentPane;
	private JTextField tfMealItem;
	private JTextField tfPrice;
	private JTextField tfQuantity;
	private JTextField tfTotal;

	private JButton btnAdd, btnRemove, btnOrder;
	private JList listRestaurant, listMenu, listOrder;
	private JComboBox cbDeliveryTime;

	// File Menu Bar
	private JMenuItem menuItemDisconnect;
	private JMenuItem menuItemQuit;
	private JMenuItem menuItemEditAccount;
	private JMenuItem menuItemDeleteAccount;

	// Order Menu Bar
	private JMenuItem menuItemOrderFood;
	private JMenuItem menuItemOrderHistory;
	private JScrollPane scrollPane;
	private JFormattedTextField ftfDeliveryDate;
	private JFormattedTextField ftfPostalCode;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ClientOrderFoodView frame = new ClientOrderFoodView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ClientOrderFoodView() {
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

		menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);

		menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);

		JMenu menuAccount = new JMenu("Account");
		menuAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuAccount);

		menuItemEditAccount = new JMenuItem("Edit");
		menuItemEditAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemEditAccount);

		menuItemDeleteAccount = new JMenuItem("Delete");
		menuItemDeleteAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuAccount.add(menuItemDeleteAccount);

		JMenu menuOrderFood = new JMenu("Order");
		menuOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrderFood);

		menuItemOrderFood = new JMenuItem("Order Food");
		menuItemOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrderFood.add(menuItemOrderFood);

		menuItemOrderHistory = new JMenuItem("Order History");
		menuItemOrderHistory.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrderFood.add(menuItemOrderHistory);

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

		JLabel label = new JLabel("Delivery date(yyyy/mm/dd):");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(325, 59, 183, 33);
		contentPane.add(label);

//		try {
//			MaskFormatter DD = new MaskFormatter("####/##/##");
//			tfDeliveryDate = new JFormattedTextField(DD);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		getContentPane().add(tfDeliveryDate);

		cbDeliveryTime = new JComboBox();
		cbDeliveryTime.setModel(new DefaultComboBoxModel(new String[] {"Now!", "00:00", "00:15", "00:30", "00:45", "01:00", "01:15", "01:30", "01:45", "02:00", "02:15", "02:30", "02:45", "03:00", "04:15", "04:30", "04:45", "05:00", "05:15", "05:30", "05:45", "06:00", "07:15", "07:30", "07:45", "08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00", "21:15", "21:30", "21:45", "22:00", "22:15", "22:30", "22:45", "23:00", "23:15", "23:30", "23:45"}));
		cbDeliveryTime.setBounds(515, 98, 110, 25);
		contentPane.add(cbDeliveryTime);

		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(325, 124, 183, 33);
		contentPane.add(lblPostalCode);

		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(95, 201, 83, 33);
		contentPane.add(lblRestaurant);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 229, 230, 361);
		contentPane.add(scrollPane);

		listRestaurant = new JList();
		scrollPane.setViewportView(listRestaurant);
		listRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));

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

		try {
			MaskFormatter DelivDate = new MaskFormatter("####/##/##");
			ftfDeliveryDate = new JFormattedTextField(DelivDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ftfDeliveryDate.setBounds(518, 66, 107, 20);
		getContentPane().add(ftfDeliveryDate);

		try {
			MaskFormatter Postal = new MaskFormatter("U#U #U#");
			ftfPostalCode = new JFormattedTextField(Postal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ftfPostalCode.setBounds(518, 134, 107, 20);
		getContentPane().add(ftfPostalCode);

		this.setVisible(false);
	}

	/**
	 * @return the ftfDeliveryDate
	 */
	public JFormattedTextField getFtfDeliveryDate() {
		return ftfDeliveryDate;
	}

	/**
	 * @param ftfDeliveryDate the ftfDeliveryDate to set
	 */
	public void setFtfDeliveryDate(JFormattedTextField ftfDeliveryDate) {
		this.ftfDeliveryDate = ftfDeliveryDate;
	}

	/**
	 * @return the ftfPostalCode
	 */
	public JFormattedTextField getFtfPostalCode() {
		return ftfPostalCode;
	}

	/**
	 * @param ftfPostalCode the ftfPostalCode to set
	 */
	public void setFtfPostalCode(JFormattedTextField ftfPostalCode) {
		this.ftfPostalCode = ftfPostalCode;
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

	/**
	 * @return the cbDeliveryTime
	 */
	public JComboBox getCbDeliveryTime() {
		return cbDeliveryTime;
	}

	/**
	 * @param cbDeliveryTime the cbDeliveryTime to set
	 */
	public void setCbDeliveryTime(JComboBox cbDeliveryTime) {
		this.cbDeliveryTime = cbDeliveryTime;
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
	 * @return the menuItemEditAccount
	 */
	public JMenuItem getMenuItemEditAccount() {
		return menuItemEditAccount;
	}

	/**
	 * @param menuItemEditAccount the menuItemEditAccount to set
	 */
	public void setMenuItemEditAccount(JMenuItem menuItemEditAccount) {
		this.menuItemEditAccount = menuItemEditAccount;
	}

	/**
	 * @return the menuItemDeleteAccount
	 */
	public JMenuItem getMenuItemDeleteAccount() {
		return menuItemDeleteAccount;
	}

	/**
	 * @param menuItemDeleteAccount the menuItemDeleteAccount to set
	 */
	public void setMenuItemDeleteAccount(JMenuItem menuItemDeleteAccount) {
		this.menuItemDeleteAccount = menuItemDeleteAccount;
	}

	/**
	 * @return the menuItemOrderFood
	 */
	public JMenuItem getMenuItemOrderFood() {
		return menuItemOrderFood;
	}

	/**
	 * @param menuItemOrderFood the menuItemOrderFood to set
	 */
	public void setMenuItemOrderFood(JMenuItem menuItemOrderFood) {
		this.menuItemOrderFood = menuItemOrderFood;
	}

	/**
	 * @return the menuItemOrderHistory
	 */
	public JMenuItem getMenuItemOrderHistory() {
		return menuItemOrderHistory;
	}

	/**
	 * @param menuItemOrderHistory the menuItemOrderHistory to set
	 */
	public void setMenuItemOrderHistory(JMenuItem menuItemOrderHistory) {
		this.menuItemOrderHistory = menuItemOrderHistory;
	}

}
