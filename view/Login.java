package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
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

public class Login extends JFrame {

	private JPanel contentPane;
	
	private JTextField tfUsername;
	private JTextField tfPassword;

	private JButton btnConnect, btnCreateNewClient, btnQuit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		this.setTitle("User Authentication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel title_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) title_panel.getLayout();
		flowLayout.setVgap(15);
		contentPane.add(title_panel, BorderLayout.NORTH);

		JLabel lblDelivery = new JLabel("Delivery System");
		lblDelivery.setFont(new Font("Arial", Font.BOLD, 20));
		title_panel.add(lblDelivery);

		JPanel center_panel = new JPanel();
		contentPane.add(center_panel, BorderLayout.CENTER);
		center_panel.setLayout(new BoxLayout(center_panel, BoxLayout.Y_AXIS));

		JPanel info_panel = new JPanel();
		info_panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		center_panel.add(info_panel);
		info_panel.setLayout(new GridLayout(2, 2, 0, 10));

		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 18));
		info_panel.add(lblUsername);

		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		tfUsername.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		info_panel.add(tfUsername);
		tfUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		info_panel.add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		tfPassword.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		info_panel.add(tfPassword);
		tfPassword.setColumns(10);

		JPanel btn_panel = new JPanel();
		btn_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		center_panel.add(btn_panel);
		btn_panel.setLayout(new GridLayout(1, 3, 8, 0));

		btnConnect = new JButton("Connect");
		btnConnect.setFont(new Font("Arial", Font.PLAIN, 14));
		btnConnect.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_panel.add(btnConnect);

		btnCreateNewClient = new JButton("New Clients");
		btnCreateNewClient.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCreateNewClient.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_panel.add(btnCreateNewClient);

		btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Arial", Font.PLAIN, 14));
		btnQuit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_panel.add(btnQuit);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @return the tfUsername
	 */
	public JTextField getTfUsername() {
		return tfUsername;
	}

	/**
	 * @param tfUsername the tfUsername to set
	 */
	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	/**
	 * @return the tfPassword
	 */
	public JTextField getTfPassword() {
		return tfPassword;
	}

	/**
	 * @param tfPassword the tfPassword to set
	 */
	public void setTfPassword(JTextField tfPassword) {
		this.tfPassword = tfPassword;
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
	 * @return the btnCreateNewClient
	 */
	public JButton getBtnCreateNewClient() {
		return btnCreateNewClient;
	}

	/**
	 * @param btnCreateNewClient the btnCreateNewClient to set
	 */
	public void setBtnCreateNewClient(JButton btnCreateNewClient) {
		this.btnCreateNewClient = btnCreateNewClient;
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
