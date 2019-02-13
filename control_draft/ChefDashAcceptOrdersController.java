package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.HistoryBean;
import model_draft.HistoryModel;
import model_draft.OrderBean;
import model_draft.RestaurauntModel;
import view_draft.ChefAcceptView;
import view_draft.ChefView;

public class ChefDashAcceptOrdersController implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefAcceptView chefAcceptView;

	public ChefDashAcceptOrdersController(HistoryModel historyModel, ChefView chefView, ChefAcceptView chefAcceptView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefAcceptView = chefAcceptView;

		chefView.getBtnAcceptMarkOrders().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println("New View: Mark Orders ");
		chefView.setVisible(false);
		chefAcceptView.setVisible(true);

		if (DTO.getInstance().getRestaurauntList().size() > 0) {
			DefaultListModel<HistoryBean> model = new DefaultListModel<>();

			for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

				HistoryBean item = DTO.getInstance().getHistoryList().get(i);
				model.addElement(item);
			}
			chefAcceptView.getListRestaurantsOrders().setModel(model);
			//chefAcceptView.getListRestaurantsOrders().setSelectedIndex(0);
		}

		chefAcceptView.getListRestaurantsOrders().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {

					HistoryBean hb = (HistoryBean) chefAcceptView.getListRestaurantsOrders().getSelectedValue();
					chefAcceptView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
					chefAcceptView.getTfDeliveryTime().setText(hb.getDeliveryTime());
					chefAcceptView.getTfPostalCode().setText(hb.getPostalCode());

					ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
					if (ob != null) {

						DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

						for (int i = 0; i < ob.size(); i++) {
							listModel.addElement(ob.get(i));
						}

						chefAcceptView.getListMealInOrder().setModel(listModel);
					} else {
						DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
						chefAcceptView.getListMealInOrder().setModel(listModel);
					}
				}

			}
		});

	}

}