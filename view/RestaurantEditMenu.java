package view;

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
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class RestaurantEditMenu extends JFrame {

	private JPanel contentPane;
	private JTextField itemTxt_field;
	private JTextField priceTxt_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantEditMenu frame = new RestaurantEditMenu();
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
	public RestaurantEditMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.add("Disconnect");
		mnFile.add("Exit");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnFile);
		
		JMenu mnRestaurant = new JMenu("Restaurant");
		mnRestaurant.add("Create");
		mnRestaurant.add("Edit");
		mnRestaurant.add("Delete");
		mnRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnRestaurant);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.add("Create");
		mnMenu.add("Edit");
		mnMenu.add("Delete");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnMenu);
		
		JMenu mnDelivery = new JMenu("Delivery");
		mnDelivery.add("Create");
		mnDelivery.add("Edit");
		mnDelivery.add("Delete");
		mnDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnDelivery);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel title_panel = new JPanel();
		title_panel.setPreferredSize(new Dimension(10, 100));
		contentPane.add(title_panel, BorderLayout.NORTH);
		title_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel RestaurantTitle_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantTitle_panel.getLayout();
		flowLayout.setVgap(50);
		RestaurantTitle_panel.setPreferredSize(new Dimension(400, 10));
		title_panel.add(RestaurantTitle_panel, BorderLayout.WEST);
		
		JLabel lblRestaurant = new JLabel("RESTAURANT");
		lblRestaurant.setFont(new Font("Arial", Font.BOLD, 30));
		RestaurantTitle_panel.add(lblRestaurant);
		
		JPanel createMenu_panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) createMenu_panel.getLayout();
		flowLayout_1.setVgap(50);
		createMenu_panel.setPreferredSize(new Dimension(410, 10));
		title_panel.add(createMenu_panel, BorderLayout.EAST);
		
		JLabel lblCreateMenu = new JLabel("EDIT MENU");
		lblCreateMenu.setFont(new Font("Arial", Font.BOLD, 30));
		createMenu_panel.add(lblCreateMenu);
		
		JPanel topEmpty_panel = new JPanel();
		title_panel.add(topEmpty_panel, BorderLayout.CENTER);
		
		JPanel center_panel = new JPanel();
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel bottom_panel = new JPanel();
		bottom_panel.setPreferredSize(new Dimension(10, 200));
		center_panel.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel addItem_panel = new JPanel();
		addItem_panel.setBorder(new EmptyBorder(20, 70, 20, 30));
		addItem_panel.setPreferredSize(new Dimension(480, 10));
		bottom_panel.add(addItem_panel, BorderLayout.EAST);
		addItem_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel addItem_panel1 = new JPanel();
		addItem_panel1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		FlowLayout fl_addItem_panel1 = (FlowLayout) addItem_panel1.getLayout();
		fl_addItem_panel1.setVgap(15);
		addItem_panel1.setPreferredSize(new Dimension(10, 40));
		addItem_panel.add(addItem_panel1, BorderLayout.NORTH);
		
		JLabel lblAddItem = new JLabel("Edit Item");
		lblAddItem.setFont(new Font("Arial", Font.ITALIC, 17));
		addItem_panel1.add(lblAddItem);
		
		JPanel addItem_panel_2 = new JPanel();
		addItem_panel.add(addItem_panel_2, BorderLayout.CENTER);
		addItem_panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel addBtn_panel = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) addBtn_panel.getLayout();
		addBtn_panel.setPreferredSize(new Dimension(10, 35));
		addItem_panel_2.add(addBtn_panel, BorderLayout.SOUTH);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setPreferredSize(new Dimension(7, 20));
		addBtn_panel.add(rigidArea);
		
		JButton btnAdd = new JButton("Add item");
		btnAdd.setPreferredSize(new Dimension(115, 29));
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), null, Color.GRAY, null));
		btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
		addBtn_panel.add(btnAdd);
		
		JButton btnEditItem = new JButton("Edit item");
		btnEditItem.setFont(new Font("Arial", Font.BOLD, 15));
		btnEditItem.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnEditItem.setPreferredSize(new Dimension(115, 29));
		addBtn_panel.add(btnEditItem);
		
		JButton btnDeleteItem = new JButton("Delete item");
		btnDeleteItem.setPreferredSize(new Dimension(116, 29));
		btnDeleteItem.setFont(new Font("Arial", Font.BOLD, 15));
		btnDeleteItem.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		addBtn_panel.add(btnDeleteItem);
		
		JPanel itemInfo_panel = new JPanel();
		itemInfo_panel.setBorder(new EmptyBorder(10, 20, 0, 0));
		addItem_panel_2.add(itemInfo_panel, BorderLayout.CENTER);
		itemInfo_panel.setLayout(new GridLayout(2, 2, 0, 10));
		
		JLabel itemlbl_label = new JLabel("item: ");
		itemlbl_label.setFont(new Font("Arial", Font.PLAIN, 20));
		itemInfo_panel.add(itemlbl_label);
		
		itemTxt_field = new JTextField();
		itemTxt_field.setFont(new Font("Arial", Font.PLAIN, 17));
		itemInfo_panel.add(itemTxt_field);
		itemTxt_field.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Price: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		itemInfo_panel.add(lblNewLabel);
		
		priceTxt_field = new JTextField();
		priceTxt_field.setFont(new Font("Arial", Font.PLAIN, 17));
		itemInfo_panel.add(priceTxt_field);
		priceTxt_field.setColumns(10);
		
		JPanel guide_panel = new JPanel();
		guide_panel.setPreferredSize(new Dimension(400, 10));
		bottom_panel.add(guide_panel, BorderLayout.WEST);
		guide_panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 0, 5, 0));
		FlowLayout flowLayout_2 = (FlowLayout) panel.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setVgap(25);
		guide_panel.add(panel);
		
		JLabel lblpleaseSelectOne = new JLabel("1. Please Select one of the existing restauraunt options above.");
		lblpleaseSelectOne.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(lblpleaseSelectOne);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		FlowLayout flowLayout_4 = (FlowLayout) panel_1.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setVgap(15);
		guide_panel.add(panel_1);
		
		JLabel lblenterTheName = new JLabel("2. Enter the new name and price of the item you wish to edit.");
		lblenterTheName.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_1.add(lblenterTheName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setVgap(0);
		guide_panel.add(panel_2);
		
		JLabel lblfinalizeByClicking = new JLabel("3. Finalize by clicking on the \"edit menu\" button");
		lblfinalizeByClicking.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_2.add(lblfinalizeByClicking);
		
		JPanel left_panel = new JPanel();
		left_panel.setPreferredSize(new Dimension(400, 10));
		center_panel.add(left_panel, BorderLayout.WEST);
		left_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel selectBtn_panel = new JPanel();
		selectBtn_panel.setPreferredSize(new Dimension(10, 50));
		left_panel.add(selectBtn_panel, BorderLayout.SOUTH);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		btnSelect.setPreferredSize(new Dimension(100, 35));
		btnSelect.setFont(new Font("Arial", Font.BOLD, 15));
		selectBtn_panel.add(btnSelect);
		
		JPanel restaurantSelect_panel = new JPanel();
		left_panel.add(restaurantSelect_panel, BorderLayout.CENTER);
		
		JList restaurantSelect_list = new JList();
		restaurantSelect_list.setPreferredSize(new Dimension(375, 375));
		restaurantSelect_panel.add(restaurantSelect_list);
		
		JPanel right_panel = new JPanel();
		right_panel.setPreferredSize(new Dimension(410, 10));
		center_panel.add(right_panel, BorderLayout.EAST);
		right_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel createBtn_panel = new JPanel();
		createBtn_panel.setPreferredSize(new Dimension(10, 50));
		right_panel.add(createBtn_panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Edit menu");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.GRAY, null));
		btnNewButton.setPreferredSize(new Dimension(100, 35));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		createBtn_panel.add(btnNewButton);
		
		JPanel menuItems_panel = new JPanel();
		right_panel.add(menuItems_panel, BorderLayout.CENTER);
		
		JList menuItems_list = new JList();
		menuItems_list.setPreferredSize(new Dimension(375, 375));
		menuItems_panel.add(menuItems_list);
		
		JPanel middle_panel = new JPanel();
		center_panel.add(middle_panel, BorderLayout.CENTER);
		middle_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel middleInfo_panel1 = new JPanel();
		middleInfo_panel1.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel1, BorderLayout.NORTH);
		
		JPanel middleInfo_panel2 = new JPanel();
		middleInfo_panel2.setPreferredSize(new Dimension(10, 150));
		middle_panel.add(middleInfo_panel2, BorderLayout.SOUTH);
		
		JPanel middleArrow_panel = new JPanel();
		middle_panel.add(middleArrow_panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("->");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Courier New", Font.BOLD, 50));
		middleArrow_panel.add(label);
	}

}
