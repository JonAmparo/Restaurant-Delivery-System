package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.DTO;
import model_draft.HistoryBean;
import model_draft.HistoryModel;
import model_draft.OrderBean;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.ClientDashView;
import view_draft.ClientOrderHistoryView;

public class ClientDashHistoryController implements ActionListener {

	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientBean clientBean;
	private ClientOrderHistoryView clientOrderHistoryView;
	private RestaurauntModel model;
	private HistoryModel historyModel;

	private String selectedRestaurant;

	public ClientDashHistoryController(RestaurauntModel model, ClientModel clientModel, ClientDashView clientDashView,
			ClientOrderHistoryView clientOrderHistoryView, HistoryModel historyModel) {
		this.model = model;
		this.clientModel = clientModel;
		this.clientDashView = clientDashView;
		this.clientOrderHistoryView = clientOrderHistoryView;

		clientDashView.getBtnOrderHistory().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println("Order History #1");
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

					HistoryBean hb = (HistoryBean) clientOrderHistoryView.getListRestaurant().getSelectedValue();
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

}
