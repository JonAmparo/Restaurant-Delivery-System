package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.ClientBean;
import model_draft.ClientModel;
import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;
import view_draft.ClientOrderFoodView;
import view_draft.ClientOrderHistoryView;
import view_draft.LoginView;

public class ClientMenuBar2 {

	private LoginView loginView;
	private ClientDashView clientDashView;
	private ClientDeleteView clientDeleteView;
	private ClientEditView clientEditView;
	private ClientOrderFoodView clientOrderFoodView;
	private ClientOrderHistoryView clientOrderHistoryView;
	private ClientBean clientBean;
	private ClientModel clientModel;

	public ClientMenuBar2(LoginView loginView, ClientDashView clientDashView, ClientDeleteView clientDeleteView,
			ClientEditView clientEditView, ClientOrderFoodView clientOrderFoodView,
			ClientOrderHistoryView clientOrderHistoryView, ClientModel clientModel) {
		this.clientModel = clientModel;

		// ==========================EDIT ACCOUNT==========================//
		clientDashView.getMenuItemEditAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientEditView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				clientBean = clientModel.getSingleClient(0);

				clientEditView.getTfUsername().setText(clientBean.getUsername());
				clientEditView.getTfLastName().setText(clientBean.getLastName());
				clientEditView.getTfFirstName().setText(clientBean.getFirstName());
				clientEditView.getTfAddress().setText(clientBean.getAddress());
				clientEditView.getTfEmail().setText(clientBean.getEmail());
				clientEditView.getTfPhone().setText(clientBean.getPhone());

			}

		});
		clientDeleteView.getMenuItemEditAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientDeleteView.setVisible(false);
				clientEditView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				clientBean = clientModel.getSingleClient(0);

				clientEditView.getTfUsername().setText(clientBean.getUsername());
				clientEditView.getTfLastName().setText(clientBean.getLastName());
				clientEditView.getTfFirstName().setText(clientBean.getFirstName());
				clientEditView.getTfAddress().setText(clientBean.getAddress());
				clientEditView.getTfEmail().setText(clientBean.getEmail());
				clientEditView.getTfPhone().setText(clientBean.getPhone());

			}

		});
		clientEditView.getMenuItemEditAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientEditView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				clientBean = clientModel.getSingleClient(0);

				clientEditView.getTfUsername().setText(clientBean.getUsername());
				clientEditView.getTfLastName().setText(clientBean.getLastName());
				clientEditView.getTfFirstName().setText(clientBean.getFirstName());
				clientEditView.getTfAddress().setText(clientBean.getAddress());
				clientEditView.getTfEmail().setText(clientBean.getEmail());
				clientEditView.getTfPhone().setText(clientBean.getPhone());

			}

		});
		clientOrderFoodView.getMenuItemEditAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodView.setVisible(false);
				clientEditView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				clientBean = clientModel.getSingleClient(0);

				clientEditView.getTfUsername().setText(clientBean.getUsername());
				clientEditView.getTfLastName().setText(clientBean.getLastName());
				clientEditView.getTfFirstName().setText(clientBean.getFirstName());
				clientEditView.getTfAddress().setText(clientBean.getAddress());
				clientEditView.getTfEmail().setText(clientBean.getEmail());
				clientEditView.getTfPhone().setText(clientBean.getPhone());

			}

		});
		clientOrderHistoryView.getMenuItemEditAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryView.setVisible(false);
				clientEditView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				clientBean = clientModel.getSingleClient(0);

				clientEditView.getTfUsername().setText(clientBean.getUsername());
				clientEditView.getTfLastName().setText(clientBean.getLastName());
				clientEditView.getTfFirstName().setText(clientBean.getFirstName());
				clientEditView.getTfAddress().setText(clientBean.getAddress());
				clientEditView.getTfEmail().setText(clientBean.getEmail());
				clientEditView.getTfPhone().setText(clientBean.getPhone());

			}

		});

		// ==========================DELETE ACCOUNT==========================//
		clientDashView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientDeleteView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				// clientBean = null;
				clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
				// System.out.println(clientBean.getUsername());
				clientDeleteView.getTfUsername().setText(clientBean.getUsername());
				clientDeleteView.getTfLastName().setText(clientBean.getLastName());
				clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
				clientDeleteView.getTfAddress().setText(clientBean.getAddress());
				clientDeleteView.getTfEmail().setText(clientBean.getEmail());
				clientDeleteView.getTfPhone().setText(clientBean.getPhone());

				// Sets all textfield uneditable
				clientDeleteView.getTfUsername().setEditable(false);
				clientDeleteView.getTfFirstName().setEditable(false);
				clientDeleteView.getTfLastName().setEditable(false);
				clientDeleteView.getTfEmail().setEditable(false);
				clientDeleteView.getTfAddress().setEditable(false);
				clientDeleteView.getTfPhone().setEditable(false);

			}

		});
		clientDeleteView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientDeleteView.setVisible(false);
				clientDeleteView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				// clientBean = null;
				clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
				// System.out.println(clientBean.getUsername());
				clientDeleteView.getTfUsername().setText(clientBean.getUsername());
				clientDeleteView.getTfLastName().setText(clientBean.getLastName());
				clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
				clientDeleteView.getTfAddress().setText(clientBean.getAddress());
				clientDeleteView.getTfEmail().setText(clientBean.getEmail());
				clientDeleteView.getTfPhone().setText(clientBean.getPhone());

				// Sets all textfield uneditable
				clientDeleteView.getTfUsername().setEditable(false);
				clientDeleteView.getTfFirstName().setEditable(false);
				clientDeleteView.getTfLastName().setEditable(false);
				clientDeleteView.getTfEmail().setEditable(false);
				clientDeleteView.getTfAddress().setEditable(false);
				clientDeleteView.getTfPhone().setEditable(false);

			}

		});
		clientEditView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientDeleteView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				// clientBean = null;
				clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
				// System.out.println(clientBean.getUsername());
				clientDeleteView.getTfUsername().setText(clientBean.getUsername());
				clientDeleteView.getTfLastName().setText(clientBean.getLastName());
				clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
				clientDeleteView.getTfAddress().setText(clientBean.getAddress());
				clientDeleteView.getTfEmail().setText(clientBean.getEmail());
				clientDeleteView.getTfPhone().setText(clientBean.getPhone());

				// Sets all textfield uneditable
				clientDeleteView.getTfUsername().setEditable(false);
				clientDeleteView.getTfFirstName().setEditable(false);
				clientDeleteView.getTfLastName().setEditable(false);
				clientDeleteView.getTfEmail().setEditable(false);
				clientDeleteView.getTfAddress().setEditable(false);
				clientDeleteView.getTfPhone().setEditable(false);

			}

		});
		clientOrderFoodView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodView.setVisible(false);
				clientDeleteView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				// clientBean = null;
				clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
				// System.out.println(clientBean.getUsername());
				clientDeleteView.getTfUsername().setText(clientBean.getUsername());
				clientDeleteView.getTfLastName().setText(clientBean.getLastName());
				clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
				clientDeleteView.getTfAddress().setText(clientBean.getAddress());
				clientDeleteView.getTfEmail().setText(clientBean.getEmail());
				clientDeleteView.getTfPhone().setText(clientBean.getPhone());

				// Sets all textfield uneditable
				clientDeleteView.getTfUsername().setEditable(false);
				clientDeleteView.getTfFirstName().setEditable(false);
				clientDeleteView.getTfLastName().setEditable(false);
				clientDeleteView.getTfEmail().setEditable(false);
				clientDeleteView.getTfAddress().setEditable(false);
				clientDeleteView.getTfPhone().setEditable(false);

			}

		});
		clientOrderHistoryView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryView.setVisible(false);
				clientDeleteView.setVisible(true);

				// Fix - make it so that the client I can edit/delete is the client the one
				// that's
				// currently signed in!
				// clientBean = null;
				clientBean = clientModel.getSingleClient(2); // Same on ClientDeleteDeleteController
				// System.out.println(clientBean.getUsername());
				clientDeleteView.getTfUsername().setText(clientBean.getUsername());
				clientDeleteView.getTfLastName().setText(clientBean.getLastName());
				clientDeleteView.getTfFirstName().setText(clientBean.getFirstName());
				clientDeleteView.getTfAddress().setText(clientBean.getAddress());
				clientDeleteView.getTfEmail().setText(clientBean.getEmail());
				clientDeleteView.getTfPhone().setText(clientBean.getPhone());

				// Sets all textfield uneditable
				clientDeleteView.getTfUsername().setEditable(false);
				clientDeleteView.getTfFirstName().setEditable(false);
				clientDeleteView.getTfLastName().setEditable(false);
				clientDeleteView.getTfEmail().setEditable(false);
				clientDeleteView.getTfAddress().setEditable(false);
				clientDeleteView.getTfPhone().setEditable(false);

			}

		});
	}
}
