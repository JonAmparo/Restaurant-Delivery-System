package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ClientBean;
import model.ClientModel;
import model.RestaurateurModel;
import model.UserBean;
import view.Admin;
import view.Client;
import view.ClientCreate;
import view.Login;

public class LoginController {

	public ClientBean clientBean;
	private Client client;

	private Login login;
	private ClientModel clientModel;
	private RestaurateurModel restaurateurModel;
	private LoginController loginController;

	private Admin admin;
	private UserBean user = new UserBean(null, null, null);
	Boolean bool = false;

	private ClientCreate clientCreate;

	public LoginController(Login login, UserBean user) {

		clientModel = new ClientModel();

		login.getBtnConnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connectFunction();
				login.dispose();
			}
		});
		// ================== Button Create New Client ================== //
		login.getBtnCreateNewClient().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.setVisible(false);
				clientCreate = new ClientCreate();

				// BTN SAVE
				clientCreate.getBtnSave().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!clientCreate.getTfUsername().getText().equals("")
								&& !clientCreate.getTfPassword().getText().equals("")
								&& !clientCreate.getTfConfirmPassword().getText().equals("")
								&& !clientCreate.getTfLastName().getText().equals("")
								&& !clientCreate.getTfFirstName().getText().equals("")
								&& !clientCreate.getTfAddress().getText().equals("")
								&& !clientCreate.getTfEmail().getText().equals("")
								&& !clientCreate.getTfPhone().getText().equals("")) {

							// Creates new Client and adds to arraylist (Grabs from textfield and inserts
							// parameters to arraylist)
							clientModel.createNewClient(new ClientBean(clientCreate.getTfUsername().getText(),
									clientCreate.getTfPassword().getText(),
									clientCreate.getTfConfirmPassword().getText(),
									clientCreate.getTfLastName().getText(), clientCreate.getTfFirstName().getText(),
									clientCreate.getTfAddress().getText(), clientCreate.getTfEmail().getText(),
									clientCreate.getTfPhone().getText()));

							// sysouts to check if it worked!!! IT DOES WORK :D
							System.out.println(clientModel.getAllClients());
							login.setVisible(true);
							clientCreate.setVisible(false);

						} else {
							JOptionPane.showMessageDialog(clientCreate, "Please do not miss any fields in the form!",
									"Missing Field(s)!", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				
				// BTN RETURN
				clientCreate.getBtnReturn().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						login.setVisible(true);
						clientCreate.setVisible(false);
						
					}
				});
				
				// BTN VERIFY
				clientCreate.getBtnVerify().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				
				// BTN CANCEL
				clientCreate.getBtnCancel().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clientCreate.getTfUsername().setText("");
						clientCreate.getTfPassword().setText("");
						clientCreate.getTfConfirmPassword().setText("");
						clientCreate.getTfLastName().setText("");
						clientCreate.getTfFirstName().setText("");
						clientCreate.getTfAddress().setText("");
						clientCreate.getTfEmail().setText("");
						clientCreate.getTfPhone().setText("");
						
					}
				});
			}
		});

		login.getBtnQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.dispose();
			}
		});
	}

	private void connectFunction() {
		admin = new Admin();
	}

	public static void main(String[] args) {
//		Login login = new Login();
//		RestaurateurModel restaurateurModel = new RestaurateurModel();
//
		Login login = new Login();
		UserBean user = new UserBean(null, null, null);
//		Client client = new Client();
//		ClientModel clientModel = new ClientModel();

		new LoginController(login, user);

	}

}
