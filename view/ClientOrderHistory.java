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
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ClientOrderHistory extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfPostalCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientOrderHistory frame = new ClientOrderHistory();
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
	public ClientOrderHistory() {
		setTitle("Client - Order History | Restuarant Delivery System");
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
		
		JLabel lblOrderFood = new JLabel("Order History");
		lblOrderFood.setFont(new Font("Arial", Font.BOLD, 30));
		lblOrderFood.setBounds(382, 11, 213, 61);
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
		
		JLabel lblRestaurant = new JLabel("Your Orders");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(209, 201, 117, 33);
		contentPane.add(lblRestaurant);
		
		JList listRestaurant = new JList();
		listRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		listRestaurant.setBounds(69, 232, 368, 361);
		contentPane.add(listRestaurant);
		
		JLabel lblOrder = new JLabel("Meals in Order");
		lblOrder.setFont(new Font("Arial", Font.BOLD, 15));
		lblOrder.setBounds(635, 205, 117, 25);
		contentPane.add(lblOrder);
		
		JButton btnOrder = new JButton("Select");
		btnOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		btnOrder.setBounds(171, 602, 146, 33);
		contentPane.add(btnOrder);
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 15));
		list.setBounds(528, 232, 368, 361);
		contentPane.add(list);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

