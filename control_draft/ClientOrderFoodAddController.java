package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.ClientModel;
import model_draft.OrderBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.ClientOrderFoodView;

public class ClientOrderFoodAddController implements ActionListener {

	private RestaurauntModel model;
	private ClientModel clientModel;
	private ClientOrderFoodView clientOrderFoodView;
	private RestaurantMenuBean restaurantMenuBean;

	public ClientOrderFoodAddController(RestaurauntModel model, ClientModel clientModel,
			ClientOrderFoodView clientOrderFoodView) {
		this.model = model;
		this.clientOrderFoodView = clientOrderFoodView;
		this.clientModel = clientModel;

		clientOrderFoodView.getBtnAdd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("Add food");
		if (clientOrderFoodView.getTfQuantity().getText().equals("")) { // Maake it compare integer 1-5
			JOptionPane.showMessageDialog(clientOrderFoodView, "Please enter a quantity!",
					"You must enter a number of items you'd like!", JOptionPane.INFORMATION_MESSAGE);
		} else if (clientOrderFoodView.getListOrder().getModel().getSize() > 0) {
			// System.out.println("working if statement");
			
			OrderBean orderBean = new OrderBean(clientOrderFoodView.getTfMealItem().getText(),
					Integer.parseInt(clientOrderFoodView.getTfPrice().getText()),
					Integer.parseInt(clientOrderFoodView.getTfQuantity().getText()));
			
			DefaultListModel<OrderBean> model = (DefaultListModel<OrderBean>) clientOrderFoodView.getListOrder()
					.getModel();

			model.addElement(orderBean);
			clientOrderFoodView.getListOrder().setModel(model);
		} else {
			// System.out.println("working #2 else statement");
			OrderBean orderBean = new OrderBean(clientOrderFoodView.getTfMealItem().getText(),
					Integer.parseInt(clientOrderFoodView.getTfPrice().getText()),
					Integer.parseInt(clientOrderFoodView.getTfQuantity().getText()));
			
			DefaultListModel<OrderBean> model = new DefaultListModel<>();

			model.addElement(orderBean);
			clientOrderFoodView.getListOrder().setModel(model);
		}
	}

}
