package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.MatteBorder;
import javax.swing.Box;
import javax.swing.JList;

public class RestaurantEdit extends JFrame {

	private JPanel contentPane;
	private JTextField txtfield_name;
	private JTextField txtfield_address;
	private JTextField txtfield_telephone;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantEdit frame = new RestaurantEdit();
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
	public RestaurantEdit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnResturant = new JMenu("Restaurant");
		menuBar.add(mnResturant);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenu mnDeliveryMan = new JMenu("Delivery man");
		menuBar.add(mnDeliveryMan);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel top_panel = new JPanel();
		top_panel.setPreferredSize(new Dimension(10, 200));
		contentPane.add(top_panel, BorderLayout.NORTH);
		top_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel title_panel = new JPanel();
		title_panel.setPreferredSize(new Dimension(10, 75));
		top_panel.add(title_panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("EDIT RESTAURANT");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		title_panel.add(lblNewLabel);
		
		JPanel info_panel1 = new JPanel();
		info_panel1.setBorder(new EmptyBorder(0, 0, 0, 150));
		top_panel.add(info_panel1, BorderLayout.CENTER);
		info_panel1.setLayout(new GridLayout(3, 2, 20, 10));
		
		JLabel lbl_restaurantname = new JLabel("Restaurant Name: ");
		lbl_restaurantname.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_restaurantname.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_restaurantname);
		
		txtfield_name = new JTextField();
		txtfield_name.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtfield_name.setFont(new Font("Arial", Font.PLAIN, 15));
		info_panel1.add(txtfield_name);
		txtfield_name.setColumns(10);
		
