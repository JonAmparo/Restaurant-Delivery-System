package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ClientBean;
import model.ClientModel;
import model.OrderModel;
import model.RestaurateurBean;
import model.RestaurateurModel;
import model.UserBean;
import view.Client;
import view.ClientCreate;
import view.ClientDelete;
import view.ClientEdit;
import view.ClientOrderFood;
import view.ClientOrderHistory;
import view.Login;

public class ClientController {

	public ClientBean clientBean;

	private static Client clientView;
	private ClientModel clientModel;

	private ClientCreate clientCreate;
	private ClientEdit clientEdit;
	private ClientDelete clientDelete;
	private ClientOrderFood clientOrderFood;
	private ClientOrderHistory clientOrderHistory;

	private static Client client;

	private OrderModel orderModel;

	private Login login;

//	private Object selectedRestaurant;

	public ClientController() {
		client = new Client();
		clientModel = new ClientModel(); // This calls the client model
		// I can use the all the code in the Class and use the arraylists!!

		// ================== ==================== ================== //
		// ======================= MenuBar =========================== //
		// ================== Menu Item Disconnect ================== //
		client.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(client, "Signing you out...", "title", JOptionPane.INFORMATION_MESSAGE);
				new LoginController(); // Opens login view
				client.dispose(); // Closes client view
			}
		});

		// ================== Menu Item Quit ================== //
		client.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(client, "Thanks for using our delivery system!", "title",
						JOptionPane.CLOSED_OPTION);
				client.dispose(); // Closes client view and ends program
			}
		});

		// ================== Menu Item Create Account ================== //
		client.getMenuItemCreateAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientCreate = new ClientCreate();
				client.dispose();
			}
		});

		// ================== Menu Item Edit Account ================== //
		client.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditFunction();
				client.setVisible(false);
			}
		});

		// ================== Menu Item Delete Account ================== //
		client.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				client.dispose();
				clientDeleteFunction();
			}
		});

		// ================== Menu Item Order Food ================== //
		client.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodFunction();
				client.dispose();
			}
		});

		// ================== Menu Item Order History ================== //
		client.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodFunction();
				client.dispose();
			}
		});
		// ================== ==================== ================== //
		// ======================= BUTTONS =========================== //
		// ================== Button Create Account ================== //
		client.getBtnCreateAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientCreate = new ClientCreate();
				client.dispose();

			}
		});

		// ================== Button Edit Account ================== //
		client.getBtnEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditFunction();
				client.dispose();
			}
		});

		// ================== Button Delete Account ================== //
		client.getBtnDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDeleteFunction();
				client.dispose();
			}
		});

		// ================== Button Order Food ================== //
		client.getBtnOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodFunction();
				client.dispose();

			}
		});

		// ================== Button Order History ================== //
		client.getBtnOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryFunction();
				client.dispose();
			}
		});

	}

