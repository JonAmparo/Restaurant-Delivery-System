package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import model.ClientModel;
import model.OrderModel;
import model.RestaurateurBean;
import model.RestaurateurModel;
import model.UserBean;
import view.Client;
import view.Login;

public class ClientController {

	private static Client client;
	private static ClientModel clientModel;
	
//	private static Login login;
//	private static RestaurateurModel restaurateurModel;


	public ClientController(Client client, ClientModel clientModel) {
		ClientController.client = client;
		clientModel = new ClientModel();

		client.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(client, "Signing you out...", "title", JOptionPane.OK_OPTION);
				client.dispose();
//				new LoginController(login);
			}

		});

		client.getMenuItemQuit().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(client, "Thanks for using our delivery system!", "title",
						JOptionPane.CLOSED_OPTION);
				client.dispose();
			}

		});

	}

	public static void main(String[] args) {
		Client client = new Client();
		ClientModel clientModel = new ClientModel();
		
//		Login login = new Login();
//		RestaurateurModel restaurateurBean = new RestaurateurModel();

		new ClientController(client, clientModel);

	}

}
