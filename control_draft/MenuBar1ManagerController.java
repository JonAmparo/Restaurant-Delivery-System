package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.AdminDash;
import view_draft.LoginView;
import view_draft.ManagerView;

public class MenuBar1ManagerController {

	public ManagerView managerView;
	public LoginView loginView;

	public MenuBar1ManagerController(LoginView loginView, ManagerView managerView) {
		this.loginView = loginView;
		this.managerView = managerView;

		managerView.getMenuFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(managerView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					managerView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(managerView, "Bringing you back to the login page now");
					managerView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		managerView.getMenuFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(managerView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(managerView, "Program will now close\n" + "            " + "Goodbye!");
					managerView.dispose();
				}

			}
		});

	}

}
