package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Panel;

public class ClientEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername;
	private JTextField tfOldPassword;
	private JTextField tfNewPassword;
	private JTextField tfConfirmPassword;
	private JTextField tfLastName;
	private JTextField tfFirstName;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfPhone;

	private JButton btnSave, btnReturn, btnCancel, btnVerify;
	

	// private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientEdit frame = new ClientEdit();
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
	public ClientEdit() {
		setTitle("Edit Account| Restuarant Delivery System");
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 508);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel topPan = new JPanel();
		topPan.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(topPan, BorderLayout.NORTH);

		JLabel lblEditAccount = new JLabel("Edit Account");
		lblEditAccount.setFont(new Font("Arial", Font.PLAIN, 18));
		topPan.add(lblEditAccount);

		JPanel centerPan = new JPanel();
		centerPan.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(centerPan, BorderLayout.CENTER);
		centerPan.setLayout(new GridLayout(10, 1, 0, 0));

		JPanel usernamePan = new JPanel();
		usernamePan.setBorder(new EmptyBorder(0, 0, 0, 40));
		centerPan.add(usernamePan);
		usernamePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 15));
		lblUsername.setBorder(new EmptyBorder(0, 0, 0, 50));
		usernamePan.add(lblUsername);

		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Arial", Font.PLAIN, 15));
		usernamePan.add(tfUsername);
		tfUsername.setColumns(10);

		btnVerify = new JButton("Verify");
		// btnNewButton.setSize(50,50);
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVerify.setFont(new Font("Arial", Font.PLAIN, 15));
		usernamePan.add(btnVerify);
		
		JPanel oldPasswordPan = new JPanel();
		oldPasswordPan.setBorder(new EmptyBorder(0, 0, 0, 115));
		centerPan.add(oldPasswordPan);
		
		JLabel lblOldPassword = new JLabel("Old Password:");
		oldPasswordPan.add(lblOldPassword);
		lblOldPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		lblOldPassword.setBorder(new EmptyBorder(0, 0, 0, 35));
		
		tfOldPassword = new JTextField();
		oldPasswordPan.add(tfOldPassword);
		tfOldPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tfOldPassword.setColumns(10);

		JPanel passwordPan = new JPanel();
		passwordPan.setBorder(new EmptyBorder(0, 0, 0, 110));
		centerPan.add(passwordPan);

		JLabel lblNewPassword = new JLabel("Password:");
		lblNewPassword.setBorder(new EmptyBorder(0, 0, 0, 52));
		lblNewPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordPan.add(lblNewPassword);

		tfNewPassword = new JTextField();
		tfNewPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNewPassword.setColumns(10);
		passwordPan.add(tfNewPassword);

		JPanel confirmPasswordPan = new JPanel();
		confirmPasswordPan.setBorder(new EmptyBorder(0, 0, 0, 115));
		centerPan.add(confirmPasswordPan);

		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		confirmPasswordPan.add(lblConfirmPassword);

		tfConfirmPassword = new JTextField();
		tfConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tfConfirmPassword.setColumns(10);
		confirmPasswordPan.add(tfConfirmPassword);

		JPanel lastNamePan = new JPanel();
		lastNamePan.setBorder(new EmptyBorder(0, 0, 0, 110));
		centerPan.add(lastNamePan);

		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBorder(new EmptyBorder(0, 0, 0, 50));
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 15));
		lastNamePan.add(lblLastName);

		tfLastName = new JTextField();
		tfLastName.setFont(new Font("Arial", Font.PLAIN, 15));
		tfLastName.setColumns(10);
		lastNamePan.add(tfLastName);

		JPanel firstNamePan = new JPanel();
		firstNamePan.setBorder(new EmptyBorder(0, 0, 0, 110));
		centerPan.add(firstNamePan);

		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBorder(new EmptyBorder(0, 0, 0, 50));
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 15));
		firstNamePan.add(lblFirstName);

		tfFirstName = new JTextField();
		tfFirstName.setFont(new Font("Arial", Font.PLAIN, 15));
		tfFirstName.setColumns(10);
		firstNamePan.add(tfFirstName);

		JPanel addressPan = new JPanel();
		addressPan.setBorder(new EmptyBorder(0, 0, 0, 105));
		centerPan.add(addressPan);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBorder(new EmptyBorder(0, 0, 0, 65));
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		addressPan.add(lblAddress);

		tfAddress = new JTextField();
		tfAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		tfAddress.setColumns(10);
		addressPan.add(tfAddress);

		JPanel emailPan = new JPanel();
		emailPan.setBorder(new EmptyBorder(0, 0, 0, 105));
		centerPan.add(emailPan);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBorder(new EmptyBorder(0, 0, 0, 80));
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		emailPan.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		tfEmail.setColumns(10);
		emailPan.add(tfEmail);

		JPanel phonePan = new JPanel();
		phonePan.setBorder(new EmptyBorder(0, 0, 0, 105));
		centerPan.add(phonePan);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBorder(new EmptyBorder(0, 0, 0, 75));
		lblPhone.setFont(new Font("Arial", Font.PLAIN, 15));
		phonePan.add(lblPhone);

		tfPhone = new JTextField();
		tfPhone.setFont(new Font("Arial", Font.PLAIN, 15));
		tfPhone.setColumns(10);
		phonePan.add(tfPhone);

		JPanel bottomPan = new JPanel();
		bottomPan.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(bottomPan, BorderLayout.SOUTH);

		btnSave = new JButton("Save");
		bottomPan.add(btnSave);

		btnReturn = new JButton("Return");
		bottomPan.add(btnReturn);

		btnCancel = new JButton("Cancel");
		bottomPan.add(btnCancel);

		Panel westPan = new Panel();
		contentPane.add(westPan, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("                    ");
		westPan.add(lblNewLabel);

		Panel eastPan = new Panel();
		contentPane.add(eastPan, BorderLayout.EAST);

		JLabel lblNewLabel_1 = new JLabel("    ");
		eastPan.add(lblNewLabel_1);

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
	 * @return the tfOldPassword
	 */
	public JTextField getTfOldPassword() {
		return tfOldPassword;
	}

	/**
	 * @param tfOldPassword the tfOldPassword to set
	 */
	public void setTfOldPassword(JTextField tfOldPassword) {
		this.tfOldPassword = tfOldPassword;
	}

	/**
	 * @return the tfPassword
	 */
	public JTextField getTfNewPassword() {
		return tfNewPassword;
	}

	/**
	 * @param tfPassword the tfPassword to set
	 */
	public void setTfNewPassword(JTextField tfPassword) {
		this.tfNewPassword = tfPassword;
	}

	/**
	 * @return the tfConfirmPassword
	 */
	public JTextField getTfConfirmPassword() {
		return tfConfirmPassword;
	}

	/**
	 * @param tfConfirmPassword the tfConfirmPassword to set
	 */
	public void setTfConfirmPassword(JTextField tfConfirmPassword) {
		this.tfConfirmPassword = tfConfirmPassword;
	}

	/**
	 * @return the tfLastName
	 */
	public JTextField getTfLastName() {
		return tfLastName;
	}

	/**
	 * @param tfLastName the tfLastName to set
	 */
	public void setTfLastName(JTextField tfLastName) {
		this.tfLastName = tfLastName;
	}

	/**
	 * @return the tfFirstName
	 */
	public JTextField getTfFirstName() {
		return tfFirstName;
	}

	/**
	 * @param tfFirstName the tfFirstName to set
	 */
	public void setTfFirstName(JTextField tfFirstName) {
		this.tfFirstName = tfFirstName;
	}

	/**
	 * @return the tfAddress
	 */
	public JTextField getTfAddress() {
		return tfAddress;
	}

	/**
	 * @param tfAddress the tfAddress to set
	 */
	public void setTfAddress(JTextField tfAddress) {
		this.tfAddress = tfAddress;
	}

	/**
	 * @return the tfEmail
	 */
	public JTextField getTfEmail() {
		return tfEmail;
	}

	/**
	 * @param tfEmail the tfEmail to set
	 */
	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	/**
	 * @return the tfPhone
	 */
	public JTextField getTfPhone() {
		return tfPhone;
	}

	/**
	 * @param tfPhone the tfPhone to set
	 */
	public void setTfPhone(JTextField tfPhone) {
		this.tfPhone = tfPhone;
	}

	/**
	 * @return the btnSave
	 */
	public JButton getBtnSave() {
		return btnSave;
	}

	/**
	 * @param btnSave the btnSave to set
	 */
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	/**
	 * @return the btnReturn
	 */
	public JButton getBtnReturn() {
		return btnReturn;
	}

	/**
	 * @param btnReturn the btnReturn to set
	 */
	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}

	/**
	 * @return the btnCancel
	 */
	public JButton getBtnCancel() {
		return btnCancel;
	}

	/**
	 * @param btnCancel the btnCancel to set
	 */
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	/**
	 * @return the btnVerify
	 */
	public JButton getBtnVerify() {
		return btnVerify;
	}

	/**
	 * @param btnVerify the btnVerify to set
	 */
	public void setBtnVerify(JButton btnVerify) {
		this.btnVerify = btnVerify;
	}
	
	

}
