package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.ClientBean;
import model_draft.ClientDAO;
import model_draft.ClientModel;
import model_draft.DTO;
import model_draft.UserBean;
import model_draft.UserDAO;
import model_draft.UserModel;
import view_draft.ClientCreateView;
import view_draft.LoginView;

public class ClientCreateSaveController implements ActionListener {

	private DTO arrays;

	private ClientBean clientBean;
	private ClientDAO clientDAO;
	private ClientModel clientModel;
	private ClientCreateView clientView;

	private UserBean userBean;
	private UserDAO userDAO;
	private UserModel userModel;

	private LoginView loginView;

	public ClientCreateSaveController(ClientModel clientModel, ClientCreateView clientView, LoginView loginView) { // , UserModel
																										// userModel
		this.clientModel = clientModel;
		this.clientView = clientView;
		this.loginView = loginView;
		// this.userModel = userModel;

		clientView.getBtnSave().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// TODO:

		if (!clientView.getTfUsername().getText().equals("") && !clientView.getTfPassword().getText().equals("")
				&& !clientView.getTfConfirmPassword().getText().equals("") && !clientView.getTfLastName().getText().equals("")
				&& !clientView.getTfFirstName().getText().equals("") && !clientView.getTfAddress().getText().equals("")
				&& !clientView.getTfEmail().getText().equals("") && !clientView.getTfPhone().getText().equals("")) {

			// Creates new Client and adds to arraylist (Grabs from textfield and inserts
			// parameters to arraylist)
			clientModel.createNewClient(
					new ClientBean(clientView.getTfUsername().getText(), clientView.getTfPassword().getText(),
							clientView.getTfConfirmPassword().getText(), clientView.getTfLastName().getText(),
							clientView.getTfFirstName().getText(), clientView.getTfAddress().getText(), clientView.getTfEmail().getText(),
							clientView.getTfPhone().getText()),
					new UserBean(clientView.getTfUsername().getText(), clientView.getTfPassword().getText(), "Client"));

			// sysouts to check
			System.out.println(clientModel.getAllClients() + "\n ");

			clientView.setVisible(false);
			loginView.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(clientView, "Please do not miss any fields in the form!", "Missing Field(s)!",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}