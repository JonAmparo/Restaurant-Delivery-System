package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;
import view_draft.ClientOrderFoodView;
import view_draft.ClientOrderHistoryView;
import view_draft.LoginView;

public class ClientMenuBar1 {

	private LoginView loginView;
	private ClientDashView clientDashView;
	private ClientDeleteView clientDeleteView;
	private ClientEditView clientEditView;
	private ClientOrderFoodView clientOrderFoodView;
	private ClientOrderHistoryView clientOrderHistoryView;

	public ClientMenuBar1(LoginView loginView, ClientDashView clientDashView, ClientDeleteView clientDeleteView,
			ClientEditView clientEditView, ClientOrderFoodView clientOrderFoodView,
			ClientOrderHistoryView clientOrderHistoryView) {

		// ==========================DISCONNECTS==========================//
		clientDashView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientDashView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					clientDashView.setVisible(false);
					loginView.setVisible(true);

				}

			}

		});
		clientDeleteView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientDeleteView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					clientDeleteView.setVisible(false);
					loginView.setVisible(true);

				}

			}

		});

		clientEditView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientEditView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					clientEditView.setVisible(false);
					loginView.setVisible(true);

				}

			}

		});

		clientOrderFoodView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientOrderFoodView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					clientOrderFoodView.setVisible(false);
					loginView.setVisible(true);

				}

			}

		});

		clientOrderHistoryView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientOrderHistoryView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					clientOrderHistoryView.setVisible(false);
					loginView.setVisible(true);

				}

			}

		});

		// ==========================QUIT==========================//
		clientDashView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientDashView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDashView, "Closing program");
					clientDashView.dispose();
				}

			}
		});
		clientDeleteView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientDeleteView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientDeleteView, "Closing program");
					clientDeleteView.dispose();
				}

			}
		});
		clientEditView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientEditView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientEditView, "Closing program");
					clientEditView.dispose();
				}

			}
		});
		clientOrderFoodView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientOrderFoodView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientOrderFoodView, "Closing program");
					clientOrderFoodView.dispose();
				}

			}
		});
		clientOrderHistoryView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(clientOrderHistoryView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(clientOrderHistoryView, "Closing program");
					clientOrderHistoryView.dispose();
				}

			}
		});

	}

}
