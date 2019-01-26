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
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class DeliveryView {

	private JFrame contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryView window = new DeliveryView();
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
	public DeliveryView() {
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
		
		JPanel LeftPan = new JPanel();
		contentPane.getContentPane().add(LeftPan, BorderLayout.WEST);
		LeftPan.setLayout(new BorderLayout(0, 0));
		
		JPanel TitlePan = new JPanel();
		LeftPan.add(TitlePan, BorderLayout.NORTH);
		TitlePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel DeliveryManlbl = new JLabel("Order");
		TitlePan.add(DeliveryManlbl);
		DeliveryManlbl.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel TextAreaPan = new JPanel();
		LeftPan.add(TextAreaPan, BorderLayout.CENTER);
		
		JTextArea SelectionTA = new JTextArea();
		TextAreaPan.add(SelectionTA);
		SelectionTA.setBorder(new LineBorder(new Color(0, 0, 0)));
		SelectionTA.setRows(21);
		SelectionTA.setColumns(20);
		
		JPanel SelectPan = new JPanel();
		FlowLayout fl_SelectPan = (FlowLayout) SelectPan.getLayout();
		LeftPan.add(SelectPan, BorderLayout.SOUTH);
		
		JButton Selectbtn = new JButton("Select");
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
		
		JLabel OrderNumberlbl2 = new JLabel("");
		OrderPan.add(OrderNumberlbl2);
		
		JLabel RestaurantNumberlbl = new JLabel("Restaurant #:");
		OrderPan.add(RestaurantNumberlbl);
		
		JLabel RestaurantNumberlbl2 = new JLabel("");
		OrderPan.add(RestaurantNumberlbl2);
		
		JLabel DeliveryAddresslbl = new JLabel("Delivery Address: ");
		OrderPan.add(DeliveryAddresslbl);
		
		JLabel DeliveryAddresslbl2 = new JLabel("");
		OrderPan.add(DeliveryAddresslbl2);
		
		JLabel DeliveryPostalCodelbl = new JLabel("Delivery Postal Code:");
		OrderPan.add(DeliveryPostalCodelbl);
		
		JLabel DeliveryPostalCodelbl2 = new JLabel("");
		OrderPan.add(DeliveryPostalCodelbl2);
		
		JPanel panel = new JPanel();
		panel_1.add(panel);
		
		JButton Completebtn = new JButton("Complete Consultation");
		panel.add(Completebtn);
		Completebtn.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JPanel TopPan = new JPanel();
		CenterPan.add(TopPan, BorderLayout.NORTH);
		
		JLabel ViewDeliverylbl = new JLabel("View Delivery");
		TopPan.add(ViewDeliverylbl);
		ViewDeliverylbl.setHorizontalAlignment(SwingConstants.CENTER);
		ViewDeliverylbl.setFont(new Font("Arial", Font.PLAIN, 20));
	}

}
