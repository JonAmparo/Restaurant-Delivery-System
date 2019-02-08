package view_draft;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class RestaurantDeleteMenuView extends JFrame {

	private JPanel contentPane;
	private JMenu mnFile;
	private JMenu mnRestaurant;
	private JMenu mnMenu;
	private JMenu mnDelivery;
	private JList restaurantSelect_list;
	private JList menuItems_list;
	private JButton menuDelete_button;
	private JButton btnSelect;
	
	
	
	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantDeleteMenuView frame = new RestaurantDeleteMenuView();
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
	public RestaurantDeleteMenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		mnFile.add("Disconnect");
		mnFile.add("Exit");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnFile);
		
		mnRestaurant = new JMenu("Restaurant");
		mnRestaurant.add("Create");
		mnRestaurant.add("Edit");
		mnRestaurant.add("Delete");
		mnRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnRestaurant);
		
		mnMenu = new JMenu("Menu");
		mnMenu.add("Create");
		mnMenu.add("Edit");
		mnMenu.add("Delete");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnMenu);
		
		mnDelivery = new JMenu("Delivery");
		mnDelivery.add("Create");
		mnDelivery.add("Edit");
		mnDelivery.add("Delete");
		mnDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnDelivery);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel title_panel = new JPanel();
		title_panel.setOpaque(false);
		title_panel.setPreferredSize(new Dimension(10, 100));
		contentPane.add(title_panel, BorderLayout.NORTH);
		title_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel RestaurantTitle_panel = new JPanel();
		RestaurantTitle_panel.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) RestaurantTitle_panel.getLayout();
		flowLayout.setVgap(50);
		RestaurantTitle_panel.setPreferredSize(new Dimension(400, 10));
		title_panel.add(RestaurantTitle_panel, BorderLayout.WEST);
		
		JLabel lblRestaurant = new JLabel("RESTAURANT");
		lblRestaurant.setForeground(Color.WHITE);
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 30));
		RestaurantTitle_panel.add(lblRestaurant);
		
		JPanel createMenu_panel = new JPanel();
		createMenu_panel.setOpaque(false);
		FlowLayout flowLayout_1 = (FlowLayout) createMenu_panel.getLayout();
		flowLayout_1.setVgap(50);
		createMenu_panel.setPreferredSize(new Dimension(410, 10));
		title_panel.add(createMenu_panel, BorderLayout.EAST);
		
		JLabel lblCreateMenu = new JLabel("DELETE MENU");
		lblCreateMenu.setForeground(Color.WHITE);
		lblCreateMenu.setFont(new Font("Arial", Font.BOLD, 30));
		createMenu_panel.add(lblCreateMenu);
		
		JPanel topEmpty_panel = new JPanel();
		topEmpty_panel.setOpaque(false);
		title_panel.add(topEmpty_panel, BorderLayout.CENTER);
		
		JPanel center_panel = new JPanel();
		center_panel.setOpaque(false);
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel bottom_panel = new JPanel();
		bottom_panel.setOpaque(false);
		bottom_panel.setPreferredSize(new Dimension(10, 200));
		center_panel.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel left_panel = new JPanel();
		left_panel.setOpaque(false);
		left_panel.setPreferredSize(new Dimension(400, 10));
		center_panel.add(left_panel, BorderLayout.WEST);
		left_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel selectBtn_panel = new JPanel();
		selectBtn_panel.setOpaque(false);
		selectBtn_panel.setPreferredSize(new Dimension(10, 50));
		left_panel.add(selectBtn_panel, BorderLayout.SOUTH);
		
		btnSelect = new JButton(new ImageIcon("button_select.png"));
		btnSelect.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		btnSelect.setPreferredSize(new Dimension(100, 35));
		btnSelect.setFont(new Font("Arial", Font.BOLD, 15));
		selectBtn_panel.add(btnSelect);
		
		JPanel restaurantSelect_panel = new JPanel();
		restaurantSelect_panel.setOpaque(false);
		left_panel.add(restaurantSelect_panel, BorderLayout.CENTER);
		
		restaurantSelect_list = new JList();
		restaurantSelect_list.setFont(new Font("Arial", Font.ITALIC, 16));
		restaurantSelect_list.setPreferredSize(new Dimension(375, 375));
		restaurantSelect_panel.add(restaurantSelect_list);
		
		JPanel right_panel = new JPanel();
		right_panel.setOpaque(false);
		right_panel.setPreferredSize(new Dimension(410, 10));
		center_panel.add(right_panel, BorderLayout.EAST);
		right_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel deleteBtn_panel = new JPanel();
		deleteBtn_panel.setOpaque(false);
		deleteBtn_panel.setPreferredSize(new Dimension(10, 50));
		right_panel.add(deleteBtn_panel, BorderLayout.SOUTH);
		
		menuDelete_button = new JButton(new ImageIcon("button_delete.png"));
		menuDelete_button.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		menuDelete_button.setPreferredSize(new Dimension(100, 35));
		menuDelete_button.setFont(new Font("Arial", Font.BOLD, 15));
		deleteBtn_panel.add(menuDelete_button);
		
		JPanel menuItems_panel = new JPanel();
		menuItems_panel.setOpaque(false);
		right_panel.add(menuItems_panel, BorderLayout.CENTER);
		
		menuItems_list = new JList();
		menuItems_list.setFont(new Font("Arial", Font.ITALIC, 16));
		menuItems_list.setPreferredSize(new Dimension(375, 375));
		menuItems_panel.add(menuItems_list);
		
		JPanel middle_panel = new JPanel();
		middle_panel.setOpaque(false);
		center_panel.add(middle_panel, BorderLayout.CENTER);
		middle_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel middleInfo_panel1 = new JPanel();
		middleInfo_panel1.setOpaque(false);
		middleInfo_panel1.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel1, BorderLayout.NORTH);
		
		JPanel middleInfo_panel2 = new JPanel();
		middleInfo_panel2.setOpaque(false);
		middleInfo_panel2.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel2, BorderLayout.SOUTH);
		
		JPanel middleArrow_panel = new JPanel();
		middleArrow_panel.setOpaque(false);
		middle_panel.add(middleArrow_panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("->");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Courier New", Font.BOLD, 50));
		middleArrow_panel.add(label);
		
		this.setVisible(false);
	}
	
	
	
	

	/**
	 * @return the restaurantSelect_list
	 */
	public JList getRestaurantSelect_list() {
		return restaurantSelect_list;
	}





	/**
	 * @param restaurantSelect_list the restaurantSelect_list to set
	 */
	public void setRestaurantSelect_list(JList restaurantSelect_list) {
		this.restaurantSelect_list = restaurantSelect_list;
	}





	/**
	 * @return the menuItems_list
	 */
	public JList getMenuItems_list() {
		return menuItems_list;
	}





	/**
	 * @param menuItems_list the menuItems_list to set
	 */
	public void setMenuItems_list(JList menuItems_list) {
		this.menuItems_list = menuItems_list;
	}





	/**
	 * @return the menuDelete_button
	 */
	public JButton getMenuDelete_button() {
		return menuDelete_button;
	}





	/**
	 * @param menuDelete_button the menuDelete_button to set
	 */
	public void setMenuDelete_button(JButton menuDelete_button) {
		this.menuDelete_button = menuDelete_button;
	}





	/**
	 * @return the btnSelect
	 */
	public JButton getBtnSelect() {
		return btnSelect;
	}





	/**
	 * @param btnSelect the btnSelect to set
	 */
	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}





	/**
	 * @return the mnFile
	 */
	public JMenu getMnFile() {
		return mnFile;
	}

	/**
	 * @param mnFile the mnFile to set
	 */
	public void setMnFile(JMenu mnFile) {
		this.mnFile = mnFile;
	}

	/**
	 * @return the mnRestaurant
	 */
	public JMenu getMnRestaurant() {
		return mnRestaurant;
	}

	/**
	 * @param mnRestaurant the mnRestaurant to set
	 */
	public void setMnRestaurant(JMenu mnRestaurant) {
		this.mnRestaurant = mnRestaurant;
	}

	/**
	 * @return the mnMenu
	 */
	public JMenu getMnMenu() {
		return mnMenu;
	}

	/**
	 * @param mnMenu the mnMenu to set
	 */
	public void setMnMenu(JMenu mnMenu) {
		this.mnMenu = mnMenu;
	}

	/**
	 * @return the mnDelivery
	 */
	public JMenu getMnDelivery() {
		return mnDelivery;
	}

	/**
	 * @param mnDelivery the mnDelivery to set
	 */
	public void setMnDelivery(JMenu mnDelivery) {
		this.mnDelivery = mnDelivery;
	}
	
	

}
