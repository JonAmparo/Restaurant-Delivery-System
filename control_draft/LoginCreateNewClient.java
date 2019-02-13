package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientBean;
import model_draft.ClientDAO;
import model_draft.ClientModel;
import model_draft.DTO;
import model_draft.UserModel;
import view_draft.ClientCreateView;
import view_draft.LoginView;

public class LoginCreateNewClient implements ActionListener {
	private DTO arrays;
	private ClientBean clientBean;
	private ClientDAO clientDAO;
	private ClientModel model;
	private ClientCreateView clientCreateView;
	private LoginView loginView;
	private UserModel loginModel;

	public LoginCreateNewClient(UserModel loginModel, LoginView loginView, ClientCreateView clientCreateView) {
		this.loginModel = loginModel;
		this.loginView = loginView;
		this.clientCreateView = clientCreateView;

		loginView.getBtnNewClients().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("New View: LoginCreateNewClient ");
		loginView.setVisible(false);
		clientCreateView.setVisible(true);

		clientCreateView.getTfUsername().setText("");
		clientCreateView.getTfPassword().setText("");
		clientCreateView.getTfConfirmPassword().setText("");
		clientCreateView.getTfLastName().setText("");
		clientCreateView.getTfFirstName().setText("");
		clientCreateView.getTfAddress().setText("");
		clientCreateView.getTfEmail().setText("");
		clientCreateView.getTfPhone().setText("");

	}
}