//	private void clientCreateFunction() {
//		
//	}

	private void clientEditFunction() {
		clientEdit = new ClientEdit();
		// clientBean = null; -
		// Need to find a way to get the client that is signed on!!
		clientBean = clientModel.getSingleClient(2); // Gets indexed single client

		// Goes to ClientEditView, gets textfield, sets text to clients(bean) settings!
		clientEdit.getTfUsername().setText(clientBean.getUsername());
		clientEdit.getTfLastName().setText(clientBean.getLastName());
		clientEdit.getTfFirstName().setText(clientBean.getFirstName());
		clientEdit.getTfAddress().setText(clientBean.getAddress());
		System.out.println("Address is above... " + clientBean.getAddress()); // Testing sysout (deletable)
		clientEdit.getTfEmail().setText(clientBean.getEmail());
		clientEdit.getTfPhone().setText(clientBean.getPhone());

		clientEdit.getBtnSave().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Checks the whole form for all text fields (Validating all inputs were
				// entered)
				if (!clientEdit.getTfUsername().getText().equals("")
						&& !clientEdit.getTfOldPassword().getText().equals("")
						&& !clientEdit.getTfNewPassword().getText().equals("") //
						&& !clientEdit.getTfConfirmPassword().getText().equals("")//
						&& !clientEdit.getTfLastName().getText().equals("")
						&& !clientEdit.getTfFirstName().getText().equals("")
						&& !clientEdit.getTfAddress().getText().equals("")
						&& !clientEdit.getTfEmail().getText().equals("")
						&& !clientEdit.getTfPhone().getText().equals("")) {

					// Checks if password matches the users text input in old password
					if (clientBean.getPassword().equals(clientEdit.getTfOldPassword().getText())) {

						// Checks if new password and confirm password match
						if (clientEdit.getTfNewPassword().getText()
								.equals(clientEdit.getTfConfirmPassword().getText())) {
							clientBean.setUsername(clientEdit.getTfUsername().getText());
							clientBean.setFirstName(clientEdit.getTfFirstName().getText());
							clientBean.setLastName(clientEdit.getTfLastName().getText());
							clientBean.setAddress(clientEdit.getTfAddress().getText());
							clientBean.setEmail(clientEdit.getTfEmail().getText());
							clientBean.setPhone(clientEdit.getTfPhone().getText());
							clientBean.setPassword(clientEdit.getTfNewPassword().getText());
							clientBean.setConfirmPassword(clientEdit.getTfConfirmPassword().getText());

							// Need to find a way to get the client that is signed on!!
							clientModel.editClient(clientBean, 0);

							JOptionPane.showMessageDialog(clientEdit, "Your account has been edited.",
									"Edit Client Account", JOptionPane.INFORMATION_MESSAGE);
							// ClientController.clientView.setVisible(true);
							clientView = new Client();
							clientEdit.dispose();

						} else {
							JOptionPane.showMessageDialog(clientEdit, "Your new and confirm password are not the same!",
									"Password Error", JOptionPane.ERROR_MESSAGE);
						}

					} else {
						JOptionPane.showMessageDialog(clientEdit,
								"Your old password doesn't match with the password we have in our database!  \nPlease try again!",
								"Password is incorrect", JOptionPane.ERROR_MESSAGE);
					}

				} else {
					JOptionPane.showMessageDialog(clientEdit, "Please do not miss any fields in the form!",
							"Missing Field(s)!", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
	}

	private void clientDeleteFunction() {
		clientDelete = new ClientDelete();
		clientDelete.setLayout(null);

		clientBean = clientModel.getSingleClient(0);

		clientDelete.getTfUsername().setText(clientBean.getUsername());
		clientDelete.getTfLastName().setText(clientBean.getLastName());
		clientDelete.getTfFirstName().setText(clientBean.getFirstName());
		clientDelete.getTfAddress().setText(clientBean.getAddress());
		System.out.println("Delete button " + clientBean.getPassword()); // Testing sysout (deletable)
		clientDelete.getTfEmail().setText(clientBean.getEmail());
		clientDelete.getTfPhone().setText(clientBean.getPhone());

		// Sets all textfield uneditable
		clientDelete.getTfUsername().setEditable(false);
		clientDelete.getTfFirstName().setEditable(false);
		clientDelete.getTfLastName().setEditable(false);
		clientDelete.getTfEmail().setEditable(false);
		clientDelete.getTfAddress().setEditable(false);
		clientDelete.getTfPhone().setEditable(false);

		clientDelete.getBtnDelete().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Checks to see if password matches
				if (clientBean.getPassword().equals(clientDelete.getTfPassword().getText())) {
					clientModel.deleteClient(0); // change to make it to that username

					JOptionPane.showMessageDialog(clientDelete, "Account deleted!", "Delete Account",
							JOptionPane.ERROR_MESSAGE);

					// ================= CHANGE TO MAKE IT CALL THE LOGIN CONTROLLER!!! ====== //
					login = new Login();
					clientDelete.dispose();
				} else {
					JOptionPane.showMessageDialog(clientDelete, "Please enter the correct password",
							"Incorrect password", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
	}

	private void clientOrderFoodFunction() {
		clientOrderFood = new ClientOrderFood();

		clientOrderFood.getListRestaurant().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				try {
//					selectedRestaurant = "";
//					selectedRestaurant = clientOrderFood.getListRestaurant().getSelectedValue();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(clientOrderFood, "Please select one item", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}

	private void clientOrderHistoryFunction() {
		clientOrderHistory = new ClientOrderHistory();
	}

	public static void main(String[] args) {
//		Client client = new Client();
//		ClientModel clientModel = new ClientModel();
//		UserBean user = new UserBean(null, null, null);

		new ClientController();

	}

}
