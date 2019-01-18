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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurateur extends JFrame {

	private JPanel contentPane;
	RestaurateurMarkAccept frameMarkOrderAsReady = new RestaurateurMarkAccept();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurateur frame = new Restaurateur();
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
	public Restaurateur() {
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
//		menuItemOrderReady.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				frameMarkOrderAsReady.setVisible(true);
//			}
//		});
		menuItemOrderReady.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemOrderReady);
		
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Orders");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setBounds(183, 194, 154, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblAcceptmarkOrders = new JLabel("Accept/Mark Orders");
		lblAcceptmarkOrders.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAcceptmarkOrders.setBounds(587, 194, 213, 81);
		contentPane.add(lblAcceptmarkOrders);
		
		JButton btnNewButton = new JButton("View Orders");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				RestaurateurAcceptOrder frameAcceptOrder = new RestaurateurAcceptOrder();
//				dispose();
//				frameAcceptOrder.setVisible(true);
//				
//				
//			}
//		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(183, 286, 154, 32);
		contentPane.add(btnNewButton);
		
		JButton btnAcceptmarkOrders = new JButton("Accept/Mark Orders");
//		btnAcceptmarkOrders.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				dispose();
//				frameMarkOrderAsReady.setVisible(true);
//			}
//		});
		btnAcceptmarkOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAcceptmarkOrders.setBounds(597, 286, 191, 32);
		contentPane.add(btnAcceptmarkOrders);
	}

}
