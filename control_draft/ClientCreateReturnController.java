package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientModel;
import view_draft.ClientCreateView;
import view_draft.LoginView;

public class ClientCreateReturnController implements ActionListener {
	
	private ClientModel clientModel;
	private ClientCreateView clientView;
	
	private LoginView loginView;
	
	public ClientCreateReturnController(ClientModel clientModel, ClientCreateView clientView, LoginView loginView) {
		this.clientModel = clientModel;
		this.clientView = clientView;
		this.loginView = loginView;
		
		clientView.getBtnReturn().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		clientView.setVisible(false);
		loginView.setVisible(true);
		
		
		
	}

}
