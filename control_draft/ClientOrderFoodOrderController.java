package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.ClientModel;
import model_draft.HistoryBean;
import model_draft.OrderBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.ClientOrderFoodView;

public class ClientOrderFoodOrderController implements ActionListener {

	private RestaurauntModel model;
	private ClientModel clientModel;
	private ClientOrderFoodView clientOrderFoodView;
	private RestaurantMenuBean restaurantMenuBean;

	public ClientOrderFoodOrderController(RestaurauntModel model, ClientModel clientModel,
			ClientOrderFoodView clientOrderFoodView) {
		this.model = model;
		this.clientOrderFoodView = clientOrderFoodView;
		this.clientModel = clientModel;

		clientOrderFoodView.getBtnOrder().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("btn Order");
		try {
			String orderNum = clientOrderFoodView.getListMenu().getSelectedValue().toString();
			int response = JOptionPane.showConfirmDialog(clientOrderFoodView,
					"\nDelivery Date:" + clientOrderFoodView.getFtfDeliveryDate().getText() + "\nDelivery Time: \t"
							+ clientOrderFoodView.getCbDeliveryTime().getSelectedItem() + "\nPostal Code: \t"
							+ clientOrderFoodView.getFtfPostalCode().getText() + "\nList Order: \t"
							+ clientOrderFoodView.getListOrder().getModel().toString(), // remove tostring?
					"Order Confirmation!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			switch (response) {
			case JOptionPane.YES_OPTION:
				// Adds to order history bean
				JOptionPane.showMessageDialog(clientOrderFoodView, "Your order has been successfully placed.",
						"Submitted", JOptionPane.INFORMATION_MESSAGE);
				DefaultListModel<OrderBean> model = (DefaultListModel<OrderBean>) clientOrderFoodView.getListOrder()
						.getModel();
//				ArrayList<HistoryBean> ArrOrderList = new ArrayList<HistoryBean>();
//				ArrOrderList1.add(clientOrderFoodView.getListOrder().getModel());

			case JOptionPane.NO_OPTION:
				break;

			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(clientOrderFoodView, "No item was chosen...", "Not item!",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}