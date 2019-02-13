package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.HistoryBean;
import model_draft.HistoryModel;
import model_draft.OrderBean;
import view_draft.ChefView;
import view_draft.ChefReadyView;

public class ChefDashReadyOrderController implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefReadyView chefReadyView;

	public ChefDashReadyOrderController(HistoryModel historyModel, ChefView chefView, ChefReadyView chefReadyView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefReadyView = chefReadyView;
		
		chefView.getBtnViewOrders().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println("New View: Chef View Orders ");
		clearFields();
		chefView.setVisible(false);
		chefReadyView.setVisible(true);
		
		if (DTO.getInstance().getRestaurauntList().size() > 0) {
			DefaultListModel<HistoryBean> model = new DefaultListModel<>();

			for (int i = 0; i < DTO.getInstance().getHistoryList().size(); i++) {

				HistoryBean item = DTO.getInstance().getHistoryList().get(i);
				model.addElement(item);
			}
			chefReadyView.getListRestaurantsOrders().setModel(model);
			//chefReadyView.getListRestaurantsOrders().setSelectedIndex(0);
		}

		chefReadyView.getListRestaurantsOrders().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					
					try {
						HistoryBean hb = (HistoryBean) chefReadyView.getListRestaurantsOrders().getSelectedValue();
						chefReadyView.getTfDeliveryDate().setText(hb.getDeliveryDateText());
						chefReadyView.getTfDeliveryTime().setText(hb.getDeliveryTime());
						chefReadyView.getTfPostalCode().setText(hb.getPostalCode());

						ArrayList<OrderBean> ob = (ArrayList<OrderBean>) hb.getOrderBean();
						if (ob != null) {

							DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();

							for (int i = 0; i < ob.size(); i++) {
								listModel.addElement(ob.get(i));
							}

							chefReadyView.getListMealInOrder().setModel(listModel);
						} else {
							DefaultListModel<OrderBean> listModel = new DefaultListModel<OrderBean>();
							chefReadyView.getListMealInOrder().setModel(listModel);
						}
					} catch (Exception e) {
//						JOptionPane.showMessageDialog(chefReadyView, "Error", "Error", JOptionPane.ERROR_MESSAGE);
					}

			
				}

			}
		});

	}
	
	private void clearFields() {

		chefReadyView.getTfDeliveryDate().setText("");
		chefReadyView.getTfDeliveryTime().setText("");
		chefReadyView.getTfPostalCode().setText("");

	}

}
