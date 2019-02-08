package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.HistoryModel;
import view_draft.ChefAcceptView;
import view_draft.ChefView;

public class ChefAcceptOrderReadyController  implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefAcceptView chefAcceptView;

	public ChefAcceptOrderReadyController(HistoryModel historyModel, ChefView chefView,
			ChefAcceptView chefAcceptView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefAcceptView = chefAcceptView;

	//	chefAcceptView.getBtnAcceptOrder().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		chefAcceptView.setVisible(false);
		chefView.setVisible(true);

	}

}