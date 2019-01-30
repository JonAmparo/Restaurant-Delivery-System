package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ClientBean;
import model.ClientModel;
import view.Admin;
import view.ClientCreate;
import view.Login;

public class LoginController {

	private Login login;
	private Admin admin;

	private ClientModel clientModel;
	private ClientCreate clientCreate;

	public LoginController() {
		login = new Login(); // Opens login view
		clientModel = new ClientModel(); // Opens Client Database (Model -> DAO -> DTO -> Bean) then back

		System.out.println("This is the new login controller"); // Testing ~ can delete later

		// ================== BUTTON CONNECT (To AdminController) ================== //
		login.getBtnConnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminController(); // Calls AdminController Class
				
				login.dispose(); // Disposes LoginController CLass
			}
		});

		// ================== BUTTON CREATE NEW CLIENT ================== //
		login.getBtnCreateNewClient().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//login.dispose();
				login.setVisible(false); // hides login view
				clientCreate = new ClientCreate(); // opens clientCreate view

				// BTN SAVE - Checks to see if all textfields are not blank.
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
							//new LoginController();
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
				new LoginController();
				System.out.println("Thanks for using my program.  Goodbye!");
			}
		});
	}

	public static void main(String[] args) {
		new LoginController();
	}

}
