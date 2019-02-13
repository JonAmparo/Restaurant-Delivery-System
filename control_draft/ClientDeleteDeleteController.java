package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.ClientBean;
import model_draft.ClientModel;

import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;
import view_draft.LoginView;

public class ClientDeleteDeleteController implements ActionListener {

	private ClientBean clientBean;
	private ClientModel clientModel;
	private ClientDeleteView clientDeleteView;
	private LoginView loginView;

	public ClientDeleteDeleteController(ClientModel clientModel, LoginView loginView,
			ClientDeleteView clientDeleteView) {
		this.clientModel = clientModel;
		this.clientDeleteView = clientDeleteView;
		this.loginView = loginView;

		clientDeleteView.getBtnDelete().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		clientBean = clientModel.getSingleClient(0); // Same on ClientDeleteDeleteController

		// Checks to see if password matches
		if (clientBean.getPassword().equals(clientDeleteView.getTfPassword().getText())) {
			clientModel.deleteClient(0); // change to make it to that username

			JOptionPane.showMessageDialog(clientDeleteView, "Account deleted!", "Delete Account",
					JOptionPane.ERROR_MESSAGE);

			// ================= CHANGE TO MAKE IT CALL THE LOGIN CONTROLLER!!! ====== //
			loginView.setVisible(true);
			clientDeleteView.dispose();
		} else {
			JOptionPane.showMessageDialog(clientDeleteView, "Please enter the correct password", "Incorrect password",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
