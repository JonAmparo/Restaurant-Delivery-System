package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.HistoryModel;
import view_draft.ChefAcceptView;
import view_draft.ChefReadyView;
import view_draft.ChefView;

public class ChefAcceptOrderReadyController  implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefReadyView chefReadyView;

	public ChefAcceptOrderReadyController(HistoryModel historyModel, ChefView chefView,
			ChefReadyView chefReadyView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefReadyView = chefReadyView;

		chefReadyView.getBtnMarkOrderAsReady().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {
			String orderNum = chefReadyView.getListRestaurantsOrders().getSelectedValue().toString();
			JOptionPane.showMessageDialog(chefReadyView, "The order is set to ready for delivery!!!", "Ready to be delivered!!",
					JOptionPane.INFORMATION_MESSAGE);
			

//			chefAcceptView.setVisible(false);
//			chefView.setVisible(true);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(chefReadyView, "No item ......", "Not item!", JOptionPane.ERROR_MESSAGE);
		}

	}

}