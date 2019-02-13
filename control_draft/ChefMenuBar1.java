package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.ChefAcceptView;
import view_draft.ChefReadyView;
import view_draft.ChefView;
import view_draft.LoginView;

public class ChefMenuBar1 {
	private LoginView loginView;
	private ChefReadyView chefReadyView;
	private ChefAcceptView chefAcceptView;
	private ChefView chefView;

	public ChefMenuBar1(LoginView loginView, ChefView chefView, ChefReadyView chefReadyView,
			ChefAcceptView chefAcceptView) {
		this.loginView = loginView;
		this.chefView = chefView;
		this.chefReadyView = chefReadyView;
		this.chefAcceptView = chefAcceptView;

		// ==========================DISCONNECTS==========================//
		chefView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					chefView.setVisible(false);
					loginView.setVisible(true);

				}
			}
		});
		chefReadyView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					chefReadyView.setVisible(false);
					loginView.setVisible(true);

				}
			}
		});
		chefAcceptView.getMenuItemDisconnect().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want to disconnect?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Signing you out...", "Good bye!",
							JOptionPane.INFORMATION_MESSAGE);

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					chefAcceptView.setVisible(false);
					loginView.setVisible(true);

				}
			}
		});
		// ==========================QUIT==========================//
		chefView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Closing program");
					chefView.dispose();
				}

			}
		});
		chefReadyView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Closing program");
					chefView.dispose();
				}

			}
		});
		chefAcceptView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(chefView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(chefView, "Closing program");
					chefView.dispose();
				}

			}
		});
		
		
	}

}
