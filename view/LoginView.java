package view_draft;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Rectangle;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField text_field1;
	private JTextField text_field2;
	private JButton btnConnect;
	private JButton btnNewClients;
	private JButton btnQuit;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		this.setTitle("User Authentication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.darkGray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel title_panel = new JPanel();
		title_panel.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) title_panel.getLayout();
		flowLayout.setVgap(15);
		contentPane.add(title_panel, BorderLayout.NORTH);
		
		JLabel lblDelivery = new JLabel("Magenta Food Delivery Service");
		lblDelivery.setForeground(Color.WHITE);
		lblDelivery.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		title_panel.add(lblDelivery);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(30, 30));
		panel.setOpaque(false);
		title_panel.add(panel);
		
		
		
		//Image img = myIcon2.getImage();
		//Image newimg = img.getScaledInstance(230, 310,  java.awt.Image.SCALE_SMOOTH);
		//newIcon = new ImageIcon(newimg);
		//ImageIcon icon = new ImageIcon("MLogo.jpeg");
		//icon.
		JLabel label = new JLabel(/*new ImageIcon("MLogo.jpeg")*/new ImageIcon(((new ImageIcon("MLogo.jpeg")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		label.setPreferredSize(new Dimension(30, 25));
		panel.add(label);
		
		JPanel center_panel = new JPanel();
		center_panel.setOpaque(false);
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BoxLayout(center_panel, BoxLayout.Y_AXIS));
		
		JPanel info_panel = new JPanel();
		info_panel.setOpaque(false);
		info_panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		center_panel.add(info_panel);
		info_panel.setLayout(new GridLayout(2, 2, 0, 10));
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 18));
		info_panel.add(lblUsername);
		
		text_field1 = new JTextField();
		text_field1.setFont(new Font("Arial", Font.PLAIN, 16));
		text_field1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		info_panel.add(text_field1);
		text_field1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		info_panel.add(lblPassword);
		
		text_field2 = new JTextField();
		text_field2.setFont(new Font("Arial", Font.PLAIN, 16));
		text_field2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		info_panel.add(text_field2);
		text_field2.setColumns(10);
		
		JPanel btn_panel = new JPanel();
		btn_panel.setOpaque(false);
		btn_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		center_panel.add(btn_panel);
		btn_panel.setLayout(new GridLayout(1, 3, 8, 0));
		
		btnConnect = new JButton(new ImageIcon("btn_connect.png"));
		btnConnect.setFont(new Font("Arial", Font.PLAIN, 14));
		btnConnect.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		//btnConnect.setIcon(new ImageIcon("btn_connect.png"));
		btn_panel.add(btnConnect);
		
		btnNewClients = new JButton(new ImageIcon("button_new-clients.png"));
		btnNewClients.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewClients.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_panel.add(btnNewClients);
		
		btnQuit = new JButton(new ImageIcon("button_quit.png"));
		btnQuit.setFont(new Font("Arial", Font.PLAIN, 14));
		btnQuit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_panel.add(btnQuit);
		
		this.setVisible(true);
		
	}

	/**
	 * @return the text_field1
	 */
	public JTextField getText_field1() {
		return text_field1;
	}

	/**
	 * @param text_field1 the text_field1 to set
	 */
	public void setText_field1(JTextField text_field1) {
		this.text_field1 = text_field1;
	}

	/**
	 * @return the text_field2
	 */
	public JTextField getText_field2() {
		return text_field2;
	}

	/**
	 * @param text_field2 the text_field2 to set
	 */
	public void setText_field2(JTextField text_field2) {
		this.text_field2 = text_field2;
	}

	/**
	 * @return the btnConnect
	 */
	public JButton getBtnConnect() {
		return btnConnect;
	}

	/**
	 * @param btnConnect the btnConnect to set
	 */
	public void setBtnConnect(JButton btnConnect) {
		this.btnConnect = btnConnect;
	}

	/**
	 * @return the btnNewClients
	 */
	public JButton getBtnNewClients() {
		return btnNewClients;
	}

	/**
	 * @param btnNewClients the btnNewClients to set
	 */
	public void setBtnNewClients(JButton btnNewClients) {
		this.btnNewClients = btnNewClients;
	}

	/**
	 * @return the btnQuit
	 */
	public JButton getBtnQuit() {
		return btnQuit;
	}

	/**
	 * @param btnQuit the btnQuit to set
	 */
	public void setBtnQuit(JButton btnQuit) {
		this.btnQuit = btnQuit;
	}

	
	

}
