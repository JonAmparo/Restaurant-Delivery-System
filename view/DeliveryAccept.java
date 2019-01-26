package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class DeliveryAccept {

	private JFrame contentPane;
	private JLabel OrderNumberlbl2;
	private JLabel RestaurantNumberlbl2;
	private JLabel DeliveryAddresslbl2;
	private JLabel DeliveryPostalCodelbl2;
	private JButton Completebtn;
	private JButton Selectbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryAccept window = new DeliveryAccept();
					window.contentPane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeliveryAccept() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		contentPane = new JFrame();
		contentPane.setBounds(100, 100, 600, 500);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.setJMenuBar(menuBar);
		
		JMenu FileMenu = new JMenu("File");
		menuBar.add(FileMenu);
		
		JMenuItem DisconnectMI = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMI);
		
		JMenuItem QuitMI = new JMenuItem("Quit");
		FileMenu.add(QuitMI);
		
		JMenu DeliveryMenu = new JMenu("Delivery");
		menuBar.add(DeliveryMenu);
		
		JMenuItem ViewDeliveryMI = new JMenuItem("View Deliveries");
		DeliveryMenu.add(ViewDeliveryMI);
		
		JMenuItem AcceptedDeliveryMI = new JMenuItem("Accepted Deliveries");
		DeliveryMenu.add(AcceptedDeliveryMI);
		
		JMenuItem DeliveryMadeMI = new JMenuItem("Delivery Made");
		DeliveryMenu.add(DeliveryMadeMI);
		
		JPanel RightPan = new JPanel();
		contentPane.getContentPane().add(RightPan, BorderLayout.EAST);
		RightPan.setLayout(new BorderLayout(0, 0));
		
		JPanel TitlePan = new JPanel();
		RightPan.add(TitlePan, BorderLayout.NORTH);
		TitlePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel DeliveryManlbl = new JLabel("Order");
		TitlePan.add(DeliveryManlbl);
		DeliveryManlbl.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel ListPan = new JPanel();
		RightPan.add(ListPan, BorderLayout.CENTER);
		
		JList DeliveryManList = new JList();
		DeliveryManList.setPreferredSize(new Dimension(225, 350));
		DeliveryManList.setVisibleRowCount(20);
		ListPan.add(DeliveryManList);
		
		JPanel SelectPan = new JPanel();
		FlowLayout fl_SelectPan = (FlowLayout) SelectPan.getLayout();
		RightPan.add(SelectPan, BorderLayout.SOUTH);
		
		Selectbtn = new JButton("Select");
		Selectbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SelectPan.add(Selectbtn);
		
		JPanel CenterPan = new JPanel();
		contentPane.getContentPane().add(CenterPan, BorderLayout.CENTER);
		CenterPan.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		CenterPan.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JPanel OrderPan = new JPanel();
		panel_2.add(OrderPan);
		OrderPan.setLayout(new GridLayout(4, 2, 0, 15));
		
		JLabel OrderNumberlbl = new JLabel("Order #:");
		OrderPan.add(OrderNumberlbl);
		
		OrderNumberlbl2 = new JLabel("");
		OrderPan.add(OrderNumberlbl2);
		
		JLabel RestaurantNumberlbl = new JLabel("Restaurant #:");
		OrderPan.add(RestaurantNumberlbl);
		
		RestaurantNumberlbl2 = new JLabel("");
		OrderPan.add(RestaurantNumberlbl2);
		
		JLabel DeliveryAddresslbl = new JLabel("Delivery Address: ");
		OrderPan.add(DeliveryAddresslbl);
		
		DeliveryAddresslbl2 = new JLabel("");
		OrderPan.add(DeliveryAddresslbl2);
		
		JLabel DeliveryPostalCodelbl = new JLabel("Delivery Postal Code:");
		OrderPan.add(DeliveryPostalCodelbl);
		
		DeliveryPostalCodelbl2 = new JLabel("");
		OrderPan.add(DeliveryPostalCodelbl2);
		
		JPanel panel = new JPanel();
		panel_1.add(panel);
		
		Completebtn = new JButton("Accept Delivery");
		panel.add(Completebtn);
		Completebtn.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JPanel TopPan = new JPanel();
		CenterPan.add(TopPan, BorderLayout.NORTH);
		
		JLabel ViewDeliverylbl = new JLabel("Accept a Delivery");
		TopPan.add(ViewDeliverylbl);
		ViewDeliverylbl.setHorizontalAlignment(SwingConstants.CENTER);
		ViewDeliverylbl.setFont(new Font("Arial", Font.PLAIN, 20));
	}

}
