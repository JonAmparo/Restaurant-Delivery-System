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
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class Manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		setTitle("Manager dashboard | Restuarant Delivery System");
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
		
		JMenu menuRestaurant = new JMenu("Restaurant");
		menuRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuRestaurant);
		
		JMenuItem menuItemEditRestaurant = new JMenuItem("Edit");
		menuItemEditRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuRestaurant.add(menuItemEditRestaurant);
		
		JMenu menuMenu = new JMenu("Menu");
		menuMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuMenu);
		
		JMenuItem menuItemCreateMenu = new JMenuItem("Create");
		menuItemCreateMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemCreateMenu);
		
		JMenuItem menuItemEditMenu = new JMenuItem("Edit");
		menuItemEditMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemEditMenu);
		
		JMenuItem menuItemDeleteMenu = new JMenuItem("Delete");
		menuItemDeleteMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemDeleteMenu);
		
		JMenu menuDelivery = new JMenu("Orders");
		menuDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuDelivery);
		
		JMenuItem menuItemDeleteDelivery = new JMenuItem("View Orders");
		menuItemDeleteDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuDelivery.add(menuItemDeleteDelivery);
		
		JMenuItem mntmMarkacceptOrders = new JMenuItem("Mark/Accept Orders");
		mntmMarkacceptOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		menuDelivery.add(mntmMarkacceptOrders);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(100);
		panel.setPreferredSize(new Dimension(10, 200));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblWelcome);
		
		JLabel lblgetname = new JLabel(" .getName()");
		lblgetname.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblgetname);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setVgap(20);
		panel_5.setPreferredSize(new Dimension(10, 60));
		panel_2.add(panel_5, BorderLayout.NORTH);
		
		JLabel lblRestaurants = new JLabel("Restaurant List");
		lblRestaurants.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		panel_5.add(lblRestaurants);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8, BorderLayout.CENTER);
		
		JList list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, Color.LIGHT_GRAY, null));
		list.setPreferredSize(new Dimension(400, 105));
		panel_8.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBorder(new EmptyBorder(1, 1, 1, 1));
		scrollBar.setPreferredSize(new Dimension(17, 100));
		panel_8.add(scrollBar);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setVgap(20);
		panel_6.setPreferredSize(new Dimension(10, 60));
		panel_3.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		panel_6.add(lblRestaurant);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9, BorderLayout.CENTER);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setPreferredSize(new Dimension(150, 50));
		btnCreate.setFont(new Font("Arial", Font.PLAIN, 21));
		btnCreate.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_9.add(btnCreate);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setPreferredSize(new Dimension(150, 50));
		btnEdit.setFont(new Font("Arial", Font.PLAIN, 21));
		btnEdit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_9.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setPreferredSize(new Dimension(150, 50));
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 21));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_9.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setVgap(20);
		panel_7.setPreferredSize(new Dimension(10, 60));
		panel_4.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblViewRestaurantOrder = new JLabel("View restaurant order");
		lblViewRestaurantOrder.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		panel_7.add(lblViewRestaurantOrder);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10, BorderLayout.CENTER);
		
		JButton btnGo = new JButton("Go");
		btnGo.setPreferredSize(new Dimension(150, 50));
		btnGo.setFont(new Font("Arial", Font.PLAIN, 21));
		btnGo.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_10.add(btnGo);
	}

}
