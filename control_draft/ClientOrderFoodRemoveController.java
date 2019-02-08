package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.ClientModel;
import model_draft.OrderBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.ClientOrderFoodView;

public class ClientOrderFoodRemoveController implements ActionListener {

	private RestaurauntModel model;
	private ClientModel clientModel;
	private ClientOrderFoodView clientOrderFoodView;
	private RestaurantMenuBean restaurantMenuBean;

	public ClientOrderFoodRemoveController(RestaurauntModel model, ClientModel clientModel,
			ClientOrderFoodView clientOrderFoodView) {
		this.model = model;
		this.clientOrderFoodView = clientOrderFoodView;
		this.clientModel = clientModel;

		clientOrderFoodView.getBtnRemove().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("Add food");
		if(clientOrderFoodView.getListOrder().getModel().getSize() >0) {
			if(clientOrderFoodView.getListOrder().getSelectedIndex() != -1) {
				DefaultListModel<OrderBean> model = new DefaultListModel<>();
				
				for (int i = 0; i < clientOrderFoodView.getListOrder().getModel().getSize(); i++) {
					if (i != clientOrderFoodView.getListOrder().getSelectedIndex()) {
						OrderBean orderBean = (OrderBean) clientOrderFoodView.getListOrder().getModel().getElementAt(i);
						model.addElement(orderBean);
					}
				}
				clientOrderFoodView.getListOrder().setModel(model);
			}
		}
	}

}