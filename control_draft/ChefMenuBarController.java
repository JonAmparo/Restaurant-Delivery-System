package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.ChefAcceptView;
import view_draft.ChefView;
import view_draft.ChefReadyView;
import view_draft.LoginView;

public class ChefMenuBarController {

	private ChefView chefView;
	private ChefAcceptView chefAcceptView;
	private ChefReadyView chefReadyView;

	private LoginView loginView;

	public ChefMenuBarController(ChefView chefView, ChefAcceptView chefAcceptView,
			ChefReadyView chefReadyView, LoginView loginView) {
		this.chefView = chefView;
		this.chefAcceptView = chefAcceptView;
		this.chefReadyView = chefReadyView;
		this.loginView = loginView;
		
		clearFields();

		// ================================= DISCONNECT ============================ //
		chefView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefView, "Signing out... \nRedirecting you to the login page...",
						"Signing out!", JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				chefView.setVisible(false); // Closes client view
			}
		});

		chefAcceptView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefAcceptView,
						"Signing out... \nRedirecting you to the login page...", "Signing out!",
						JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				chefAcceptView.setVisible(false); // Closes client view
			}
		});

		chefReadyView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefReadyView,
						"Signing out... \nRedirecting you to the login page...", "Signing out!",
						JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				chefReadyView.setVisible(false); // Closes client view
			}
		});

		// ================================= QUIT ============================ //
		chefView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				chefView.dispose(); // Closes client view and ends program
			}
		});

		chefAcceptView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefAcceptView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				chefAcceptView.dispose(); // Closes client view and ends program
			}
		});

		chefReadyView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(chefReadyView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				chefReadyView.dispose(); // Closes client view and ends program
			}
		});

		// ================================= VIEW ORDERS ============================ //
		chefView.getMenuItemViewOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefView.setVisible(false);
				chefReadyView.setVisible(true);
			}
		});

		chefReadyView.getMenuItemViewOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefReadyView.setVisible(false);
				chefReadyView.setVisible(true);
			}
		});

		chefAcceptView.getMenuItemViewOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefAcceptView.setVisible(false);
				chefReadyView.setVisible(true);
			}
		});

		// ================================= ACCEPT/MARK ORDERS
		// ============================ //
		chefView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefView.setVisible(false);
				chefAcceptView.setVisible(true);
			}
		});

		chefReadyView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefReadyView.setVisible(false);
				chefAcceptView.setVisible(true);
			}
		});

		chefAcceptView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				chefAcceptView.setVisible(false);
				chefAcceptView.setVisible(true);
			}
		});

	}
/*	
	this.clientDashView = clientDashView;
	this.clientEditView = clientEditView;
	this.clientDeleteView = clientDeleteView;
	this.clientOrderFoodView = clientOrderFoodView;
	this.clientOrderHistoryView = clientOrderHistoryView;
*/
	private void clearFields() {
		chefAcceptView.getTfDeliveryDate().setText("");
		chefAcceptView.getTfDeliveryTime().setText("");
		chefAcceptView.getTfPostalCode().setText("");

		chefReadyView.getTfDeliveryDate().setText("");
		chefReadyView.getTfDeliveryTime().setText("");
		chefReadyView.getTfPostalCode().setText("");
	}
	
	private void clearLoginText() {
		loginView.getText_field1().setText("");
		loginView.getText_field2().setText("");
		
	}

}
