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

public class RestaurateurViewOrder extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeliveryDate;
	private JTextField tfDeliveryTime;
	private JTextField tfPostalCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurateurViewOrder frame = new RestaurateurViewOrder();
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
	public RestaurateurViewOrder() {
		setTitle("Restaurateur Menu | Restuarant Delivery System");
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
		
		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);
		
		JMenuItem menuItemAcceptOrder = new JMenuItem("Accept Order");
		menuItemAcceptOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemAcceptOrder);
		
		JMenuItem menuItemOrderReady = new JMenuItem("Order Ready");
		menuItemOrderReady.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderReady);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder());
		list.setBounds(77, 70, 359, 376);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("View Orders");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(430, 0, 119, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setBounds(77, 447, 359, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date (yyyy/mm/dd):");
		lblDeliveryDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryDate.setBounds(486, 565, 221, 26);
		contentPane.add(lblDeliveryDate);
		
		tfDeliveryDate = new JTextField();
		tfDeliveryDate.setBounds(717, 563, 186, 26);
		contentPane.add(tfDeliveryDate);
		tfDeliveryDate.setColumns(10);
		
		JLabel lblDeliveryTime = new JLabel("Delivery Time:");
		lblDeliveryTime.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeliveryTime.setBounds(486, 591, 221, 26);
		contentPane.add(lblDeliveryTime);
		
		tfDeliveryTime = new JTextField();
		tfDeliveryTime.setColumns(10);
		tfDeliveryTime.setBounds(717, 592, 186, 26);
		contentPane.add(tfDeliveryTime);
		
		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPostalCode.setBounds(486, 621, 221, 26);
		contentPane.add(lblPostalCode);
		
		tfPostalCode = new JTextField();
		tfPostalCode.setColumns(10);
		tfPostalCode.setBounds(717, 622, 186, 26);
		contentPane.add(tfPostalCode);
		
		JLabel lblMealOrder = new JLabel("Meal in Order");
		lblMealOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMealOrder.setBounds(67, 500, 113, 26);
		contentPane.add(lblMealOrder);
		
		JList list_2 = new JList();
		list_2.setBounds(66, 524, 359, 185);
		contentPane.add(list_2);
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurant.setBounds(220, 45, 94, 26);
		contentPane.add(lblRestaurant);
		
		JLabel lblRestaurantsOrder = new JLabel("Restaurant's Order");
		lblRestaurantsOrder.setFont(new Font("Arial", Font.BOLD, 15));
		lblRestaurantsOrder.setBounds(623, 45, 160, 26);
		contentPane.add(lblRestaurantsOrder);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(642, 675, 104, 34);
		contentPane.add(btnGoBack);
		
		JList list_1 = new JList();
		list_1.setBorder(new CompoundBorder());
		list_1.setBounds(544, 70, 359, 376);
		contentPane.add(list_1);
		
		JButton button = new JButton("Select");
		button.setBounds(544, 449, 359, 26);
		contentPane.add(button);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

