package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import view_draft.ClientDashView;
import view_draft.ClientEditView;

public class ClientDashEditController implements ActionListener {

	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientEditView clientEditView;
	private ClientBean clientBean;

	public ClientDashEditController(ClientModel clientModel, ClientDashView clientDashView,
			ClientEditView clientEditView) {
		
		this.clientModel = clientModel;
		this.clientBean = clientBean;
		this.clientDashView = clientDashView;
		this.clientEditView = clientEditView;
		
		clientDashView.getBtnEditAccount().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clientDashView.setVisible(false);
		clientEditView.setVisible(true);
		
		// Fix - make it so that the client I can edit/delete is the client the one that's
		// currently signed in!
		clientBean = clientModel.getSingleClient(0);
		
		clientEditView.getTfUsername().setText(clientBean.getUsername());
		clientEditView.getTfLastName().setText(clientBean.getLastName());
		clientEditView.getTfFirstName().setText(clientBean.getFirstName());
		clientEditView.getTfAddress().setText(clientBean.getAddress());
		clientEditView.getTfEmail().setText(clientBean.getEmail());
		clientEditView.getTfPhone().setText(clientBean.getPhone());
		
		System.out.println(clientModel.getAllClients());

	}

}
