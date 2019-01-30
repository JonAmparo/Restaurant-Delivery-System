package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ClientBean;
import model.ClientModel;
import view.ClientCreate;
import view.Login;

public class LoginControllerv2 {

	private Login login;
	private ClientModel clientModel;
	private ClientCreate clientCreate;

	public LoginControllerv2() {
		login = new Login();
		clientModel = new ClientModel();

		System.out.println("This is the new login controller");

		login.getBtnConnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminController(); // Works to call - need to delete parameters to get to working!!
//				admin = new Admin();
//				login.dispose();
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
				System.out.println("Thanks for using my program.  Goodbye!");
			}
		});
	}

	public static void main(String[] args) {
		new LoginControllerv2();
	}

}
