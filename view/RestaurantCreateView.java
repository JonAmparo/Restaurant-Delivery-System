package view_draft;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JList;
import javax.swing.JFormattedTextField;

public class RestaurantCreateView extends JFrame {
	
	
	
	
	/*list = new JList(data); //data has type Object[]
	list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	list.setVisibleRowCount(-1);
	
	JScrollPane listScroller = new JScrollPane(list);
	listScroller.setPreferredSize(new Dimension(250, 80));*/
	
	private JFormattedTextField txtfield_telephone;
	private JButton btnAddDeliveryArea;
	private JButton btnAddRestaurant;
	private JPanel contentPane;
	private JTextField txtfield_name;
	private JTextField txtfield_address;
	private JTextField textField;
	private JButton btnDeleteDeliveryArea;
	private JMenu mnResturant;
	private JMenu mnFile;
	private JList list;
	private JMenu mnMenu ;
	
	private JButton btnModify;
	// hours
	private JComboBox comboBox_2;
	private JComboBox comboBox_4;
	private JComboBox comboBox_8;
	private JComboBox comboBox_12;
	private JComboBox comboBox_16;
	private JComboBox comboBox_20;
	private JComboBox comboBox_24;
	private JComboBox comboBox_6;
	private JComboBox comboBox_10;
	private JComboBox comboBox_14;
	private JComboBox comboBox_18;
	private JComboBox comboBox_22;
	private JComboBox comboBox_26;
	private JComboBox comboBox;
	// minutes
	private JComboBox comboBox_1;
	private JComboBox comboBox_5;
	private JComboBox comboBox_9;
	private JComboBox comboBox_13;
	private JComboBox comboBox_17;
	private JComboBox comboBox_21;
	private JComboBox comboBox_25;
	private JComboBox comboBox_3;
	private JComboBox comboBox_7;
	private JComboBox comboBox_11;
	private JComboBox comboBox_15;
	private JComboBox comboBox_19;
	private JComboBox comboBox_23;
	private JComboBox comboBox_27;
	
	

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantCreate frame = new RestaurantCreate();
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
	public RestaurantCreateView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		this.setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		mnFile.add("disconnect");
		mnFile.add("exit");
		menuBar.add(mnFile);

		mnResturant = new JMenu("Restaurant");
		mnResturant.add("create");
		mnResturant.add("edit");
		mnResturant.add("delete");
		menuBar.add(mnResturant);

		mnMenu = new JMenu("Menu");
		mnMenu.add("create");
		mnMenu.add("edit");
		mnMenu.add("delete");
		menuBar.add(mnMenu);

		JMenu mnDeliveryMan = new JMenu("Delivery man");
		mnDeliveryMan.add("create");
		mnDeliveryMan.add("edit");
		mnDeliveryMan.add("delete");
		menuBar.add(mnDeliveryMan);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel top_panel = new JPanel();
		top_panel.setOpaque(false);
		top_panel.setPreferredSize(new Dimension(10, 200));
		contentPane.add(top_panel, BorderLayout.NORTH);
		top_panel.setLayout(new BorderLayout(0, 0));

		JPanel title_panel = new JPanel();
		title_panel.setOpaque(false);
		title_panel.setPreferredSize(new Dimension(10, 75));
		top_panel.add(title_panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("ADD NEW RESTAURANT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		title_panel.add(lblNewLabel);

		JPanel info_panel1 = new JPanel();
		info_panel1.setOpaque(false);
		info_panel1.setBorder(new EmptyBorder(0, 0, 0, 150));
		top_panel.add(info_panel1, BorderLayout.CENTER);
		info_panel1.setLayout(new GridLayout(3, 2, 20, 10));

		JLabel lbl_restaurantname = new JLabel("Restaurant Name: ");
		lbl_restaurantname.setForeground(Color.WHITE);
		lbl_restaurantname.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_restaurantname.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_restaurantname);

		txtfield_name = new JTextField();
		txtfield_name.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtfield_name.setFont(new Font("Arial", Font.PLAIN, 15));
		info_panel1.add(txtfield_name);
		txtfield_name.setColumns(10);

		JLabel lbl_restaurantAddress = new JLabel("Restaurant Address: ");
		lbl_restaurantAddress.setForeground(Color.WHITE);
		lbl_restaurantAddress.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_restaurantAddress.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_restaurantAddress);

		txtfield_address = new JTextField();
		txtfield_address.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtfield_address.setFont(new Font("Arial", Font.PLAIN, 15));
		info_panel1.add(txtfield_address);
		txtfield_address.setColumns(10);

