package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.HistoryModel;
import view_draft.ChefReadyView;
import view_draft.ChefView;

public class ChefReadyGoBackController implements ActionListener {

	private HistoryModel historyModel;
	private ChefView chefView;
	private ChefReadyView chefReadyView;

	public ChefReadyGoBackController(HistoryModel historyModel, ChefView chefView,
			ChefReadyView chefReadyView) {
		this.historyModel = historyModel;
		this.chefView = chefView;
		this.chefReadyView = chefReadyView;

		chefReadyView.getBtnGoBack().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		chefReadyView.setVisible(false);
		chefView.setVisible(true);

	}

}