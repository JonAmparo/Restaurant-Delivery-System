package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.ClientDashView;
import view_draft.ClientOrderFoodView;

public class ClientDashOrderFoodController implements ActionListener {

	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientBean clientBean;
	private ClientOrderFoodView clientOrderFoodView;
	private RestaurauntModel model;

	private String selectedRestaurant;

	public ClientDashOrderFoodController(RestaurauntModel model, ClientModel clientModel, ClientDashView clientDashView,
			ClientOrderFoodView clientOrderFoodView) {
		this.model = model;
		this.clientModel = clientModel;
		this.clientDashView = clientDashView;
		this.clientOrderFoodView = clientOrderFoodView;

		clientDashView.getBtnOrderFood().addActionListener(this);
	}

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

					RestaurantBean rb = (RestaurantBean) clientOrderFoodView.getListRestaurant().getSelectedValue();
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

					RestaurantMenuBean rb2 = (RestaurantMenuBean) clientOrderFoodView.getListMenu().getSelectedValue();
					
					if (rb2 != null) {

						clientOrderFoodView.getTfMealItem().setText(rb2.getItem());
						clientOrderFoodView.getTfPrice().setText(String.valueOf(rb2.getPrice()));
						clientOrderFoodView.getTfQuantity().setText("");

					}
				}
			}

		});

	}
}
