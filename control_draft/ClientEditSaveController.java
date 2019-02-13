package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.UserModel;
import view_draft.ClientDashView;
import view_draft.ClientEditView;

public class ClientEditSaveController implements ActionListener {

	private ClientModel clientModel;
	private ClientEditView clientEditView;
	private ClientDashView clientDashView;
	private ClientBean clientBean;
	// private UserModel userModel;

	public ClientEditSaveController(ClientModel clientModel, ClientEditView clientEditView,
			ClientDashView clientDashView) {
		this.clientModel = clientModel;
		this.clientEditView = clientEditView;
		this.clientDashView = clientDashView;

		clientEditView.getBtnSave().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// Find a way to find exact client and edit/delete that client
		clientBean = clientModel.getSingleClient(0);

		// TODO:
		if (!clientEditView.getTfUsername().getText().equals("")
				&& !clientEditView.getTfOldPassword().getText().equals("")
				&& !clientEditView.getTfNewPassword().getText().equals("") //
				&& !clientEditView.getTfConfirmPassword().getText().equals("")//
				&& !clientEditView.getTfLastName().getText().equals("")
				&& !clientEditView.getTfFirstName().getText().equals("")
				&& !clientEditView.getTfAddress().getText().equals("")
				&& !clientEditView.getTfEmail().getText().equals("")
				&& !clientEditView.getTfPhone().getText().equals("")) {

			// Checks if password matches the users text input in old password
			if (clientBean.getPassword().equals(clientEditView.getTfOldPassword().getText())) {

				// Checks if new password and confirm password match
				if (clientEditView.getTfNewPassword().getText()
						.equals(clientEditView.getTfConfirmPassword().getText())) {
					clientBean.setUsername(clientEditView.getTfUsername().getText());
					clientBean.setFirstName(clientEditView.getTfFirstName().getText());
					clientBean.setLastName(clientEditView.getTfLastName().getText());
					clientBean.setAddress(clientEditView.getTfAddress().getText());
					clientBean.setEmail(clientEditView.getTfEmail().getText());
					clientBean.setPhone(clientEditView.getTfPhone().getText());
					clientBean.setPassword(clientEditView.getTfNewPassword().getText());
					clientBean.setConfirmPassword(clientEditView.getTfConfirmPassword().getText());

					// Need to find a way to get the client that is signed on!!
					clientModel.editClient(clientBean, 0);

					JOptionPane.showMessageDialog(clientEditView, "Your account has been edited.",
							"Edit Client Account", JOptionPane.INFORMATION_MESSAGE);
					// ClientController.clientView.setVisible(true);
					clientDashView.setVisible(true);
					clientEditView.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(clientEditView, "Your new and confirm password are not the same!",
							"Password Error", JOptionPane.ERROR_MESSAGE);
				}

			} else {
				JOptionPane.showMessageDialog(clientEditView,
						"Your old password doesn't match with the password we have in our database!  \nPlease try again!",
						"Password is incorrect", JOptionPane.ERROR_MESSAGE);
			}

		} else {
			JOptionPane.showMessageDialog(clientEditView, "Please do not miss any fields in the form!",
					"Missing Field(s)!", JOptionPane.ERROR_MESSAGE);
		}

	}

}
