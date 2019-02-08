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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class ManagerView extends JFrame {

	private JPanel contentPane;
	private JButton btnEdit;
	private JButton btnCreate;
	private JButton btnDelete;
	private JMenu menuFile;
	private JMenu menuRestaurant;
	private JMenuItem menuItemEditRestaurant;
	public JMenuItem menuItemCreateMenu;
	public JMenuItem menuItemEditMenu;
	public JMenuItem menuItemDeleteMenu;
	public JMenu menuMenu;
	

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerView frame = new ManagerView();
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
	public ManagerView() {
		setTitle("Manager dashboard | Restuarant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		
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
		
		JMenuItem menuItemQuit = new JMenuItem("Quit");
		menuItemQuit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuFile.add(menuItemQuit);
		
		menuRestaurant = new JMenu("Restaurant");
		menuRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuRestaurant);
		
		menuItemEditRestaurant = new JMenuItem("Edit");
		menuItemEditRestaurant.setFont(new Font("Arial", Font.PLAIN, 15));
		menuRestaurant.add(menuItemEditRestaurant);
		
		menuMenu = new JMenu("Menu");
		menuMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuMenu);
		
		menuItemCreateMenu = new JMenuItem("Create");
		menuItemCreateMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemCreateMenu);
		
		menuItemEditMenu = new JMenuItem("Edit");
		menuItemEditMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemEditMenu);
		
		menuItemDeleteMenu = new JMenuItem("Delete");
		menuItemDeleteMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		menuMenu.add(menuItemDeleteMenu);
		
		JMenu menuDelivery = new JMenu("Orders");
		menuDelivery.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(menuDelivery);
		
		JMenuItem menuItemDeleteDelivery = new JMenuItem("View Orders");
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
		flowLayout.setVgap(100);
		panel.setPreferredSize(new Dimension(10, 200));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblWelcome = new JLabel("Manager's Options");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 40));
		panel.add(lblWelcome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setVgap(20);
		panel_5.setPreferredSize(new Dimension(10, 60));
		panel_2.add(panel_5, BorderLayout.NORTH);
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setForeground(Color.WHITE);
		panel_5.add(lblRestaurant);
		lblRestaurant.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_2.add(panel_8, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setVgap(20);
		panel_6.setPreferredSize(new Dimension(10, 60));
		panel_3.add(panel_6, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_3.add(panel_9, BorderLayout.CENTER);
		
		btnCreate = new JButton(new ImageIcon("button_create.png"));
		btnCreate.setPreferredSize(new Dimension(150, 50));
		btnCreate.setFont(new Font("Arial", Font.PLAIN, 21));
		btnCreate.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_9.add(btnCreate);
		
		btnEdit = new JButton(new ImageIcon("button_edit.png"));
		panel_9.add(btnEdit);
		btnEdit.setPreferredSize(new Dimension(150, 50));
		btnEdit.setFont(new Font("Arial", Font.PLAIN, 21));
		btnEdit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		
		btnDelete = new JButton(new ImageIcon("button_delete.png"));
		btnDelete.setPreferredSize(new Dimension(150, 50));
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 21));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, Color.GRAY, null, Color.GRAY, null));
		panel_9.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setVgap(20);
		panel_7.setPreferredSize(new Dimension(10, 60));
		panel_4.add(panel_7, BorderLayout.NORTH);
		
		JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_4.add(panel_10, BorderLayout.CENTER);
		
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
	 * @return the menuItemCreateMenu
	 */
	public JMenuItem getMenuItemCreateMenu() {
		return menuItemCreateMenu;
	}

	/**
	 * @param menuItemCreateMenu the menuItemCreateMenu to set
	 */
	public void setMenuItemCreateMenu(JMenuItem menuItemCreateMenu) {
		this.menuItemCreateMenu = menuItemCreateMenu;
	}





	/**
	 * @return the menuItemEditMenu
	 */
	public JMenuItem getMenuItemEditMenu() {
		return menuItemEditMenu;
	}





	/**
	 * @param menuItemEditMenu the menuItemEditMenu to set
	 */
	public void setMenuItemEditMenu(JMenuItem menuItemEditMenu) {
		this.menuItemEditMenu = menuItemEditMenu;
	}





	/**
	 * @return the menuItemDeleteMenu
	 */
	public JMenuItem getMenuItemDeleteMenu() {
		return menuItemDeleteMenu;
	}





	/**
	 * @param menuItemDeleteMenu the menuItemDeleteMenu to set
	 */
	public void setMenuItemDeleteMenu(JMenuItem menuItemDeleteMenu) {
		this.menuItemDeleteMenu = menuItemDeleteMenu;
	}





	/**
	 * @return the menuItemEditRestaurant
	 */
	public JMenuItem getMenuItemEditRestaurant() {
		return menuItemEditRestaurant;
	}





	/**
	 * @param menuItemEditRestaurant the menuItemEditRestaurant to set
	 */
	public void setMenuItemEditRestaurant(JMenuItem menuItemEditRestaurant) {
		this.menuItemEditRestaurant = menuItemEditRestaurant;
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
