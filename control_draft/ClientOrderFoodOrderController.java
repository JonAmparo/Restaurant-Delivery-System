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

		int response = JOptionPane.showConfirmDialog(clientOrderFoodView,
				"\nDelivery Date:" + clientOrderFoodView.getFtfDeliveryDate().getText() + "\nDelivery Time: \t"
						+ clientOrderFoodView.getCbDeliveryTime().getSelectedItem() + "\nPostal Code: \t"
						+ clientOrderFoodView.getFtfPostalCode().getText() + "\nList Order: \t"
						+ clientOrderFoodView.getListOrder().getModel().toString(), // remove tostring?
				"Order Confirmation!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		switch (response) {
		case JOptionPane.YES_OPTION:
			// Adds to order history bean
			JOptionPane.showMessageDialog(clientOrderFoodView, "Your order has been successfully placed.", "Submitted",
					JOptionPane.INFORMATION_MESSAGE);
			DefaultListModel<OrderBean> model = (DefaultListModel<OrderBean>) clientOrderFoodView.getListOrder().getModel();

		case JOptionPane.NO_OPTION:
			break;
		}

		// Gets quantity x price then add up all sum
//		for (int i = 0; i < clientOrderFoodView.getListMenu().getModel().getSize(); i++) {
//			clientOrderFoodView.getListOrder().getModel().getElementAt(i);
//		}

		// Set validations for the whole page

//		if (clientOrderFoodView.getFtfDeliveryDate().getText().equals("####/##/##")) {
//			JOptionPane.showMessageDialog(clientOrderFoodView, "Must enter a valid delivery date!", "Delivery Date",
//					JOptionPane.ERROR_MESSAGE);
//			if (clientOrderFoodView.getFtfPostalCode().getText().equals("#U# U#U")) {
//				JOptionPane.showMessageDialog(clientOrderFoodView, "Must enter a valid postal code!", "Postal Code",
//						JOptionPane.ERROR_MESSAGE);
//				if (clientOrderFoodView.getTfMealItem().getText().equals("")) {
//					JOptionPane.showMessageDialog(clientOrderFoodView, "You must add items to your cart...",
//							"Empty cart", JOptionPane.ERROR_MESSAGE);
//				} else {
//					JOptionPane.showMessageDialog(clientOrderFoodView,
//							"\nDelivery Date:" + clientOrderFoodView.getFtfDeliveryDate().getText()
//									+ "\nDelivery Time: \t" + clientOrderFoodView.getCbDeliveryTime().getSelectedItem()
//									+ "\nPostal Code: \t" + clientOrderFoodView.getFtfPostalCode().getText()
//									+ "\nList Order: \t" + clientOrderFoodView.getListOrder().getModel(),
//							"Order Confirmation!", JOptionPane.ERROR_MESSAGE);
//					System.out.println("Delivery Date: " + clientOrderFoodView.getFtfDeliveryDate().getText());
//					System.out.println("Delivery Time: " + clientOrderFoodView.getCbDeliveryTime().getSelectedItem());
//					System.out.println("Postal Code: " + clientOrderFoodView.getFtfPostalCode().getText());
//					System.out.println("List Order: " + clientOrderFoodView.getListOrder().getModel());
//					System.out.println("working 1");
//				}
//				System.out.println("working 2");
//			}
//			System.out.println("working 3");
//		}
//
//		System.out.println("working 4");

	}

}