		JLabel lbl_telephone = new JLabel("Telephone Number: ");
		lbl_telephone.setForeground(Color.WHITE);
		lbl_telephone.setBorder(new EmptyBorder(0, 150, 0, 0));
		lbl_telephone.setFont(new Font("Arial", Font.PLAIN, 17));
		info_panel1.add(lbl_telephone);
		
		try {
			MaskFormatter number = new MaskFormatter("(###) ###-####");
			txtfield_telephone = new JFormattedTextField(number);
		}catch(Exception e) {
			e.printStackTrace();
		}
		info_panel1.add(txtfield_telephone);
		
		JPanel bottom_panel = new JPanel();
		bottom_panel.setOpaque(false);
		contentPane.add(bottom_panel, BorderLayout.CENTER);
		bottom_panel.setLayout(new BoxLayout(bottom_panel, BoxLayout.Y_AXIS));

		JPanel hour_panel = new JPanel();
		hour_panel.setOpaque(false);
		bottom_panel.add(hour_panel);
		hour_panel.setBorder(new EmptyBorder(50, 0, 0, 0));
		hour_panel.setName("Opening Hours");
		hour_panel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		hour_panel.setLayout(new BorderLayout(0, 0));

		JPanel delivery_panel = new JPanel();
		delivery_panel.setOpaque(false);
		delivery_panel.setPreferredSize(new Dimension(485, 10));
		hour_panel.add(delivery_panel, BorderLayout.EAST);
		delivery_panel.setLayout(new BorderLayout(0, 0));

		JPanel deliveryAreaTitle_panel = new JPanel();
		deliveryAreaTitle_panel.setOpaque(false);
		delivery_panel.add(deliveryAreaTitle_panel, BorderLayout.NORTH);

		JLabel lblDeliveryArea = new JLabel("Delivery Area");
		lblDeliveryArea.setForeground(Color.WHITE);
		lblDeliveryArea.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		deliveryAreaTitle_panel.add(lblDeliveryArea);

		JPanel deliveryAreaBottom_panel = new JPanel();
		deliveryAreaBottom_panel.setOpaque(false);
		deliveryAreaBottom_panel.setPreferredSize(new Dimension(10, 150));
		delivery_panel.add(deliveryAreaBottom_panel, BorderLayout.SOUTH);
		deliveryAreaBottom_panel.setLayout(new BorderLayout(0, 0));

