package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.AdminDash;
import view_draft.LoginView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditView;

public class MenuBar1RestaurantController {

	public AdminDash adminView;
	public LoginView loginView;
	public RestaurantCreateView createView;
	public RestaurantEditView editView;
	public RestaurantDeleteView deleteView;

	public MenuBar1RestaurantController(LoginView loginView, AdminDash adminView, RestaurantCreateView createView, RestaurantEditView editView, RestaurantDeleteView deleteView) {
		this.loginView = loginView;
		this.adminView = adminView;
		this.createView = createView;
		this.editView = editView;
		this.deleteView = deleteView;

		createView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(createView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					createView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(createView, "Bringing you back to the restaurant create page");
					createView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		createView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(createView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(createView, "Program will now close\n" + "            " + "Goodbye!");
					createView.dispose();
				}

			}
		});
		
		//restaurant edit menu (file)
		editView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(editView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					//createView.setVisible(false);
					editView.setVisible(false);
					//deleteView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(editView, "Bringing you back to the restaurant edit page");
					editView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		editView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(editView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(editView, "Program will now close\n" + "            " + "Goodbye!");
					editView.dispose();
				}

			}
		});
		
		
		//restaurant edit menu (file)
		deleteView.getMnFile().getItem(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(deleteView, "Are you sure you want to disconnect?");

				if (temp == 0) {

					loginView.getText_field1().setText("");
					loginView.getText_field2().setText("");
					deleteView.setVisible(false);
					loginView.setVisible(true);

				} else if (temp == 1) {
					JOptionPane.showMessageDialog(deleteView, "Bringing you back to the restaurant delete page");
					deleteView.setVisible(true);
				} else {
					System.out.println("cancel");
				}

			}
		});

		deleteView.getMnFile().getItem(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int temp = 0;
				temp = JOptionPane.showConfirmDialog(deleteView, "Are you sure you want like to quit?");

				if (temp == 0) {
					JOptionPane.showMessageDialog(deleteView, "Program will now close\n" + "            " + "Goodbye!");
					deleteView.dispose();
				}

			}
		});

	}

}
