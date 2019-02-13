package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.UserBean;
import model_draft.UserModel;
import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;

public class ClientDashDeleteController implements ActionListener {

	public ClientModel clientModel;
	public ClientDashView clientDashView;
	public ClientDeleteView clientDeleteView;
	private ClientBean clientBean;
	private UserModel usermodel;
	private UserBean userBean;

	public ClientDashDeleteController(ClientModel clientModel, ClientDashView clientDashView,
			ClientDeleteView clientDeleteView, UserModel userModel) {
		this.usermodel = userModel;
		this.clientModel = clientModel;
		this.clientDashView = clientDashView;
		this.clientDeleteView = clientDeleteView;

		clientDashView.getBtnDeleteAccount().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clientDashView.setVisible(false);
		clientDeleteView.setVisible(true);

		// Fix - make it so that the client I can edit/delete is the client the one
		// that's
		// currently signed in!
		//clientBean = null;
		clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
		//System.out.println(clientBean.getUsername());
		clientDeleteView.getTfUsername().setText(clientBean.getUsername());
		clientDeleteView.getTfLastName().setText(clientBean.getLastName());
		clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
		clientDeleteView.getTfAddress().setText(clientBean.getAddress());
		clientDeleteView.getTfEmail().setText(clientBean.getEmail());
		clientDeleteView.getTfPhone().setText(clientBean.getPhone());

		// Sets all textfield uneditable
		clientDeleteView.getTfUsername().setEditable(false);
		clientDeleteView.getTfFirstName().setEditable(false);
		clientDeleteView.getTfLastName().setEditable(false);
		clientDeleteView.getTfEmail().setEditable(false);
		clientDeleteView.getTfAddress().setEditable(false);
		clientDeleteView.getTfPhone().setEditable(false);

	}

}
