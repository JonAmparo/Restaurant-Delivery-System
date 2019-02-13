package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientModel;
import view_draft.ClientDashView;
import view_draft.ClientEditView;

public class ClientEditClearController implements ActionListener {
	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientEditView clientEditView;

	public ClientEditClearController(ClientModel clientModel, ClientEditView clientEditView,
			ClientDashView clientDashView) {
		this.clientModel = clientModel;
		this.clientEditView = clientEditView;
		this.clientDashView = clientDashView;
		
		clientEditView.getBtnClear().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clientEditView.getTfUsername().setText("");
		clientEditView.getTfOldPassword().setText("");
		clientEditView.getTfNewPassword().setText("");
		clientEditView.getTfConfirmPassword().setText("");
		clientEditView.getTfLastName().setText("");
		clientEditView.getTfFirstName().setText("");
		clientEditView.getTfAddress().setText("");
		clientEditView.getTfEmail().setText("");
		clientEditView.getTfPhone().setText("");

		
	}
}
