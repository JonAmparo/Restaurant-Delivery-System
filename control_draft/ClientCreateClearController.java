package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientModel;
import view_draft.ClientCreateView;

public class ClientCreateClearController implements ActionListener{
	
	private ClientModel clientModel;
	private ClientCreateView clientView;
	
	
	public ClientCreateClearController(ClientModel clientModel, ClientCreateView clientView) {
		this.clientModel = clientModel;
		this.clientView = clientView;
		
		clientView.getBtnCancel().addActionListener(this);
		
	}
	
	// BTN CLEAR
		public void actionPerformed(ActionEvent e) {
			clientView.getTfUsername().setText("");
			clientView.getTfPassword().setText("");
			clientView.getTfConfirmPassword().setText("");
			clientView.getTfLastName().setText("");
			clientView.getTfFirstName().setText("");
			clientView.getTfAddress().setText("");
			clientView.getTfEmail().setText("");
			clientView.getTfPhone().setText("");

		}

}
