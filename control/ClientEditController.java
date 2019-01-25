package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ClientBean;
import model.ClientModel;
import model.OrderModel;
import model.UserBean;
import view.Client;
import view.ClientCreate;
import view.ClientDelete;
import view.ClientEdit;
import view.ClientOrderFood;
import view.ClientOrderHistory;
import view.Login;

public class ClientEditController {

	public ClientBean clientBean;

	private Client clientView;
	private ClientModel clientModel;

	private ClientCreate clientCreate;
	private ClientEdit clientEditView;
	private ClientDelete clientDelete;
	private ClientOrderFood clientOrderFood;
	private ClientOrderHistory clientOrderHistory;

	private OrderModel orderModel;

	private static Login login;

	public ClientEditController(ClientEdit clientEdit, UserBean user) {

		clientEditView = new ClientEdit();
		clientModel = new ClientModel();

		System.out.println("hi");

		clientBean = clientModel.getSingleClient(0); // Gets indexed single client

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

}
