package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.HistoryModel;
import view_draft.ChefAcceptView;
import view_draft.ChefView;

public class ChefAcceptOrderAcceptController implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefAcceptView chefAcceptView;

	public ChefAcceptOrderAcceptController(HistoryModel historyModel, ChefView chefView,
			ChefAcceptView chefAcceptView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefAcceptView = chefAcceptView;

		chefAcceptView.getBtnAcceptOrder().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {
			String orderNum = chefAcceptView.getListRestaurantsOrders().getSelectedValue().toString();
			JOptionPane.showMessageDialog(chefAcceptView, "The order is accepted!", "Accepted!",
					JOptionPane.INFORMATION_MESSAGE);
			

//			chefAcceptView.setVisible(false);
//			chefView.setVisible(true);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(chefAcceptView, "No item ......", "Not item!", JOptionPane.ERROR_MESSAGE);
		}

	}

}