		JLabel lbl_restaurantAddress = new JLabel("Restaurant Address: ");
		lbl_restaurantAddress.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_restaurantAddress.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_restaurantAddress);
		
		txtfield_address = new JTextField();
		txtfield_address.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtfield_address.setFont(new Font("Arial", Font.PLAIN, 15));
		info_panel1.add(txtfield_address);
		txtfield_address.setColumns(10);
		
		JLabel lbl_telephone = new JLabel("Telephone Number: ");
		lbl_telephone.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_telephone.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_telephone);
		
		txtfield_telephone = new JTextField();
		txtfield_telephone.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtfield_telephone.setFont(new Font("Arial", Font.PLAIN, 15));
		info_panel1.add(txtfield_telephone);
		txtfield_telephone.setColumns(10);
		
		JPanel bottom_panel = new JPanel();
		contentPane.add(bottom_panel, BorderLayout.CENTER);
		bottom_panel.setLayout(new BoxLayout(bottom_panel, BoxLayout.Y_AXIS));
		
		JPanel hour_panel = new JPanel();
		bottom_panel.add(hour_panel);
		hour_panel.setBorder(new EmptyBorder(50, 0, 0, 0));
		hour_panel.setName("Opening Hours");
		hour_panel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		hour_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel delivery_panel = new JPanel();
		delivery_panel.setPreferredSize(new Dimension(485, 10));
		hour_panel.add(delivery_panel, BorderLayout.EAST);
		delivery_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel deliveryAreaTitle_panel = new JPanel();
		delivery_panel.add(deliveryAreaTitle_panel, BorderLayout.NORTH);
		
		JLabel lblDeliveryArea = new JLabel("Delivery Area");
		lblDeliveryArea.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		deliveryAreaTitle_panel.add(lblDeliveryArea);
		
		JPanel deliveryAreaBottom_panel = new JPanel();
		deliveryAreaBottom_panel.setPreferredSize(new Dimension(10, 150));
		delivery_panel.add(deliveryAreaBottom_panel, BorderLayout.SOUTH);
		deliveryAreaBottom_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel deliveryAreaBtn_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) deliveryAreaBtn_panel.getLayout();
		flowLayout.setVgap(0);
		deliveryAreaBtn_panel.setBorder(new EmptyBorder(10, 10, 0, 10));
		deliveryAreaBtn_panel.setFont(new Font("Arial", Font.BOLD, 12));
		deliveryAreaBtn_panel.setPreferredSize(new Dimension(10, 50));
		deliveryAreaBottom_panel.add(deliveryAreaBtn_panel, BorderLayout.SOUTH);
		
		JButton btnAddDeliveryArea = new JButton("Add delivery Area");
		btnAddDeliveryArea.setFont(new Font("Arial", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnAddDeliveryArea);
		
		JButton btnDeleteDeliveryArea = new JButton("Delete delivery Area");
		btnDeleteDeliveryArea.setFont(new Font("Arial", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnDeleteDeliveryArea);
		
		JButton btnDeleteRestaurant = new JButton("Save");
		btnDeleteRestaurant.setFont(new Font("Arial", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnDeleteRestaurant);
		
		JPanel deliveryArea_panel = new JPanel();
		deliveryArea_panel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		deliveryAreaBottom_panel.add(deliveryArea_panel, BorderLayout.CENTER);
		
		JLabel lblDeliveryArea_1 = new JLabel("Delivery Area");
		lblDeliveryArea_1.setFont(new Font("Arial", Font.PLAIN, 15));
		deliveryArea_panel.add(lblDeliveryArea_1);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(6, 25));
		textField.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		deliveryArea_panel.add(textField);
		textField.setColumns(10);
		
		JPanel deliverytxt_panel = new JPanel();
		deliverytxt_panel.setFont(new Font("Arial", Font.ITALIC, 15));
		delivery_panel.add(deliverytxt_panel, BorderLayout.CENTER);
		deliverytxt_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel addRestaurant_panel = new JPanel();
		addRestaurant_panel.setPreferredSize(new Dimension(10, 135));
		deliverytxt_panel.add(addRestaurant_panel, BorderLayout.SOUTH);
		addRestaurant_panel.setLayout(new BorderLayout(0, 0));
		
		JPanel addRestaurantTitle_panel = new JPanel();
		addRestaurant_panel.add(addRestaurantTitle_panel, BorderLayout.NORTH);
		
		JLabel lblAddRestaurant = new JLabel("Add Restaurant");
		lblAddRestaurant.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		addRestaurantTitle_panel.add(lblAddRestaurant);
		
		JPanel addRestaurantList_panel = new JPanel();
		addRestaurant_panel.add(addRestaurantList_panel, BorderLayout.CENTER);
		
		JList list_1 = new JList();
		list_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		list_1.setPreferredSize(new Dimension(450, 98));
		addRestaurantList_panel.add(list_1);
		
		JPanel deliveryAreaList_panel = new JPanel();
		deliveryAreaList_panel.setPreferredSize(new Dimension(10, 120));
		deliverytxt_panel.add(deliveryAreaList_panel, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		list.setPreferredSize(new Dimension(450, 95));
		deliveryAreaList_panel.add(list);
		
		JPanel weekdays_panel = new JPanel();
		weekdays_panel.setPreferredSize(new Dimension(480, 10));
		hour_panel.add(weekdays_panel, BorderLayout.WEST);
		weekdays_panel.setLayout(new BoxLayout(weekdays_panel, BoxLayout.Y_AXIS));
		
		JPanel weekdayTitle_panel = new JPanel();
		weekdayTitle_panel.setBorder(new EmptyBorder(0, 50, 0, 50));
		weekdays_panel.add(weekdayTitle_panel);
		weekdayTitle_panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblDay);
		
		JLabel lblOpeningHours = new JLabel("Opening hours");
		lblOpeningHours.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblOpeningHours);
		
		JLabel lblClosingHours = new JLabel("Closing hours");
		lblClosingHours.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblClosingHours);
		
		JPanel sunday_panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) sunday_panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setHgap(10);
		weekdays_panel.add(sunday_panel);
		
		JLabel lblMonday = new JLabel("Sunday: ");
		lblMonday.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMonday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblMonday.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblMonday);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setPreferredSize(new Dimension(50, 20));
		sunday_panel.add(rigidArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setPreferredSize(new Dimension(50, 20));
		
		comboBox.addItem("24:00");
		sunday_panel.add(comboBox);
		
		JLabel lblH = new JLabel("-");
		lblH.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblH);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		sunday_panel.add(comboBox_1);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblTo);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		sunday_panel.add(comboBox_2);
		
		JLabel lblH_1 = new JLabel("-");
		sunday_panel.add(lblH_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_3.setPreferredSize(new Dimension(50, 20));
		sunday_panel.add(comboBox_3);
		
		JPanel monday_panel = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) monday_panel.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setHgap(10);
		weekdays_panel.add(monday_panel);
		
		JLabel lblTuesday = new JLabel("Monday: ");
		lblTuesday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblTuesday.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblTuesday);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(rigidArea_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(comboBox_4);
		
		JLabel lblH_2 = new JLabel("-");
		lblH_2.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblH_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(comboBox_5);
		
		JLabel lblTo_1 = new JLabel("to");
		lblTo_1.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblTo_1);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(comboBox_6);
		
		JLabel lblH_3 = new JLabel("-");
		monday_panel.add(lblH_3);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(comboBox_7);
		
		JPanel tuesday_panel = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) tuesday_panel.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setHgap(10);
		weekdays_panel.add(tuesday_panel);
		
		JLabel lblWedsnday = new JLabel("Tuesday: ");
		lblWedsnday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblWedsnday.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(lblWedsnday);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_2.setPreferredSize(new Dimension(43, 20));
		tuesday_panel.add(rigidArea_2);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setPreferredSize(new Dimension(50, 20));
		tuesday_panel.add(comboBox_8);
		
		JLabel label = new JLabel("-");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(label);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setPreferredSize(new Dimension(50, 20));
		tuesday_panel.add(comboBox_9);
		
		JLabel lblTo_2 = new JLabel("to");
		lblTo_2.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(lblTo_2);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setPreferredSize(new Dimension(50, 20));
		tuesday_panel.add(comboBox_10);
		
		JLabel label_1 = new JLabel("-");
		tuesday_panel.add(label_1);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setPreferredSize(new Dimension(50, 20));
		tuesday_panel.add(comboBox_11);
		
		JPanel wedsnday_panel = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) wedsnday_panel.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		flowLayout_5.setHgap(10);
		weekdays_panel.add(wedsnday_panel);
		
		JLabel lblThursday = new JLabel("Wedsnday: ");
		lblThursday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblThursday.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(lblThursday);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3.setPreferredSize(new Dimension(30, 20));
		wedsnday_panel.add(rigidArea_3);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setPreferredSize(new Dimension(50, 20));
		wedsnday_panel.add(comboBox_12);
		
		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(label_2);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setPreferredSize(new Dimension(50, 20));
		wedsnday_panel.add(comboBox_13);
		
		JLabel lblTo_3 = new JLabel("to");
		lblTo_3.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(lblTo_3);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setPreferredSize(new Dimension(50, 20));
		wedsnday_panel.add(comboBox_14);
		
		JLabel label_3 = new JLabel("-");
		wedsnday_panel.add(label_3);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setPreferredSize(new Dimension(50, 20));
		wedsnday_panel.add(comboBox_15);
		
		JPanel thursday_panel = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) thursday_panel.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		flowLayout_6.setHgap(10);
		weekdays_panel.add(thursday_panel);
		
		JLabel lblFriday = new JLabel("Thursday: ");
		lblFriday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblFriday.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(lblFriday);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(rigidArea_4);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setPreferredSize(new Dimension(50, 20));
		thursday_panel.add(comboBox_16);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(label_4);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setPreferredSize(new Dimension(50, 20));
		thursday_panel.add(comboBox_17);
		
		JLabel lblTo_4 = new JLabel("to");
		lblTo_4.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(lblTo_4);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setPreferredSize(new Dimension(50, 20));
		thursday_panel.add(comboBox_18);
		
		JLabel label_5 = new JLabel("-");
		thursday_panel.add(label_5);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setPreferredSize(new Dimension(50, 20));
		thursday_panel.add(comboBox_19);
		
		JPanel friday_panel = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) friday_panel.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		flowLayout_7.setHgap(10);
		weekdays_panel.add(friday_panel);
		
		JLabel lblFriday_1 = new JLabel("Friday: ");
		lblFriday_1.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblFriday_1.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(lblFriday_1);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_5.setPreferredSize(new Dimension(60, 20));
		friday_panel.add(rigidArea_5);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setPreferredSize(new Dimension(50, 20));
		friday_panel.add(comboBox_20);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(label_6);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setPreferredSize(new Dimension(50, 20));
		friday_panel.add(comboBox_21);
		
		JLabel lblTo_5 = new JLabel("to");
		lblTo_5.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(lblTo_5);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setPreferredSize(new Dimension(50, 20));
		friday_panel.add(comboBox_22);
		
		JLabel label_7 = new JLabel("-");
		friday_panel.add(label_7);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setPreferredSize(new Dimension(50, 20));
		friday_panel.add(comboBox_23);
		
		JPanel saturday_panel = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) saturday_panel.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		flowLayout_8.setHgap(10);
		weekdays_panel.add(saturday_panel);
		
		JLabel lblSaturday = new JLabel("Saturday: ");
		lblSaturday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblSaturday.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblSaturday);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_6.setPreferredSize(new Dimension(43, 20));
		saturday_panel.add(rigidArea_6);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setPreferredSize(new Dimension(50, 20));
		saturday_panel.add(comboBox_24);
		
		JLabel lblTo_6 = new JLabel("-");
		lblTo_6.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblTo_6);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setPreferredSize(new Dimension(50, 20));
		saturday_panel.add(comboBox_25);
		
		JLabel lblTo_7 = new JLabel("to");
		lblTo_7.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblTo_7);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setPreferredSize(new Dimension(50, 20));
		saturday_panel.add(comboBox_26);
		
		JLabel label_8 = new JLabel("-");
		saturday_panel.add(label_8);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setPreferredSize(new Dimension(50, 20));
		saturday_panel.add(comboBox_27);
		
		JPanel modify_panel_1 = new JPanel();
		modify_panel_1.setBorder(new EmptyBorder(10, 20, 0, 0));
		FlowLayout fl_modify_panel_1 = (FlowLayout) modify_panel_1.getLayout();
		fl_modify_panel_1.setVgap(-10);
		fl_modify_panel_1.setHgap(150);
		fl_modify_panel_1.setAlignment(FlowLayout.LEFT);
		weekdays_panel.add(modify_panel_1);
		
		JButton btnModify = new JButton("Modify All");
		modify_panel_1.add(btnModify);
		btnModify.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lbl_openingHours = new JLabel("Opening Time");
		lbl_openingHours.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_openingHours.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_openingHours.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_openingHours.setHorizontalAlignment(SwingConstants.LEFT);
		hour_panel.add(lbl_openingHours, BorderLayout.NORTH);
		lbl_openingHours.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lbl_openingHours.setName("");
	}

}