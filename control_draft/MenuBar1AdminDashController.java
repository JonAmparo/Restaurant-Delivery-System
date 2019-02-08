package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.AdminDash;
import view_draft.LoginView;

public class MenuBar1AdminDashController {

	public AdminDash adminView;
	public LoginView loginView;

	public MenuBar1AdminDashController(LoginView loginView, AdminDash adminView) {
		this.loginView = loginView;
		this.adminView = adminView;

		adminView.getMenuFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					adminView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(adminView, "Bringing you back to the admin's main page now");
					adminView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		adminView.getMenuFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(adminView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(adminView, "Program will now close\n" + "            " + "Goodbye!");
					adminView.dispose();
				}

			}
		});

	}

}
