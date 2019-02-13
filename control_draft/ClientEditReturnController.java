package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientModel;
import view_draft.ClientCreateView;
import view_draft.ClientDashView;
import view_draft.ClientEditView;

public class ClientEditReturnController implements ActionListener {

	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientEditView clientEditView;

	public ClientEditReturnController(ClientModel clientModel, ClientEditView clientEditView,
			ClientDashView clientDashView) {
		this.clientModel = clientModel;
		this.clientEditView = clientEditView;
		this.clientDashView = clientDashView;
		
		clientEditView.getBtnReturn().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clientEditView.setVisible(false);
		clientDashView.setVisible(true);
		

	}

}