		JPanel deliveryAreaBtn_panel = new JPanel();
		deliveryAreaBtn_panel.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) deliveryAreaBtn_panel.getLayout();
		flowLayout.setVgap(0);
		deliveryAreaBtn_panel.setBorder(new EmptyBorder(10, 10, 0, 10));
		deliveryAreaBtn_panel.setFont(new Font("Arial", Font.BOLD, 12));
		deliveryAreaBtn_panel.setPreferredSize(new Dimension(10, 50));
		deliveryAreaBottom_panel.add(deliveryAreaBtn_panel, BorderLayout.SOUTH);

		btnAddDeliveryArea = new JButton(new ImageIcon("button_add-delivery-area.png"));
		btnAddDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnAddDeliveryArea);

		btnDeleteDeliveryArea = new JButton("Delete delivery Area");
		btnDeleteDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnDeleteDeliveryArea);

		btnAddRestaurant = new JButton("Add");
		btnAddRestaurant.setFont(new Font("Tahoma", Font.BOLD, 12));
		deliveryAreaBtn_panel.add(btnAddRestaurant);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new EmptyBorder(20, 0, 0, 0));
		deliveryAreaBottom_panel.add(panel, BorderLayout.CENTER);

		JLabel lblDeliveryArea_1 = new JLabel("Delivery Area");
		lblDeliveryArea_1.setForeground(Color.WHITE);
		lblDeliveryArea_1.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(lblDeliveryArea_1);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(6, 25));
		textField.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(textField);
		textField.setColumns(10);

		JPanel deliverytxt_panel = new JPanel();
		deliverytxt_panel.setOpaque(false);
		deliverytxt_panel.setFont(new Font("Arial", Font.ITALIC, 15));
		delivery_panel.add(deliverytxt_panel, BorderLayout.CENTER);
		deliverytxt_panel.setLayout(new BorderLayout(0, 0));
		
		list = new JList();
		list.setFont(new Font("Arial", Font.ITALIC, 16));
		deliverytxt_panel.add(list, BorderLayout.CENTER);
		

		JPanel weekdays_panel = new JPanel();
		weekdays_panel.setOpaque(false);
		weekdays_panel.setPreferredSize(new Dimension(480, 10));
		hour_panel.add(weekdays_panel, BorderLayout.WEST);
		weekdays_panel.setLayout(new BoxLayout(weekdays_panel, BoxLayout.Y_AXIS));

		JPanel weekdayTitle_panel = new JPanel();
		weekdayTitle_panel.setOpaque(false);
		weekdayTitle_panel.setBorder(new EmptyBorder(0, 50, 0, 50));
		weekdays_panel.add(weekdayTitle_panel);
		weekdayTitle_panel.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lblDay = new JLabel("Day");
		lblDay.setForeground(Color.WHITE);
		lblDay.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblDay);

		JLabel lblOpeningHours = new JLabel("Opening hours");
		lblOpeningHours.setForeground(Color.WHITE);
		lblOpeningHours.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblOpeningHours);

		JLabel lblClosingHours = new JLabel("Closing hours");
		lblClosingHours.setForeground(Color.WHITE);
		lblClosingHours.setFont(new Font("Arial", Font.ITALIC, 12));
		weekdayTitle_panel.add(lblClosingHours);

		JPanel sunday_panel = new JPanel();
		sunday_panel.setOpaque(false);
		FlowLayout flowLayout_1 = (FlowLayout) sunday_panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setHgap(10);
		weekdays_panel.add(sunday_panel);

		JLabel lblMonday = new JLabel("Sunday: ");
		lblMonday.setForeground(Color.WHITE);
		lblMonday.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMonday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblMonday.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblMonday);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setPreferredSize(new Dimension(50, 20));
		sunday_panel.add(rigidArea);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setPreferredSize(new Dimension(40, 20));
		sunday_panel.add(comboBox);

		JLabel lblH = new JLabel("-");
		lblH.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblH);

		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_1.setPreferredSize(new Dimension(40, 20));
		sunday_panel.add(comboBox_1);

		JLabel lblTo = new JLabel("to");
		lblTo.setFont(new Font("Arial", Font.PLAIN, 15));
		sunday_panel.add(lblTo);

		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_2.setPreferredSize(new Dimension(40, 20));
		sunday_panel.add(comboBox_2);

		JLabel lblH_1 = new JLabel("-");
		sunday_panel.add(lblH_1);

		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_3.setPreferredSize(new Dimension(40, 20));
		sunday_panel.add(comboBox_3);

		JPanel monday_panel = new JPanel();
		monday_panel.setOpaque(false);
		FlowLayout flowLayout_3 = (FlowLayout) monday_panel.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setHgap(10);
		weekdays_panel.add(monday_panel);

		JLabel lblTuesday = new JLabel("Monday: ");
		lblTuesday.setForeground(Color.WHITE);
		lblTuesday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblTuesday.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblTuesday);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setPreferredSize(new Dimension(50, 20));
		monday_panel.add(rigidArea_1);

		comboBox_4 = new JComboBox();
		comboBox_4.setPreferredSize(new Dimension(40, 20));
		monday_panel.add(comboBox_4);

		JLabel lblH_2 = new JLabel("-");
		lblH_2.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblH_2);

		comboBox_5 = new JComboBox();
		comboBox_5.setPreferredSize(new Dimension(40, 20));
		monday_panel.add(comboBox_5);

		JLabel lblTo_1 = new JLabel("to");
		lblTo_1.setFont(new Font("Arial", Font.PLAIN, 15));
		monday_panel.add(lblTo_1);

		comboBox_6 = new JComboBox();
		comboBox_6.setPreferredSize(new Dimension(40, 20));
		monday_panel.add(comboBox_6);

		JLabel lblH_3 = new JLabel("-");
		monday_panel.add(lblH_3);

		comboBox_7 = new JComboBox();
		comboBox_7.setPreferredSize(new Dimension(40, 20));
		monday_panel.add(comboBox_7);

		JPanel tuesday_panel = new JPanel();
		tuesday_panel.setOpaque(false);
		FlowLayout flowLayout_4 = (FlowLayout) tuesday_panel.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setHgap(10);
		weekdays_panel.add(tuesday_panel);

		JLabel lblWedsnday = new JLabel("Tuesday: ");
		lblWedsnday.setForeground(Color.WHITE);
		lblWedsnday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblWedsnday.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(lblWedsnday);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_2.setPreferredSize(new Dimension(43, 20));
		tuesday_panel.add(rigidArea_2);

		comboBox_8 = new JComboBox();
		comboBox_8.setPreferredSize(new Dimension(40, 20));
		tuesday_panel.add(comboBox_8);

		JLabel label = new JLabel("-");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(label);

		comboBox_9 = new JComboBox();
		comboBox_9.setPreferredSize(new Dimension(40, 20));
		tuesday_panel.add(comboBox_9);

		JLabel lblTo_2 = new JLabel("to");
		lblTo_2.setFont(new Font("Arial", Font.PLAIN, 15));
		tuesday_panel.add(lblTo_2);

		comboBox_10 = new JComboBox();
		comboBox_10.setPreferredSize(new Dimension(40, 20));
		tuesday_panel.add(comboBox_10);

		JLabel label_1 = new JLabel("-");
		tuesday_panel.add(label_1);

		comboBox_11 = new JComboBox();
		comboBox_11.setPreferredSize(new Dimension(40, 20));
		tuesday_panel.add(comboBox_11);

		JPanel wedsnday_panel = new JPanel();
		wedsnday_panel.setOpaque(false);
		FlowLayout flowLayout_5 = (FlowLayout) wedsnday_panel.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		flowLayout_5.setHgap(10);
		weekdays_panel.add(wedsnday_panel);

		JLabel lblThursday = new JLabel("Wedsnday: ");
		lblThursday.setForeground(Color.WHITE);
		lblThursday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblThursday.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(lblThursday);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3.setPreferredSize(new Dimension(30, 20));
		wedsnday_panel.add(rigidArea_3);

		comboBox_12 = new JComboBox();
		comboBox_12.setPreferredSize(new Dimension(40, 20));
		wedsnday_panel.add(comboBox_12);

		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(label_2);

		comboBox_13 = new JComboBox();
		comboBox_13.setPreferredSize(new Dimension(40, 20));
		wedsnday_panel.add(comboBox_13);

		JLabel lblTo_3 = new JLabel("to");
		lblTo_3.setFont(new Font("Arial", Font.PLAIN, 15));
		wedsnday_panel.add(lblTo_3);

		comboBox_14 = new JComboBox();
		comboBox_14.setPreferredSize(new Dimension(40, 20));
		wedsnday_panel.add(comboBox_14);

		JLabel label_3 = new JLabel("-");
		wedsnday_panel.add(label_3);

		comboBox_15 = new JComboBox();
		comboBox_15.setPreferredSize(new Dimension(40, 20));
		wedsnday_panel.add(comboBox_15);

		JPanel thursday_panel = new JPanel();
		thursday_panel.setOpaque(false);
		FlowLayout flowLayout_6 = (FlowLayout) thursday_panel.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		flowLayout_6.setHgap(10);
		weekdays_panel.add(thursday_panel);

		JLabel lblFriday = new JLabel("Thursday: ");
		lblFriday.setForeground(Color.WHITE);
		lblFriday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblFriday.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(lblFriday);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(rigidArea_4);

		comboBox_16 = new JComboBox();
		comboBox_16.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(comboBox_16);

		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(label_4);

		comboBox_17 = new JComboBox();
		comboBox_17.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(comboBox_17);

		JLabel lblTo_4 = new JLabel("to");
		lblTo_4.setFont(new Font("Arial", Font.PLAIN, 15));
		thursday_panel.add(lblTo_4);

		comboBox_18 = new JComboBox();
		comboBox_18.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(comboBox_18);

		JLabel label_5 = new JLabel("-");
		thursday_panel.add(label_5);

		comboBox_19 = new JComboBox();
		comboBox_19.setPreferredSize(new Dimension(40, 20));
		thursday_panel.add(comboBox_19);

		JPanel friday_panel = new JPanel();
		friday_panel.setOpaque(false);
		FlowLayout flowLayout_7 = (FlowLayout) friday_panel.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		flowLayout_7.setHgap(10);
		weekdays_panel.add(friday_panel);

		JLabel lblFriday_1 = new JLabel("Friday: ");
		lblFriday_1.setForeground(Color.WHITE);
		lblFriday_1.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblFriday_1.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(lblFriday_1);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_5.setPreferredSize(new Dimension(60, 20));
		friday_panel.add(rigidArea_5);

		comboBox_20 = new JComboBox();
		comboBox_20.setPreferredSize(new Dimension(40, 20));
		friday_panel.add(comboBox_20);

		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(label_6);

		comboBox_21 = new JComboBox();
		comboBox_21.setPreferredSize(new Dimension(40, 20));
		friday_panel.add(comboBox_21);

		JLabel lblTo_5 = new JLabel("to");
		lblTo_5.setFont(new Font("Arial", Font.PLAIN, 15));
		friday_panel.add(lblTo_5);

		comboBox_22 = new JComboBox();
		comboBox_22.setPreferredSize(new Dimension(40, 20));
		friday_panel.add(comboBox_22);

		JLabel label_7 = new JLabel("-");
		friday_panel.add(label_7);

		comboBox_23 = new JComboBox();
		comboBox_23.setPreferredSize(new Dimension(40, 20));
		friday_panel.add(comboBox_23);

		JPanel saturday_panel = new JPanel();
		saturday_panel.setOpaque(false);
		FlowLayout flowLayout_8 = (FlowLayout) saturday_panel.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		flowLayout_8.setHgap(10);
		weekdays_panel.add(saturday_panel);

		JLabel lblSaturday = new JLabel("Saturday: ");
		lblSaturday.setForeground(Color.WHITE);
		lblSaturday.setBorder(new EmptyBorder(0, 20, 0, 0));
		lblSaturday.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblSaturday);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_6.setPreferredSize(new Dimension(43, 20));
		saturday_panel.add(rigidArea_6);

		comboBox_24 = new JComboBox();
		comboBox_24.setPreferredSize(new Dimension(40, 20));
		saturday_panel.add(comboBox_24);

		JLabel lblTo_6 = new JLabel("-");
		lblTo_6.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblTo_6);

		comboBox_25 = new JComboBox();
		comboBox_25.setPreferredSize(new Dimension(40, 20));
		saturday_panel.add(comboBox_25);

		JLabel lblTo_7 = new JLabel("to");
		lblTo_7.setFont(new Font("Arial", Font.PLAIN, 15));
		saturday_panel.add(lblTo_7);

		comboBox_26 = new JComboBox();
		comboBox_26.setPreferredSize(new Dimension(40, 20));
		saturday_panel.add(comboBox_26);

		JLabel label_8 = new JLabel("-");
		saturday_panel.add(label_8);

		comboBox_27 = new JComboBox();
		comboBox_27.setPreferredSize(new Dimension(40, 20));
		saturday_panel.add(comboBox_27);

		JPanel modify_panel_1 = new JPanel();
		modify_panel_1.setOpaque(false);
		modify_panel_1.setBorder(new EmptyBorder(10, 20, 0, 0));
		FlowLayout fl_modify_panel_1 = (FlowLayout) modify_panel_1.getLayout();
		fl_modify_panel_1.setVgap(-10);
		fl_modify_panel_1.setHgap(150);
		fl_modify_panel_1.setAlignment(FlowLayout.LEFT);
		weekdays_panel.add(modify_panel_1);

		btnModify = new JButton("Modify All");
		modify_panel_1.add(btnModify);
		btnModify.setFont(new Font("Arial", Font.BOLD, 12));

		JLabel lbl_openingHours = new JLabel("Opening Time");
		lbl_openingHours.setForeground(Color.WHITE);
		lbl_openingHours.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_openingHours.setBorder(new EmptyBorder(0, 125, 0, 0));
		lbl_openingHours.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_openingHours.setHorizontalAlignment(SwingConstants.LEFT);
		hour_panel.add(lbl_openingHours, BorderLayout.NORTH);
		lbl_openingHours.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lbl_openingHours.setName("");
		
		//combo box hour and minute function
		addHours();
		addMinutes();	
		
		this.setVisible(false);
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
	 * @return the mnResturant
	 */
	public JMenu getMnResturant() {
		return mnResturant;
	}




	/**
	 * @param mnResturant the mnResturant to set
	 */
	public void setMnResturant(JMenu mnResturant) {
		this.mnResturant = mnResturant;
	}




	/**
	 * @return the btnModify
	 */
	public JButton getBtnModify() {
		return btnModify;
	}




	/**
	 * @param btnModify the btnModify to set
	 */
	public void setBtnModify(JButton btnModify) {
		this.btnModify = btnModify;
	}




	/**
	 * @return the btnDeleteDeliveryArea
	 */
	public JButton getBtnDeleteDeliveryArea() {
		return btnDeleteDeliveryArea;
	}




	/**
	 * @param btnDeleteDeliveryArea the btnDeleteDeliveryArea to set
	 */
	public void setBtnDeleteDeliveryArea(JButton btnDeleteDeliveryArea) {
		this.btnDeleteDeliveryArea = btnDeleteDeliveryArea;
	}




	/**
	 * @return the list
	 */
	public JList getList() {
		return list;
	}




	/**
	 * @param list the list to set
	 */
	public void setList(JList list) {
		this.list = list;
	}




	/**
	 * @return the btnAddDeliveryArea
	 */
	public JButton getBtnAddDeliveryArea() {
		return btnAddDeliveryArea;
	}




	/**
	 * @param btnAddDeliveryArea the btnAddDeliveryArea to set
	 */
	public void setBtnAddDeliveryArea(JButton btnAddDeliveryArea) {
		this.btnAddDeliveryArea = btnAddDeliveryArea;
	}




	/**
	 * @return the dlm
	 */
	




	
	/**
	 * @return the btnAddRestaurant
	 */
	public JButton getBtnAddRestaurant() {
		return btnAddRestaurant;
	}

	/**
	 * @return the txtfield_telephone
	 */
	public JFormattedTextField getTxtfield_telephone() {
		return txtfield_telephone;
	}




	/**
	 * @param txtfield_telephone the txtfield_telephone to set
	 */
	public void setTxtfield_telephone(JFormattedTextField txtfield_telephone) {
		this.txtfield_telephone = txtfield_telephone;
	}




	/**
	 * @return the comboBox_2
	 */
	public JComboBox getComboBox_2() {
		return comboBox_2;
	}




	/**
	 * @param comboBox_2 the comboBox_2 to set
	 */
	public void setComboBox_2(JComboBox comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}




	/**
	 * @param btnAddRestaurant the btnAddRestaurant to set
	 */
	public void setBtnAddRestaurant(JButton btnAddRestaurant) {
		this.btnAddRestaurant = btnAddRestaurant;
	}
		
	/**
	 * @return the txtfield_name
	 */
	public JTextField getTxtfield_name() {
		return txtfield_name;
	}

	/**
	 * @param txtfield_name the txtfield_name to set
	 */
	public void setTxtfield_name(JTextField txtfield_name) {
		this.txtfield_name = txtfield_name;
	}

	/**
	 * @return the txtfield_address
	 */
	public JTextField getTxtfield_address() {
		return txtfield_address;
	}

	/**
	 * @param txtfield_address the txtfield_address to set
	 */
	public void setTxtfield_address(JTextField txtfield_address) {
		this.txtfield_address = txtfield_address;
	}

	
	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * @return the closingH_comboBox
	 */
	public JComboBox getClosingH_comboBox() {
		return comboBox_2;
	}

	/**
	 * @param closingH_comboBox the closingH_comboBox to set
	 */
	public void setClosingH_comboBox(JComboBox closingH_comboBox) {
		this.comboBox_2 = closingH_comboBox;
	}

	/**
	 * @return the comboBox_4
	 */
	public JComboBox getComboBox_4() {
		return comboBox_4;
	}

	/**
	 * @param comboBox_4 the comboBox_4 to set
	 */
	public void setComboBox_4(JComboBox comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	/**
	 * @return the comboBox_8
	 */
	public JComboBox getComboBox_8() {
		return comboBox_8;
	}

	/**
	 * @param comboBox_8 the comboBox_8 to set
	 */
	public void setComboBox_8(JComboBox comboBox_8) {
		this.comboBox_8 = comboBox_8;
	}

	/**
	 * @return the comboBox_12
	 */
	public JComboBox getComboBox_12() {
		return comboBox_12;
	}

	/**
	 * @param comboBox_12 the comboBox_12 to set
	 */
	public void setComboBox_12(JComboBox comboBox_12) {
		this.comboBox_12 = comboBox_12;
	}

	/**
	 * @return the comboBox_16
	 */
	public JComboBox getComboBox_16() {
		return comboBox_16;
	}

	/**
	 * @param comboBox_16 the comboBox_16 to set
	 */
	public void setComboBox_16(JComboBox comboBox_16) {
		this.comboBox_16 = comboBox_16;
	}

	/**
	 * @return the comboBox_20
	 */
	public JComboBox getComboBox_20() {
		return comboBox_20;
	}

	/**
	 * @param comboBox_20 the comboBox_20 to set
	 */
	public void setComboBox_20(JComboBox comboBox_20) {
		this.comboBox_20 = comboBox_20;
	}

	/**
	 * @return the comboBox_24
	 */
	public JComboBox getComboBox_24() {
		return comboBox_24;
	}

	/**
	 * @param comboBox_24 the comboBox_24 to set
	 */
	public void setComboBox_24(JComboBox comboBox_24) {
		this.comboBox_24 = comboBox_24;
	}

	/**
	 * @return the comboBox_6
	 */
	public JComboBox getComboBox_6() {
		return comboBox_6;
	}

	/**
	 * @param comboBox_6 the comboBox_6 to set
	 */
	public void setComboBox_6(JComboBox comboBox_6) {
		this.comboBox_6 = comboBox_6;
	}

	/**
	 * @return the comboBox_10
	 */
	public JComboBox getComboBox_10() {
		return comboBox_10;
	}

	/**
	 * @param comboBox_10 the comboBox_10 to set
	 */
	public void setComboBox_10(JComboBox comboBox_10) {
		this.comboBox_10 = comboBox_10;
	}

	/**
	 * @return the comboBox_14
	 */
	public JComboBox getComboBox_14() {
		return comboBox_14;
	}

	/**
	 * @param comboBox_14 the comboBox_14 to set
	 */
	public void setComboBox_14(JComboBox comboBox_14) {
		this.comboBox_14 = comboBox_14;
	}

	/**
	 * @return the comboBox_18
	 */
	public JComboBox getComboBox_18() {
		return comboBox_18;
	}

	/**
	 * @param comboBox_18 the comboBox_18 to set
	 */
	public void setComboBox_18(JComboBox comboBox_18) {
		this.comboBox_18 = comboBox_18;
	}

	/**
	 * @return the comboBox_22
	 */
	public JComboBox getComboBox_22() {
		return comboBox_22;
	}

	/**
	 * @param comboBox_22 the comboBox_22 to set
	 */
	public void setComboBox_22(JComboBox comboBox_22) {
		this.comboBox_22 = comboBox_22;
	}

	/**
	 * @return the comboBox_26
	 */
	public JComboBox getComboBox_26() {
		return comboBox_26;
	}

	/**
	 * @param comboBox_26 the comboBox_26 to set
	 */
	public void setComboBox_26(JComboBox comboBox_26) {
		this.comboBox_26 = comboBox_26;
	}

	/**
	 * @return the comboBox
	 */
	public JComboBox getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the comboBox_1
	 */
	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	/**
	 * @param comboBox_1 the comboBox_1 to set
	 */
	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	/**
	 * @return the comboBox_5
	 */
	public JComboBox getComboBox_5() {
		return comboBox_5;
	}

	/**
	 * @param comboBox_5 the comboBox_5 to set
	 */
	public void setComboBox_5(JComboBox comboBox_5) {
		this.comboBox_5 = comboBox_5;
	}

	/**
	 * @return the comboBox_9
	 */
	public JComboBox getComboBox_9() {
		return comboBox_9;
	}

	/**
	 * @param comboBox_9 the comboBox_9 to set
	 */
	public void setComboBox_9(JComboBox comboBox_9) {
		this.comboBox_9 = comboBox_9;
	}

	/**
	 * @return the comboBox_13
	 */
	public JComboBox getComboBox_13() {
		return comboBox_13;
	}

	/**
	 * @param comboBox_13 the comboBox_13 to set
	 */
	public void setComboBox_13(JComboBox comboBox_13) {
		this.comboBox_13 = comboBox_13;
	}

	/**
	 * @return the comboBox_17
	 */
	public JComboBox getComboBox_17() {
		return comboBox_17;
	}

	/**
	 * @param comboBox_17 the comboBox_17 to set
	 */
	public void setComboBox_17(JComboBox comboBox_17) {
		this.comboBox_17 = comboBox_17;
	}

	/**
	 * @return the comboBox_21
	 */
	public JComboBox getComboBox_21() {
		return comboBox_21;
	}

	/**
	 * @param comboBox_21 the comboBox_21 to set
	 */
	public void setComboBox_21(JComboBox comboBox_21) {
		this.comboBox_21 = comboBox_21;
	}

	/**
	 * @return the comboBox_25
	 */
	public JComboBox getComboBox_25() {
		return comboBox_25;
	}

	/**
	 * @param comboBox_25 the comboBox_25 to set
	 */
	public void setComboBox_25(JComboBox comboBox_25) {
		this.comboBox_25 = comboBox_25;
	}

	/**
	 * @return the comboBox_3
	 */
	public JComboBox getComboBox_3() {
		return comboBox_3;
	}

	/**
	 * @param comboBox_3 the comboBox_3 to set
	 */
	public void setComboBox_3(JComboBox comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	/**
	 * @return the comboBox_7
	 */
	public JComboBox getComboBox_7() {
		return comboBox_7;
	}

	/**
	 * @param comboBox_7 the comboBox_7 to set
	 */
	public void setComboBox_7(JComboBox comboBox_7) {
		this.comboBox_7 = comboBox_7;
	}

	/**
	 * @return the comboBox_11
	 */
	public JComboBox getComboBox_11() {
		return comboBox_11;
	}

	/**
	 * @param comboBox_11 the comboBox_11 to set
	 */
	public void setComboBox_11(JComboBox comboBox_11) {
		this.comboBox_11 = comboBox_11;
	}

	/**
	 * @return the comboBox_15
	 */
	public JComboBox getComboBox_15() {
		return comboBox_15;
	}

	/**
	 * @param comboBox_15 the comboBox_15 to set
	 */
	public void setComboBox_15(JComboBox comboBox_15) {
		this.comboBox_15 = comboBox_15;
	}

	/**
	 * @return the comboBox_19
	 */
	public JComboBox getComboBox_19() {
		return comboBox_19;
	}

	/**
	 * @param comboBox_19 the comboBox_19 to set
	 */
	public void setComboBox_19(JComboBox comboBox_19) {
		this.comboBox_19 = comboBox_19;
	}

	/**
	 * @return the comboBox_23
	 */
	public JComboBox getComboBox_23() {
		return comboBox_23;
	}

	/**
	 * @param comboBox_23 the comboBox_23 to set
	 */
	public void setComboBox_23(JComboBox comboBox_23) {
		this.comboBox_23 = comboBox_23;
	}

	/**
	 * @return the comboBox_27
	 */
	public JComboBox getComboBox_27() {
		return comboBox_27;
	}

	/**
	 * @param comboBox_27 the comboBox_27 to set
	 */
	public void setComboBox_27(JComboBox comboBox_27) {
		this.comboBox_27 = comboBox_27;
	}
	
	public void comboResetHour() {
		comboBox.setSelectedItem(1);
		comboBox_2.setSelectedItem(1);
		comboBox_4.setSelectedItem(1);
		comboBox_8.setSelectedItem(1);
		comboBox_12.setSelectedItem(1);
		comboBox_16.setSelectedItem(1);
		comboBox_20.setSelectedItem(1);
		comboBox_24.setSelectedItem(1);
		comboBox_6.setSelectedItem(1);
		comboBox_10.setSelectedItem(1);
		comboBox_14.setSelectedItem(1);
		comboBox_18.setSelectedItem(1);
		comboBox_22.setSelectedItem(1);
		comboBox_26.setSelectedItem(1);
	}
	
	public void comboResetMinute() {
		
		comboBox_1.setSelectedItem("0"+1);
		comboBox_5.setSelectedItem("0"+1);
		comboBox_9.setSelectedItem("0"+1);
		comboBox_13.setSelectedItem("0"+1);
		comboBox_17.setSelectedItem("0"+1);
		comboBox_21.setSelectedItem("0"+1);
		comboBox_25.setSelectedItem("0"+1);
		comboBox_3.setSelectedItem("0"+1);
		comboBox_7.setSelectedItem("0"+1);
		comboBox_11.setSelectedItem("0"+1);
		comboBox_15.setSelectedItem("0"+1);
		comboBox_19.setSelectedItem("0"+1);
		comboBox_23.setSelectedItem("0"+1);
		comboBox_27.setSelectedItem("0"+1);
		
		
	}

	public void addHours() {
		for (int i = 1; i <= 24; i++) {
			comboBox.addItem(i);
			comboBox_2.addItem(i);
			comboBox_4.addItem(i);
			comboBox_8.addItem(i);
			comboBox_12.addItem(i);
			comboBox_16.addItem(i);
			comboBox_20.addItem(i);
			comboBox_24.addItem(i);
			comboBox_6.addItem(i);
			comboBox_10.addItem(i);
			comboBox_14.addItem(i);
			comboBox_18.addItem(i);
			comboBox_22.addItem(i);
			comboBox_26.addItem(i);
		}
	}

	public void addMinutes() {
		for (int i = 1; i < 60; i++) {

			if (i < 10) {
				comboBox_1.addItem("0"+ i);
				comboBox_5.addItem("0"+ i);
				comboBox_9.addItem("0"+ i);
				comboBox_13.addItem("0"+ i);
				comboBox_17.addItem("0"+ i);
				comboBox_21.addItem("0"+ i);
				comboBox_25.addItem("0"+ i);
				comboBox_3.addItem("0"+ i);
				comboBox_7.addItem("0"+ i);
				comboBox_11.addItem("0"+ i);
				comboBox_15.addItem("0"+ i);
			 comboBox_19.addItem("0"+ i);
				comboBox_23.addItem("0"+ i);
				comboBox_27.addItem("0"+ i);
				
			} else {
				comboBox_1.addItem(i+"");
				comboBox_5.addItem(i+"");
				comboBox_9.addItem(i+"");
				comboBox_13.addItem(i+"");
				comboBox_17.addItem(i+"");
				comboBox_21.addItem(i+"");
				comboBox_25.addItem(i+"");
				comboBox_3.addItem(i+"");
				comboBox_7.addItem(i+"");
				comboBox_11.addItem(i+"");
				comboBox_15.addItem(i+"");
				comboBox_19.addItem(i+"");
				comboBox_23.addItem(i+"");
				comboBox_27.addItem(i+"");
			}

		}
	}

}
