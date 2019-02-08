package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.AdminDash;
import view_draft.LoginView;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantEditMenuView;

public class MenuBar1MenuController {

	public RestaurantCreateMenuView menuCreateView;
	public RestaurantEditMenuView menuEditView;
	public RestaurantDeleteMenuView menuDeleteView;
	public AdminDash adminView;
	public LoginView loginView;

	public MenuBar1MenuController(LoginView loginView, AdminDash adminView, RestaurantCreateMenuView menuCreateView,
			RestaurantEditMenuView menuEditView, RestaurantDeleteMenuView menuDeleteView) {
		this.loginView = loginView;
		this.adminView = adminView;
		this.menuCreateView = menuCreateView;
		this.menuEditView = menuEditView;
		this.menuDeleteView = menuDeleteView;

		
		//create menu view action listenners
		menuCreateView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuCreateView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					menuCreateView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(menuCreateView, "Returning to the create menu page");
					menuCreateView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});
		
		
		menuCreateView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuCreateView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(menuCreateView,
							"Closing program");
					menuCreateView.dispose();
				}

			}
		});

		// edit menu view
		menuEditView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuEditView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					menuEditView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(menuEditView, "Returning to the create menu page");
					menuEditView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		menuEditView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuEditView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(menuEditView,
							"Closing program");
					menuEditView.dispose();
				}

			}
		});

		// Delete menu view
		menuDeleteView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuDeleteView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					menuDeleteView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(menuDeleteView, "Returning to the create menu page");
					menuDeleteView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		menuDeleteView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(menuDeleteView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(menuDeleteView,
							"Closing program");
					menuDeleteView.dispose();
				}

			}
		});
	}

}
