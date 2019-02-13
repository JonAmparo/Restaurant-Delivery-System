package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientModel;
import view_draft.ClientDashView;
import view_draft.ClientDeleteView;

public class ClientDeleteCancelController implements ActionListener {

	private ClientModel clientModel;
	private ClientDeleteView clientDeleteView;
	private ClientDashView clientDashView;

	public ClientDeleteCancelController(ClientModel clientModel, ClientDeleteView clientDeleteView,
			ClientDashView clientDashView) {
		this.clientModel = clientModel;
		this.clientDeleteView = clientDeleteView;
		this.clientDashView = clientDashView;
		
		clientDeleteView.getBtnCancel().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clientDeleteView.setVisible(false);
		clientDashView.setVisible(true);

	}

}
