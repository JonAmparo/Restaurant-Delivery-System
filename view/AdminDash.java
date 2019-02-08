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
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class AdminDash extends JFrame {

	private JPanel contentPane;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnCreate;
	private JMenu menuRestaurant;
	private JMenu menuFile;
	private JMenuItem menuItemQuit;
	private JButton btnCreate_1;
	private JButton btnEdit_1;
	private JButton btnDelete_1;
	private JMenu menuMenu;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDash frame = new AdminDash();
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
	public AdminDash() {
		setTitle("Restuarant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		menuBar.setFont(new Font("Arial", Font.PLAIN, 15));
		setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuFile);
		
		JMenuItem menuItemDisconnect = new JMenuItem("Disconnect");
		menuItemDisconnect.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemDisconnect);
		
		menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);
		
		menuRestaurant = new JMenu("Restaurant");
		menuRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuRestaurant);
		
		JMenuItem menuItemCreateRestaurant = new JMenuItem("Create");
		menuItemCreateRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuRestaurant.add(menuItemCreateRestaurant);
		
		JMenuItem menuItemEditRestaurant = new JMenuItem("Edit");
		menuItemEditRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuRestaurant.add(menuItemEditRestaurant);
		
		JMenuItem menuItemDeleteRestaurant = new JMenuItem("Delete");
		menuItemDeleteRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuRestaurant.add(menuItemDeleteRestaurant);
		
		menuMenu = new JMenu("Menu");
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
		
		JMenu menuDelivery = new JMenu("Delivery");
		menuDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuDelivery);
		
		JMenuItem menuItemCreateDelivery = new JMenuItem("Create");
		menuItemCreateDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuDelivery.add(menuItemCreateDelivery);
		
		JMenuItem menuItemEditDelivery = new JMenuItem("Edit");
		menuItemEditDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuDelivery.add(menuItemEditDelivery);
		
		JMenuItem menuItemDeleteDelivery = new JMenuItem("Delete");
		menuItemDeleteDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuDelivery.add(menuItemDeleteDelivery);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(110);
		panel.setPreferredSize(new Dimension(10, 250));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblWelcome = new JLabel("Admin Options");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 40));
		panel.add(lblWelcome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setVgap(15);
		panel_5.setPreferredSize(new Dimension(10, 60));
		panel_2.add(panel_5, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Restaurant");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD | Font.ITALIC, 21));
		panel_5.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		FlowLayout flowLayout_4 = (FlowLayout) panel_8.getLayout();
		flowLayout_4.setVgap(0);
		panel_2.add(panel_8, BorderLayout.CENTER);
		
		btnCreate = new JButton("Create");
		btnCreate.setIcon(new ImageIcon("button_create.png"));
		btnCreate.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnCreate.setPreferredSize(new Dimension(150, 50));
		btnCreate.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		panel_8.add(btnCreate);
		
		btnEdit = new JButton(new ImageIcon("button_edit.png"));
		btnEdit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnEdit.setPreferredSize(new Dimension(150, 50));
		btnEdit.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		panel_8.add(btnEdit);
		
		btnDelete = new JButton(new ImageIcon("button_delete.png"));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnDelete.setPreferredSize(new Dimension(150, 50));
		btnDelete.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		panel_8.add(btnDelete);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setVgap(15);
		panel_6.setPreferredSize(new Dimension(10, 60));
		panel_3.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Menu\r\n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD | Font.ITALIC, 21));
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		FlowLayout flowLayout_5 = (FlowLayout) panel_9.getLayout();
		flowLayout_5.setVgap(0);
		panel_3.add(panel_9, BorderLayout.CENTER);
		
		btnCreate_1 = new JButton(new ImageIcon("button_create.png"));
		btnCreate_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnCreate_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnCreate_1.setPreferredSize(new Dimension(150, 50));
		panel_9.add(btnCreate_1);
		
		btnEdit_1 = new JButton(new ImageIcon("button_edit.png"));
		btnEdit_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnEdit_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnEdit_1.setPreferredSize(new Dimension(150, 50));
		panel_9.add(btnEdit_1);
		
		btnDelete_1 = new JButton(new ImageIcon("button_delete.png"));
		btnDelete_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnDelete_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnDelete_1.setPreferredSize(new Dimension(150, 50));
		panel_9.add(btnDelete_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setVgap(15);
		panel_7.setPreferredSize(new Dimension(10, 60));
		panel_4.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Delivery");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD | Font.ITALIC, 21));
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		FlowLayout flowLayout_6 = (FlowLayout) panel_10.getLayout();
		flowLayout_6.setVgap(0);
		panel_4.add(panel_10, BorderLayout.CENTER);
		
		JButton btnCreate_2 = new JButton(new ImageIcon("button_create.png"));
		btnCreate_2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnCreate_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnCreate_2.setPreferredSize(new Dimension(150, 50));
		panel_10.add(btnCreate_2);
		
		JButton btnEdit_2 = new JButton(new ImageIcon("button_edit.png"));
		btnEdit_2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnEdit_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnEdit_2.setPreferredSize(new Dimension(150, 50));
		panel_10.add(btnEdit_2);
		
		JButton btnDelete_2 = new JButton(new ImageIcon("button_delete.png"));
		btnDelete_2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		btnDelete_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		btnDelete_2.setPreferredSize(new Dimension(150, 50));
		panel_10.add(btnDelete_2);
		
		this.setVisible(false);
	}
	
	

	/**
	 * @return the menuMenu
	 */
	public JMenu getMenuMenu() {
		return menuMenu;
	}



	/**
	 * @param menuMenu the menuMenu to set
	 */
	public void setMenuMenu(JMenu menuMenu) {
		this.menuMenu = menuMenu;
	}



	/**
	 * @return the btnEdit_1
	 */
	public JButton getBtnEdit_1() {
		return btnEdit_1;
	}



	/**
	 * @param btnEdit_1 the btnEdit_1 to set
	 */
	public void setBtnEdit_1(JButton btnEdit_1) {
		this.btnEdit_1 = btnEdit_1;
	}



	/**
	 * @return the btnDelete_1
	 */
	public JButton getBtnDelete_1() {
		return btnDelete_1;
	}



	/**
	 * @param btnDelete_1 the btnDelete_1 to set
	 */
	public void setBtnDelete_1(JButton btnDelete_1) {
		this.btnDelete_1 = btnDelete_1;
	}



	/**
	 * @return the btnCreate_1
	 */
	public JButton getBtnCreate_1() {
		return btnCreate_1;
	}



	/**
	 * @param btnCreate_1 the btnCreate_1 to set
	 */
	public void setBtnCreate_1(JButton btnCreate_1) {
		this.btnCreate_1 = btnCreate_1;
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
	 * @return the menuFile
	 */
	public JMenu getMenuFile() {
		return menuFile;
	}



	/**
	 * @param menuFile the menuFile to set
	 */
	public void setMenuFile(JMenu menuFile) {
		this.menuFile = menuFile;
	}



	/**
	 * @return the menuRestaurant
	 */
	public JMenu getMenuRestaurant() {
		return menuRestaurant;
	}



	/**
	 * @param menuRestaurant the menuRestaurant to set
	 */
	public void setMenuRestaurant(JMenu menuRestaurant) {
		this.menuRestaurant = menuRestaurant;
	}



	/**
	 * @return the btnCreate
	 */
	public JButton getBtnCreate() {
		return btnCreate;
	}



	/**
	 * @param btnCreate the btnCreate to set
	 */
	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}



	/**
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}



	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}



	/**
	 * @return the btnEdit
	 */
	public JButton getBtnEdit() {
		return btnEdit;
	}

	/**
	 * @param btnEdit the btnEdit to set
	 */
	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}
	
	

}
