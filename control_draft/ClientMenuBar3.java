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
import model_draft.HistoryBean;
import model_draft.OrderBean;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import view_draft.ClientDashView;
import view_draft.ClientDeleteView;
import view_draft.ClientEditView;
import view_draft.ClientOrderFoodView;
import view_draft.ClientOrderHistoryView;
import view_draft.LoginView;

public class ClientMenuBar3 {

	private LoginView loginView;
	private ClientDashView clientDashView;
	private ClientDeleteView clientDeleteView;
	private ClientEditView clientEditView;
	private ClientOrderFoodView clientOrderFoodView;
	private ClientOrderHistoryView clientOrderHistoryView;
	private ClientBean clientBean;
	private ClientModel clientModel;

	public ClientMenuBar3(LoginView loginView, ClientDashView clientDashView, ClientDeleteView clientDeleteView,
			ClientEditView clientEditView, ClientOrderFoodView clientOrderFoodView,
			ClientOrderHistoryView clientOrderHistoryView, ClientModel clientModel) {
		this.clientModel = clientModel;

		// ==========================EDIT ACCOUNT==========================//
		clientDashView.getMenuItemOrderFood().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

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
		clientDeleteView.getMenuItemOrderFood().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientDeleteView.setVisible(false);
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
			public void actionPerformed(ActionEvent arg0) {

				clientEditView.setVisible(false);
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
		clientOrderFoodView.getMenuItemOrderFood().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientOrderFoodView.setVisible(false);
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
		clientOrderHistoryView.getMenuItemOrderFood().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientOrderHistoryView.setVisible(false);
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
		// ==========================ORDER HISTORY==========================//
		clientDashView.getMenuItemOrderHistory().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientDashView.setVisible(false);
				clientOrderHistoryView.setVisible(true);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<HistoryBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

						HistoryBean item = DTO.getInstance().getHistoryList().get(i);
						model.addElement(item);
					}
					clientOrderHistoryView.getListRestaurant().setModel(model);
					clientOrderHistoryView.getListRestaurant().setSelectedIndex(0);
				}

				clientOrderHistoryView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant()
									.getSelectedValue();
							clientOrderHistoryView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
							clientOrderHistoryView.getTfDeliveryTime().setText(hb.getDeliveryTime());
							clientOrderHistoryView.getTfPostalCode().setText(hb.getPostalCode());

							ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
							if (ob != null) {

								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

								for (int i = 0; i < ob.size(); i++) {
									listModel.addElement(ob.get(i));
								}

								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							} else {
								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							}
						}

					}
				});
			}
		});
		clientDeleteView.getMenuItemOrderHistory().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientDeleteView.setVisible(false);
				clientOrderHistoryView.setVisible(true);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<HistoryBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

						HistoryBean item = DTO.getInstance().getHistoryList().get(i);
						model.addElement(item);
					}
					clientOrderHistoryView.getListRestaurant().setModel(model);
					clientOrderHistoryView.getListRestaurant().setSelectedIndex(0);
				}

				clientOrderHistoryView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant()
									.getSelectedValue();
							clientOrderHistoryView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
							clientOrderHistoryView.getTfDeliveryTime().setText(hb.getDeliveryTime());
							clientOrderHistoryView.getTfPostalCode().setText(hb.getPostalCode());

							ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
							if (ob != null) {

								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

								for (int i = 0; i < ob.size(); i++) {
									listModel.addElement(ob.get(i));
								}

								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							} else {
								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							}
						}

					}
				});
			}
		});
		clientEditView.getMenuItemOrderHistory().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientEditView.setVisible(false);
				clientOrderHistoryView.setVisible(true);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<HistoryBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

						HistoryBean item = DTO.getInstance().getHistoryList().get(i);
						model.addElement(item);
					}
					clientOrderHistoryView.getListRestaurant().setModel(model);
					clientOrderHistoryView.getListRestaurant().setSelectedIndex(0);
				}

				clientOrderHistoryView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant()
									.getSelectedValue();
							clientOrderHistoryView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
							clientOrderHistoryView.getTfDeliveryTime().setText(hb.getDeliveryTime());
							clientOrderHistoryView.getTfPostalCode().setText(hb.getPostalCode());

							ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
							if (ob != null) {

								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

								for (int i = 0; i < ob.size(); i++) {
									listModel.addElement(ob.get(i));
								}

								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							} else {
								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							}
						}

					}
				});
			}
		});
		clientOrderFoodView.getMenuItemOrderHistory().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientOrderFoodView.setVisible(false);
				clientOrderHistoryView.setVisible(true);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<HistoryBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

						HistoryBean item = DTO.getInstance().getHistoryList().get(i);
						model.addElement(item);
					}
					clientOrderHistoryView.getListRestaurant().setModel(model);
					clientOrderHistoryView.getListRestaurant().setSelectedIndex(0);
				}

				clientOrderHistoryView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant()
									.getSelectedValue();
							clientOrderHistoryView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
							clientOrderHistoryView.getTfDeliveryTime().setText(hb.getDeliveryTime());
							clientOrderHistoryView.getTfPostalCode().setText(hb.getPostalCode());

							ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
							if (ob != null) {

								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

								for (int i = 0; i < ob.size(); i++) {
									listModel.addElement(ob.get(i));
								}

								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							} else {
								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							}
						}

					}
				});
			}
		});
		clientOrderHistoryView.getMenuItemOrderHistory().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				clientOrderHistoryView.setVisible(false);
				clientOrderHistoryView.setVisible(true);

				if (DTO.getInstance().getRestaurauntList().size() > 0) {
					DefaultListModel<HistoryBean> model = new DefaultListModel<>();

					for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

						HistoryBean item = DTO.getInstance().getHistoryList().get(i);
						model.addElement(item);
					}
					clientOrderHistoryView.getListRestaurant().setModel(model);
					clientOrderHistoryView.getListRestaurant().setSelectedIndex(0);
				}

				clientOrderHistoryView.getListRestaurant().addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						if (!arg0.getValueIsAdjusting()) {

							HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant()
									.getSelectedValue();
							clientOrderHistoryView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
							clientOrderHistoryView.getTfDeliveryTime().setText(hb.getDeliveryTime());
							clientOrderHistoryView.getTfPostalCode().setText(hb.getPostalCode());

							ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
							if (ob != null) {

								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

								for (int i = 0; i < ob.size(); i++) {
									listModel.addElement(ob.get(i));
								}

								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							} else {
								DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
								clientOrderHistoryView.getListMealOrder().setModel(listModel);
							}
						}

					}
				});
			}
		});

	}
}
