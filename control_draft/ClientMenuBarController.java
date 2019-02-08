package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;
import view_draft.ClientOrderFoodView;
import view_draft.ClientOrderHistoryView;
import view_draft.LoginView;

public class ClientMenuBarController {

	private ClientBean clientBean;
	private ClientModel clientModel;

	private ClientDashView clientDashView;
	private ClientEditView clientEditView;
	private ClientDeleteView clientDeleteView;
	private ClientOrderFoodView clientOrderFoodView;
	private ClientOrderHistoryView clientOrderHistoryView;

	private LoginView loginView;

	public ClientMenuBarController(ClientModel clientModel, ClientDashView clientDashView,
			ClientEditView clientEditView, ClientDeleteView clientDeleteView, ClientOrderFoodView clientOrderFoodView,
			ClientOrderHistoryView clientOrderHistoryView, LoginView loginView) {
		this.clientModel = clientModel;
		this.clientDashView = clientDashView;
		this.clientEditView = clientEditView;
		this.clientDeleteView = clientDeleteView;
		this.clientOrderFoodView = clientOrderFoodView;
		this.clientOrderHistoryView = clientOrderHistoryView;
		this.loginView = loginView;

		// ================================= DISCONNECT ============================ //
		clientDashView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientDashView, "Signing out... \nRedirecting you to the login page...",
						"Signing out!", JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				clientDashView.setVisible(false); // Closes client view
			}
		});

		clientEditView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientEditView, "Signing out... \nRedirecting you to the login page...",
						"Signing out!", JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				clientEditView.setVisible(false); // Closes client view
			}
		});

		clientDeleteView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientDeleteView, "Signing out... \nRedirecting you to the login page...",
						"Signing out!", JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				clientDeleteView.setVisible(false); // Closes client view
			}
		});

		clientOrderFoodView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientOrderFoodView,
						"Signing out... \nRedirecting you to the login page...", "Signing out!",
						JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				clientOrderFoodView.setVisible(false); // Closes client view
			}
		});

		clientOrderHistoryView.getMenuItemDisconnect().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientOrderHistoryView,
						"Signing out... \nRedirecting you to the login page...", "Signing out!",
						JOptionPane.WARNING_MESSAGE);
				clearLoginText();
				loginView.setVisible(true); // Opens login view
				clientOrderHistoryView.setVisible(false); // Closes client view
			}
		});

		// ================================= QUIT ============================ //
		clientDashView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientDashView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				clientDashView.dispose(); // Closes client view and ends program
			}
		});

		clientEditView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientEditView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				clientEditView.dispose(); // Closes client view and ends program
			}
		});

		clientDeleteView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientDeleteView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				clientDeleteView.dispose(); // Closes client view and ends program
			}
		});

		clientOrderFoodView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientOrderFoodView, "Thanks for using our delivery system!", "Goodbye!",
						JOptionPane.CLOSED_OPTION);
				clientOrderFoodView.dispose(); // Closes client view and ends program
			}
		});

		clientOrderHistoryView.getMenuItemQuit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(clientOrderHistoryView, "Thanks for using our delivery system!",
						"Goodbye!", JOptionPane.CLOSED_OPTION);
				clientOrderHistoryView.dispose(); // Closes client view and ends program
			}
		});

		// ================================= EDIT ACCOUNTS ========================== //
		clientDashView.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientEditView.setVisible(true);
			}
		});
		clientEditView.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientEditView.setVisible(true);
			}
		});
		clientDeleteView.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDeleteView.setVisible(false);
				clientEditView.setVisible(true);
			}
		});
		clientOrderFoodView.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderFoodView.setVisible(false);
				clientEditView.setVisible(true);
			}
		});
		clientOrderHistoryView.getMenuItemEditAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientEditView.setVisible(true);
			}
		});
		// ================================= DELETE ACCOUNTS
		// ============================= //
		clientDashView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientDeleteView.setVisible(true);
			}
		});
		clientEditView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientDeleteView.setVisible(true);
			}
		});
		clientDeleteView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientDeleteView.setVisible(true);
			}
		});
		clientOrderFoodView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientDeleteView.setVisible(true);
			}
		});
		clientOrderHistoryView.getMenuItemDeleteAccount().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryView.setVisible(false);
				clientDeleteView.setVisible(true);
			}
		});

		// ================================= ORDER FOOD ==============================//
		clientDashView.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("New View: Client Order Food Controller ");
				clientDashView.setVisible(false);
				clientOrderFoodView.setVisible(true);

				clientOrderFoodView.getTfPrice().setEnabled(false);
				clientOrderFoodView.getTfMealItem().setEnabled(false);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {

						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);
					}
					clientOrderFoodView.getListRestaurant().setModel(model);
					clientOrderFoodView.getListRestaurant().setSelectedIndex(0);
				}
				clientOrderFoodView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							RestaurantBean rb = (RestaurantBean) clientOrderFoodView.getListRestaurant()
									.getSelectedValue();
							ArrayList<RestaurantMenuBean> rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();

							if (rmb != null) {

								DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();

								for (int i = 0; i < rmb.size(); i++) {
									listModel.addElement(rmb.get(i));
								}

								clientOrderFoodView.getListMenu().setModel(listModel);
							} else {
								DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();
								clientOrderFoodView.getListMenu().setModel(listModel);
							}
						}

					}
				});

				clientOrderFoodView.getListMenu().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							RestaurantMenuBean rb2 = (RestaurantMenuBean) clientOrderFoodView.getListMenu()
									.getSelectedValue();

							if (rb2 != null) {

								clientOrderFoodView.getTfMealItem().setText(rb2.getItem());
								clientOrderFoodView.getTfPrice().setText(String.valueOf(rb2.getPrice()));
								clientOrderFoodView.getTfQuantity().setText("");

							}
						}
					}

				});

			}
		});
		clientEditView.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientOrderFoodView.setVisible(true);
			}
		});
		clientDeleteView.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientOrderFoodView.setVisible(true);
			}
		});
		clientOrderFoodView.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientOrderFoodView.setVisible(true);
			}
		});
		clientOrderHistoryView.getMenuItemOrderFood().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryView.setVisible(false);
				clientOrderFoodView.setVisible(true);
			}
		});
		// ================================= ORDER HISTORY
		// =============================== //
		clientDashView.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientOrderHistoryView.setVisible(true);
			}
		});
		clientEditView.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientEditView.setVisible(false);
				clientOrderHistoryView.setVisible(true);
			}
		});
		clientDeleteView.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientOrderHistoryView.setVisible(true);
			}
		});
		clientOrderFoodView.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientDashView.setVisible(false);
				clientOrderHistoryView.setVisible(true);
			}
		});
		clientOrderHistoryView.getMenuItemOrderHistory().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clientOrderHistoryView.setVisible(false);
				clientOrderHistoryView.setVisible(true);
			}
		});

	}

	private void clearFields() {
//		chefMarkAcceptView.getTfDeliveryDate().setText("");
//		chefMarkAcceptView.getTfDeliveryTime().setText("");
	}

	private void clearLoginText() {
		loginView.getText_field1().setText("");
		loginView.getText_field2().setText("");

	}
}
