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
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

public class Client extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
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
		
		JMenuItem menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);
		
		JMenuItem menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);
		
		JMenu menuMenu = new JMenu("Account");
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
		
		JMenuItem mntmCloseAccount = new JMenuItem("Terminate Account");
		mntmCloseAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(mntmCloseAccount);
		
		JMenu mnOrderFood = new JMenu("Order");
		mnOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnOrderFood);
		
		JMenuItem mntmOrderFood = new JMenuItem("Order Food");
		mntmOrderFood.setFont(new Font("Arial", Font.PLAIN, 15));
		mnOrderFood.add(mntmOrderFood);
		
		JMenuItem mntmOrderHistory = new JMenuItem("Order History");
		mntmOrderHistory.setFont(new Font("Arial", Font.PLAIN, 15));
		mnOrderFood.add(mntmOrderHistory);
		
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
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel_11.add(lblWelcome);
		
		JLabel lblgetname = new JLabel(" .getName()");
		lblgetname.setFont(new Font("Arial", Font.BOLD, 40));
		panel_11.add(lblgetname);
		
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
		
		JButton btnNewButton = new JButton("Order Food");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setPreferredSize(new Dimension(275, 50));
		panel_7.add(btnNewButton);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		panel_5.add(panel_8);
		
		JButton btnNewButton_1 = new JButton("Order History");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setPreferredSize(new Dimension(275, 50));
		panel_8.add(btnNewButton_1);
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		JButton btnNewButton_2 = new JButton("Create Account");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setPreferredSize(new Dimension(275, 50));
		panel_9.add(btnNewButton_2);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JButton btnNewButton_3 = new JButton("Edit Account");
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3.setPreferredSize(new Dimension(275, 50));
		panel_6.add(btnNewButton_3);
		
		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10);
		
		JButton btnNewButton_4 = new JButton("Terminate Account");
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_4.setPreferredSize(new Dimension(275, 50));
		panel_10.add(btnNewButton_4);
	}

}
