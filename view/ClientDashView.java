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
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientDashView extends JFrame {

	private JPanel contentPane;
	
	// Global Fonts -- IGNORE FOR NOW!!
//	Font titleFont = new Font("Arial", 1, 15);
//	Font headerFont = new Font("Arial", 1, 15);
//	Font font = new Font("Arial", 1, 15);

	// File Menu Bar
	private JMenuItem menuItemDisconnect;
	private JMenuItem menuItemQuit;
	private JMenuItem menuItemEditAccount;
	private JMenuItem menuItemDeleteAccount;

	// Order Menu Bar
	private JMenuItem menuItemOrderFood;
	private JMenuItem menuItemOrderHistory;

	// Welcoming label
	private JLabel lblGetName;

	// Dashboard buttons
	private JButton btnOrderFood;
	private JButton btnOrderHistory;
	private JButton btnEditAccount;
	private JButton btnDeleteAccount;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Client frame = new Client();
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
	public ClientDashView() {
		setTitle("Restaurant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 250));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_11.getLayout();
		panel_11.setPreferredSize(new Dimension(10, 150));
		panel.add(panel_11, BorderLayout.SOUTH);

		JLabel lblWelcome = new JLabel("Client Options");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel_11.add(lblWelcome);

		lblGetName = new JLabel("");
		lblGetName.setFont(new Font("Arial", Font.BOLD, 40));
		panel_11.add(lblGetName);

		JPanel panel_12 = new JPanel();
		panel.add(panel_12, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(200, 10));
		panel_4.add(panel_2, BorderLayout.WEST);

		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(200, 10));
		panel_4.add(panel_3, BorderLayout.EAST);

		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(5, 0, 0, 0));

		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		panel_5.add(panel_7);

		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		panel_5.add(panel_8);
		
				btnOrderFood = new JButton("Order Food");
				panel_8.add(btnOrderFood);
				btnOrderFood.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
				btnOrderFood.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
				btnOrderFood.setPreferredSize(new Dimension(275, 50));

		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
				btnOrderHistory = new JButton("Order History");
				panel_9.add(btnOrderHistory);
				btnOrderHistory.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
				btnOrderHistory.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
				btnOrderHistory.setPreferredSize(new Dimension(275, 50));

		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);

		btnEditAccount = new JButton("Edit Account");
		btnEditAccount.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnEditAccount.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnEditAccount.setPreferredSize(new Dimension(275, 50));
		panel_6.add(btnEditAccount);

		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10);

		btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnDeleteAccount.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnDeleteAccount.setPreferredSize(new Dimension(275, 50));
		panel_10.add(btnDeleteAccount);

		this.setVisible(false);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

	/**
	 * @return the lblGetName
	 */
	public JLabel getLblGetName() {
		return lblGetName;
	}

	/**
	 * @param lblGetName the lblGetName to set
	 */
	public void setLblGetName(JLabel lblGetName) {
		this.lblGetName = lblGetName;
	}

	/**
	 * @return the btnOrderFood
	 */
	public JButton getBtnOrderFood() {
		return btnOrderFood;
	}

	/**
	 * @param btnOrderFood the btnOrderFood to set
	 */
	public void setBtnOrderFood(JButton btnOrderFood) {
		this.btnOrderFood = btnOrderFood;
	}

	/**
	 * @return the btnOrderHistory
	 */
	public JButton getBtnOrderHistory() {
		return btnOrderHistory;
	}

	/**
	 * @param btnOrderHistory the btnOrderHistory to set
	 */
	public void setBtnOrderHistory(JButton btnOrderHistory) {
		this.btnOrderHistory = btnOrderHistory;
	}

	/**
	 * @return the btnEditAccount
	 */
	public JButton getBtnEditAccount() {
		return btnEditAccount;
	}

	/**
	 * @param btnEditAccount the btnEditAccount to set
	 */
	public void setBtnEditAccount(JButton btnEditAccount) {
		this.btnEditAccount = btnEditAccount;
	}

	/**
	 * @return the btnDeleteAccount
	 */
	public JButton getBtnDeleteAccount() {
		return btnDeleteAccount;
	}

	/**
	 * @param btnDeleteAccount the btnDeleteAccount to set
	 */
	public void setBtnDeleteAccount(JButton btnDeleteAccount) {
		this.btnDeleteAccount = btnDeleteAccount;
	}

}
