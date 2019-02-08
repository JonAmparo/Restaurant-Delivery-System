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

public class ChefView extends JFrame {

	private JPanel contentPane;
	
	private JButton btnOrderReady, btnAcceptOrders;
	private JMenuItem menuItemDisconnect, menuItemQuit, menuItemViewOrders, menuItemAcceptMarkOrders;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefView frame = new ChefView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ChefView() {
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

		JMenu menuOrder = new JMenu("Order");
		menuOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuOrder);

		menuItemViewOrders = new JMenuItem("View Orders");
		menuItemViewOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemViewOrders);

		menuItemAcceptMarkOrders = new JMenuItem("Accept/Mark Orders");
		menuItemAcceptMarkOrders.setFont(new Font("Arial", Font.PLAIN, 15));
		menuOrder.add(menuItemAcceptMarkOrders);
		
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
		
		JLabel lblWelcome = new JLabel("Restaurateur Options");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 40));
		panel_11.add(lblWelcome);
		
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
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(100, 0, 0, 0));
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		panel_5.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 1, 0, 10));
		
		btnAcceptOrders = new JButton("Accept Order");
		panel_8.add(btnAcceptOrders);
		btnAcceptOrders.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnAcceptOrders.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnAcceptOrders.setPreferredSize(new Dimension(275, 50));
		
		 btnOrderReady = new JButton("Order Ready");
		 panel_8.add(btnOrderReady);
		 btnOrderReady.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		 btnOrderReady.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		 btnOrderReady.setPreferredSize(new Dimension(275, 50));
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		panel_5.add(panel_6);
		
		this.setVisible(false);
	}

	/**
	 * @return the btnViewOrders
	 */
	public JButton getBtnViewOrders() {
		return btnOrderReady;
	}

	/**
	 * @param btnViewOrders the btnViewOrders to set
	 */
	public void setBtnViewOrders(JButton btnViewOrders) {
		this.btnOrderReady = btnViewOrders;
	}

	/**
	 * @return the btnAcceptMarkOrders
	 */
	public JButton getBtnAcceptMarkOrders() {
		return btnAcceptOrders;
	}

	/**
	 * @param btnAcceptMarkOrders the btnAcceptMarkOrders to set
	 */
	public void setBtnAcceptMarkOrders(JButton btnAcceptMarkOrders) {
		this.btnAcceptOrders = btnAcceptMarkOrders;
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
	 * @return the menuItemViewOrders
	 */
	public JMenuItem getMenuItemViewOrders() {
		return menuItemViewOrders;
	}

	/**
	 * @param menuItemViewOrders the menuItemViewOrders to set
	 */
	public void setMenuItemViewOrders(JMenuItem menuItemViewOrders) {
		this.menuItemViewOrders = menuItemViewOrders;
	}

	/**
	 * @return the menuItemAcceptMarkOrders
	 */
	public JMenuItem getMenuItemAcceptMarkOrders() {
		return menuItemAcceptMarkOrders;
	}

	/**
	 * @param menuItemAcceptMarkOrders the menuItemAcceptMarkOrders to set
	 */
	public void setMenuItemAcceptMarkOrders(JMenuItem menuItemAcceptMarkOrders) {
		this.menuItemAcceptMarkOrders = menuItemAcceptMarkOrders;
	}

	
	
	

}
